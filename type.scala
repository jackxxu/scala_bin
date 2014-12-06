// var a = Any

println("a".toLowerCase)
println(Int)
println(Unit)
// println(java.lang.String)
val a = (x: Int) => x*2
val b = (_: Int) > 0 && (_: Int) > 0

println(b(1, -1))
println(b(1, 2))


def sum(a: Int, b: Int, c: Int) = a + b + c

val c = sum _  // '_' is a placeholder for the entire param list

// c: (Int, Int, Int) => Int = <function3>

println(c(1, 2, 3))

def printlist(args: String*) = for(arg <- args) println(arg)

printlist("2", "jack")
println(Array("2", "jack"))
// println(Array("2", "jack"): _*)
println("2", "jack")
printlist(Array("2", "jack"): _*)


Console.println('1')
Console.out.println('1')
Console.err.println('1')
