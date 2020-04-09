pipeline {
  agent {
    docker {
      image 'maven'
      args '-p 8006:8080'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn install'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }

    stage('Deploy') {
      steps {
        sh 'mvn spring-boot:run'
      }
    }

  }
}