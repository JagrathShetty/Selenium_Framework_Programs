package register;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import com.ec.tricentis.genericutility.FileUtility;

public class TC_DWS_002_Test {
	@Test
	public void demo() throws EncryptedDocumentException, IOException {
		FileUtility file=new FileUtility();
		String url = file.getDataFromProperty("url");
		System.out.println(url);
	}
}
