package chapter1

import org.specs2.mutable.Specification

import scala.collection.mutable.ArrayBuffer

class Exercise6Spec extends Specification {
  val exercise = new Exercise6

  "rotates the matrix 90 degrees" in {
    val matrix = ArrayBuffer(
      ArrayBuffer(1,  2,  3,  4),
      ArrayBuffer(5,  6,  7,  8),
      ArrayBuffer(9,  10, 11, 12),
      ArrayBuffer(13, 14, 15, 16)
    )
    
    exercise.rotate(matrix) ==== ArrayBuffer(
      ArrayBuffer(13, 9,  5, 1),
      ArrayBuffer(14, 10, 6, 2),
      ArrayBuffer(15, 11, 7, 3),
      ArrayBuffer(16, 12, 8, 4)
    )
  }

  "returns the same matrix when rotating single element matrix" in {
    val matrix = ArrayBuffer(
      ArrayBuffer(1)
    )

    exercise.rotate(matrix) ==== matrix
  }
}
