import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class generateCsvs {
    public void generate2csvs(int scale,int correctRate) throws IOException {
        Random r = new Random();
        ArrayList<String> csv1 = new ArrayList<>();
        csv1.add(generate.HEADER);
        ArrayList<String> csv2 = new ArrayList<>();
        csv2.add(generate.HEADER);
        for (int i = 0;i<scale;i++){
            int rate = r.nextInt(100);
            if (correctRate>rate){
                String s = generate.generateLine(i);
                csv1.add(s);
                csv2.add(s);
            }else {
                String s = generate.generateLine(i);
                csv1.add(s);
                String s2 = generate.generateLine(i);
                csv2.add(s2);
            }
        }
        WriteCSV.writeToCSV(csv1,"csv1.csv");
        WriteCSV.writeToCSV(csv2,"csv2.csv");
    }
}
