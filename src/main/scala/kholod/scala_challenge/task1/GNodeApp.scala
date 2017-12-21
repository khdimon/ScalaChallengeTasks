package kholod.scala_challenge.task1

object GNodeApp extends App {

  val K = new MyGNode("K", new Array[GNode](0))
  val L = new MyGNode("L", new Array[GNode](0))
  val F = new MyGNode("F", new Array[GNode](0))
  val G = new MyGNode("G", new Array[GNode](0))
  val H = new MyGNode("H", new Array[GNode](0))
  val I = new MyGNode("I", new Array[GNode](0))
  val J = new MyGNode("J", new Array[GNode](0))
  val E = new MyGNode("E", Array[GNode](K, L))
  val B = new MyGNode("B", Array[GNode](E, F))
  val C = new MyGNode("C", Array[GNode](G))
  val D = new MyGNode("D", Array[GNode](H, I, J))
  val A = new MyGNode("A", Array[GNode](B, C, D))

  val nodes = GNodeWalker.walkGraph(A)

  Helper.printGraph(nodes)
}
