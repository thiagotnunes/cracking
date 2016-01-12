name := "cracking_the_coding_interview"

version := "1.0"

scalaVersion := "2.11.7"

scalacOptions += "-target:jvm-1.8"

libraryDependencies ++= Seq(
  "org.testng" % "testng" % "6.9.10" % "test",
  "org.specs2" %% "specs2-core" % "3.6.6" % "test"
)

