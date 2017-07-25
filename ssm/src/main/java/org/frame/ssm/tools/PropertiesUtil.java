package org.frame.ssm.tools;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

	public Properties getProperties() throws FileNotFoundException, IOException{
		String path = this.getClass().getResource("/converter.properties").getPath();
		if(path.contains("%20")){
			path = path.replace("%20", " ");
		}
		File file = new File(path);
		Properties pro = new Properties();
		pro.load(new BufferedInputStream(new FileInputStream(file)));
		return pro;
	}
}
