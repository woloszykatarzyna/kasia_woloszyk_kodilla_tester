public class LeapYear {
    public static void main(String[] args) {
        int enterYear = 2000;
        int firstCondition = 400;
        int secondCondition = 100;
        int thirdCondition = 4;
        int result400 = enterYear % firstCondition;
        int result100 = enterYear % secondCondition;
        int result4 = enterYear % thirdCondition;


        if (result400 == 0) {
            System.out.println("Rok przestępny.");
        }
        else if (result4 == 0 && result100 != 0) {
            System.out.println("Również rok przestępny."); // Żeby było łatwiej weryfikować czy jest ok, zmieniłam tu tekst
        }
        else {
            System.out.println("Podany rok nie jest przestępny.");
        }
    }

}