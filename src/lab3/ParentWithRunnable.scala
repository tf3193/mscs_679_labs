package lab3

object ParentWithRunnable extends App {
  val numCores = Runtime.getRuntime.availableProcessors()
  val children = for(no <- 0 until numCores) yield {
    val child = new Thread(new ChildRunnable(no))
    child.start
    child
  }
  children.foreach { n => n.join()}

}
