package Connectfour.connectfourgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.junit.Test;


public class ReadInput {

	ConfigFileReader obj = new ConfigFileReader();

	// Read all values from the config and store them in 2 arrays
	@Test
	public void readConfigValues()
	{
		String red = obj.getRedInput();
		String[] arrayRed = red.split(","); 

		String yellow = obj.getYellowInput();
		String[] arrayYellow = yellow.split(",");

		System.out.println("Reading Red input :");
		for (String element: arrayRed) {
			System.out.println(element);
		}
		System.out.println("Reading Yellow input :");
		for (String element: arrayYellow) {
			System.out.println(element);
		}
	}

	// Run the jar file from here 
	@Test
	public void runJar() throws IOException
	{
		System.out.println("Execuet runnable JAR file");
		System.out.println("Start");
		Process proc = Runtime.getRuntime().exec("java -jar /Users/mau/eclipse-workspace/connectfour.jar");
		String s;
		System.out.println(proc.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		StringBuilder builder = new StringBuilder();
		while((s = br.readLine())!=null)
		{
			builder.append(s);
			builder.append(System.getProperty("line.separator"));
		}
		String result = builder.toString();
		System.out.println(result);


	}

	// Pass the values in the jar file from here 
	@Test
	public void passInputValueToJar()
	{
		System.out.println("Pass Input values to Executable Jar files");
	}

}