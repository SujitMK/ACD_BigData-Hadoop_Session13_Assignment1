

object GCD {
  
  def gcd(num1:Int,num2:Int):Int = 
  {
    if (num2 == 0)
      num1
    else 
      return gcd(num2,num1%num2)
  }
  
  def main(args: Array[String]):Unit = 
  {
    println("Enter two numbers to get the GCD")
    
    var num1 = Console.readInt()
    var num2 = Console.readInt()
    
    println("GCD of numbers "+num1+" and "+num2+" is :"+gcd(num1,num2))  
  }
}