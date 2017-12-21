package kholod.scala_challenge.task2

import scala.collection.mutable.ArrayBuffer

object Helper {

  def printPaths(paths: ArrayBuffer[ArrayBuffer[GNode]]): Unit = {
    println(paths.map(p => p.map(n => n.getName).mkString("(", " ", ")")).mkString("(", " ", ")"))
  }
}
