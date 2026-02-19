package employeeTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;

public class CreateEmployeeTest extends BaseClass{
	
	
	@Test(groups = "SmokeSuite")
	public void createEmployeeTest()
	{
		System.out.println("ji");
		System.out.println("Employee Created");
	}	
	
	@Test
	public void modifyEmployeeTest()
	{
		
		System.out.println("Employee modified");
	}
	
	@Test
	public void deleteEmployeeTest()
	{
		
		System.out.println("Employee Deleted");
	}

}
