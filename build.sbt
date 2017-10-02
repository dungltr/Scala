name := "SecondSbtScalaProject"

version := "0.1"

scalaVersion := "2.11.8"
/*
import Dependencies._

lazy val commonSettings = Seq(
  version := "0.1.0",
  scalaVersion := "2.12.3"
)

lazy val backend = (project in file("backend"))
  .settings(
    commonSettings,
    libraryDependencies ++= backendDeps
  )
*/
//val overrideScalaVersion = "2.12.1"
val overrideScalaVersion = "2.11.8"
val sparkVersion = "2.2.0"
//val sparkVersion = "2.1.0"
val sparkXMLVersion = "0.4.1"
val sparkCsvVersion = "1.5.0"
val sparkElasticVersion = "2.3.4"
val sscKafkaVersion = "1.6.3"
val sparkMongoVersion = "2.1.0"
val sparkCassandraVersion = "1.6.0"

//ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }

resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion
)

