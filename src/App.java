public class App {
    public static void main(String[] args) throws Exception {
        String firstname = "Mubarak";
        String lastname = "Aloraifan";
        int age = 22;
        int amount = 178;
        
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(age);
        System.out.println(amount);
        
        boolean isMarried = false;
        System.out.println(isMarried);

        double amount1 = 20;
        String deposit = "Deposit";
        String withdraw = "Withdraw";

        System.out.println("The amount is" + " " + amount1 + " "  + "KD");
        System.out.println("Would you like to "+deposit+" or "+withdraw+" ?");

        int amount2 = 5;
        System.out.println(amount2 +" plus "+ amount2 +" makes "+ (amount2+amount2));
        
        String fullName = " John doe";
        System.out.println("My name is" + fullName.substring(0,6).toUpperCase() + "and my last name Length is " + fullName.substring(6, 9).length());
        System.out.println(fullName.substring(6, 9).startsWith("d"));
        //
    }
}
