object Main extends App{
  def area(shape:String,first_val:Int,second_val:Int,f:(Int,Int)=>Int)={

shape match{

  case "rectangle" =>f(first_val,second_val)
  case "rhombus" =>f(first_val,second_val)
  case "Parallelogram" =>f(first_val,second_val)

}

}
  val areaRect=(first_val: Int, second_val: Int)=>first_val*second_val
  val areaRhombus=(first_val: Int, second_val: Int)=>first_val*second_val/2
  val areaParallelogram=(first_val: Int, second_val: Int)=>first_val*second_val

  val shape1:String="rectangle"
  val shape2:String="rhombus"
  val shape3:String="Parallelogram"

println("Area of Rectangle"+area(shape1,4,5,areaRect))
  println("Area of Rhombus"+area(shape2,4,5,areaRhombus))
  println("Area of Parallelogram"+area(shape3,4,5,areaParallelogram))



  fib(9)


    def fib(num:Int):Int = {

      def fibo(num1:Int, a:Int,b:Int): Int =
      {

        if(num1==0) {
          a
        }
        else {
          println(a)
          fibo(num1 - 1, b, a + b)


        }
      }
      fibo(num,0,1)

    }

  def sum(first_val:Int,second_val:Int,fun:(Int,Int)=>Int)=fun(first_val,second_val)



  val sumOfSquare = (first_val: Int, second_val: Int) => (first_val*first_val + second_val*second_val)
  val sumOfCube = (first_val: Int, second_val: Int) => (first_val*first_val*first_val + second_val*second_val*second_val)
  val sumOfInt = (first_val: Int, second_val: Int) => (first_val + second_val)





  println("Sum Of Squares"+sum(2,3,sumOfSquare))
  println("Sum of Cube"+sum(2,3,sumOfSquare))
  println("Area of Integers"+sum(2,3,sumOfSquare))



}
