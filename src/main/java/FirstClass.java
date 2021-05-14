public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 500, 2000);
        Notebook heavyNotebook = new Notebook(2000, 900, 2010);
        Notebook oldNotebook = new Notebook(1200, 1100, 2020);


        System.out.println("Weight: " + notebook.weight + "g, price: " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        System.out.println("Weight: " + heavyNotebook.weight + "g, price: " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        System.out.println("Weight: " + oldNotebook.weight + "g, price: " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();

        }


}
