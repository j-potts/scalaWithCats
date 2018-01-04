import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.3"

  lazy val cats = "org.typelevel" %% "cats-core" % "1.0.1"

  lazy val ammonite = "com.lihaoyi" % "ammonite" % "1.0.3" % "test"
}
