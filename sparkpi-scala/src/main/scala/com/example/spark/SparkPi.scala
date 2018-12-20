package com.example.spark

import org.apache.spark._

import scala.math.random
import com.marketo.datalake.PipelineGateway
import com.marketo.datalake.DataLakeLeadActivityProcessor
/** Computes an approximation to pi */
object SparkPi {
  def main(args: Array[String]) {
//    val conf = new SparkConf().setAppName("Spark Pi")
//    val spark = new SparkContext(conf)
//    println("************************")
    args.foreach(println)
//    var slices = 2
//
//    for (intput_arg <- args if intput_arg.startsWith("--slices=")) slices = intput_arg.split("=").last.toInt
//
//    println("slices: %s".format(slices))
//    val n = math.min(100000L * slices, Int.MaxValue).toInt // avoid overflow
//    val count = spark.parallelize(1 until n, slices).map { i =>
//      val x = random * 2 - 1
//      val y = random * 2 - 1
//      if (x * x + y * y < 1) 1 else 0
//    }.reduce(_ + _)
//    println("******************* Pi is roughly %s".format(4.0 * count / (n - 1)))
//    spark.stop()

//    val args1 = "--renv local --fs /tmp/poc/gs/ --master local".split(" ")
//    DataLakeLeadActivityProcessor.main(args1)
    PipelineGateway.main(args)
  }
}