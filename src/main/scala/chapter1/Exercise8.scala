package chapter1

class Exercise8 {
  // Time complexity - O(n)
  // Space complexity - O(n)
  def isRotation(s1: String, s2: String): Boolean = {
    s1.length == s2.length && s"$s1$s1".contains(s2)
  }
}
