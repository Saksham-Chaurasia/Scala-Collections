object MapExample {

  def main(args:Array[String]): Unit = {
    val myMap = Map(1->"test","sss"->"sss")
    println(myMap)
    println(myMap(1))
    println(myMap.keys)
    println(myMap.values)
    println(myMap.isEmpty)
    for(i<- myMap.keys)
      println(s"$i===>${myMap(i)}")
  }


}
