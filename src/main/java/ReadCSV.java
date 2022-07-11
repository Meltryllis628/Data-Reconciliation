import java.io.*;
import java.util.ArrayList;

public class ReadCSV {
    /**
     * BufferedReader
     * @param filePath
     * @return
     */
    public static ArrayList<String> readCsvByBufferedReader(String filePath) {
        try {
            File csv = new File(filePath);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
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
            return null;
        }
        String line = "";
        ArrayList<String> records = new ArrayList<>();
        try {
            while ((line = br.readLine()) != null) {
                String linestr = line.toString();
                //System.out.println(linestr);
                records.add(linestr);
            }
            //System.out.println("csv lines:" + records.size());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return records;
    }
}
