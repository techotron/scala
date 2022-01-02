// scala tuples.scala
// Tuples are immutable but can consist of different types of elements.
val pair = (99, "Luftballoons")
println(pair._1)
println(pair._2)
// Note: Scala infers the type here to be Tuple2[Int, String] and gives that type to the pair variable too. This type is
//  based on that there are 2 elements in the tuple. The following would be a Tuple6[Char, Char, String, Int, Int, String]
val tuple = ("u", "r", "the", 1, 4, "me")
println(tuple)

// Note: lists and tuples differ in how they refer to the data (eg the first element isn't called using pair(0)) because
//  a lists apply method always returns the same type but tuples could return different types. They are "one based" (instead
//  of zero based like lists) as a tradition set by other statically typed tuples (eg Haskell and ML).