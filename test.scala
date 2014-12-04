class Test2 {
  def method(arg: Int): Int =
    arg

  def method2(arg: Int) =
    arg


}

var test = new Test2

println(test)
println(test.method(1))
println(test.method2(2))
