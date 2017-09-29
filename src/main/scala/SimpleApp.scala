import org.apache.spark.sql.SparkSession
object SimpleApp {
  def main(args: Array[String]) {
    println("\n Hello world")
    val logFile = "/usr/local/Cellar/apache-spark/2.1.0/README.md" // Should be some file on your system
    val spark = SparkSession.builder.appName("Simple Application").getOrCreate()
    val logData = spark.read.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    println("\n Goodbye")
    spark.stop()
  }
}
