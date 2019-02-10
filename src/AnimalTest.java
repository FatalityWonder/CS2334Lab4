/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
	public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

	public void fullConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal("White","Joy",180.0, 144.0);
        Animal animal2 = new Animal("White","Joy",180.0, 144.0);

        // The name should be "Joy", color "White", height 144.0, and weight 180.0.
        Assert.assertEquals("White", animal.getColor());
        Assert.assertEquals("Joy", animal.getName());
        Assert.assertEquals(144.0, animal.getHeight(), 0.01);
        Assert.assertEquals(180.0, animal.getWeight(), 0.01);
        Assert.assertEquals(true, animal.equals(animal2));
    }
	
	public void toStringTest() throws AssertException
	{	
		// Use constructor
		Animal animal = new Animal("White","Joy",180.0, 144.0);
		
		// test toString()
		Assert.assertEquals("Joy, a White-colored animal. 180.0 pounds, 144.0 inches\n", animal.toString());
	}
	
	public void equalsTest() throws AssertException
	{
		Animal animal = new Animal();
		Object animal2 = animal;
		
		Assert.assertEquals(true, animal.equals(animal2));
	}
}

