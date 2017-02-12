package chapter1

import org.specs2.mutable.Specification

class Exercise1Spec extends Specification {

  val exercise = new Exercise1

  "returns true when all characters are unique" in {
    exercise.hasUniqueCharacters("abcdefghijklmnopq") ==== true
    exercise.hasUniqueCharacters2("abcdefghijklmnopq") ==== true
  }

  "returns true when empty string is given" in {
    exercise.hasUniqueCharacters("") ==== true
    exercise.hasUniqueCharacters2("") ==== true
  }

  "returns false when at least one character is repeated" in {
    exercise.hasUniqueCharacters("abcdefghijklmnopqa") ==== false
    exercise.hasUniqueCharacters2("abcdefghijklmnopqa") ==== false
  }
}
