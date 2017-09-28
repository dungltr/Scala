name := "SecondSbtScalaProject"

version := "0.1"

scalaVersion := "2.12.3"
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
val overrideScalaVersion = "2.12.1"
val sparkVersion = "2.1.0"
val sparkXMLVersion = "0.4.1"
val sparkCsvVersion = "1.5.0"
val sparkElasticVersion = "2.3.4"
val sscKafkaVersion = "1.6.3"
val sparkMongoVersion = "2.1.0"
val sparkCassandraVersion = "1.6.0"

//ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }

resolvers ++= Seq(
  "All Spark Repository -> bintray-spark-packages" at "https://mvnrepository.com/artifact/"
)
dependencyOverrides += "org.scala-lang" % "scala-compiler" % "2.11.11"
libraryDependencies ++= Seq(
  // "org.scalatest"         % "scalatest_2.12"              % "2.0.M5b" % "test",
  // https://mvnrepository.com/artifact/org.scala-lang/scala-library
  //"org.scala-lang" % "scala-library" % "2.12.3",
  //"org.scala-lang" % "scala-compiler" % "2.12.0",
  //"org.scalatest" % "scalatest_2.11" % "3.0.4" % "test",
  //"org.apache.spark" % "spark-sql_2.10" % "2.1.0" % "provided",
  //"org.apache.spark"      % "spark-core_2.10" % "2.1.0" % "provided",
  // https://mvnrepository.com/artifact/org.apache.spark/spark-core_2.11
  //"org.apache.spark" % "spark-core_2.11" % "2.1.0" % "provided"

  "org.apache.spark"      % "spark-core_2.11"            % sparkVersion % "provided",
  "org.apache.spark"      % "spark-sql_2.11"             % sparkVersion % "provided",
  "org.apache.spark"      % "spark-hive_2.11"            % sparkVersion % "provided",
  "org.apache.spark"      % "spark-catalyst_2.11"        % sparkVersion % "provided",
  "org.apache.spark"      % "spark-graphx_2.11"          % sparkVersion % "provided",
  "org.apache.spark"      % "spark-streaming_2.11"       % sparkVersion % "provided",
  "org.apache.spark"      % "spark-mllib_2.11"           % sparkVersion % "provided",
  "com.databricks"        % "spark-xml_2.11"             % sparkXMLVersion,
  "com.databricks"        % "spark-csv_2.11"             % sparkCsvVersion,
  "org.apache.spark"      % "spark-streaming-kafka_2.11" % sscKafkaVersion % "provided",

  "org.mongodb.spark"     % "mongo-spark-connector_2.11" % sparkMongoVersion,
  "org.mongodb.spark" % "mongo-spark-connector_2.11" % "2.1.0",
  "com.stratio.datasource" % "spark-mongodb_2.11"         % "0.12.0"
)


