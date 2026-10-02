public class BugHunt {
   public static void main(String[] args) {
        //string name = "Ada" //saknar stor bokstav i String och ; på slutet
        String name = "Ada"; //rättat
        // int age = "35"; felaktig datatyp, ska vara int, dvs heltal, inte String, dvs sträng
        int age = 25; //rättat
        //double height = 1,72; felaktig decimalpunkt, ska vara "."
        double height = 1.72; //rättat
        //char grade = "A"; felaktig datatyp, ska vara char, dvs tecken '', inte String "", dvs sträng
        char grade = 'A'; //rättat
        //boolean likesJava = "true"; felaktig datatyp, ska vara boolean, dvs sant/falskt, inte String "", dvs sträng
        boolean likesJava = true; //rättat
        // int apples = 5; inget fel här 
        int apples = 5; 
        //int bananas = 2; inget fel här
        int bananas = 2; 

            //System.out.println("Fruit: " + apples + bananas); //felaktig utskrift gentemot upgiften som vill ha det samlade antalet, inte vardera siffra för sig
            System.out.println("Furits: " + (apples+bananas)); //rättat, samlat antalet frukter i utskriften
            //System.out.println("Name: "name); //felaktig utskrift, saknar + mellan "Name: " och name
            System.out.println("Name: " + name); //rättat, lagt till + mellan "Name: " och name
            //System.out.println(age == 25); 
            System.out.println(age == 25);

            //om det var viktigt att ha allt på en och samma rad då hade svaret kunnat bli:
            System.out.println("Fruits: " + (apples+bananas) + ", Name: " + name + ", " +(age == 25));
            //eller
            System.out.print("Fruits: " + (apples+bananas));
            System.out.print(", Name: " + name);
            System.out.println(", " + (age == 25));
    }
}