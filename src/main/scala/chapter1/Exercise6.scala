package chapter1

import scala.collection.mutable.ArrayBuffer

class Exercise6 {

  // Time complexity - O(n^2)
  // Space complexity - O(n^2)
  def rotate(matrix: Matrix[Int]): Matrix[Int] = {
    val rows = matrix.length
    val columns = matrix.head.length

    val rotatedMatrix = ArrayBuffer.fill(rows, columns)(-1)

    for {
      i <- 0 until rows
      j <- 0 until columns
    } yield {
      rotatedMatrix(i)(j) = matrix(rows - j - 1)(i)
    }

    rotatedMatrix
  }
}


