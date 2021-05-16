public class Grades {
    private int[] grades;
    private int size;


    public Grades() {
        this.grades = new int[10];
        this.size = 0;


    }

    public void addGrade(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }


    public void lastGrade() {
        if (this.size != 0) {
            int last = grades[this.size - 1];
            System.out.println(last);
        } else {
            System.out.println("No grades yet");
        }
    }


    public void averageGrade() {
        if (this.size != 0) {
            int suma = 0;
            for (int i = 0; i < grades.length; i++) {
                suma = grades[i] + suma;
            }
            System.out.println();
            System.out.println("Wynik sumowania: " + suma);
            double avg = (double) suma / this.size;

            System.out.println("Srednia arytmetyczna: " + avg);
        }
    }
}