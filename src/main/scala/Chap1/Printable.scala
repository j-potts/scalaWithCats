package Chap1

object Printable {

  def format[A](fs: A)(implicit p: Printable[A]): String = p.format(fs)

  def print[A](ps: A)(implicit p: Printable[A]): Unit = println(format(ps))
}

trait Printable[A] {

  def format(fs: A): String

}
