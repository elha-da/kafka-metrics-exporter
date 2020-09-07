import sbt._

object Dependencies {

  val scalaV = "2.13.3"

  private val akkaV = "2.6.8"
  private val kafkaV = "2.6.0"

  val base = Seq(
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
    "ch.qos.logback" % "logback-classic" % "1.2.3"
  )

  val testDeps = Seq(
    "org.scalatest" %% "scalatest" % "3.2.2" % Test,
    "org.apache.kafka" % "kafka-streams-test-utils" % kafkaV % Test
  )

  val akka = Seq(
    "com.typesafe.akka" %% "akka-actor-typed" % akkaV
  )

  val kafka = Seq(
    "org.apache.kafka" %% "kafka" % kafkaV
  )

  val influxdb = Seq(
    "org.influxdb" % "influxdb-java" % "2.20"
  )

}

