package employeeTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;

public class DataProviderPractice extends BaseClass {
	//Run the same multiple times with Different data set 
	//Execution Time is more
	
	@Test(dataProvider = "empData")
	public void createEmployeeTest(String name, int id)
	{
		System.out.println(name + "-> "+id);
	}
	
	@DataProvider //script specific
	public Object[][] empData()
	{
		Object[][] data = new Object[3][2]; // 3 rows - 2 columns - 3 datas with 2 inform each
		
		data[0][0] = "Sylvia";
		data[0][1] = 12;
		
		data[1][0] = "Chaitra";
		data[1][1] = 14;
		
		data[2][0] = "Shah Ruk Khan";
		data[2][1] = 16;
		
		return data;
	
	}
	
	

}
