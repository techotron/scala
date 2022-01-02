// scala array.scala
// Note: these are NOT the recommended way of instantiating arrays
val greetStrings = new Array[String](3)
// A more explicit way would be:
// var greetStrings: Array[String] = new Array[String](3)

// An alternative syntax would be: greetStrings.update(0, "Hello")
//  as we're updating the greetStrings array. Arrays have an "update()" method
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "World!\n"
// Note: an array in scala is a mutable object. The greetStrings val is immutable but the objects of the array are mutable

// This is a shorthand way of calling the to() method which takes in 1 Int.
// Another way of expressing this would be (0).to(2)
for (i <- 0 to 2) {
  // Like the "update()" method, the array also has an "apply()" method which is used to retrieve the value
  //  so greetStrings.apply(i) is what the compiler renders.
  print(greetStrings(i))
}