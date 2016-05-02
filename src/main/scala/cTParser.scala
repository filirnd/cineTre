
import org.jsoup.Jsoup

/**
  * Created by filippo on 02/05/16.
  */


//Parse
class cTParser( city : String) {

  val site = s"http://www.grandecinema3.it/cinemalistresult.aspx?provincia=$city"

  val doc = Jsoup.connect(site).get
  val cineList = doc.select(".cinemalist-scheda-cinema").listIterator

  while(cineList.hasNext){
    val c = cineList.next()

    //println(c)
    val nome = c.getElementsByClass("descrizione").first()
    val indirizzo = c.getElementsByTag("span").first()

    println(Console.BOLD + Console.GREEN + nome.text() + Console.RESET +" -+- "+Console.BOLD +Console.GREEN  + indirizzo.text() + Console.RESET)

    val program = c.getElementsByTag("table").first()
    if(program == null){
      println(Console.CYAN +"  =+= "+ "Nessun film in programmazione qui.")
    }else{

      val films = program.getElementsByClass("box-film").listIterator

      //println(Console.CYAN +films)



      while(films.hasNext){
        val film = films.next()

        val scheda = film.getElementsByClass("scheda").first
        val titolo = scheda.getElementsByClass("titolofilm").first().text()
        val trama = scheda.getElementsByClass("titolofilm").first().getElementsByTag("a").first.attr("href")
        val root = "http://www.grandecinema3.it"

        val genere = scheda.getElementsByClass("label").first.nextSibling.toString.replace("&nbsp;","")

        val orari = scheda.getElementsByClass("orario").first.text
        println(Console.CYAN +"  =+= "+ titolo  +" - " + root+trama )
        println(Console.WHITE + "      "+  genere + " - "+ orari)



      }



    }

    println("\n")

    //

  }

  println(Console.RESET)







}


