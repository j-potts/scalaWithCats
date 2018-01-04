package Chap1

import org.scalatest.{FreeSpec, Matchers}

class Chap1Spec extends FreeSpec with Matchers {

  "Printable" - {
    import Chap1.PrintableInstances._
    import Chap1.PrintableSyntax._
    "should format Cat output correctly" in {
      Cat("Data", 999, "white-ish").format should be("Data is 999 year-old white-ish cat.")
    }

  }

  "Show" - {
    import cats.syntax.show._
    import Chap1.ShowCatInstances._
    "should format Cat output correctly" in {
      Cat("Picard", 45, "tabby").show should be("Picard is 45 year-old tabby cat.")
    }
  }

}
