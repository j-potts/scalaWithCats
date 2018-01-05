package Chap1

import cats.Eq
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

  "Eq" - {
    import Chap1.EqCatInstances._
    import cats.instances.option._

    val cat1 = Cat("Garfield",   38, "orange and black")
    val cat2 = Cat("Heathcliff", 33, "orange and black")
    "should compare the Cats correctly" in {
      Eq.eqv(cat1, cat2) should be(false)
    }

    "should compare the Cats wrapped in the Option type" in {
      val optionCat1 = Option(cat1)
      val optionCat2 = Option.empty[Cat]

      Eq.eqv(optionCat1, optionCat2) should be(false)
    }
  }

}
