package game;

import java.util.ArrayList;
import java.util.List;

class Inventory {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItems(List<Item> toRemove) {
        items.removeAll(toRemove);
    }

    public boolean upgradeItem(String name, Item.Rarity rarity) {
        List<Item> matchingItems = new ArrayList<>();

        for (Item item : items) {
            if (item.getName().equals(name) && item.getRarity() == rarity) {
                matchingItems.add(item);
            }
        }

        int requiredItems = rarity == Item.Rarity.EPIC ? 2 : 3;
        if (matchingItems.size() >= requiredItems) {
            Item upgradedItem = matchingItems.get(0);
            upgradedItem.upgrade();
            removeItems(matchingItems.subList(0, requiredItems));
            addItem(upgradedItem);
            return true;
        }
        return false;
    }

    public void displayInventory() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
