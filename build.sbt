

name := "markov_chain_movie_generator"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "org.mongodb" %% "casbah" % "3.1.1",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
  "org.json4s"   %% "json4s-jackson" % "3.5.2",
  "org.json4s" %% "json4s-mongo" % "3.5.2",
  "org.mongodb" %% "casbah" % "3.1.1",

)