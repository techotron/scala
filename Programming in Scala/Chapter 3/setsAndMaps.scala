// scala setsAndMaps.scala
// A Set and Map are collection traits
// sets come from the same base class (scala.collection) with 2 sub classes:
//  scala.collection.mutable.Set and scala.collection.immuatable.Set
// The HashSet extends the Set class trait (same with HashMaps and Maps)

// The default way to create an set is (which is the type: scala.collection.immutable.Set)
var jetSet = Set("Boeing", "Airbus")
// As jetSet is immutable, += here is shorthand for jetSet = jetSet + "Lear". Therefore, we're re-assigning the var
//  jetSet. If it was a val - the compiler would complain.
jetSet += "Lear"
println(jetSet.contains("Cessna")) // false

// Mutable example - requires an import:
import scala.collection.mutable
val movieSet = mutable.Set("Hitch", "Poltergeist")
// Alternatively, this syntax would work: movieSet.+=("Shrek")
movieSet += "Shrek"
println(movieSet) // HashSet(Hitch, Shrek, Poltergeist)


// Maps have a similar class hierarchy as Sets (scala.collection.immutable.Map/HashMap and scala.collection.mutable.Map/HashMap)
//  They can be created in a similar way to Sets, using the factory methods
// import scala.collection.mutable (no need to import this again as it's already imported above)

// Create an empty (mutable) Map with the empty parentheses
val treasureMap = mutable.Map[Int, String]()

// Alternative syntax: 1.->("Go to island.") The method "->" can be invoked on any object and returns a 2 element tuple for the key and value.
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap(2)) // Find big X on ground.


// Create an immutable map (immutable is the default)
val romanNumeral = Map(
  1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
)
println(romanNumeral(4)) // IV