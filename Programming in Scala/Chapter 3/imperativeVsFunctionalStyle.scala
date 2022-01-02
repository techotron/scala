// scala imperativeVsFunctionalStyle.scala zero one two

// Rule of thumb - if "var" is used then it's imperative. If "val" is used, then functional

// Imperative while loop
def printArgs1(args: Array[String]): Unit = {
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}
println("==== 1 ====")
printArgs1(args)


// Same while loop in 2 functional styles
def printArgs2(args: Array[String]): Unit = {
  for (arg <- args)
    println(arg)
}
println("==== 2 ====")
printArgs2(args)

def printArgs3(args: Array[String]): Unit = {
  args.foreach(println)
}
println("==== 3 ====")
printArgs3(args)

// Note: The result type here is Unit. This is a telltale sign that the function isn't returning anything interesting.
//  It's arguable that printArgs3() isn't purely functional still, because there are no side-effects. It's only printing
//  out to stdout. To make it purely functional, it would need to make some changes, for example:

def formatArgs(args: Array[String]) = args.mkString("\n")
println("==== 4 ====")
println(formatArgs(args))

// The mkString() method can be called on any iterable and returns a string, consisting of calling toString on each
//  element.

// formatArgs() also allows us to test it:
val res = formatArgs(Array("zero", "one", "two"))
assert(res == "zero\none\ntwo")
