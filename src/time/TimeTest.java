//package time;
//
//import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//
//class TimeTest {
//
//	
//	
//	
//	@ParameterizedTest
//	@ValueSource(strings = { "05:00:00:000", "23:59:59:001" })
//	void testGetTotalSeconds(String candidate) {
//		double seconds = Time.getTotalSeconds(candidate);
//		if(candidate.equals("23:59:59:001")) {
//			assertTrue("The seconds were not calculated properly", seconds==86399.001);
//		}
//		else 
//		assertTrue("The seconds were not calculated properly", seconds==18000.000);
//		
//	}
//	
//	@Test
//	void testGetTotalSecondsBad() {
//		assertThrows(
//				StringIndexOutOfBoundsException.class,
//				()-> {Time.getTotalSeconds("10:00");});
//	}
//	
//	@ParameterizedTest
//	@ValueSource(strings = { "05:00:50:100", "05:00:59:001" })
//	void testGetSeconds(String candidate) {
//		int seconds = Time.getSeconds(candidate);
//		if(candidate.equals("05:00:59:001")) {
//			assertTrue("The seconds were not calculated properly", seconds==59);
//		}
//		else
//		assertTrue("The seconds were not calculated properly", seconds==50);
//	}
//	
//	@Test
//	void testGetSecondsBad() {
//		assertThrows(
//				StringIndexOutOfBoundsException.class,
//				()-> {Time.getSeconds("10:00");});
//	}
//	
//	@ParameterizedTest
//	@ValueSource(strings = { "12:05:05:005", "12:05:05:999" })
//	void testGetMilliSeconds(String candidate) {
//		int milliseconds = Time.getMilliSeconds(candidate);
//		if(candidate.equals("12:05:05:999")) {
//			assertTrue("The seconds were not calculated properly", milliseconds==999);
//		}
//		else
//		assertTrue("The seconds were not calculated properly", milliseconds==5);
//	}
//	
//	@Test
//	void testGetMilliSecondsBad() {
//		assertThrows(
//				StringIndexOutOfBoundsException.class,
//				()-> {Time.getMilliSeconds("10:00:00:01");});
//	}
//	
//	
//	@ParameterizedTest
//	@ValueSource(strings = { "05:30:00:001", "05:59:00:001" })
//	void testGetTotalMinutes(String candidate) {
//		int minutes = Time.getTotalMinutes(candidate);
//		if(candidate.equals("05:59:00:001")) {
//			assertTrue("The seconds were not calculated properly", minutes==59);
//		}
//		else
//		assertTrue("The minutes were not calculated properly", minutes==30);
//	}
//	
//	@Test
//	void testGetTotalMinutesBad() {
//		assertThrows(
//				StringIndexOutOfBoundsException.class,
//				()-> {Time.getTotalMinutes("10:");});
//	}
//	
//	@ParameterizedTest
//	@ValueSource(strings = { "06:00:00:500", "23:59:59:150" })
//	void testGetTotalHours(String candidate) {
//		int hours = Time.getTotalHours(candidate);
//		if(candidate.equals("23:59:59:150")) {
//			assertTrue("The seconds were not calculated properly", hours==23);
//		}
//		else
//		assertTrue("The hours were not calculated properly", hours==6);
//	}
//	
//	@Test
//	void testGetTotalHoursBad() {
//		assertThrows(
//				StringIndexOutOfBoundsException.class,
//				()-> {Time.getTotalHours(":");});
//	}
//	
//
//}
