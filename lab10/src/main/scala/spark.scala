import org.apache.spark.sql.SparkSession

object CounterDemo {
  def main(args: Array[String]): Unit = {
    val conf = new
        SparkConf().setAppName("CounterDemo").setMaster("local[*]")

    val path_1="hdfs://localhost:9000/procedure.csv"
    val path_2="hdfs://localhost:9000/master.csv"
    val path_3="hdfs://localhost:9000/client.csv"

    val df_procedure = spark.read.option("header", "true").csv(path_1)
    val df_master = spark.read.option("header", "true").csv(path_2)
    val df_client = spark.read.option("header", "true").csv(path_3)

    df_procedure.createOrReplaceTempView("procedures")
    df_master.createOrReplaceTempView("masters")
    df_client.createOrReplaceTempView("clients")

    spark.sql("SELECT * FROM procedures").show(5)
    spark.sql("SELECT * FROM masters").show(5)
    spark.sql("SELECT * FROM clients").show(5)

    spark.sql("SELECT DISTINCT procedures.master_id, COUNT(procedures.procedure_id) " +
              "FROM procedures GROUP BY procedures.master_id").show()

    spark.stop()
  }
}