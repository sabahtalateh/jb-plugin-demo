package com.github.sabahtalateh.jbplugindemo.services

import com.github.sabahtalateh.jbplugindemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
