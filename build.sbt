ThisBuild / scalaVersion := "2.12.18" // Use Scala 2.12.x for Spark 3.5.0
ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    name := "UkRailride",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % "3.5.0",
      "org.apache.spark" %% "spark-sql" % "3.5.0"
    )
  )