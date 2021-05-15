public class Testy {
    public static void main(String[] args) {
        Grades play = new Grades(1);
        System.out.println(play.grade);
        play.addGrade(5);
        System.out.println(play.grade);
    }
}
