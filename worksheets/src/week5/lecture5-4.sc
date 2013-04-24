def squareList0(xs: List[Int]): List[Int] = xs match {
  case Nil     => Nil
  case y :: ys => y * y :: squareList0(ys)
}

def squareList1(xs: List[Int]): List[Int] =
  xs map (x => x * x)

val nums = List(2, -4, 5, 7, 1)
val fruits = List("apple", "pineapple", "orange", "banana")

nums filter(x => x > 0)
nums filterNot(x => x > 0)
nums partition(x => x > 0)

nums takeWhile(x => x > 0)
nums dropWhile(x => x > 0)
nums span(x => x > 0)

