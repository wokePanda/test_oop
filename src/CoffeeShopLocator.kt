import java.lang.NumberFormatException

fun main(args: Array<String>) {

    if (args.size != 3) { throw InvalidInput("Incorrect number of arguments") }

    try {
        val longitude: Double = args[0].toDouble()
        val latitude: Double = args[1].toDouble()
        val filename: String = args[2]
    } catch (e: NumberFormatException) {
        throw NumberFormatException("Input format is incorrect")
    }

}

internal class InvalidInput(message: String): Exception(message)