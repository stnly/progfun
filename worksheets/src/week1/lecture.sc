def abs(x: Double) = if (x < 0) -x else x

def isGoodEnough(guess: Double, x: Double) =
  abs(guess * guess - x) / x < 0.001

def improve(guess: Double, x: Double) =
  (guess + x / guess) / 2

def sqrtIter(guess: Double, x: Double): Double = {
  if (isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)
}

def sqrt(x: Double) = sqrtIter(1.0, x)

sqrt(2)
sqrt(4)
sqrt(1e-6)
sqrt(1e60)

def gcd(a: Int, b: Int): Int =
  if (b == 0) a else gcd(a, a % b)

gcd(14, 21)

def factorial(n:Int): Int =
  if (n == 0) 1 else n * factorial(n - 1)

factorial(4)

def tailfactorial(n: Int): Int = {
  def loop(acc: Int, n: Int): Int =
    if (n == 0) acc
    else loop(acc * n, n - 1)
  loop(1, n)
}

tailfactorial(4)
