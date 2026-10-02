public class StringWorkshop {
    public static void main(String[] args) {
        String firstName = "Anna";
        String LastName = "Andersson";
            String fullName = firstName + " " + LastName;
            System.out.println(fullName);
            System.out.println(fullName.length()); //räknar antalet tecken i strängen, inklusive mellanslag

        System.out.print("Hej! Jag heter " + fullName);
        System.out.println(" och mitt namn innehåller " + fullName.replace(" ", "").length() + " tecken.");
        //replace(" ", "") tar bort mellanslag i strängen, så att det inte räknas med i längden.

            //Bonus Uppgift
            String city = "Göteborg";
            String profession = "Mjukvarutestare";
            System.out.print(firstName + " bor i " + city + " och utbildar sig till " + profession + ".");


        }

}
