object PascalTriangleApp extends App {
  val triangle = computePascalTriangle(16)
  printPascalTriangle(triangle)

  def printPascalTriangle(triangle: Seq[Seq[Int]]): Unit = {
    val maxElemWidth = triangle.last(triangle.last.length / 2).toString.length

    def rowToString(row: Seq[Int]): String = row.map(_.toString.center(maxElemWidth)).mkString(" ")

    val triangleWidth = rowToString(triangle.last).length
    triangle.map(rowToString(_).center(triangleWidth)).foreach(println)
  }

  def computePascalTriangle(rows: Int): Seq[Seq[Int]] = {
    for (i <- 0 until rows) yield
      for (j <- 0 to i) yield
        (factorial(i) / (factorial(j) * factorial(i - j))).toInt
  }

  def factorial(n: Int): BigInt = (BigInt(1) to BigInt(n)).product

  implicit class StringExtensions(val str: String) {
    def center(width: Int): String = {
      val offSet = (width - str.length) / 2
      val newString = if (offSet > 0) " " * offSet + str + " " * offSet else str
      if (newString.length < width) newString + " " else newString
    }
  }
}
