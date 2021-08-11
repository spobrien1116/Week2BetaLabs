public class Week2QuizQ1 {

    public static void main(String[] args) {

        //Q1
        for (int i = 0; i <= 9; i++) {
            System.out.println(i);
        }
        //Q2
        char letterGrade;
        double numericGrade = 74;
        if (numericGrade >= 90) {
            letterGrade = 'A';
        } else if (numericGrade <= 89 && numericGrade >= 80) {
            letterGrade = 'B';
        } else if (numericGrade <= 79 && numericGrade >= 70) {
            letterGrade = 'C';
        } else if (numericGrade <= 69 && numericGrade >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        System.out.println(letterGrade);
        //Q4
        String name = "Tommy";
        int age = 52;
        if (name == "Tommy") {
            System.out.println("Hi, Tommy!");
        } else if (age == 52) {
            System.out.println("52 years old.");
        }
        System.out.println("Out of conditional.");
        //Q6
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}