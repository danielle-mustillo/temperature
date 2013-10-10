/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
 * @version 2013.10.06
 * Unit Testing Temperature class
 */

import org.junit.* ;
import static org.junit.Assert.* ;

public class TemperatureTest {

	@Test
	public void testGetUnits() {
		Temperature temp = new Temperature(100, Temperature.Units.KELVIN);
		assertTrue(temp.getUnits() == Temperature.Units.KELVIN);
	}
	
	@Test
	public void testGetValue() {
		Temperature temp = new Temperature(100, Temperature.Units.KELVIN);
		assertTrue(temp.getValue() == 100);
	}
	
	/* The below code was chosen as to start from 100 base unit and convert to the other unit.
	 * The conversion was checked in google to be correct.
	 * The only exception is celcuis to farenheit, which 98 was used to test decimal numbers. 
	 */
	
	@Test
	public void testChangeUnitsKtoC() {
		Temperature temp = new Temperature(100, Temperature.Units.KELVIN);
		temp.changeUnits(Temperature.Units.CELSIUS);
		assertTrue((temp.getValue() + 173.15) < 0.1);
	}
	
	@Test
	public void testChangeUnitsKtoF() {
		Temperature temp = new Temperature(100, Temperature.Units.KELVIN);
		temp.changeUnits(Temperature.Units.FAHRENHEIT);
		assertTrue((temp.getValue() + 279.67) < 0.1);
	}
	
	@Test
	public void testChangeUnitsCtoF() {
		Temperature temp = new Temperature(98, Temperature.Units.CELSIUS);
		temp.changeUnits(Temperature.Units.FAHRENHEIT);
		assertTrue(temp.getValue() - 208.40 < 0.1);
	}
	
	@Test
	public void testChangeUnitsCtoK() {
		Temperature temp = new Temperature(100, Temperature.Units.CELSIUS);
		temp.changeUnits(Temperature.Units.KELVIN);
		assertTrue(temp.getValue() - 373.15 < 0.1);
	}
	
	@Test
	public void testChangeUnitsFtoK() {
		Temperature temp = new Temperature(100, Temperature.Units.FAHRENHEIT);
		temp.changeUnits(Temperature.Units.KELVIN);
		assertTrue(temp.getValue() - 310.93 < 0.1);
	}
	
	@Test
	public void testChangeUnitsFtoC() {
		Temperature temp = new Temperature(100, Temperature.Units.FAHRENHEIT);
		temp.changeUnits(Temperature.Units.CELSIUS);
		assertTrue(temp.getValue() - 37.778 < 0.1);
	}
	
	
	
  // Add multiple tests to check all functions of
  // {@Code Temperature} class.

  // @Test
  // public void .... (){
  //    ...
  // }

  // @Test
  // public void .... (){
  //    ...
  // }
}
