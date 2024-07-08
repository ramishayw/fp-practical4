object Q1 extends App {
    // item names array as string
    val itemNames = Array("apple", "banana", "orange", "grape")
    // corresponding item quantities as integers
    val itemQuantities = Array(100, 200, 100, 400)

    // print item names and quantities
    def displayInventory(itemNames: Array[String], itemQuantities: Array[Int]): Unit = {
        if (itemNames.nonEmpty) {
            println(itemNames.head + " " + itemQuantities.head)
            displayInventory(itemNames.tail, itemQuantities.tail)
        }
    }

    displayInventory(itemNames, itemQuantities)

    // Restock item quantities
    def restockItem(itemName: String, restockedQuantity: Int): Unit = itemName match {
        case "apple" => itemQuantities(0) = itemQuantities(0) + restockedQuantity
        case "banana" => itemQuantities(1) = itemQuantities(1) + restockedQuantity
        case "orange" => itemQuantities(2) = itemQuantities(2) + restockedQuantity
        case "grape" => itemQuantities(3) = itemQuantities(3) + restockedQuantity
        case _ => println("Invalid item name")
    }

    val restockItemName = "banana"
    restockItem(restockItemName, 50)

    println("New total of " + restockItemName + "s is: " + itemQuantities(itemNames.indexOf(restockItemName)))

    // Sell item quantities
    def sellItem(itemName: String, soldQuantity: Int): Unit = {
        val itemIndex = itemNames.indexOf(itemName)
        if (itemIndex == -1) {
            println("Invalid item name")
        } else if (itemQuantities(itemIndex) < soldQuantity) {
            println("Out of stock")
        } else {
            itemQuantities(itemIndex) = itemQuantities(itemIndex) - soldQuantity
            println("New total of " + itemName + "s is: " + itemQuantities(itemIndex))
        }
    }

    val soldItemName = "banana"
    val soldAmount = 500
    sellItem(soldItemName, soldAmount)
}

