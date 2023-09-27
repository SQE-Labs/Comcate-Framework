package CommonMethods;

import java.io.File;

public class CheckDownloadedFile {
    public static String isFileDownloaded(String fileName) {
        String home = System.getProperty("user.home");
        String file_name = fileName;
        String file_with_location = home + "\\Downloads\\" + file_name;
        File file = new File(file_with_location);
        if (file.exists()) {
            String result = "File Present";
            return result;
        } else {
            String result = "File not Present";
            String result1 = result;
            return result1;
        }
    }

}
