package Chap1

object PrintableSyntax {

  implicit class PrintableOps[A](v: A) {
    def format(implicit p: Printable[A]): String = p.format(v)
    def print(implicit p: Printable[A]): Unit = println(p.format(v))
  }

}
