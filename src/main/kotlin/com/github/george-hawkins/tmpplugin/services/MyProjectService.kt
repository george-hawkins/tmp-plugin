package com.github.george-hawkins.tmpplugin.services

import com.intellij.openapi.project.Project
import com.github.george-hawkins.tmpplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
