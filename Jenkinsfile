pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean install'
      }
    }

    stage('Deploy') {
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