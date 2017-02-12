package chapter1

import org.specs2.mutable.Specification

import scala.collection.mutable.ArrayBuffer

class Exercise2Spec extends Specification {

  val exercise = new Exercise2

  "reverse" >> {
    "returns the string in reverse order" in {
      exercise.reverse(ArrayBuffer('a', 'b', 'c', 'd', 'e', 'f', 'g', '\0')) ==== ArrayBuffer('g', 'f', 'e', 'd', 'c', 'b', 'a', '\0')
    }

    "returns the given string when empty string (only \\0) is given" in {
      exercise.reverse(ArrayBuffer('\0')) ==== ArrayBuffer('\0')
    }
  }

  "reverse2" >> {
    "returns the string in reverse order" in {
      val chars = ArrayBuffer('a', 'b', 'c', 'd', 'e', 'f', 'g', '\0')

      exercise.reverse2(chars)

      chars ==== ArrayBuffer('g', 'f', 'e', 'd', 'c', 'b', 'a', '\0')
    }

    "returns the given string when empty string (only \\0) is given" in {
      val chars = ArrayBuffer('\0')

      exercise.reverse2(chars)

      chars ==== ArrayBuffer('\0')
    }
  }
}
