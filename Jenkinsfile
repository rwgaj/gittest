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
    stage('Deliver') {
      steps {
        sh '''docker build -t frontend . docker rm -f angular || true
docker run -d -p 8000:80 --name angular frontend'''
      }
    }
  }
}