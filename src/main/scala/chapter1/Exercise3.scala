package chapter1

import scala.collection.mutable
import util.control.Breaks._

class Exercise3 {
  // Time complexity - O(n)
  // Space complexity - O(n)
  def isPermutation(s1: String, s2: String): Boolean = {
    if (s1.length != s2.length) {
      false
    } else {
      val s1Chars = countChars(s1)
      val s2Chars = countChars(s2)

      val sameChars = s1Chars.keySet.diff(s2Chars.keySet).isEmpty
      var sameCharCount = true
      breakable {
        if (sameChars) {
          for (c <- s1Chars.keySet) {
            if (s1Chars(c) != s2Chars(c)) {
              sameCharCount = false
              break
            }
          }
        }
      }

      sameChars && sameCharCount
    }
  }

  // Time complexity - O(n)
  // Space complexity - O(n)
  private def countChars(s: String): mutable.Map[Char, Int] = {
    val chars = mutable.Map[Char, Int]()
    for (i <- 0 until s.length) {
      val currentChar = s(i)
      if (chars.contains(currentChar)) {
        val count = chars(currentChar)
        chars(currentChar) = count + 1
      } else {
        chars(currentChar) = 1
      }
    }
    chars
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
