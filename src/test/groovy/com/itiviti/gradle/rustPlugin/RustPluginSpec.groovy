package com.itiviti.gradle.RustPlugin

import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

class RustPluginSpec extends Specification {
    def 'rustRun task test'() {
        given:
        def project = ProjectBuilder.builder().build()
        project.apply plugin: 'RustPlugin'

        when:
        project.evaluate()

        then:
        project.tasks.rustRun
    }

    def 'rustBuild task test'() {
        given:
        def project = ProjectBuilder.builder().build()
        project.apply plugin: 'RustPlugin'

        when:
        project.evaluate()

        then:
        project.tasks.rustBuild
    }

    def 'rustTest task test'() {
        given:
        def project = ProjectBuilder.builder().build()
        project.apply plugin: 'RustPlugin'

        when:
        project.evaluate()

        then:
        project.tasks.rustTest
    }

}
