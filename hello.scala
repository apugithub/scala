package pakg1

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.SparkSession


object hello {
  def main(args: Array[String]) {
  val sparkConf = new SparkConf().setMaster("local[*]").setAppName("KafkaWordCount").set("spark.driver.host", "localhost")
 val sc = new SparkContext(sparkConf)
 val sqlContext=new SQLContext(sc)
// val sparkSession: SparkSession = SparkSession
//.builder
//.appName(s"LocalTestSparkSession")
//.config("spark.broadcast.compress", "false")
//.config("spark.shuffle.compress", "false")
//.config("spark.shuffle.spill.compress", "false")
//.config("spark.driver.host", "localhost")
//.master("local[*]")
//.getOrCreate
  val df = sqlContext.read.option("header", "true").csv("E:/emp.csv")
  df.show()
  }
}
