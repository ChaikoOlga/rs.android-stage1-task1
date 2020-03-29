package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {

        var min:Int=input[0]
        var max:Int=input[0]
        var sum:Int=input[0]

        for (i in 1 until input.size){
            if (min > input[i]) {
                min=input[i]
            }
            if (max<input[i]){
                max=input[i]
            }
            sum=sum+input[i]
        }
        val miniMaxSum= arrayOf(sum-max, sum-min)
        return miniMaxSum.toIntArray()
    }
}
