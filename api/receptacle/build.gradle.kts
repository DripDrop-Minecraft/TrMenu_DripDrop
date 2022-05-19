plugins {
    id("io.izzel.taboolib")
    id("trplugins.build.publish")
}

val taboolibVersion: String by rootProject

taboolib {
    description {
        name(rootProject.name)
    }
    install(
        "common",
        "module-nms",
        "platform-bukkit",
    )
    options(
        "skip-minimize",
        "keep-kotlin-module",
        "skip-taboolib-relocate",
    )
    classifier = null
    version = taboolibVersion
}

dependencies {
    api(project(":api:common"))

    compileOnly("org.spigotmc:spigot:1.16.5-R0.1-20210611.090701-17")
    compileOnly("ink.ptms.core:v11701:11701-minimize:universal")
    compileOnly("ink.ptms.core:v11600:11600-minimize")
    compileOnly("ink.ptms.core:v11200:11200-minimize")
    compileOnly("ink.ptms.core:v11400:11400-minimize")

    compileOnly("org.geysermc.floodgate:api:2.1.1-SNAPSHOT")
}