package chapter1

import scala.collection.mutable.ArrayBuffer

class Exercise2 {
  // Time complexity - O(n)
  // Space complexity - O(n)
  def reverse(s: ArrayBuffer[Char]): ArrayBuffer[Char] = {
    val length = s.length
    val reversed = ArrayBuffer.fill(length)('\0')

    for (i <- 0 to length - 2) {
      reversed(i) = s(length - 2 - i)
    }

    reversed
  }

  // Time complexity - O(n)
  // Space complexity - O(1)
  def reverse2(s: ArrayBuffer[Char]): Unit = {
    val length = s.length

    for (i <- 0 until length / 2) {
      val tmp = s(i)
      s(i) = s(length - 2 - i)
      s(length - 2 - i) = tmp
    }
  }
}
