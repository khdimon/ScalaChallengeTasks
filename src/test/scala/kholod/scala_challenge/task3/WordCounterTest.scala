package kholod.scala_challenge.task3

import org.scalatest.FunSuite

import scala.collection.immutable.ListMap

class WordCounterTest extends FunSuite {

  test("testCountWords") {

    val string = "Aaa bbb aaaa aaa12324 ?.,., bBb \n aaa"
    val expectedResult = ListMap("aaa" -> 3, "bbb" -> 2, "aaaa" -> 1)

    val actualResult = WordCounter.countWords(string)

    assert(expectedResult.equals(actualResult))
  }
}
