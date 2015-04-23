// TODO
//
// Make this an actor and write a message handler for at least the
// set method.
//
import akka.actor.Actor

case class SetPixelColour(x: Int, y: Int, c: Colour)

class Coordinator(var image: Image, val outfile: String) extends Actor {

  var waiting: Int = image.width * image.height

  def receive = {
    case SetPixelColour(x, y, c) => {
      this.set(x, y, c)
      if (waiting <= 0) print
    }
  }

  // TODO: make set a message
  private def set(x: Int, y: Int, c: Colour) = {
    image(x, y) = c
    waiting -= 1
  }

  private def print = {
    assert(waiting == 0)
    image.print(outfile)
  }
}
