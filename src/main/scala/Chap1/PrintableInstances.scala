package Chap1

object PrintableInstances {
  implicit lazy val PrintableString: Printable[String] = (fs: String) => fs

  implicit lazy val PrintableInt: Printable[Int] = (i: Int) => i.toString

  implicit lazy val PrintableCat: Printable[Cat] = (c: Cat) =>
    s"${c.name} is ${c.age} year-old ${c.color} cat."
}
