public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g,", 500, 2000);
        Notebook heavyNotebook = new Notebook("2000g,", 900, 2010);
        Notebook oldNotebook = new Notebook("1200g,", 1100, 2020);


        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();

        }


}
