// INTERVIEW CODING CHALLENGE #1
// Link: https://blog.junaideffendi.com/
// Author: Junaid Effendi

// Method 1
val n = 6
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
