object ImplicitParameters {

  def add(x: Int)(implicit y: Int) = x + y

  add(11)

}
