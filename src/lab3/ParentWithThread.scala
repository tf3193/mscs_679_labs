package lab3

object ParentWithThread extends App{
  val numCores = Runtime.getRuntime.availableProcessors()
  val child = new Thread(new ChildThread(0))
  child.run()
  val numThreads = Thread.activeCount()
  println("Parent numCores: " + numCores)
  println("Parent active threads: " + numThreads)
  println("Parent thread ID: " + Thread.currentThread.getId )

  child.join()


}
