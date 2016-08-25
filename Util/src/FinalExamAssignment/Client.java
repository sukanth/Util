package FinalExamAssignment;

import java.util.ArrayList;

public class Client {
    
    public static void main(String[] args) {
	
	ProductList productList=new ProductList(new ArrayList<Product>(), 0);
	    Book book=new Book("Java References", 1, 10, 500.00, 0.1);
	    productList.addNewProduct(book);
	    Book book1=new Book("C++ References", 2, 10, 500.00, 0.1);
	    productList.addNewProduct(book1);
	    Book book2=new Book("C References", 3, 10, 500.00, 0.1);
	    productList.addNewProduct(book2);
	    Book book3=new Book(".Net References", 4, 10, 500.00, 0.1);
	    productList.addNewProduct(book3);
	
	    CD cd=new CD("MJ", 5, 30, 40, 5);
	    productList.addNewProduct(cd);
	    CD cd1=new CD("DJ", 5, 30, 40, 5);
	    productList.addNewProduct(cd1);
	   

    }
}
