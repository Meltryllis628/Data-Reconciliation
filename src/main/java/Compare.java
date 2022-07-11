import java.util.ArrayList;

public class Compare {
    public static ArrayList<String> compare(String filepath1, String filepath2) {
        ArrayList<String> record1 = ReadCSV.readCsvByBufferedReader(filepath1);
        ArrayList<String> record2 = ReadCSV.readCsvByBufferedReader(filepath2);
        ArrayList<String> result = new ArrayList<String>();
        int lssize;
        if (record1.size()>record2.size()){
            lssize = record2.size();
        }else {
            lssize = record2.size();
        }
        for(int i = 0; i < lssize; i++) {
            if (!(record1.get(i).equals(record2.get(i)))){
                result.add(record1.get(i));
                result.add(record2.get(i));
                //System.out.print(record1.get(i)+"\n");
                //System.out.print(record2.get(i)+"\n");
            }
        }
        return result;
    }
}
