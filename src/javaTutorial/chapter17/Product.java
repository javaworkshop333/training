package javaTutorial.chapter17;

public class Product {
	String category;
	String name;
	int price;
	Product (String category,String name,int price)
	{
		this.category=category;
		this.name=name;
		this.price=price;
	}
	public boolean equals(Object OtherObj) {
		Product otherProductObj=(Product) OtherObj;
		if(	this.category.equals(otherProductObj.category)
			&& 	this.name.equals(otherProductObj.name)
				&& this.price == otherProductObj.price )
			return true;
		else
			return false;
	}
	public int hashCode() {
		if(category.equals("vegetables"))
			return 1;
		else if(category.equals("fruits"))
			return 2;
		else if(category.equals("furniture"))
			return 3;
		else
			return 4;
		
	}
}
