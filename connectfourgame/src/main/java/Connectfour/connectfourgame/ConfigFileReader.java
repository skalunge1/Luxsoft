package Connectfour.connectfourgame;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath= "src/test/java/connectFourInput.properties";


	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Connect Four.properties not found at " + propertyFilePath);
		} 
	}

	public String getRedInput(){
		String user = properties.getProperty("Red");
		return user;
	}
	
	public String getYellowInput(){
		String user = properties.getProperty("Yellow");
		return user;
	}

}