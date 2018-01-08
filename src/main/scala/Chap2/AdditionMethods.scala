package Chap2

import cats.instances.int._
import cats.syntax.semigroup._

object AdditionMethods {

  def add(items: List[Int]): Int =
    items.fold(Monoid[Int].empty)((acc,i) =>
      acc |+| i
    )

}
