plugins {
<<<<<<< HEAD
    id("io.papermc.paperweight.userdev") version "1.4.1"
=======
    id("io.papermc.paperweight.userdev") version "1.5.3"
>>>>>>> 216db5c (Fix dependencies)
}

dependencies {
    paperDevBundle("1.17.1-R0.1-SNAPSHOT")
    compileOnly(projects.hyperverseNmsCommon)
}

java.toolchain.languageVersion.set(JavaLanguageVersion.of(17))

tasks {
    reobfJar {
        outputJar.set(file("build/libs/${project.name}-${project.version}.jar"))
    }
    assemble {
        dependsOn(reobfJar)
    }
}