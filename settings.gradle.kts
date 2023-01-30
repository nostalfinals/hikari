import java.util.Locale

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "hikari"
for (name in listOf("hikari-api", "hikari-server")) {
    include(projName)
    findProject(":$name")!!.projectDir = file(name)
}
