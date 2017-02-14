package chapter1

import org.specs2.mutable.Specification

import scala.collection.mutable.ArrayBuffer

class Exercise7Spec extends Specification {

  val exercise = new Exercise7

  "zeroes row and column of element that is equal to 0" in {
    exercise.zero(ArrayBuffer(
      ArrayBuffer(0,  1,  2,  3),
      ArrayBuffer(4,  5,  6,  7),
      ArrayBuffer(8,  9,  10, 11),
      ArrayBuffer(12, 13, 14, 15)
    )) ==== ArrayBuffer(
      ArrayBuffer(0,  0,  0,  0),
      ArrayBuffer(0,  5,  6,  7),
      ArrayBuffer(0,  9,  10, 11),
      ArrayBuffer(0, 13, 14, 15)
    )

    exercise.zero2(ArrayBuffer(
      ArrayBuffer(0,  1,  2,  3),
      ArrayBuffer(4,  5,  6,  7),
      ArrayBuffer(8,  9,  10, 11),
      ArrayBuffer(12, 13, 14, 15)
    )) ==== ArrayBuffer(
      ArrayBuffer(0,  0,  0,  0),
      ArrayBuffer(0,  5,  6,  7),
      ArrayBuffer(0,  9,  10, 11),
      ArrayBuffer(0, 13, 14, 15)
    )
  }

  "does nothing when there is no zero in the given matrix" in {
    exercise.zero(ArrayBuffer(
      ArrayBuffer(-2,  1,  2,  3),
      ArrayBuffer(4,  5,  6,  7),
      ArrayBuffer(8,  9,  10, 11),
      ArrayBuffer(12, 13, 14, 15)
    )) ==== ArrayBuffer(
      ArrayBuffer(-2,  1,  2,  3),
      ArrayBuffer(4,  5,  6,  7),
      ArrayBuffer(8,  9,  10, 11),
      ArrayBuffer(12, 13, 14, 15)
    )

    exercise.zero2(ArrayBuffer(
      ArrayBuffer(-2,  1,  2,  3),
      ArrayBuffer(4,  5,  6,  7),
      ArrayBuffer(8,  9,  10, 11),
      ArrayBuffer(12, 13, 14, 15)
    )) ==== ArrayBuffer(
      ArrayBuffer(-2,  1,  2,  3),
      ArrayBuffer(4,  5,  6,  7),
      ArrayBuffer(8,  9,  10, 11),
      ArrayBuffer(12, 13, 14, 15)
    )
  }

}
