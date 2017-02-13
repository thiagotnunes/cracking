package chapter1

class Exercise5 {
  // Time complexity - O(n)
  // Space complexity - O(n)
  def compress(s: String): String = {
    if (s.length > 0) {
      val stringBuilder = new StringBuilder

      var currentChar = s(0)
      var count = 1
      for (i <- 1 until s.length) {
        if (s(i) == currentChar) {
          count = count + 1
        } else {
          stringBuilder.append(currentChar)
          stringBuilder.append(count)
          currentChar = s(i)
          count = 1
        }
      }
      stringBuilder.append(currentChar)
      stringBuilder.append(count)

      if (stringBuilder.size < s.length) {
        stringBuilder.toString()
      } else {
        s
      }
    } else {
      s
    }
  }
}
