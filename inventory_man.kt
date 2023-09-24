data class Item(val name: String)

class Player {
    val inventory = mutableListOf<Item>()

    fun pickUpItem(item: Item) {
        inventory.add(item)
        println("You picked up ${item.name}.")
    }

    fun discardItem(item: Item) {
        if (inventory.contains(item)) {
            inventory.remove(item)
            println("You discarded ${item.name}.")
        } else {
            println("Item not found in your inventory.")
        }
    }

    fun showInventory() {
        println("Your Inventory:")
        for (item in inventory) {
            println("- ${item.name}")
        }
    }
}

fun main() {
    val player = Player()

    // Simulate a battle where items are dropped
    val droppedItem1 = Item("Health Potion")
    val droppedItem2 = Item("Sword")
    val droppedItem3 = Item("Gold Coin")

    // Player picks up the dropped items after the battle
    player.pickUpItem(droppedItem1)
    player.pickUpItem(droppedItem2)
    player.pickUpItem(droppedItem3)

    // Player decides to discard an item
    player.showInventory()
    player.discardItem(droppedItem2)

    // Player checks their updated inventory
    player.showInventory()
}
