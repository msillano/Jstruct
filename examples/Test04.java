/*
 *from: The Java ® Language Specification - Java SE 8 Edition
 * (2015-02-13)
 * Example 8.9.2-2. Enum Type With Members
 * 1) import  test04.java in JStruct
 * 2) export from JSTRUCT in test04_a.java
 * 3) compare/compile test04.java and test04_a.java
 */


//
enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
    Coin(int value) {
        this.value = value;
    }
    private final int value;
    public int value() {
        return value;
    }
}


class Test04 {
    public static void main(String[] args) {
        for (Coin c : Coin.values()) {
            System.out.println(c + "\t\t" + c.value() + "\t" + color(c));
        }
    }
    private enum CoinColor {
        COPPER, NICKEL, SILVER
    }
    private static CoinColor color(Coin c) {
        switch (c) {
        case PENNY:
            return CoinColor.COPPER;

        case NICKEL:
            return CoinColor.NICKEL;

        case DIME:
        case QUARTER:
            return CoinColor.SILVER;

        default:
            throw new AssertionError("Unknown coin: " + c);
        }
    }
}
