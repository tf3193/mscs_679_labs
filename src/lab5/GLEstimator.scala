package lab5

case object GLEstimator extends App {

  def getPi(number: Integer): Double = {
    (0 to number).foldLeft(0D) { (sum: Double, n) => if (n % 2 == 0) (sum + 1D/((2*n) +1)) else (sum - 1D/((2*n)+ 1)) }
  }
  val t1 = System.nanoTime
  val pi = getPi(1000000)
  val t2 = System.nanoTime
  println("pi = " + pi*4)
  val tDelta = (t2 - t1)/1000000000.0
  println(s"dt = $tDelta s")
}
