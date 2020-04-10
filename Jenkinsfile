pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'echo ${POM_VERSION}'
        sh 'mvn clean install'
        sh 'echo ${BUILD_NUMBER}'
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