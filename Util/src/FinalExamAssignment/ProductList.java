package FinalExamAssignment;

import java.util.ArrayList;

public class ProductList {
    private ArrayList<Product> products=null;
    private int noOfProducts=0;
    @Override
    public String toString() {
	return "ProductList [products=" + products + ", noOfProducts="
		+ noOfProducts + ", getClass()=" + getClass() + ", hashCode()="
		+ hashCode() + ", toString()=" + super.toString() + "]";
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    public int getNoOfProducts() {
        return noOfProducts;
    }
    public void setNoOfProducts(int noOfProducts) {
        this.noOfProducts = noOfProducts;
    }
   
    
    public ProductList(ArrayList<Product> products, int noOfProducts) {
	super();
	this.products = products;
	this.noOfProducts = noOfProducts;
    }
    
    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	ProductList other = (ProductList) obj;
	if (noOfProducts != other.noOfProducts)
	    return false;
	if (products == null) {
	    if (other.products != null)
		return false;
	} else if (!products.equals(other.products))
	    return false;
	return true;
    }
    public boolean addNewProduct(Product product){
	return this.products.add(product);
	
    }
    public boolean deleteProduct(Product product){
	return this.products.remove(product);
    }
    
    public void noOfProductsLeft(int id){
	for(Product product: this.products){
	    if(product.getProductId()==id){
		System.out.println("No Of Products Left for the given Id :"+ product.getNoOfProducts());
	    }
	    else{
		System.out.println("No Products found for the given Id");
	    }
	}
	
    }
    
    public void searchProductByTitle(String title){
   	for(Product product: this.products){
   	    if(product.getTitle().equalsIgnoreCase(title)){
   		System.out.println("No Of Products Left for the given title :"+ product.getNoOfProducts());
   	    }
   	    else{
   		System.out.println("No Products found for the given title");
   	    }
   	}
   	
       }
    
}
