import scala.List

object code {
  
  /*
  ==================
  listCheck
  	
  	Проверяет, не пустой ли список
  ==================
  */
  private def listCheck(a: List[Any]) = a match {   
    case Nil => false
    case _ => true
  }
  
  /*
  ==================
  append
  	
  	Добавляет список b в конец списка a с помощью foldLeft
  ==================
  */
  def append(a: List[Any], b: List[Any]) =
    if( !listCheck(a) ) "First list empty!"
    else if( !listCheck(b) ) "Second list is empty!"
    else a.reverse.foldLeft(b){ (x, y) => y :: x }
  
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
    
    val l3 = List()
    val l4 = List()
    
    println("List 3 = " + l3)
    println("List 4 = " + l4)
    
    println("append(l3, l4) = " + append(l3, l4))
  }
}
