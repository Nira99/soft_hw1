package najah.edu10;

public class Checkout {
	private int rt = 0 ;

	public void add(Integer itemcount, int price) {
		// TODO Auto-generated method stub
		rt+= (itemcount.intValue()*price);	
	}
	public long total() {
		return rt;
	}
}
