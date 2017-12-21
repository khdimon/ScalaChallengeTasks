package kholod.scala_challenge.task1

import scala.collection.mutable.ArrayBuffer

object GNodeWalker {

  def walkGraph(node: GNode): ArrayBuffer[GNode] = {
    val nodes = new ArrayBuffer[GNode](0)
    walkGraph(node, nodes)
    nodes
  }

  private def walkGraph(node: GNode, nodes: ArrayBuffer[GNode]):Unit = {
    if (!nodes.contains(node)) {
      nodes += node
    }
    node.getChildren.foreach(n => walkGraph(n, nodes))
  }
}
