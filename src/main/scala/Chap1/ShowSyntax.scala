package Chap1

import cats.Show
import cats.syntax.show._

object ShowSyntax {
  implicit class ShowOps[A](v: A) {
    def print(implicit s: Show[A]): Unit = println(v.show)
  }
}
