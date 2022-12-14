package app
import scalatags.Text.all._
object MinimalApplication extends cask.MainRoutes{
  @cask.get("/")
  def hello() = {
    doctype("html")(
      html(
        body(
          h1("Hello World"),
          p("This is my first Scala web app"),
          p("Work in progress")
        )
      )
    )
  }

  @cask.post("/do-thing")
  def doThing(request: cask.Request) = {
    request.text().reverse
  }

  initialize()
}
