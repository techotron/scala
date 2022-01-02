// scala list.scala
// Unlike arrays, lists are not mutable. You can instead call methods which return a result for example:
//  adding 2 lists together:
val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")

// Another common operator for lists is :: (pronounced cons) which prepends a new element to the beginning of a list.
// This should print: "List(1, 2, 3). The twoThree list is not altered. The :: is a method of the right hand operand.
//  If the method ends in a colon, then it's a method of the right operand. If the method doesn't end in a colon
//  (eg a * b) then it's a method of the left operand (eg a.*(b) )
val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)

// Another way to initialise lists is with the cons operator with a Nil at the end:
val consList = 1 :: 2 :: 3 :: Nil
println(consList)
// Note: you need Nil because the cons method belongs to the List class. Nil is a way of instantiating an empty List.
//  Without it, the compiler would complain because cons isn't a method which belongs to the Int class.



// Testing List methods area:
val thrill = "Will" :: "fill" :: "until" :: Nil
println(thrill.filter(s => s.length == 4))

// Returns a list resulting from adding "y" to each string element in the thrill List.
println(thrill.map(s => s + "y"))

// Returns a string of the elements in the List
println(thrill.mkString(", "))

// Returns a list containing all elements of the thrill List in alphabetical order of the first character (lowercased)
println(
  thrill.sortWith((s, t) =>
    s.charAt(0).toLower <
      t.charAt(0).toLower)
)