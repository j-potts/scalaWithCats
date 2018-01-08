package Chap2

object BooleanMonoidInstances {

  implicit val booleanAndMonoid = new Monoid[Boolean] {
    override def combine(x: Boolean, y: Boolean): Boolean = x && y

    override def empty: Boolean = true
  }

  implicit val booleanOrMonoid = new Monoid[Boolean] {
    override def combine(x: Boolean, y: Boolean): Boolean = x || y
    override def empty: Boolean = false
  }

  implicit val booleanEitherMonoid = new Monoid[Boolean] {
    override def combine(x: Boolean, y: Boolean): Boolean =
      (!x && y) || (x && !y)

    override def empty: Boolean = false
  }

  implicit val booleanXnorMonoid = new Monoid[Boolean] {
    override def combine(x: Boolean, y: Boolean): Boolean =
      (!x || y) && (x || !y)

    override def empty: Boolean = true
  }

}
