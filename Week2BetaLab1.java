public class Week2BetaLab1 {

    public static void main(String[] args) {
        //Designed to print "You can drive" if age is greater than or equal to 16, and they have a license
        //Otherwise, prints "You cannot drive"
        int age = 18;
        System.out.println(age >= 16);
        boolean hasLicense = false;
        if (age >= 16 && hasLicense == true) {
            System.out.println("You can drive");
        } else {
            System.out.println("You cannot drive");
        }
        //Designed to print Milk Please when thirst is greater than 6, or milk is less than 2.50
        //Otherwise, prints "No Thanks"
        double costOfMilk = 2.69;
        int thirstLevel = 8;
        if (costOfMilk < 2.50 || thirstLevel > 6) {
            System.out.println("Milk Please");    
        } else {
            System.out.println("No Thanks");
        }
        //Cookies evenly distributed to children, remainder goes to adult. 4 different printouts
        //Alternate, resource saving method: make new int remainingCookies = numberOfCookies % numberOfChildren
        //and replace that in following calculations
        int numberOfCookies = 2;
        int numberOfChildren = 7;
        if (numberOfCookies % numberOfChildren == 0) {
            System.out.println("Sad Face");
        } else if (numberOfCookies % numberOfChildren < 2) {
            System.out.println("Yes!");
        } else if (numberOfCookies % numberOfChildren < 5) {
            System.out.println("Whoohoooo!");
        } else {
            System.out.println("Jackpot!");
        }
    }
}