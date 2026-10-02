public class OperatorLab {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 17;
        int d = 18;

        System.out.println(a+b); 
        System.out.println(a + " + " + b + " = " + (a+b));
        //Ett sätt att få med hela beräkningen i utskriften, men det kan bli lite rörigt om man har många variabler.
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println( a / b);
        System.out.println(a % b); //modulus, dvs. resten vid heltalsdivision
        System.out.println(c % 2); //Kontrollerar om c är jämnt eller ojämnt
        System.out.println(d % 2); //Kontrollerar om d är jämnt eller ojämnt
        System.out.println(d % 1); //Kontrollerar om d är jämnt eller ojämnt
        
        //BoleanExperiment
        
        int age = 20;
            boolean test1 = age > 18;
            boolean test2 = age < 18;
            boolean test3 = age == 20;
            boolean test4 = age != 20;

            System.out.println(test1);
            System.out.println(test2);
            System.out.println(test3);
            System.out.println(test4);
            //logiska operatorer
            boolean hasTicket = true;
            boolean isAdult = true;
        
            boolean isAllowed = hasTicket && isAdult; //&& betyder "och"
            System.out.println(isAllowed);
            boolean isAllowed2 = hasTicket || isAdult; //|| betyder "eller"
            System.out.println(isAllowed2);


    }
}