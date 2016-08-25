package FinalExamAssignment;

public class Book extends Product{
    
    private String nameOfTheAuthor=null;
    private int currentEdition=0;

    public Book(String title, int productId, int noOfProducts,
	    double originalPrice, double discountRate) {
	super(title, productId, noOfProducts, originalPrice, discountRate);
	// TODO Auto-generated constructor stub
    }

    public String getNameOfTheAuthor() {
        return nameOfTheAuthor;
    }

    public void setNameOfTheAuthor(String nameOfTheAuthor) {
        this.nameOfTheAuthor = nameOfTheAuthor;
    }

    public int getCurrentEdition() {
        return currentEdition;
    }

    public void setCurrentEdition(int currentEdition) {
        this.currentEdition = currentEdition;
    }

    public Book(String title, int productId, int noOfProducts,
	    double originalPrice, double discountRate, String nameOfTheAuthor,
	    int currentEdition) {
	super(title, productId, noOfProducts, originalPrice, discountRate);
	this.nameOfTheAuthor = nameOfTheAuthor;
	this.currentEdition = currentEdition;
    }

    @Override
    public String toString() {
	return "Book [nameOfTheAuthor=" + nameOfTheAuthor + ", currentEdition="
		+ currentEdition + "]";
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!super.equals(obj))
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Book other = (Book) obj;
	if (currentEdition != other.currentEdition)
	    return false;
	if (nameOfTheAuthor == null) {
	    if (other.nameOfTheAuthor != null)
		return false;
	} else if (!nameOfTheAuthor.equals(other.nameOfTheAuthor))
	    return false;
	return true;
    }
    
    

}
