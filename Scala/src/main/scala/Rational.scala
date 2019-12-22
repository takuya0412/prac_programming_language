class Rational(n:Int, d:Int) {
  require(d != 0)
  val number = n
  val denom = d
  def this(n: Int) = this(n, 1)
  override def toString: String = n + "/" + d
  def add(that: Rational)={
    new Rational(
      number * that.d + that.n * denom,
      denom * that.d
    )
  }
  def lessThan(that: Rational) = {
    this.number * that.denom < that.number * this.denom
  }

  def max(that: Rational) = {
    if (this.lessThan(that)) that else this
  }

}
