pipeline {
  agent {
    docker {
      args '-v /root/.m2:/root/.m2'
      image 'maven:3-jdk-8'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn package'
      }
    }
    stage('Test') {
      environment {
        CI = 'true'
      }
      steps {
        sh 'mvn test'
      }
    }
    stage('Install') {
      steps {
        sh 'mvn clean install'
      }
    }
  }
}