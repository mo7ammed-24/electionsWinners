fun main() {
    print(electionsWinners(mutableListOf(2,3,5,2),3))
}

fun electionsWinners(votes: MutableList<Int>, k: Int):Int{
    var maxValue=votes[0]
    for(i in 1 until votes.size)
        if(votes[i]>maxValue)
            maxValue=votes[i]
    var m=votes.filter{ it+k>maxValue}.size
    var count=0
    votes.forEach{if(it==maxValue) count++}
    return if(k==0 && count==1) 1 else m
}