package kholod.scala_challenge.task1

class MyGNode(val name: String, val children: Array[GNode]) extends GNode {

  override def getName: String = name

  override def getChildren: Array[GNode] = children

  def canEqual(other: Any): Boolean = other.isInstanceOf[MyGNode]

  override def equals(other: Any): Boolean = other match {
    case that: MyGNode =>
      (that canEqual this) &&
        name == that.name
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(name)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
