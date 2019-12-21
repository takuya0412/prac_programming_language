class Rational(n:Int, d:Int) {
  require(d != 0)
  val number = n
  val denom = d
  override def toString: String = n + "/" + d
  def add(that: Rational)={
    new Rational(
      number * that.d + that.n * denom,
      denom * that.d
    )
  }

}
