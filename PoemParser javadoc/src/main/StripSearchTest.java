package main;


import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


class StripSearchTest extends StripSearch {
	
	
	
//does it remove special characters?
	@Test
	public void SpecialCharTest() {

		 assertEquals("Once  nevermore", StripSearch.Strip("Once !@#$%^ nevermore"));
		 }
	
	//does it remove numbers?
	@Test
	public void StrippedOutLettersTest () {
		 
		 assertEquals("Once 3456 nevermore", StripSearch.Strip("Once !@#$%^3456 nevermore"));
		
	}
	
	//Does it remove everything before and after?
	@Test
	public void StrippedOutBeforeAfter () {
	
		 assertEquals("Once  nevermore", StripSearch.Strip("Yum Yum Once  nevermore Yum Yum"));
		
	}

}
