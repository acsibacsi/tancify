pipeline {
  agent {
    docker {
      image 'maven'
    }

  }
  stages {
    stage('Test') {
      steps {
        sh 'make run_test'
      }
    }

  }
}