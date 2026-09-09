import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*

version = "2024.12"

project {
    description = "Control - sandbox working"
    buildType {
        id("ControlBuild")
        name = "Control Build Config"
    }
}
