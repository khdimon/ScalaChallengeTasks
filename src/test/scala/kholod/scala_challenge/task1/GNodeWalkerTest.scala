package kholod.scala_challenge.task1

import org.scalatest.FunSuite

import scala.collection.mutable.ArrayBuffer

class GNodeWalkerTest extends FunSuite {

  test("testWalkGraph") {

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

    val expectedNodes = ArrayBuffer[GNode](A, B, E, F, C, G, H, I, D, J)

    val actualNodes = GNodeWalker.walkGraph(A)

    assert(expectedNodes == actualNodes)
  }
}
