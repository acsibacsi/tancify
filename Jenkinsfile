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
        sh 'cat /etc/*-release'
        sh 'echo "mvn spring-boot:run" | at now'
      }
    }

  }
}