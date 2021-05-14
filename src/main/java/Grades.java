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


    public void lastGrade() { //Nie ma pojęcia co wpisać w (). Teoretycznie nic, ale próba odpalenia tej medoty krzyczy krzykiem wielkim, że tak pusto być nie może
        if (this.size != 0) {
            System.out.println(grades); // No "grades" tu nie będzie, właściwsze chyba byłoby "value", ale jeszcze nie mam pomysłu jak to wyciągnąć
        }
        else {
            System.out.println("No grades yet");
        }

    }
}
