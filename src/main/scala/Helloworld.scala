object EchoApp {
  def main(args:Array[String]) = {
     args.foreach(x => println("The value of parameter is " + x))
    var i =0
    while (i <= args.length){
      println(i)
      i = i + 1
    }
    }

}
