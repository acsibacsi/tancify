pipeline {
  agent any

  environment {
    IMAGE = readMavenPom().getArtifactId()
    VERSION = readMavenPom().getVersion()
  }

  stages {
    stage('Build') {
      steps {
        sh 'echo $IMAGE'
        sh 'echo $VERSION'
        sh 'mvn clean install'
      }
    }

    stage('Deploy') {
      steps {
        sh 'mvn spring-boot:run'
      }
    }

  }
  tools {
    maven 'Maven 3.3.9'
    jdk 'jdk8'
  }
}