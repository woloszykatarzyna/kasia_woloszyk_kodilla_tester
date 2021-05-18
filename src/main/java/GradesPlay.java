public class GradesPlay {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.addGrade(1);
        grades.addGrade(5);
        grades.addGrade(7);
        int lastGrade = grades.lastGrade();
        double averageGrade = grades.averageGrade();

        System.out.println("Last grade was: " + lastGrade);

        System.out.println("Avg grade was: " + averageGrade);
    }
}
