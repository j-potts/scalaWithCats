package Chap2

import cats.instances.double._
import cats.syntax.semigroup._

object OrderMonoidInstances {

  implicit val monoidOrder: cats.Monoid[Order] = new cats.Monoid[Order] {
    override def combine(a: Order, b: Order): Order =
      Order(
        a.totalCost |+| b.totalCost,
        a.quantity |+| b.quantity
      )

    override def empty: Order = Order(0,0)
  }

}
