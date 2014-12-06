val a = 4

def f1(x: Int) = { x*x }
def f2(x: Int) { println(x*x) }


def f3(arg: Int) =
  println(arg)

println(f1(1))
println(f2(1))
type R = Double
println((1 to 5).map(_*2))
// println((1 to 8) filter { _ == 3})

var (x,y,z) = (1,2,3)
println(x)


class A extends App {
}

trait B {
  def bar = {
    x + 2
  }
  def baz(arg: Any) = {
    arg
  }
}

class C extends B {

}

class D(var x: Int) extends B {
  // println(x)
  // // x =  x + 1
  // println(x)

  def foo = {
    x + 1
  }
}

var d = new D(10)
println(d.x)
d.x = 12
println(d.x)
println(d.foo)
println(d.bar)

println((1 to 5).map(2+))

var abc : String = "ad"


// var aa = new A
// var ab = new B

println(classOf[String])
