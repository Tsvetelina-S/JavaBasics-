package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int degrees = Integer.parseInt(scan.nextLine());
        String timeOfTheDay = scan.nextLine();
        String outfit = " ";
        String shoes = " ";
        if (degrees >= 10 && degrees <= 18){
            if (timeOfTheDay.equals("Morning")){
                outfit = "Sweatshirt";
                shoes = "Sneakers";

            }else if (timeOfTheDay.equals("Afternoon")){
                outfit = "Shirt";
                shoes = "Moccasins";

            }else if (timeOfTheDay.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }

        }else if (degrees > 18 && degrees <= 24){
            if (timeOfTheDay.equals("Morning")){
                outfit = "Shirt";
                shoes = "Moccasins";

            }if (timeOfTheDay.equals("Afternoon")){
                outfit = "T-Shirt";
                shoes = "Sandals";

            }if (timeOfTheDay.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }

        }else if (degrees >= 25){
            if (timeOfTheDay.equals("Morning")){
                outfit = "T-Shirt";
                shoes = "Sandals";

            }if (timeOfTheDay.equals("Afternoon")){
                outfit = "Swim Suit";
                shoes = "Barefoot";

            }if (timeOfTheDay.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }

        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
