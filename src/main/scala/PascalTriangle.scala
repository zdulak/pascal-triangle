object PascalTriangle extends App {
  val triangle = computePascalTriangle(4)
  printPascalTriangle(triangle)

  def printPascalTriangle(triangle: Seq[Seq[Int]]): Unit = {
    val maxOffset = triangle.length - 1
    triangle
      .zipWithIndex
      .map { case (row, i) => row.mkString(" " * (maxOffset - i), " ", " " * (maxOffset - i)) }
      .foreach(println)
  }

  def computePascalTriangle(rows: Int): Seq[Seq[Int]] = {
    for (i <- 0 until rows) yield
      for (j <- 0 to i) yield
        factorial(i) / (factorial(j) * factorial(i - j))
  }

  def factorial(n: Int): Int = (1 to n).product
}