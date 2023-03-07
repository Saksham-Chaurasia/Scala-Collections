object TupleExample {

  def main(args: Array[String]) ={
    val myTuple = (1,2.0,3l,4.1,"test")
    val myTuple2 = new Tuple5(1,2.0,3l,4.1,"test")
    val myTuple3 = new Tuple6(1,2.0,3l,4.1,"test",(2,3))
    val myTuple6 = Tuple6(1,2.0,3l,4.1,"test",(2,3))


    println(myTuple._1)
    println(myTuple3._6._1)

    myTuple2.productIterator.foreach((x)=>{
      println(x)
    });
    myTuple2.productIterator.foreach((x)=>println(x));
    myTuple2.productIterator.foreach(println(_));
    val myTuple4 = ("a"->"b")
    println(myTuple4)

    var(z,i) = myTuple4
    println(z)
    println(i)
  }

}
