public class EquipmentTest
{
	public void equipmentConstructorTest() throws AssertException
    {
        // Use the default constructor
        Equipment eq = new Equipment("Batarang/5,5.0,5.0,A boomerang for bats");

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("Batarang", eq.getName());
        Assert.assertEquals(5, eq.getCount());
        Assert.assertEquals(5.0, eq.getTotalWeight());
        Assert.assertEquals(5.0, eq.getTotalPrice());
        Assert.assertEquals("A boomerang for bats", eq.getDescription());
    }
	
	public void equipmentToStringTest() throws AssertException
	{
		Equipment eq = new Equipment("Batarang/5,5.0,5.0,A boomerang for bats");
		
		Assert.assertEquals("Name: Batarang, Number: 5, Weight: 5.00 lbs, Price: $5.00 - A boomerang for bats", eq.toString());
	}
}