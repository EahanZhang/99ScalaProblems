//Find the number of elements of a list
//

def length[A](ls: List[A]) : Int = {
  def lengthR(result: Int, curList: List[A]): Int = curList match {
    case Nil => result
    case _ :: tail => lengthR(result + 1, curList.tail)
  }

  lengthR(0, ls)
}

var a = List(1,2,3,4,5)
println(length(a))
