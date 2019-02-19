

internal object Converter {
    fun convertLineToCoffeeShop(line: String): CoffeeShop {
        try {
            val coffeeShopDetailArray = line.split(",").toTypedArray()
            val name = coffeeShopDetailArray[0]
            val latitudeString = coffeeShopDetailArray[1]
            val longitudeString = coffeeShopDetailArray[2]
            val coordinates = Coordinates(latitudeString.toDouble(), longitudeString.toDouble())
            return CoffeeShop(coordinates, name)
        } catch (error: Throwable) {
            throw InvalidCsvException("line: \" $line \" is not valid")
        }
    }
}

internal class InvalidCsvException(message: String): Exception(message)