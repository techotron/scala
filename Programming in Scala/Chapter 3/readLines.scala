// scala readLines.scala scratchReadLines.md
// This script will print the scratchReadLines.md file with the line length value, then a | symbol, followed by the line itself.
//  Methods are included to workout the required padding to format the output nicely.
import scala.io.Source

// Works out the character length of "s"
def widthOfLength(s: String) = s.length.toString.length

if (args.length > 0) {
  // Store each line from the file as a List so we can iterate over it multiple times
  val lines = Source.fromFile(args(0)).getLines().toList

  // Work out the longest line in the List. Reduceleft (as used here) will compare the length of the first 2 elements in the "lines"
  //  list and return the longest. Then it'll compare the returned result with the next item in the list and so on. The ending result
  //  will be the length of the longest line in the line List (eg, "138").
  val longestLine = lines.reduceLeft(
    (a, b) => if (a.length > b.length) a else b
  )

  val maxWidth = widthOfLength(longestLine)

  // Loop over each line and work out the padding required
  for (line <- lines) {
    // So if maxWidth is 138, then numSpaces would be 3 - line.length
    val numSpaces = maxWidth - widthOfLength(line)
    val padding = " " * numSpaces
    println(padding + line.length + " | " + line)
  }
}
else
  Console.err.println("Please enter filename")