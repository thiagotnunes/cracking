package chapter1

import org.specs2.mutable.Specification

import scala.collection.mutable.ArrayBuffer

class Exercise4Spec extends Specification {

  val exercise = new Exercise4

  "replaceSpaces" >> {
    "replaces spaces with %20" in {
      val s = ArrayBuffer(
        'M', 'R', ' ',
        'J', 'O', 'H', 'N', ' ',
        'S', 'M', 'I', 'T', 'H',
        ' ', ' ', ' ', ' '
      )

      exercise.replaceSpaces(s)

      s ==== ArrayBuffer(
        'M', 'R', '%', '2', '0',
        'J', 'O', 'H', 'N', '%', '2', '0',
        'S', 'M', 'I', 'T', 'H'
      )
    }

    "does nothing on empty string" in {
      val s = new ArrayBuffer[Char](0)

      exercise.replaceSpaces(s)

      s ==== new ArrayBuffer[Char](0)
    }
  }

  "replaceSpaces2" >> {
    "replaces spaces with %20" in {
      val s = ArrayBuffer(
        'M', 'R', ' ',
        'J', 'O', 'H', 'N', ' ',
        'S', 'M', 'I', 'T', 'H',
        ' ', ' ', ' ', ' '
      )

      exercise.replaceSpaces2(s) ==== ArrayBuffer(
        'M', 'R', '%', '2', '0',
        'J', 'O', 'H', 'N', '%', '2', '0',
        'S', 'M', 'I', 'T', 'H'
      )
    }

    "does nothing on empty string" in {
      exercise.replaceSpaces(new ArrayBuffer[Char](0)) ==== new ArrayBuffer[Char](0)
    }
  }
}
