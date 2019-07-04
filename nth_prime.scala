// INTERVIEW CODING CHALLENGE #1
// Link: https://blog.junaideffendi.com/2019/07/interview-coding-challenge-2-nth-prime.html
// Author: Junaid Effendi

val n = 6

// Approach 1
def nthPrimeNumber(): Array[Int] = {
  var result = Array[Int]()
  for(i <- 1 to 10 * n){
    var count = 0
    for(j <- 2 to i-1){ 
      if(i % j == 0){ // Check the remainder for each value less than the number
        count = count + 1
      }
    }
    if(count == 0) // Add in Array if no divisor found
      result = result :+ i
  }
  return result
}
nthPrimeNumber()(n)

// Approach 2
def nthPrimeNumber(n: Int) : Int = {
  val range = (1 to 10 * n).toArray
  val result = range.map(i => 
    if((2 until i) forall (i % _ != 0)) i 
    else 0).filter(_ != 0)
  return result(n)
}

nthPrimeNumber(n)

// Approach 3
def nthPrimeNumber(n: Int) = 
  (1 to 10 * n).toArray.map(i => 
    if((2 until i) forall (i % _ != 0)) i 
    else 0).
  filter(_ != 0)(n)

nthPrimeNumber(n)

// Approach 4
def nthPrimeNumber(n: Int) : Int = {
  var result = Array[Int]()
  for(i <- 2 to 10 * n){
    var count = 0
    for(j <- 2 to i-1){ 
      if(i % j == 0){
        count = count + 1
      }
    }
    if (result.length-1 == n) return result(n)
    if(count == 0 ) result = result :+ i
  }
  return 0
}

nthPrimeNumber(n-1)

// Approach 5
def nthPrimeNumber(n: Int) : Int = {
  var count = 0 
  for(i <- 2 to 10 * n){
    if((2 until i) forall (i % _ != 0)) count = count + 1
    if(count-1 == n) return i // return when found
  }
  return 0
}

nthPrimeNumber(n-1)
