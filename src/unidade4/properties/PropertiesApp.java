package unidade4.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropertiesApp {

	public static void main(String[] args) throws InvalidPropertiesFormatException, FileNotFoundException, IOException {

		Properties sites = new Properties();
		sites.loadFromXML(new FileInputStream("C:/Java/2Disciplina/src/unidade4/properties/sites.xml"));
		System.out.println(sites.getProperty("1"));		// <entry key='1'>
	}
}
