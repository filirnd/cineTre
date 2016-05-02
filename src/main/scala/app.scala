/**
  * Created by filippo on 02/05/16.
  */
object app extends App{

    if(args.length==1){

      println("                                                                        \n  ,ad8888ba,   88                      888888888888                     \n d8\"'    `\"8b  \"\"                           88                          \nd8'                                         88                          \n88             88  8b,dPPYba,    ,adPPYba,  88  8b,dPPYba,   ,adPPYba,  \n88             88  88P'   `\"8a  a8P_____88  88  88P'   \"Y8  a8P_____88  \nY8,            88  88       88  8PP\"\"\"\"\"\"\"  88  88          8PP\"\"\"\"\"\"\"  \n Y8a.    .a8P  88  88       88  \"8b,   ,aa  88  88          \"8b,   ,aa  \n  `\"Y8888Y\"'   88  88       88   `\"Ybbd8\"'  88  88           `\"Ybbd8\"' v0.1\n                                                                        \n                                                                        ")

      println("            GrandeCinema3.it showtimes in your terminal.\n            Written in Scala with <3 by Filippo Randazzo\n                      https://github.com/filirnd")
      println()


      println()

      val parser = new cTParser(args(0))




    }else{

      println("Usage: cinetre <prov> \nExample(Catania): cinetre CT ")
    }

}
