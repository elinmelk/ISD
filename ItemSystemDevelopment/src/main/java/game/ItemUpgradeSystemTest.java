package game;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class ItemUpgradeSystemTest {
    private Inventory inventory;

    @BeforeEach
    void setUp() {
        inventory = new Inventory();
    }

    @Test
    void testUpgradeCommonToGreat() {
        inventory.addItem(new Item("Iron Sword", Item.Rarity.COMMON));
        inventory.addItem(new Item("Iron Sword", Item.Rarity.COMMON));
        inventory.addItem(new Item("Iron Sword", Item.Rarity.COMMON));
        assertTrue(inventory.upgradeItem("Iron Sword", Item.Rarity.COMMON));
    }

    @Test
    void testUpgradeFailureNotEnoughItems() {
        inventory.addItem(new Item("Iron Sword", Item.Rarity.COMMON));
        assertFalse(inventory.upgradeItem("Iron Sword", Item.Rarity.COMMON));
    }

    @Test
    void testUpgradeRareToEpic() {
        inventory.addItem(new Item("Iron Sword", Item.Rarity.RARE));
        inventory.addItem(new Item("Iron Sword", Item.Rarity.RARE));
        inventory.addItem(new Item("Iron Sword", Item.Rarity.RARE));
        assertTrue(inventory.upgradeItem("Iron Sword", Item.Rarity.RARE));
    }

    @Test
    void testUpgradeEpicToLegendary() {
        inventory.addItem(new Item("Iron Sword", Item.Rarity.EPIC));
        inventory.addItem(new Item("Iron Sword", Item.Rarity.EPIC));
        inventory.addItem(new Item("Iron Sword", Item.Rarity.EPIC));
        assertTrue(inventory.upgradeItem("Iron Sword", Item.Rarity.EPIC));
    }
    @Test
    void testUpgradeWithMismatchedItemNames() {
        inventory.addItem(new Item("Iron Sword", Item.Rarity.COMMON));
        inventory.addItem(new Item("Steel Sword", Item.Rarity.COMMON));
        inventory.addItem(new Item("Iron Sword", Item.Rarity.COMMON));
        assertFalse(inventory.upgradeItem("Iron Sword", Item.Rarity.COMMON));
    }
    @Test
    void testUpgradeWithMismatchedRarities() {
        inventory.addItem(new Item("Iron Sword", Item.Rarity.COMMON));
        inventory.addItem(new Item("Iron Sword", Item.Rarity.GREAT));
        inventory.addItem(new Item("Iron Sword", Item.Rarity.COMMON));
        assertFalse(inventory.upgradeItem("Iron Sword", Item.Rarity.COMMON));
    }

    @Test
    void testFullUpgradePath() {
        inventory.addItem(new Item("Iron Sword", Item.Rarity.COMMON));
        inventory.addItem(new Item("Iron Sword", Item.Rarity.COMMON));
        inventory.addItem(new Item("Iron Sword", Item.Rarity.COMMON));
        assertTrue(inventory.upgradeItem("Iron Sword", Item.Rarity.COMMON));
        inventory.addItem(new Item("Iron Sword", Item.Rarity.GREAT));
        inventory.addItem(new Item("Iron Sword", Item.Rarity.GREAT));
        assertTrue(inventory.upgradeItem("Iron Sword", Item.Rarity.GREAT));
    }

}

