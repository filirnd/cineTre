import AssemblyKeys._  // put this at the top of the file

name := "cineTre"

version := "1.0"

scalaVersion := "2.11.8"

// Enables publishing to maven repo
publishMavenStyle := true



assemblySettings



libraryDependencies += "com.typesafe" % "config" % "1.3.0"


libraryDependencies += "org.scala-lang" % "scala-xml" % "2.11.0-M4"

libraryDependencies += "org.jsoup" % "jsoup" % "1.9.1"
