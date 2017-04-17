package es.david.cap02

// un comentario
/* un comentario */
/** documentacion */
object MyModule extends App {
  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }

}