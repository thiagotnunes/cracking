package chapter1

import org.specs2.mutable.Specification

class Exercise3Spec extends Specification {

  val exercise = new Exercise3

  "returns true when second string is permutation of the first" in {
    exercise.isPermutation("aabcdef", "badcfea") ==== true
    exercise.isPermutation2("aabcdef", "badcfea") ==== true
    exercise.isPermutation3("aabcdef", "badcfea") ==== true
  }

  "returns true when both strings are empty" in {
    exercise.isPermutation("", "") ==== true
    exercise.isPermutation2("", "") ==== true
    exercise.isPermutation3("", "") ==== true
  }

  "returns false when second string is not permutation of the first" in {
    exercise.isPermutation("abcdef", "bcdefg") ==== false
    exercise.isPermutation2("abcdef", "bcdefg") ==== false
    exercise.isPermutation3("abcdef", "bcdefg") ==== false
  }

  "returns false when second string is single char repeated and is not permutation of the first" in {
    exercise.isPermutation("abcdef", "aaaaaa") ==== false
    exercise.isPermutation2("abcdef", "aaaaaa") ==== false
    exercise.isPermutation3("abcdef", "aaaaaa") ==== false
  }

  "returns false when strings are not of the same size" in {
    exercise.isPermutation("abc", "abcd") ==== false
    exercise.isPermutation2("abc", "abcd") ==== false
    exercise.isPermutation3("abc", "abcd") ==== false
  }

  "returns false when second string is empty" in {
    exercise.isPermutation("abc", "") ==== false
    exercise.isPermutation2("abc", "") ==== false
    exercise.isPermutation3("abc", "") ==== false
  }
}
