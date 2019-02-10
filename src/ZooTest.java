public class ZooTest
{
	public void zooConstructorTest() throws AssertException
    {
        // Use the default constructor
        Zoo zoo = new Zoo(5);

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals(5, zoo.getCapacity());
    }
	
	public void zooToStringTest() throws AssertException
	{
		Zoo zoo2 = new Zoo(1);
		Animal animal = new Animal("White","Joy",180.0, 144.0);
		
		zoo2.addAnimal(animal);
        Assert.assertEquals("These animals live in the zoo: \nJoy, a White-colored animal. 180.0 pounds, 144.0 inches\n", zoo2.toString());
	}
}