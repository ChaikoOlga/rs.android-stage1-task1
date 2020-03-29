package subtask1

import java.util.*

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyArray = LinkedList<Int>()
        for (i in sadArray.indices) {
            happyArray.add(sadArray[i])
        }
        var i = 1
        while (i < happyArray.size - 1) {
            if (i != 0 && happyArray[i] > happyArray[i + 1] + happyArray[i - 1]) {
                happyArray.removeAt(i)
                i--
            } else {
                i++
            }
        }
        return happyArray.toIntArray()
    }
}
