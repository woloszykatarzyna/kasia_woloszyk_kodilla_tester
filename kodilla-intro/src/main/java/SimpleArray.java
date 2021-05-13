public class SimpleArray {
        public static void main(String[] args) {
            String[] herbs = new String[5];
            herbs[0] = "Rumianek";
            herbs[1] = "Pokrzywa";
            herbs[2] = "Dziurawiec";
            herbs[3] = "Melisa";
            herbs[4] = "Mięta";

            String herb = herbs[3];
            System.out.println(herb);

            int numberOfElements = herbs.length;
            System.out.print("Moja tablica zawiera " + numberOfElements + " elementów");
        }

}
