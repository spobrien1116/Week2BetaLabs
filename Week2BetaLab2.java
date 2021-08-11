public class Week2BetaLab2 {

    public static void main(String[] args) {
        String loyaltyMemberStatus = "SILVER";
        double loyaltyMemberDiscount = 0.0;
        //Sets up a switch stating loyalty member discount based on loyalty member status
        switch (loyaltyMemberStatus) {
            case "SILVER":
                loyaltyMemberDiscount = 0.10;
                break;
            case "GOLD":
                loyaltyMemberDiscount = 0.15;
                break;
            case "PLATINUM":
                loyaltyMemberDiscount = 0.25;
                break;
            default:
        }
        System.out.println("Loyalty member discount is " + loyaltyMemberDiscount);
        double billTotal = 636.74;
        double adjustedTotal = billTotal - (loyaltyMemberDiscount * billTotal);
        //I chose to nest a switch inside of an if else condition so more info could be printed explaining the data
        if (adjustedTotal > 500.00) {
            System.out.println("Your total comes to " + adjustedTotal + ".");
            switch (loyaltyMemberStatus) {
                case "SILVER":
                    loyaltyMemberStatus = "GOLD";
                    System.out.println("You have been upgraded to gold.");
                    break;
                case "GOLD":
                    loyaltyMemberStatus = "PLATINUM";
                    System.out.println("You have been upgraded to platinum.");
                    break;
                case "PLATINUM":
                    System.out.println("Thank you for your continued loyalty.");
                default:
                    loyaltyMemberStatus = "SILVER";
                    System.out.println("You have been upgraded to silver.");        
            }
        } else {
            System.out.println("Your total comes to " + adjustedTotal + ".");
        }
        //A system checking username and password matches. Using .equals is proper for strings instead of ==
        String username = "Tommy123";
        String password = "12345";
        if (username.equals("Tommy123") && password.equals("12345")) {
            System.out.println("login successful");
        } else {
            System.out.println("access denied");
        }
    }
}