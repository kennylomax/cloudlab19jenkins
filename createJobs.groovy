pipelineJob('cloudlab19springapp') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/kennylomax/cloudlab19springapp.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
