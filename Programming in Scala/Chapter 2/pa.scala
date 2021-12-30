// scala pa.scala Scala is concise
/*
Functional style
args.foreach(arg => println(arg))
     |<--->|                        call the "foreach" method on args
            |<----------------->|   function literal where "arg" is a parameter
                    |<-------->|    body of the function is just "println(arg)"
*/
args.foreach(arg => println(arg))

/*
An even more concise way to express this would be to infer the single argument (called Partially Applied Function)

args.foreach(println)
*/