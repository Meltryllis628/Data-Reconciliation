import java.util.ArrayList;
import java.util.HashSet;

public class Compare {
    public static ArrayList<String> compare(String filepath1, String filepath2) {
        ArrayList<String> record1 = ReadCSV.readCsvByBufferedReader(filepath1);
        ArrayList<String> record2 = ReadCSV.readCsvByBufferedReader(filepath2);
        ArrayList<String> result = new ArrayList<String>();
        HashSet<String> hs = new HashSet<>();
        if (record1==null||record2==null){
            return null;
        }
        if (record1.size()!=record2.size()){
            return null;
        }
        for(int i = 0; i < record1.size(); i++) {
            if (hs.contains(record1.get(i))){
                return null;
            }
            hs.add(record1.get(i));
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
