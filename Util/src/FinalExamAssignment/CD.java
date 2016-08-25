package FinalExamAssignment;

public class CD extends Product{
    
    private int noOfSongs =0;
    private int year=0;

    public CD(String title, int productId, int noOfProducts,
	    double originalPrice, double discountRate) {
	super(title, productId, noOfProducts, originalPrice, discountRate);
	// TODO Auto-generated constructor stub
    }

    public int getNoOfSongs() {
        return noOfSongs;
    }

    public void setNoOfSongs(int noOfSongs) {
        this.noOfSongs = noOfSongs;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
	return "CD [noOfSongs=" + noOfSongs + ", year=" + year
		+ ", getNoOfSongs()=" + getNoOfSongs() + ", getYear()="
		+ getYear() + ", toString()=" + super.toString()
		+ ", getTitle()=" + getTitle() + ", getProductId()="
		+ getProductId() + ", getNoOfProducts()=" + getNoOfProducts()
		+ ", getOriginalPrice()=" + getOriginalPrice()
		+ ", getDiscountRate()=" + getDiscountRate()
		+ ", getNewPrice()=" + getNewPrice() + ", getClass()="
		+ getClass() + ", hashCode()=" + hashCode() + "]";
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!super.equals(obj))
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	CD other = (CD) obj;
	if (noOfSongs != other.noOfSongs)
	    return false;
	if (year != other.year)
	    return false;
	return true;
    }
    

}
