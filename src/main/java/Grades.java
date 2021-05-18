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
        System.out.println(value);
    }


    public int lastGrade() {
        if (this.size != 0) {
            int last = grades[this.size - 1];
            return last;
        } else {
            return 0;
        }
    }

    public double averageGrade() {

        double result = 0;
        for (int i = 0; i < this.size; i++) {
            result = result + grades[i];
        }
        double average = result / this.size;
        return average;
    }
}



  //  public void averageGrade() {
    //    if (this.size != 0) {
       //     int suma = 0;
          //  for (int i = 0; i < grades.length; i++) {
           //     suma = grades[i] + suma;
            //}
            //System.out.println();
            //System.out.println("Wynik sumowania: " + suma);
            //double avg = (double) suma / this.size;

            //System.out.println("Srednia arytmetyczna: " + avg);
        //}