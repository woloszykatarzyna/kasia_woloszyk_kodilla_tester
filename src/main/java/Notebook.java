public class Notebook {
    String weight;
    int price;
    int year;
    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price <= 600 && this.year <= 2000) {
            System.out.println("This notebook is very cheap and very old.");
        }
        else if (this.price <= 600 && this.year <= 2010) {
            System.out.println("This notebook is very cheap and old.");
        }
        else if (this.price <= 600 && this.year <= 2020) {
            System.out.println("This notebook is very cheap and not so old.");
        }
        else if (this.price > 600 && this.year > 2020) {
            System.out.println("This notebook is very cheap and new.");
        }
        else if (this.price > 600 && this.price <=  1000 && this.year <= 2000) {
            System.out.println("This notebook has a good price and is very old.");
        }
        else if (this.price > 600 && this.price <=  1000 && this.year <= 2010 ) {
            System.out.println("This notebook has a good price and is old.");
        }
        else if (this.price > 600 && this.price <=  1000 && this.year <= 2020) {
            System.out.println("This notebook has a good price and is not so old.");
        }
        else if (this.price > 600 && this.price <=  1000 && this.year > 2020) {
            System.out.println("This notebook has a good price and is new.");
        }
        else if (this.price < 1000 &&  this.year <= 2000) {
            System.out.println("This notebook is very expensive and very old.");
        }
        else if (this.price < 1000 &&  this.year <= 2010) {
            System.out.println("This notebook is very expensive and old.");
        }
        else if (this.price < 1000 &&  this.year <= 2020) {
            System.out.println("This notebook is very expensive and not so old.");
        }
        else if (this.price < 1000 &&  this.year > 2020) {
            System.out.println("This notebook is very expensive and new.");
        }
        else {
            System.out.println("Is it Apple stuff?");
        }
        }
    public void checkWeight() {
        if (this.weight == "600g," ) {
            System.out.println("This notebook is light.");
        }
        else if (this.weight == "1200g," ) {
            System.out.println("This notebook is not so heavy.");
        }
        else {
            System.out.println("This notebook is very heavy");
        }
    }
}
