object ArrayPartition {
  def main(args:Array[String]): Unit = {
    val myArr = Array(1,2,3,4,5,6,7,8,9)
    val (even,odd) = myArr.partition((p)=>{
      if(p%2==0){
         true;
      }else{
         false;
      }
    })

    val (even1,odd1) = myArr.partition(_%2==0)
    even.foreach(print(_))
    println()
    odd.foreach(print(_))

    println()
    even1.foreach(print(_))
    println()
    odd1.foreach(print(_))

  }

}
