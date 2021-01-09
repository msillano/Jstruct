/*
 *from: The Java ® Language Specification - Java SE 8 Edition
 * (2015-02-13)
 * pag. 275:  8.9.2-1 + 8.9.3-2. Switching Over Enum Constants
 * 1) import  test2.java in JStruct
 * 2) export from JStruct in test02_a.java
 * 3) compare/compile test02.java and test02_a.java
 */
enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

    Coin(int value) { this.value = value; }
    private final int value;
    public int value() { return value; }
    }

class Test {
    enum CoinColor { COPPER, NICKEL, SILVER }

    static CoinColor color(Coin c) {
        switch (c) {
            case PENNY:
                return CoinColor.COPPER;
            case NICKEL:
                return CoinColor.NICKEL;
            case DIME: case QUARTER:
                return CoinColor.SILVER;
            default:
                throw new AssertionError("Unknown coin: " + c);
            }
        }

    public static void main(String[] args) {
        for (Coin c : Coin.values())
            System.out.println(c + "\t\t" +  c.value() + "\t" + color(c));
        }
    }
