import static org.junit.Assert.*;

import org.junit.Test;



public class TRLAppTest {

	@Test
	public void testPatron() {
		Patron P1 = new Patron("A1", "Amar", "");
		assertEquals("Amar",P1.getName());
		assertEquals("A1", P1.getId());
		assertEquals("", P1.getHold());
		
	}
	
	@Test
	public void testCopy()
	{
		Copy C1 = new Copy("C1", "The Deathly Hallows");
		assertEquals("C1", C1.getCopyID());
		assertEquals("The Deathly Hallows",C1.getTitle());
	}
	
	@Test
	public void testCopyCheckOut()
	{
		Patron P1 = new Patron("A1", "Amar", "");
		Copy C1 = new Copy("C1", "The Deathly Hallows");
		C1.setOutTo(P1);
		assertEquals(P1, C1.getOutTo());
	}
	
	
	@Test
	public void testCopyCheckInOut()
	{
		Patron P1 = new Patron("A1", "Amar", "");
		Copy C1 = new Copy("C1", "The Deathly Hallows");
		
		//CheckingOut
		P1.checkCopyOut(C1);
		assertEquals(P1, C1.getOutTo());
		System.out.println(P1);
		
		
		//CheckingIn
		P1.checkCopyIn(C1);
		assertEquals(null,C1.getOutTo());
		System.out.println(P1);
		
	}
	
	@Test
	public void testReturnDate()
	{
		TRLAppController T1 = new TRLAppController("P1");
		String returnDate = T1.returnDate();
		System.out.println(returnDate);
	}
	
	
	@Test
	public void testEventCheckIn()
	{
		Responder R1 = new Responder();
		R1.copyCheckedIn("C3", "U3", "W1");
	}
	
	@Test
	public void testEventCheckOut()
	{
		Responder R1 = new Responder();
		R1.copyCheckedOut("C3", "U3", "W1");
	}
	

	@Test
	public void testEventCheckOut1()
	{
		Responder R1 = new Responder();
		R1.copyCheckedOut("C3", "U3", "W1");
	}
	

}
