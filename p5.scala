// Reverse a list
//

def reverse[A](ls: List[A]): List[A] = {
  def reverseR[A](resList: List[A], curList: List[A]): List[A] = curList match {
    case Nil => resList
    case h :: tail => reverseR(h :: resList, tail)
  }
  reverseR(Nil, ls)
}


var ls = List(1,2,3,4,5,6)
var res = reverse(ls)
println(res)
