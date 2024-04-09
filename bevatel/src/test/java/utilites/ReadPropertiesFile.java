package utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static Properties getCofig() {
		Properties properties = new Properties();
		try {
			FileInputStream fileInputStream = new FileInputStream("configs//config.properties");
			properties.load(fileInputStream);
			fileInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return properties;

	}


}
