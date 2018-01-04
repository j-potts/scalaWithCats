package Chap1

import cats.Show
import cats.instances.int._
import cats.instances.string._
import cats.syntax.show._

object ShowCatInstances {
  implicit lazy val show: Show[Cat] =
    Show.show[Cat](c => s"${c.name.show} is ${c.age.show} year-old ${c.color.show} cat.")
}
