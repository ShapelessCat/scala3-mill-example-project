import mill._, scalalib._

object root extends SbtModule {
  def millSourcePath = ammonite.ops.pwd
  def scalaVersion = "3.0.0-M3"
  def publishVersion = "0.1.0"
}
