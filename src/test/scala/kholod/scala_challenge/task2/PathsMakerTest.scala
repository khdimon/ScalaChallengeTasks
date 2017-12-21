package kholod.scala_challenge.task2

import org.scalatest.FunSuite

import scala.collection.mutable.ArrayBuffer

class PathsMakerTest extends FunSuite {

  test("testPaths") {

    val E = new MyGNode("E", new Array[GNode](0))
    val F = new MyGNode("F", new Array[GNode](0))
    val G = new MyGNode("G", new Array[GNode](0))
    val H = new MyGNode("H", new Array[GNode](0))
    val I = new MyGNode("I", new Array[GNode](0))
    val J = new MyGNode("J", new Array[GNode](0))
    val B = new MyGNode("B", Array[GNode](E, F))
    val C = new MyGNode("C", Array[GNode](G, H, I))
    val D = new MyGNode("D", Array[GNode](J))
    val A = new MyGNode("A", Array[GNode](B, C, D))

    val expectedNodes = ArrayBuffer[ArrayBuffer[GNode]]()
    expectedNodes += ArrayBuffer[GNode](A, B, E)
    expectedNodes += ArrayBuffer[GNode](A, B, F)
    expectedNodes += ArrayBuffer[GNode](A, C, G)
    expectedNodes += ArrayBuffer[GNode](A, C, H)
    expectedNodes += ArrayBuffer[GNode](A, C, I)
    expectedNodes += ArrayBuffer[GNode](A, D, J)

    val actualNodes = PathsMaker.paths(A)

    assert(expectedNodes == actualNodes)
  }
}
