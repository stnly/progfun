import week4._

object expr {
  def show(e: Expr): String = e match {
    case Number(x) => x.toString
    case Sum(l, r) => show(l) + " + " + show(r)
  }
  show(Sum(Number(1), Number(44)))
}

