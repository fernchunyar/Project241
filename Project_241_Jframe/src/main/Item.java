package main;

public class Item {

    private String name;

    private String price;

    private String amount;

    private double total;

    Item(String name,String price,String amount) {

        this.name = name;
        this.price = price;
        this.amount = amount;

    }

    public String getName() {
        return name;

    }
    public String getPrice() {
        return price;
    }
    public String getAmount() {
        return amount;
    }
    public double getTotal() {
    	
    	int amountInt = Integer.parseInt(amount);
    	double priceD = Double.parseDouble(price);
    	
        total = priceD*amountInt;
        return total;
    }


}
