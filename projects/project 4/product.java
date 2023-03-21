import java.text.*;

class product {

    public DecimalFormat twoPlaces = new DecimalFormat("0.00");
    
    //private data members
    private String name;
    private String description;
    private double price;
    private int quantity;

    final private static int LIMIT = 10;
    
    product(){  //no arg constructor
        name = "null";  
        description = "null";
        price = 0;
        quantity = 0;
    }

    /*No arg constructor
     * parameters: name, description, price, quantity
     */
    product(String cName, String cDesc, double cPrice, int cQuantity){
        name = cName;
        description = cDesc;
        price = cPrice;
        quantity = cQuantity;
    }

    //getters
    public String getName(){    //getter for name
        return name;
    }

    public String getDesc(){    //getter for description
        return description;
    }

    public double getPrice(){   //getter for price
        return price;
    }

    public int getQuantity(){   //getter for quantity
        return quantity;
    }

    //setters
    public void setName(String sName){  //setter for name
        name = sName;
    }

    public void setDesc(String sDesc){ //setter for description
        description = sDesc;
    }

    public void setPrice(double sPrice){ //setter for price
        price = sPrice;
    }

    public void setQuantity(int sQuan){ //setter for quantity
        quantity = sQuan;
    }

    public String toString(){   //tostring, returns object info
        String toStr = "Name: " + name + "\nDescription: " + description + "\nPrice: $" + twoPlaces.format(price) + "\nQuantity: " + quantity;
        return toStr;
    }

    public void applyDiscount(double discount){ //set price to price - discount percent
        price = price - (discount * price);
    }

    public boolean needsOrdered(){  //check if product is below LIMIT (10) total quantity
        if(quantity < LIMIT){
            return true;
        }
        return false;
    }

    public double returnWorth(){    //compute worth of all of one product
        return quantity * price;
    }

    public boolean equals(product prod){    //return if 2 products are the same
        return(this.getName().equals(prod.getName()) && this.getDesc().equals(prod.getDesc()) && this.getPrice() == prod.getPrice());
    }

    public product combine(product prod){   //combine 2 products, mame them the same and return the sum of both product quatities
        product newProd = new product(this.name, this.description, this.price, (this.quantity + prod.quantity));
        return newProd;
    }

}
