fun listToLowerCase(names: MutableList<String>) = names.replaceAll(String::lowercase)
fun removeAllAsAndBs(names: MutableList<String>)  = names.removeAll(listOf("a", "b"))
fun addAllAsAndBs(names: MutableList<String>,names2: MutableList<String>)  = names.addAll(names2)

fun getPercentageARep(listOfChars: MutableList<String>): String {
    var result = ""
    val sample: MutableList<String> = mutableListOf()
    listToLowerCase(listOfChars)
    addAllAsAndBs(sample,listOfChars)
    removeAllAsAndBs(sample)

    for (i in listOfChars) {
        if (i.length != 1) {
            result = "-1.0"
            break
        }
        if (!(listOfChars.containsAll(listOf("a", "b")))) {
            result = "-1.0"
            break
        }
        if (sample.isNotEmpty()) {
            result = "-1.0"
            break
        }
    }
    if(result == "-1.0"){
        return result
    }
        val aCount = listOfChars.count { it == "a" }
        val bCount = listOfChars.count { it == "b" }
        result = "a reps = ${String.format("%.1f", (aCount.toDouble() / (aCount + bCount)) * 100).toDouble()}%"


    return result

}


fun main() {
    println(getPercentageARep(mutableListOf("a", "B")))
}