def msort(xs: List[Int]): List[Int] = {
  val n = xs.length / 2
  if (n == 0) xs
  else {
    def merge0(xs: List[Int], ys: List[Int]): List[Int] = xs match {
      case Nil => ys
      case x :: xs1 => ys match {
        case Nil => xs
        case y :: ys1 => if (x < y) x :: merge0(xs1, xs) else y :: merge0(xs, ys1)
      }
    }

    def merge1(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (x < y) x :: merge1(xs1, ys) else y :: merge1(xs, ys1)
    }

    val (fst, snd) = xs splitAt n
    merge1(msort(fst), msort(snd))
  }
}

val list = List(2, -4, 5, 7, 1)
msort(list)
