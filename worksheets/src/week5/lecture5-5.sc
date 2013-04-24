def concat[T](xs: List[T], ys: List[T]): List[T] = {
  (xs foldRight(ys)) (_ :: _)
  // foldLeft will cause a type error
}

val one = List("a", "b")
val two = List("c", "d")

concat(one, two)
