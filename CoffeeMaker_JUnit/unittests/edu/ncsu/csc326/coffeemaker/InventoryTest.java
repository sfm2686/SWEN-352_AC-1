package edu.ncsu.csc326.coffeemaker;

import junit.framework.TestCase;
import edu.ncsu.csc326.coffeemaker.Inventory;
import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;

public class InventoryTest extends TestCase {

	private Inventory inv;
	private Recipe r;
	
    /**
     * Sets up the test fixture. 
     * (Called before every test case method.) 
     */ 
	public void setUp() {
		this.inv = new Inventory();
		this.r = new Recipe();
		//TODO
		
	}
	
    /**
     * Tears down the test fixture. 
     * (Called after every test case method.) 
     */ 
    public void tearDown() { 
         this.inv = null;
    } 
    
    /**
     * Test cases for all of the setters for each of the four 
     * different ingredients.
     */
    public void testSetCoffee() {
    	this.inv.setCoffee(10);
    	assertTrue(this.inv.getCoffee() == 10);
    }
    
    public void testSetMilk() {
    	this.inv.setMilk(10);
    	assertTrue(this.inv.getMilk() == 10);
    }
    
    public void testSetSugar() {
    	this.inv.setSugar(10);
    	assertTrue(this.inv.getSugar() == 10);
    }
    
    public void testSetChocolate() {
    	this.inv.setChocolate(10);
    	assertTrue(this.inv.getChocolate() == 10);
    }
    
    
    /**
     * Test cases for all of the 'adder' methods for all four of
     * the different ingredients.
     */
    public void testAddCoffee() {
    	try {
			this.inv.addCoffee("5");
			assertTrue(this.inv.getCoffee() == 20);
		} catch (InventoryException e) {
			fail("Expected Inventory Exception to be thrown");
		}
    	
    	try {
			this.inv.addCoffee("NO");
			fail("Expected Inventory Exception to be thrown");
		} catch (InventoryException e) {
			assertEquals("Units of coffee must be a positive integer",
					e.getMessage());
		}
    }
    
    public void testAddMilk() {
    	try {
			this.inv.addMilk("5");
			assertTrue(this.inv.getMilk() == 20);
		} catch (InventoryException e) {
			fail("Expected Inventory Exception to be thrown");
		}
    	
    	try {
			this.inv.addMilk("NO");
			fail("Expected Inventory Exception to be thrown");
		} catch (InventoryException e) {
			assertEquals("Units of milk must be a positive integer",
					e.getMessage());
		}
    }
    
    public void testAddSugar() {
    	try {
			this.inv.addSugar("5");
			assertTrue(this.inv.getSugar() == 20);
		} catch (InventoryException e) {
			fail("Expected Inventory Exception to be thrown");
		}
    	
    	try {
			this.inv.addSugar("NO");
			fail("Expected Inventory Exception to be thrown");
		} catch (InventoryException e) {
			assertEquals("Units of sugar must be a positive integer",
					e.getMessage());
		}
    }
    
    public void testAddChocolate() {
    	try {
			this.inv.addChocolate("5");
			assertTrue(this.inv.getChocolate() == 20);
		} catch (InventoryException e) {
			fail("Expected Inventory Exception to be thrown");
		}
    	
    	try {
			this.inv.addChocolate("NO");
			fail("Expected Inventory Exception to be thrown");
		} catch (InventoryException e) {
			assertEquals("Units of chocolate must be a positive integer",
					e.getMessage());
		}
    }
    
    /**
     * Testing enoughIngredients, useIngredients, and the toString
     * methods below
     */
    
    public void testEnoughIngredients(){
    	
    }
    
}
