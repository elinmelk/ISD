package game;

public class Item {
    enum Rarity {
        COMMON, GREAT, RARE, EPIC, LEGENDARY
    }

    private final String name;
    private Rarity rarity;
    private int upgradeCount;

    public Item(String name, Rarity rarity) {
        this.name = name;
        this.rarity = rarity;
        this.upgradeCount = 0;
    }

    public String getName() {
        return name;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public int getUpgradeCount() {
        return upgradeCount;
    }

    public void upgrade() {
        if (rarity == Rarity.EPIC && upgradeCount < 2) {
            upgradeCount++;
        } else if (rarity == Rarity.EPIC && upgradeCount == 2) {
            rarity = Rarity.LEGENDARY;
            upgradeCount = 0;
        } else {
            rarity = Rarity.values()[rarity.ordinal() + 1];
        }
    }

    public boolean isSameType(Item other) {
        return this.name.equals(other.name) && this.rarity == other.rarity;
    }

    @Override
    public String toString() {
        return name + " [" + rarity + (rarity == Rarity.EPIC ? " " + upgradeCount : "") + "]";
    }
}
