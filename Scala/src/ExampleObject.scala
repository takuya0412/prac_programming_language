object ExampleObject{
  val num = 1
  val value = "test_value"
  def show(x:Int, y:String): Unit ={
    println(s"x:$x, y:$y")
  }
  def main(args: Array[String]): Unit ={
    show(num, value)
  }
}