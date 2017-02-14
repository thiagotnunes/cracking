package chapter1

import scala.collection.mutable.ArrayBuffer

class Exercise7 {
  // Time complexity - O(n^3)
  // Space complexity - O(n^2)
  def zero(matrix: Matrix[Int]): Matrix[Int] = {
    val rows = matrix.length
    val columns = matrix.head.length
    val zeroedMatrix = ArrayBuffer.fill(rows, columns)(-1)

    for {
      i <- 0 until rows
      j <- 0 until columns
    } yield {
      if (matrix(i)(j) == 0) {
        zeroRowAndColumn(zeroedMatrix)(i, j, rows, columns)
      } else if (zeroedMatrix(i)(j) != 0) {
        zeroedMatrix(i)(j) = matrix(i)(j)
      }
    }

    zeroedMatrix
  }

  // Time complexity - O(n^3)
  // Space complexity - O(n^2)
  def zero2(matrix: Matrix[Int]): Matrix[Int] = {
    val rows = matrix.length
    val columns = matrix.head.length
    val zeroPositions = new ArrayBuffer[(Int, Int)](rows * columns)

    for {
      i <- 0 until rows
      j <- 0 until rows
    } yield {
      if (matrix(i)(j) == 0) {
        zeroPositions.+=((i, j))
      }
    }

    for(i <- zeroPositions.indices) {
      zeroRowAndColumn(matrix)(zeroPositions(i)._1, zeroPositions(i)._2, rows, columns)
    }

    matrix
  }

  private def zeroRowAndColumn(matrix: Matrix[Int])
                              (row: Int, column: Int, rows: Int, columns: Int) = {
    for (k <- 0 until columns) {
      matrix(row)(k) = 0
    }
    for (k <- 0 until rows) {
      matrix(k)(column) = 0
    }
  }
}
