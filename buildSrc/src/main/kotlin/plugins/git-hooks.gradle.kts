package plugins

import PUBLISHING_GROUP
import org.gradle.api.tasks.Copy
import java.io.File

tasks.register<Copy>("installGitHooks") {
    description = "Install or replace pre-commit git hook"
    File(rootProject.rootDir, ".git/hooks/pre-commit").apply {
        if (exists())
            delete()
    }
    from("${rootProject.rootDir}/hooks/pre-commit")
    into("${rootProject.rootDir}/.git/hooks")
    fileMode = 0x777
    onlyIf { !PUBLISHING_GROUP.contains("skeleton", true) }
    doLast {
        println("Git hooks installed.")
    }
}

afterEvaluate {
    tasks.getByPath(":app:preBuild").dependsOn(tasks.named("installGitHooks"))
}
