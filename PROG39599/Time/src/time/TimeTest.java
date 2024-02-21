package time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TimeTest {

	@Test
	void testGetTotalSeconds() {
		int seconds =
				Time.getTotalSeconds("05:05:05");
				assertTrue("The seconds were not calculated properly" , seconds==18305);
	}

	@Test
	public void testGetTotalSecondsBad(){
		assertThrows(
			StringIndexOutOfBoundsException.class,
			()-> {Time.getTotalSeconds("10:00");});
	}
	
	@Test
	public void testGetTotalSecondsBoundary() {
		int seconds = Time.getTotalSeconds("00:00:00");
		assertTrue("The hours were not calculated properly",
				seconds ==0);
	}

	@Test
	void testGetSeconds() {
		int seconds = Time.getSeconds("05:05:05");
		assertTrue("The seconds were not calculated properly" , seconds==5);
	}
	
	@Test
	void testGetSecondsBad() {
		assertThrows(
				StringIndexOutOfBoundsException.class,
				()-> {Time.getTotalSeconds("10:00");});
	}

	@Test
	public void testGetSecondsBoundary() {
		int seconds = Time.getTotalSeconds("00:00:00");
		assertTrue("The hours were not calculated properly",
				seconds ==0);
	}
	@Test
	void testGetTotalMinutes() {
		int minutes =
				Time.getTotalMinutes("05:05:05");
				assertTrue("The seconds were not calculated properly" , minutes==5);
	}
	
	@Test
	void testGetTotalMinutesBad() {
		assertThrows(
				StringIndexOutOfBoundsException.class,
				()-> {Time.getTotalMinutes("5:00");});
	}

	public void testGetTotalMinutesBoundary() {
		int seconds = Time.getTotalSeconds("00:00:00");
		assertTrue("The hours were not calculated properly",
				seconds ==0);
	}
	@ParameterizedTest
	@ValueSource(strings = { "05:00:00:00", "05:15:15:15", "05:59:59:59" })
	void testGetTotalHours(String candidate) 
	{
		int hrs = Time.getTotalHours(candidate);
		assertTrue("The hours were not calculated properly", hrs ==5);
	}
	
	@Test
	
	void testgetMiliseconds() {
		int milliseconds =
				Time.getTotalSeconds("05:05:05");
				assertTrue("The seconds were not calculated properly" , milliseconds==18305);
	}
	@Test
	void testgetMillisecondsGood() {
		assertThrows(
				StringIndexOutOfBoundsException.class,
				()-> {Time.getMilliseconds("12:05:05:05");});
	}

	
}




