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
        sh 'mvn spring-boot:run'
      }
    }

  }
  tools {
    maven 'Maven 3.3.9'
    jdk 'jdk8'
  }
}