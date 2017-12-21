package kholod.scala_challenge.task3

object PrintHelper {

  def print(words: Map[String, Int]): Unit = {
    words.foreach((pair: (String, Int)) => println(pair._2 + " " + pair._1))
  }
}
