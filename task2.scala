import scala.List

object code {
  type la = List[Any]
  
  /*
  ==================
  appendMath
  	
  	Добавляет список b в конец списка a. Использует match
  ==================
  */
  def appendMatch(a: la, b: la) = {
/*  val tmp = a
    def appendMatch_r(a: la, b: la): la = a match {
      case Nil => b
      case h :: Nil => {h :: b; tmp}    //Было бы неплохо, но увы
      case h :: t => appendMatch_r(t, b)
    }
    appendMatch_r(a, b)*/
    
    def appendMatch_r(a: la, b: la): la = a match {
      case Nil => b
      case h :: t => appendMatch_r(t, h :: b)
    }
    def rev_r(a: la, b: la): la = b match {    //Без разворота, явного или неявного не обойтись.
      case Nil => a
      case h :: t => rev_r(h::a, t)
    }
    appendMatch_r(rev_r(Nil, a), b)
  }
  
  /*
  ==================
  append
  	
  	Добавляет список b в конец списка a с помощью foldLeft
  ==================
  */
  def append(a: la, b: la) =
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
    
    val l7 = List(6)
    val l8 = List()
    
    println("List 7 = " + l7)
    println("List 8 = " + l8)
    
    println("append(l7, l8) = " + append(l7, l8))
    println("appendMatch(l7, l8) = " + appendMatch(l7, l8))
  }
}
