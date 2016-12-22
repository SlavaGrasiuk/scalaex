object code {
  /*
  ==================
  fib
  
  	Рекурсия
  ==================
  */
  def fib(n: BigInt): BigInt =
    if (n > 1) fib(n - 1) + fib(n - 2)
    else n

  /*
  ==================
  fibWithTailRec
  	
  	Обёртка для удобства вызова
  ==================
  */  
  def fibWithTailRec(n: BigInt) =
    if (n > 1) fibIter(1, 1, n - 2)
    else n

  /*
  ==================
  fibIter
  
  	Хвостовая рекурсия
  ==================
  */ 
  private def fibIter(prev: BigInt, current: BigInt, n: BigInt): BigInt = 
    if (n == 0) current
    else fibIter(current, prev + current, n - 1)
  
  /*
  ==================
  main
  ==================
  */ 
  def main(args: Array[String]) {
      println("fibWithTailRec(1000) = " + fibWithTailRec(1000));  //Ok
      println("fibWithTailRec(2) = " + fibWithTailRec(2));
      
      println("fib(2) = " + fib(2));
      println("fib(1000) = " + fib(1000));   //Not Ok
  }
}
