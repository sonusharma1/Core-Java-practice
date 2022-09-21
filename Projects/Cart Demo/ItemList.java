/*
@author : Sonu Sharma
@Date	: 21 Sep 2022
*/

// This class show list of items in store
public class ItemList {
    
    // instance variable
    private String name;
    private int quantity;
    private double price;

    ItemList() {
		this.name = "";
		this.price = 0;
		this.quantity = 0;
    }

    ItemList(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // name -> setter & getter
    public void setName(String name) {
		this.name=name;
	}	
	public String getName(){
		return this.name;
	}
	
    // quantity -> setter & getter
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}	
	public int getQuantity() {
		return this.quantity;
	}
	
    // price -> setter & getter
	public void setPrice(double price)	{
		this.price=price;
	}	
	public double getPrice() {
		return this.price;
	}
}
