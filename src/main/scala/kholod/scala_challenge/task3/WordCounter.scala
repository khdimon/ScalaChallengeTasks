package kholod.scala_challenge.task3

import scala.collection.immutable.{HashMap, ListMap}

object WordCounter {

  private val word = "[a-zA-Z]+"

  def countWords(string: String): ListMap[String, Int] = {
    val wordsArray = word.r.findAllIn(string).toArray
    var wordsMap = new HashMap[String, Int]
    wordsArray.foreach(w => wordsMap += w.toLowerCase -> (wordsMap.getOrElse(w.toLowerCase, 0) + 1))
    ListMap(wordsMap.toSeq.sortWith(_._2 > _._2):_*)
  }
}
