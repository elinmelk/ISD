package game;

public class ItemUpgradeSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addItem(new Item("Iron Sword", Item.Rarity.COMMON));
        inventory.addItem(new Item("Iron Sword", Item.Rarity.COMMON));
        inventory.addItem(new Item("Iron Sword", Item.Rarity.COMMON));

        System.out.println("Before Upgrade:");
        inventory.displayInventory();

        if (inventory.upgradeItem("Iron Sword", Item.Rarity.COMMON)) {
            System.out.println("\nUpgrade Successful!");
        } else {
            System.out.println("\nUpgrade Failed!");
        }

        System.out.println("After Upgrade:");
        inventory.displayInventory();

        Inventory inventory1 = new Inventory();

        inventory1.addItem(new Item("Iron Sword", Item.Rarity.RARE));
        inventory1.addItem(new Item("Iron Sword", Item.Rarity.RARE));
        inventory1.addItem(new Item("Iron Sword", Item.Rarity.RARE));

        System.out.println("Before Upgrade:");
        inventory1.displayInventory();

        if (inventory1.upgradeItem("Iron Sword", Item.Rarity.RARE)) {
            System.out.println("\nUpgrade to Epic Successful!");
        } else {
            System.out.println("\nUpgrade to Epic Failed!");
        }

        System.out.println("After Upgrade:");
        inventory1.displayInventory();
    }
}
