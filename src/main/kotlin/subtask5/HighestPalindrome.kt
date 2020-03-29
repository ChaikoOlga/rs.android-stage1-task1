package subtask5

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {

        val array = digitString.toCharArray()
        var count = 0
        for (index in array.indices) {
            if (index > array.size / 2) break

            if (array[index] != array[array.size - index - 1]) {
                if (array[index] == '0') {
                    array[index] = '9'
                }
                array[array.size - index - 1] = array[index]
                count++
            } else if (count > k) {
                return "-1"
            }
        }
        return String(array)
    }
}
