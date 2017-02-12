package chapter1

import scala.collection.mutable
import util.control.Breaks._

class Exercise3 {
  // Time complexity - O(n)
  // Space complexity - O(n)
  def isPermutation(s1: String, s2: String): Boolean = {
    val s1Chars = mutable.Set[Char]()
    val s2Chars = mutable.Set[Char]()
    if (s1.length != s2.length) {
      false
    } else {
      for (i <- 0 until s1.length) {
        s1Chars.add(s1(i))
      }
      for (i <- 0 until s2.length) {
        s2Chars.add(s2(i))
      }

      s1Chars.diff(s2Chars).isEmpty
    }
  }

  // Time complexity - O(n^2)
  // Space complexity - O(1)
  def isPermutation2(s1: String, s2: String): Boolean = {
    if (s1.length != s2.length) {
      false
    } else {
      var hasSameCharacters = true
      breakable {
        for {
          i <- 0 until s1.length
        } yield {
          if (!s2.contains(s1(i))) {
            hasSameCharacters = false
            break
          }
        }
      }

      hasSameCharacters
    }
  }

  // Assuming quicksort
  // Time complexity - O(nlogn)
  // Space complexity - O(1)
  def isPermutation3(s1: String, s2: String): Boolean = {
    s1.sortBy(identity) == s2.sortBy(identity)
  }
}
