package subtask3

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = 0
        for (i in 0 until bill.size) {
            sum = sum + bill[i]
        }
        val actualBill: Int = ((sum - bill[k]) / 2)
        return if (b == actualBill) {
            "Bon Appetit"
        } else {
            (b - actualBill).toString().toLowerCase()
        }
    }
}
