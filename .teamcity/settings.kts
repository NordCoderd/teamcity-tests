import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.triggers.vcs

version = "2026.2"

project {
    description = "Control - DSL sandbox test"

    buildType(ControlBuild)
}

object ControlBuild : BuildType({
    name = "Control Build"

    vcs {
        root(DslContext.settingsRoot)
    }

    triggers {
        vcs {
        }
    }
})
