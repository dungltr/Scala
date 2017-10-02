sbt package
$SPARK_HOME/bin/spark-submit \
  --class "SimpleApp" \
  --master local[4] \
  target/scala-2.11/secondsbtscalaproject_2.11-0.1.jar
