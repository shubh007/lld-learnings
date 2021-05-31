
plugins {
    java
    application
}

group = "io.finility.lld.learnings"
version = "0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
tasks.create("Hello"){
    print("Hello Printed")
}
application {
    // Define the main class for the application.
    mainClass.set("io.finility.lld.learnings.App2")
}
application {
    // Define the main class for the application.
    mainClass.set("io.finility.lld.learnings.App3")
}
