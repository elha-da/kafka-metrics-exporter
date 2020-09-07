name := "kafka-metrics-exporter"

version := "1.0"

scalaVersion := Dependencies.scalaV

libraryDependencies ++= {
  Dependencies.testDeps ++
  Dependencies.akka ++
  Dependencies.kafka
}.map(_ exclude("org.slf4j", "slf4j-log4j12") exclude("log4j", "log4j") exclude("junit", "junit")) ++
  Dependencies.base

