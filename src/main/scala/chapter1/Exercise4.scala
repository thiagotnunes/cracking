package chapter1

import scala.collection.mutable.ArrayBuffer

class Exercise4 {
  // Time complexity - O(n^2)
  // Space complexity - O(1)
  def replaceSpaces(s: ArrayBuffer[Char]): Unit = {
    for (i <- s.indices) {
      if (s(i) == ' ') {
        s(i) = '%'

        shiftRight(s, i + 1)
        shiftRight(s, i + 1)

        s(i + 1) = '2'
        s(i + 2) = '0'
      }
    }
  }

  // Time complexity - O(n)
  // Space complexity - O(n)
  def replaceSpaces2(s: ArrayBuffer[Char]): ArrayBuffer[Char] = {
    val encoded = ArrayBuffer[Char]()
    var i = 0
    while (encoded.length < s.length) {
      if (s(i) == ' ') {
        encoded += '%'
        encoded += '2'
        encoded += '0'
      } else {
        encoded += s(i)
      }
      i = i + 1
    }
    encoded
  }

  private def shiftRight(s: ArrayBuffer[Char], from: Int): Unit = {
    for (j <- s.length - 1 until from by -1) {
      s(j) = s(j - 1)
    }
  }
}
