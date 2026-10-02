public class PersonCard {
    public static void main(String[] args) {
        String fakeName = "Lisa";
        String fakeLastName = "Andersson";
        int fakeAge = 28;
        double fakeHeight = 1.72;
        char fakeGrade = 'B';
        boolean likesJava = true;
        int ageNextYear = fakeAge + 1; //går även att koda in i print-satsen, men detta är smidigt ifall det ska användas i emr än ett scenario.

        System.out.print("The students name is " + fakeName + " " +fakeLastName + ".");
        System.out.println(" She is " + fakeAge + " years old and " + fakeHeight + " meters tall!");
        System.out.println("Last year she got a grade of mostly " + fakeGrade + ".");
        System.out.println("It is " + likesJava + " that she likes Java");
        System.out.println("Next year she will be " + ageNextYear + " years old.");
    }
}
