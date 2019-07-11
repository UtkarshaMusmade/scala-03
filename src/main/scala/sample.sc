def sum(x:List[Int]):Int={
x match{
  case Nil=>0
case head::tail=>head+sum(tail)
}
}

println(sum(List(1,2,3,4)))