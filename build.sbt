import sbtassembly.AssemblyPlugin.autoImport._

name := """events-model"""
organization := "Vitaliy Kuznetsov & Lesia Mirchenko"
version := "0.0.1"
scalaVersion := "2.10.6"

libraryDependencies ++= {
    val scalaTestV = "2.2.5"
    val scalamockV = "3.2"
    val configV = "1.3.0"

    Seq(
        "com.typesafe" % "config" % configV,

        "org.scalatest" %% "scalatest" % scalaTestV % "test",
        "org.scalamock" %% "scalamock-scalatest-support" % scalamockV % "test"
    )
}

assemblyJarName in assembly := "model.jar"
