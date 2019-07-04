// INTERVIEW CODING CHALLENGE #1
// Link: https://blog.junaideffendi.com/2019/02/interview-coding-challenge-1.html
// Author: Junaid Effendi

// Method 1
def findDups(input: List[Int]) : Set[Int] = {
  var result = List[Int]()
  for(i <- 0 to input.length-1){
    var count = 0
    for(j <- i+1 to input.length-1){
      if(input(i) == input(j)){
        result = result :+ input(i)
        count = count + 1 
      }
    }
  }
  result.toSet
}
findDups(List(1,2,3,4,2,5,5,3,5))

// Method 2
def findDups(input: List[Int]) : Set[Int] = {
  var result = List[Int]()
  val sortedInput = input.sorted 
  for(i <- 0 to sortedInput.length-2){
    if(sortedInput(i) == sortedInput(i+1))
      result = result :+ sortedInput(i)
  }
  result.toSet
}
findDups(List(1,2,3,4,2,5,5,3,5))

// Method 3
def findDups(input: List[Int]) : Set[Any] = {
  input.map(x => 
    if(input.filter(_ == x).size > 1) x else "").
    filter(_ != "").
    toSet
}
findDups(List(1,2,3,4,2,5,5,3,5))

// Method 4
def findDups(input: List[Int]) = list.diff(list.distinct).distinct

