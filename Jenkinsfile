pipeline {
  agent any
  stages {
    stage('Build') {
      when {
          branch 'master'
          branch 'release'
      }
      steps {
        sh 'mvn clean install'
      }
    }

    stage('Deploy') {
      when {
          branch 'master'
      }
      steps {
        script{
            withEnv(['JENKINS_NODE_COOKIE=dontkill']) {
                sh 'nohup java -jar target/$IMAGE-$VERSION.jar &'
            }
        }
      }
    }

  }
  tools {
    maven 'Maven 3.3.9'
    jdk 'jdk8'
  }
  environment {
    IMAGE = readMavenPom().getArtifactId()
    VERSION = readMavenPom().getVersion()
  }
}