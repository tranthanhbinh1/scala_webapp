import mill._, scalalib._


object app extends ScalaModule {
  def scalaVersion = "3.1.3"

  def ivyDeps = Agg(
    ivy"com.lihaoyi::cask:0.8.3",
    ivy"com.lihaoyi::scalatags:0.9.1".withDottyCompat(scalaVersion()),
  )
  object test extends Tests{
    def testFramework = "utest.runner.Framework"

    def ivyDeps = Agg(
      ivy"com.lihaoyi::utest::0.7.10",
      ivy"com.lihaoyi::requests::0.6.9",
    )
  }
}
