trait Functors {
  def map [A, B](f: A => B): Option[A] => Option[B]
}