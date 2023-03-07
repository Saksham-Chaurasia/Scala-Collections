import scala.io.StdIn.readInt

object TestArrays {
      def main(args:Array[String]) ={
//        val myArr = Array.ofDim[Int](2,2)
//        val n:Int = 2
//        val myArr2 = Array(Array(1,2,3,4),Array(3,4,5,6))
//
//        myArr(0)(0) = 10
//        myArr(0)(1) = 20
//        println(myArr(0)(0))
//
//        for (i<- 0 until n; j<-0 until n){
//          print(i,j)
//          //Accessing the elements
//          println("=" + myArr(i)(j))
//        }
//
//        // 1, 2, 3, 4
//        // 3, 4, 5, 6
//        for(i<-0 until myArr2.length ){
//          for(j<-0 until myArr2(i).length) {
//            print(myArr2(i)(j) )
//            if(j<myArr2(i).length-1)
//              print(" , ")
//          }
//
//          println()
//        }

        println("Enter the outer 3rd Dimensional of an Array: ")
        val d= readInt()
        println("Enter the second dimension of an Array " )
        val d2 = readInt()
        println("Enter the first dimension of an Array ")
        val d3 = readInt()

        var myArr3 = Array.ofDim[Int](d,d2,d3)

        for(i<-0 until d){
          for(j<-0 until d2){

            for(k<-0 until d3){
              println("Enter your array value " + " my Array" + i+j+k +" = ")
              myArr3(i)(j)(k) = readInt();
            }
          }
        }
        for (i <- 0 until d) {
          for (j <- 0 until d2) {

            for (k <- 0 until d3) {
              println( "myArray" + i +j +k + "=" +myArr3(i)(j)(k) + " ")
            }
            println()
          }
          println()
        }



        var v = Array(1,2,4,5,6,7,8,9,10)
        v.foreach(n=>{
          if(n==5){
            println("Five ")
          }
          else{
            println(n)
          }
        })
        v.foreach(n=> println(n))
        v.foreach(println(_))   //place holder notation


        val a = 10
        val b =10
        val v1 = testM(_+_,a,b,30.0)
        println("===")
        println(s"===>$v1")

      }

  def testM(highFunction:(Int,Int)=>Int,a:Int,b:Int, d:Double): Double = {
    highFunction(a,b)*d
  }

  //partially applied function


}
