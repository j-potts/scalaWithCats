package Chap2

trait Semigroup[A] {
  def combine(x: A, y: A): A
}
