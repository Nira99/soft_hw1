package najah.edu.acceptancetest10;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu10.Checkout;

public class software {
	private Checkout c  = new Checkout();
	int bananaPrice = 0, applePrice = 0;

	@Given("the price of a {string} is {int}")
	public void the_price_of_a_is(String item , Integer price)  {
		//this.price = price ;
		
		if (item.equals("banana")) {
			bananaPrice = price;
			}
			else if (item.equals("apple")) {
			applePrice = price ;
			
			}
	}


	@When("I checkout {int} {string}")
	public void icheckout(Integer itemcount , String string )  
	{
		
		//c.add(itemcount , price);
		
		
	if (string.equals("banana")) {
			c.add(itemcount, bananaPrice);
	}

			else if (string.equals("apple")) {
		c.add(itemcount, applePrice);
		}
	}

	@Then("the total price should be {int}")
	public void the_total_price_should_be(Integer price) {
		assertEquals(price.intValue(), c.total());
	}
}
