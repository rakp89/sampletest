package TESTs;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PAGES.All_page;
import PAGES.BASE;



public class Testcases extends BASE{
	All_page PG =new All_page();
  
	public Testcases () {
		super();
	}
 
	@BeforeMethod
  public void setup() {
	  initialization();
	 
  }
  
	@Test
  public void test1() {
		Boolean login=PG.signIn.isEnabled();
		assertTrue(login);
		PG.login("1234@gmail.com","123");
		
  }
	@Test
	 public void test2()
	 {
		PG.login("1234@gmail.com","123");
		int Actuallist= 3;
		int expectedlist=PG.listofgroup();
		Assert.assertEquals(expectedlist, Actuallist);
		String actualvalue="List Item 2";
		String expectedvalue=PG.secondlistvaluetext();
		Assert.assertEquals(expectedvalue, actualvalue);
		String actualbadgevalue="6";
		String Expectedbadgevalue=PG.secondlistvaluebadge();
		Assert.assertEquals(Expectedbadgevalue, actualbadgevalue);
		
		
	 }
	
	@Test
	 public void test3() {
		PG.login("1234@gmail.com","123");
	String	actualdefaultvalue="Option 1";
	String Expecteddefaultvalue=PG.defaultoptiontext();
	Assert.assertEquals(Expecteddefaultvalue, actualdefaultvalue);
	PG.selectoption2();
		
			
	}
	@Test
	 public void test4() {
		PG.login("1234@gmail.com","123");
		Boolean enabled=PG.enabledbutton();
		Assert.assertTrue(enabled);
		Boolean disabled=PG.disabledbutton();
		Assert.assertFalse(disabled);
	}
	
	@Test
	 public void test5() {
		PG.login("1234@gmail.com","123");
		PG.test5button();
		String Amessage="You clicked a button!";
		String Emessage=PG.sucessmessage();
		Assert.assertEquals(Amessage, Emessage);
		boolean d=PG.test5button.isEnabled();
		Assert.assertFalse(d);
		
	}
	@Test
	 public void test6() {
		String actual1="Ventosanzap";
		String expect1=PG.getvalueofcell();
		Assert.assertEquals(actual1, expect1);
	}
	
	
}
