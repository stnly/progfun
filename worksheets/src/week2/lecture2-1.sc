def sum(f: Int => Int, a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int =
    if (a > b) acc
    else loop(a + 1, f(a) + acc)
    loop(a, 0)
}

sum(x => x + x, 3, 5)

def product(f: Int => Int)(a: Int, b: Int): Int =
  //mapReduce(f, (x, y) => x * y, 1)(a, b)
  if (a > b) 1
  else f(a) * product(f)(a + 1, b)

product(x => x * x)(3, 4)

def factorial(n: Int) = product(x => x)(1, n)

factorial(5)

def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
  if (a > b) 0
  else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
