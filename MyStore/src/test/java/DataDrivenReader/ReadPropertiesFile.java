package DataDrivenReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	
	public static Properties RegistrationData = loadProperties(System.getProperty("user.dir")+"/DataDrivenFiles/RegistrationData.properties"); 
	
	private static Properties loadProperties(String Path)
	{
		Properties prop = new Properties();
		try 
		{
			FileInputStream stream = new FileInputStream(Path);
			prop.load(stream);
		} 
		catch (FileNotFoundException e) 
		{
		    System.out.println(e.getMessage());
		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		} 
		
		return prop; 
	}
}
