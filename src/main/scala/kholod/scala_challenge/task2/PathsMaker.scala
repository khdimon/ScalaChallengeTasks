package kholod.scala_challenge.task2

import scala.collection.mutable.ArrayBuffer

object PathsMaker {

  def paths(node: GNode): ArrayBuffer[ArrayBuffer[GNode]] = {
    val onePath = new ArrayBuffer[GNode]
    val allPaths = new ArrayBuffer[ArrayBuffer[GNode]]
    paths(node, onePath, allPaths)
    allPaths
  }

  private def paths(node: GNode, onePath: ArrayBuffer[GNode], allPaths: ArrayBuffer[ArrayBuffer[GNode]]): Unit = {
    onePath += node
    if (node.getChildren.length != 0) for (n <- node.getChildren) {
      paths(n, onePath, allPaths)
    }
    else {
      val path = new ArrayBuffer[GNode]()
      path ++= onePath
      allPaths += path
    }
    onePath.remove(onePath.size - 1)
  }
}
