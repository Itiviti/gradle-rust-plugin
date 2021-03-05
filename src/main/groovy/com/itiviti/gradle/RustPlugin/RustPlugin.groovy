package com.itiviti.gradle.RustPlugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.Exec

class RustPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.tasks.create('rustRun', Exec).configure {
            commandLine 'cargo', 'run'
        }

        project.tasks.create('rustBuild', Exec).configure {
            commandLine 'cargo', 'build'
        }

        project.tasks.create('rustTest', Exec).configure {
            commandLine 'cargo', 'test'
        }
    }
}

