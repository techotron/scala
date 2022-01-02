// scala arrayWithInference.scalas
// No need to specify the type as Array[String](3) because it's inferred:
val numNames = Array("zero", "one", "two")
for (i <- 0 to 2)
  println(numNames(i))