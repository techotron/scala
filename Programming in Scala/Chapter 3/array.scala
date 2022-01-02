// scala array.scala
// Note: these are not the recommended way of instantiating arrays
val greetStrings = new Array[String](3)
// A more explicit way would be:
// var greetStrings: Array[String] = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "World!\n"

for (i <- 0 to 2)
  print(greetStrings(i))