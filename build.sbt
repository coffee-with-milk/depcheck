addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

resolvers += Resolver.bintrayRepo("runarorama", "maven")

lazy val foop = (project in file("."))
  .settings(
    name := "depency checker project",
    version := "1.0",
    scalaVersion := "2.11.8"
  )
  .settings(
    libraryDependencies ++= Seq(
      "com.higher-order" %% "latr" % "0.3.0"
      //"org.scalamacros" %% "paradise" % "2.1.0"
    )
  )
  .settings(
    // include scala library in output
    filterScalaLibrary := false,
    //render dot file to `./dependencies.dot`
    dependencyDotFile := file("dependencies.dot")
  )
