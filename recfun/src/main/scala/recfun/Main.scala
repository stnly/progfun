package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = (c, r) match {
    case (_, 0) => 1
    case (0, _) => 1
    case (c, r) => if (c == r) 1 else pascal(c, r - 1) + pascal(c - 1, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balancing(chars: List[Char], num: Int): Boolean = (chars, num) match {
      case (Nil, num) => num == 0
      case ('(' :: c, num) => balancing(c, num + 1)
      case (')' :: c, num) => if (num == 0) false else balancing(c, num - 1)
      case (_ :: c, num) => balancing(c, num)
    }
    balancing(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = money match {
    case 0 => 1
    case m => if (m < 0 || coins.isEmpty) 0 else countChange(m - coins.head, coins) + countChange(m, coins.tail)
    case _ => 0
  }
}
