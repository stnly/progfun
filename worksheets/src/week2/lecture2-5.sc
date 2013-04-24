class Rational(x: Int, y: Int) {

  require(y != 0, "denominator must be nonzero")

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  /*private val g = gcd(x, y)*/

  def numer = x /*/g*/
  def denom = y /*/g*/

  override def toString = {
    val g = gcd(numer, denom)
    numer/g + "/" + denom/g
  }

  def add(that: Rational) =
    new Rational(numer * that.denom + that.numer * denom,
                  denom * that.denom)

  def neg: Rational = new Rational(-numer, denom)

  def sub(that: Rational) = add(that.neg)

  def less(that: Rational) = numer * that.denom < that.denom * denom
  def max(that: Rational) = if (this.less(that)) that else this
}

val x = new Rational(1, 2)

x.numer
x.denom

val y = new Rational(5, 7)

x.add(y)
x.neg

val z = new Rational(3, 2)

x.sub(y).sub(z)

x.less(y)
x.max(y)
