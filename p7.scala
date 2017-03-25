// Faltten a nested list structure


def flatten(ls: List[Any]): List[Any] = ls flatMap {
  case ms: List[_] => flatten(ms)
  case e => List(e)
}

var a = List(List(1,2),3,List(List(1,3),2))
var result = flatten(a)
println(result)
