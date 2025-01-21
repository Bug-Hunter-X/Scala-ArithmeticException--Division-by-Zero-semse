```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    try {
      x / y
    } catch {
      case e: ArithmeticException => 0 // Or handle the exception appropriately
    }
  }
}
```