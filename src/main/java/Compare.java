import java.util.ArrayList;

public class Compare {
    public static void main(String[] args) {
        String filepath1 = "F:\\Term5\\50003\\Software Testing Mini Campaign\\sample_file_1.csv";
        String filepath2 = "F:\\Term5\\50003\\Software Testing Mini Campaign\\sample_file_3.csv";
        ArrayList<String> record1 = ReadCSV.readCsvByBufferedReader(filepath1);
        ArrayList<String> record2 = ReadCSV.readCsvByBufferedReader(filepath2);
        int lssize;
        if (record1.size()>record2.size()){
            lssize = record2.size();
        }else {
            lssize = record2.size();
        }
        for(int i = 0; i < lssize; i++) {
            if (!(record1.get(i).equals(record2.get(i)))){
                System.out.print(record1.get(i)+"\n");
                System.out.print(record2.get(i)+"\n");
            }
        }
    }
}
