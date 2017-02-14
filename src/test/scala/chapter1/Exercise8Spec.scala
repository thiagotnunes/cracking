package chapter1

import org.specs2.mutable.Specification

class Exercise8Spec extends Specification {

  val exercise = new Exercise8

  "returns true when second string is a rotation of the first" in {
    exercise.isRotation("erbottlewat", "waterbottle") ==== true
  }

  "returns false when second string is not a rotation of the first" in {
    exercise.isRotation("erbottlewat", "waterbot") ==== false
  }
}
