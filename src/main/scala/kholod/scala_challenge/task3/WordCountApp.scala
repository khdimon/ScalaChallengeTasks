package kholod.scala_challenge.task3

import scala.io.Source

object WordCountApp extends App {

  val filePath = "/Users/dkhol/IdeaProjects/JavaChallengeTasks/example.txt"
  val encoding = "UTF-8"

  val string = Source.fromFile(filePath, encoding).mkString
  val words = WordCounter.countWords(string)
  PrintHelper.print(words)
}
