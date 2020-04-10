pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'whoami'
        sh 'mvn clean install'
      }
    }

    stage('Deploy') {
      steps {
        sh 'java -jar target/tancify-0.1.0-SNAPSHOT.jar'
      }
    }

  }
  tools {
    maven 'Maven 3.3.9'
    jdk 'jdk8'
  }
}