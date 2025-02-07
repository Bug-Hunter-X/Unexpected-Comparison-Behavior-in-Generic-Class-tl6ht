# Unexpected Comparison Behavior in Generic Class

This example demonstrates a potential pitfall when using generics in Scala.  The `MyClass` class defines a generic type parameter `T`. However, the `myMethod` uses `==` for comparison, which will behave differently depending on the type of `T`.

The issue is that comparing objects of different types (`Int` and `String` in the example) with `==` leads to compiler errors or unexpected results based on implicit conversions. This is because == in scala is not overloaded based on type parameters. The comparison will not behave intuitively when used with different types.