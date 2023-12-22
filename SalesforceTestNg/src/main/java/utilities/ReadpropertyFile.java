package utilities;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import constant.FileConstants;

public class ReadpropertyFile {

	
	public static String readPropertyFile(String path, String key) throws IOException {
		File f = new File(FileConstants.LOGIN_TESTDATA_FILE_PATH2);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);
	}
	

	public static String readUserMenuTestData(String key) throws IOException {
		File f = new File(FileConstants.USER_MENU_TESTDATA_FILE_PATH);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);
	}
}