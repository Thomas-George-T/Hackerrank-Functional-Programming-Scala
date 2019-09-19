//https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list/problem

def f(arr:List[Int]):List[Int] = {
    arr.zipWithIndex.collect{case (x,i) if i % 2 !=0 => x}
}