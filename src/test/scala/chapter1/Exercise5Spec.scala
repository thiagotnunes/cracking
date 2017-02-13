package chapter1

import org.specs2.mutable.Specification

class Exercise5Spec extends Specification {
  val exercise = new Exercise5

  "compress string" in {
    exercise.compress("aabcccccaaa") ==== "a2b1c5a3"
  }

  "does not compress if compressed would be same size as the input" in {
    exercise.compress("ccab") ==== "ccab"
  }

  "does not compress if compressed would be bigger than the input" in {
    exercise.compress("abc") ==== "abc"
  }

  "returns empty string if empty string is given" in {
    exercise.compress("") ==== ""
  }
}
