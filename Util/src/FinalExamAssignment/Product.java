package FinalExamAssignment;

public class Product {
    private String title=null;
    private int productId=0;
    private int noOfProducts =0;
    private double originalPrice=0;
    private double discountRate=0;
    
    public Product(String title, int productId, int noOfProducts,
	    double originalPrice, double discountRate) {
	super();
	this.title = title;
	this.productId = productId;
	this.noOfProducts = noOfProducts;
	this.originalPrice = originalPrice;
	this.discountRate = discountRate;
    }
    
    //Equals method

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Product other = (Product) obj;
	if (Double.doubleToLongBits(discountRate) != Double
		.doubleToLongBits(other.discountRate))
	    return false;
	if (noOfProducts != other.noOfProducts)
	    return false;
	if (Double.doubleToLongBits(originalPrice) != Double
		.doubleToLongBits(other.originalPrice))
	    return false;
	if (productId != other.productId)
	    return false;
	if (title == null) {
	    if (other.title != null)
		return false;
	} else if (!title.equals(other.title))
	    return false;
	return true;
    }



    @Override
    public String toString() {
	return "Product [title=" + title + ", productId=" + productId
		+ ", noOfProducts=" + noOfProducts + ", originalPrice="
		+ originalPrice + ", discountRate=" + discountRate
		+ ", getTitle()=" + getTitle() + ", getProductId()="
		+ getProductId() + ", getNoOfProducts()=" + getNoOfProducts()
		+ ", getOriginalPrice()=" + getOriginalPrice()
		+ ", getDiscountRate()=" + getDiscountRate() + ", getClass()="
		+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
		+ super.toString() + "]";
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getNoOfProducts() {
        return noOfProducts;
    }

    public void setNoOfProducts(int noOfProducts) {
        this.noOfProducts = noOfProducts;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    //Method to compute new  price 
    
    public double getNewPrice(){
	double price = this.originalPrice - (this.originalPrice* this.discountRate);
	return price;
    }
    
    
}
