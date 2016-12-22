import scala.List

object code {
  /*
  ==================
  appendMath
  	
  	Добавляет список b в конец списка a. Использует match
  ==================
  */
  def appendMatch(a: List[Any], b: List[Any]) = {
    def appendMatch_r(a: List[Any], b: List[Any]): List[Any] = a match {  //_r значит рекурсивно
      case Nil => b
      case h :: t => appendMatch_r(t, h :: b)
    }
    
    appendMatch_r(a.reverse, b)
  }
  
  /*
  ==================
  append
  	
  	Добавляет список b в конец списка a с помощью foldLeft
  ==================
  */
  def append(a: List[Any], b: List[Any]) =
    a.reverse.foldLeft(b){ (x, y) => y :: x }
  
  /*
  ==================
  main
  ==================
  */ 
  def main(args: Array[String]) {
    val l1 = List(1, 2, 3, 4, 5)
    val l2 = List(6, 7, 8, 9, 10)
    
    println("List 1 = " + l1)
    println("List 2 = " + l2)
    
    println("append(l1, l2) = " + append(l1, l2))
    println("appendMatch(l1, l2) = " + appendMatch(l1, l2))
    
    val l3 = List()
    val l4 = List()
    
    println("List 3 = " + l3)
    println("List 4 = " + l4)
    
    println("append(l3, l4) = " + append(l3, l4))
    println("appendMatch(l3, l4) = " + appendMatch(l3, l4))
    
    val l5 = List()
    val l6 = List(5)
    
    println("List 5 = " + l5)
    println("List 6 = " + l6)
    
    println("append(l5, l6) = " + append(l5, l6))
    println("appendMatch(l5, l6) = " + appendMatch(l5, l6))
  }
}
