def formatResult(name: String, n: Int, f: Int => Int ) = {
  val msg = "The %s of %d is %d."
  msg.format(name, n, f(n))
}

println(formatResult("increment1", 2, (x: Int) => x+1))
println(formatResult("increment1", 2, (x) => x+1))

println('z'+ 1)

// val f = (x: Int) => x + 1

// println(f)
