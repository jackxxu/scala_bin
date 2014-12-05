def formatResult(name: String, n: Int, f: Int => Int ) = {
  val msg = "The %s of %d is %d."
  msg.format(name, n, f(n))
}

println(formatResult("increment1", 2, (x: Int) => x+1))
println(formatResult("increment1", 2, (x) => x+1))

println('z'+ 1)

var increment1 = (x: Int) => x + 1
// var increment2 = _ + 1

println(increment1(3))
// println(increment2(3))

// val lessThan = new Function2[Int, Int, Boolean] {
//   def apply(a: Int, b: Int) = a < b
// }

// println('6')

object Main extends App {
  Console.println("Hello World: " + (args mkString ", "))
}

// var func2 = new Function2[] {
//   def apply(a: Int, b: Int) = a < b
// }

// val f = (x: Int) => x + 1

// println(f)
