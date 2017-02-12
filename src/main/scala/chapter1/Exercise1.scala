package chapter1

import scala.collection.mutable
import util.control.Breaks._

class Exercise1 {

  // Time complexity - O(n)
  // Space complexity - O(n)
  def hasUniqueCharacters(s: String): Boolean = {
    val seenCharacters = mutable.Set[Char]()
    var hasRepeatedCharacter = false
    breakable {
      for (i <- 0 until s.length) {
        val c = s.charAt(i)
        if (seenCharacters.contains(c)) {
          hasRepeatedCharacter = true
          break
        } else {
          seenCharacters.add(c)
        }
      }
    }

    !hasRepeatedCharacter
  }

  // No extra data structures
  // Time complexity - O(n^2)
  // Space complexity - O(1)
  def hasUniqueCharacters2(s: String): Boolean = {
    var hasRepeatedCharacters = false
    breakable {
      for {
        i <- 0 until s.length - 1
        j <- i + 1 until s.length
      } yield {
        if (s.charAt(i) == s.charAt(j)) {
          hasRepeatedCharacters = true
          break
        }
      }
    }

    !hasRepeatedCharacters
  }

}
