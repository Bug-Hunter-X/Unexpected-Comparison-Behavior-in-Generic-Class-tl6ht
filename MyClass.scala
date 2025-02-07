```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): Boolean = {
    value == other.value
  }
}

object Main extends App {
  val obj1 = new MyClass[Int](10)
  val obj2 = new MyClass[String]("10")
  println(obj1.myMethod(obj2)) // This will compile but may give unexpected result
}
```