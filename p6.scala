// Find out whether a list is a palindrome
//


def isPalindrome[A](ls: List[A]): Boolean = {
  def reverseR[A](result: List[A], curList: List[A]): List[A] = curList match {
    case Nil => result
    case h :: tail => reverseR(h :: result, tail)
  }
  var result = reverseR(Nil, ls)
  if (ls.equals(result)) {
    true
  } else {
    false
  }
}


var ls = List(1,2,3,4,3,2,1)
var ns = List(1,3,4,2,1,1)
println(isPalindrome(ls))
println(isPalindrome(ns))
