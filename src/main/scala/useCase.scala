import scala.io.Source
import org.coreyyares.markov._

object useCase extends App {
    // \2 and \3 are the ascii stop and start characters
    val stop = '\2'
    val start = '\3'

    // we'll use lists of length 2
    val chainLength = 2

    // build a markov chain from an input file where each line
    // consists of a planet name from Star Trek
    val planetGenerator = Source.fromFile("./src/test/resources/planets.txt")
      .getLines
      // MarkovChainMap is a markov chain that stores the chain
      // options in a Map[C,Int]. This map is working over Chars
      .foldLeft(new MarkovChain[Char](start, stop))((acc, n) =>
      acc.insert(n.toLowerCase.toList)
      )

    // Generate a new planet name based on the corpus with a maximum length
    // of 10
    val toFormat = planetGenerator.generate(10).mkString("")

    println(planetGenerator.toString())

    println("Meet new planet: " + toFormat)


}