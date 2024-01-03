public class Arithmeticstask {
    public static void main(String[] args) throws Exception {
        double amountKWD = 86;
        double amountUSD = (amountKWD*3.25);
        double amountEUR = (amountKWD*2.97);
        System.out.println("Kuwaiti dinar to US Dollars ");
        System.out.println(amountKWD + " KWD" + " = "+ (amountUSD) + "USD");
        System.out.println("US Dollars to Kuwaiti dinar ");
        System.out.println(amountUSD + " USD" + " = "+ (amountUSD/3.25) + "KWD");
        System.out.println("Euro to Kuwaiti dinar ");
        System.out.println(amountEUR + " EUR" + " = "+ (amountEUR/2.97) + "KWD");
    }
}
