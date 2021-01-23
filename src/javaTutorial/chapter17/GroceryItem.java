package javaTutorial.chapter17;

public class GroceryItem {
	public String category;
	public String name;
	public String price;
	
	public int hashCode() {
		return 1;
	}
	public boolean equals(Object otherGroceryObj) {
		GroceryItem anotherObj=(GroceryItem) otherGroceryObj;
		if( this.category.equals(anotherObj.category)
				&&
				this.name.equals(anotherObj.name)
				&&
				this.price.equals(anotherObj.price)
				)
			return true;
		else
			return false;
	}
}
