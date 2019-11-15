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
        if(this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if(this.price >= 600 && this.price <= 1000){
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        int intWeight = Integer.parseInt(this.weight.substring(0,this.weight.length()-1));
        if(intWeight < 1000) {
            System.out.println("This notebook is very light.");
        } else if(intWeight >= 1000 && intWeight <= 3000 ){
            System.out.println("This notebook is quite heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void yearPriceComparison() {
        if(this.year > 2016 && (this.price > 2500 && this.price < 4000)) {
            System.out.println("That is a good deal!");
        } else if ((this.year >= 2010 && this.year <= 2016) && (this.price >= 1000 && this.price <= 2500)) {
            System.out.println("You can buy it.");
        } else if ((this.year >=2000 && this.year < 2010) && this.price < 1000){
            System.out.println("Old but cheap.");
        } else if (this.year < 2000 || this.price > 4000) {
            System.out.println("I don\'t think so!");
        } else {System.out.println("Sorry, no recommendation.");}
    }
}
