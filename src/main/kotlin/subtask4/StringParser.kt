package subtask4

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val wordArray = mutableListOf<String>()
        for (i in inputString.indices) {
            val word = when (inputString[i]) {
                '<' -> addWord(inputString.substring(i), 1)
                '(' -> addWord(inputString.substring(i), 2)
                '[' -> addWord(inputString.substring(i), 3)
                else -> ""
            }
            if (word.length != 0 || word != "") {
                wordArray.add(word)
            }
        }
        return wordArray.toTypedArray()
    }
}

    fun addWord(subString: String, number: Int): String {
        val firstChar = when (number) {
            1 -> '<'
            2 -> '('
            3 -> '['
            else -> ""
    }
        val finalChar = when (number) {
            1 -> '>'
            2 -> ')'
            3 -> ']'
            else -> ""
    }

        var word = ""
        var check = 0

        for (i in 1 until subString.length) {
            if (subString[i] == firstChar)
                check = check + 1
            else if (subString[i] ==
                finalChar && check != 0
        )
                check = check - 1
            else if (subString[i] == finalChar && check == 0) {
                word = subString.substring(1, i)
            break
        }
    }
    return word
}

