package kholod.scala_challenge.task1

import scala.collection.mutable.ArrayBuffer

object Helper {

  def printGraph(nodes: ArrayBuffer[GNode]): Unit = {
    println(nodes.map(n => n.getName).mkString(", "))
  }
}
