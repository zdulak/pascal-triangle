import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class PascalTriangleSpec extends AnyFlatSpec with should.Matchers {
  behavior of "The computePascalTriangle method"

  it should "return sequence with pascal triangle with 4 rows for 4" in {
    PascalTriangle.computePascalTriangle(4) shouldBe Seq(
      Seq(1),
      Seq(1, 1),
      Seq(1, 2, 1),
      Seq(1, 3, 3, 1))
  }
}
