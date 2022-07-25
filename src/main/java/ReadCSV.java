import java.io.*;
import java.net.URLConnection;
import java.util.ArrayList;

public class ReadCSV {
    /**
     * BufferedReader
     * @param filePath
     * @return records
     */
    public static ArrayList<String> readCsvByBufferedReader(String filePath) {
        try {
            File csv = new File(filePath);
        } catch (Exception e){
            //e.printStackTrace();
            return null;
        }
        String[] strArray = filePath.split("\\.");
        int suffixIndex = strArray.length -1;
        if (suffixIndex<=0||!strArray[suffixIndex].equals("csv")){
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
                String[] num = linestr.split(",");
                if(num.length != 5){
                    return null;
                }
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
