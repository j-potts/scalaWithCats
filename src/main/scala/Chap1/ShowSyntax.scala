package Chap1

import cats.Show

object ShowSyntax {
  implicit class ShowOps[A](v: A) {
    def show(implicit s: Show[A]): String = v.show
    def print(implicit s: Show[A]): Unit = println(v.show)
  }
}
