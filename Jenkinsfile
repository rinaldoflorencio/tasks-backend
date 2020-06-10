pipeline {
    agent any
    stages {
        stage('Build Backend') {
            steps {
                bat 'mvn clean package -DskipTests=true'
            }
        }
        stage('Unit Tests') {
            steps {
                bat 'mvn test'
            }
        }
		
		stage('Sonar Analysis') {
		environment {
		scannerHome = tool 'SONAR_SCANNER'
		}
            steps {
			withSonarQubeEnv('SONAR_LOCAL') {
                bat "${SONAR_SCANNER}/bin/sonar-scanner -e -Dsonar.projectKey=DeployBack -Dsonar.host.url=http://localhost:9000 -Dsonar.login=2ffcbfe768bda1a3034374e275b3f360e0818f06 -Dsonar.java.binaries=target-Dsonar.coverage.exclusions=**/.mvn/**;**/src/test/**;**/model/**;**Application.java"
            
			}
        }
    }
}

