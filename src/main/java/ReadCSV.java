import java.io.*;
import java.util.ArrayList;

public class ReadCSV {
    /**
     * BufferedReader
     * @param filePath
     * @return
     */
    public static ArrayList<String> readCsvByBufferedReader(String filePath) {
        File csv = new File(filePath);
        csv.setReadable(true);
        csv.setWritable(true);
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            isr = new InputStreamReader(new FileInputStream(csv), "UTF-8");
            br = new BufferedReader(isr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String line = "";
        ArrayList<String> records = new ArrayList<>();
        try {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                records.add(line);
            }
            System.out.println("csv lines:" + records.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }
}
