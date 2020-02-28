package lab2

object SeqMultAdder extends App {
  val nums = List(1, 3, 4, 5, 12, 2, 7, 9, 7)
  //  val f = {n: Int => println(n)}
  //  def f(n: Int): Unit = println(n)
  //  nums.foreach(println(_))}
  val odds = nums.filter {_ % 2 == 1}
  odds.foreach { n => println(n) }
  val total = odds.foldLeft(0) { (sum, odd) => sum + 2*odd }
  println(total)
}

