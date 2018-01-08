package Chap2

import cats.syntax.semigroup._

object AdditionMethods {

  def add[A: cats.Monoid](items: List[A]): A =
    items.fold(cats.Monoid[A].empty)(_ |+| _)

}
