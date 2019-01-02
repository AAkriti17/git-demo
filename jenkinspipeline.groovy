pipeline{
    agent any

    stages{
        stage('Build')
        {
            sh 'mv clean package'

        }

        post{
            success{
                echo "now Achivement"
                archiveArtifacts artifacts: "**/target/*.war"
            }
        }
    }
}

