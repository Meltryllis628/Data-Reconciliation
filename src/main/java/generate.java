
import java.util.Random;

public class generate {
    public static final String HEADER = "\"Customer ID#\",\"Account No.\",\"Currency\",\"Type\",\"Balance\"";
    static Random r = new Random();
    public static String generateLine(Integer id){
        String idS = "\"id" + id.toString() +"\",";
        int num = r.nextInt(5)+1;
        int num2 = r.nextInt(15)+1;
        Long ballence = r.nextLong();
        String NoS = "\""+generateAccNo(num)+"\",";
        String cur = "\""+generateRandomChr(num2)+"\",";
        String type = "\""+generateRandomChr(num2)+"\",";
        String bal = "\""+ballence.toString()+"\"";
        return idS+NoS+cur+type+bal;
    }
    private static String generateRandomChr(int num){
        String result = "";
        for(int i = 0;i<num;i++){
            Character c;
            boolean capital = r.nextBoolean();
            int number = r.nextInt(25);
            if(capital){
                c = (char)(number+65);
            }else{
                c = (char)(number+97);
            }
            result += c.toString();
        }
        return result;
    }
    private static String generateAccNo(int num){
        String prefix = generateRandomChr(num);
        String id = ((Long)r.nextLong()).toString();
        return prefix+id;
    }
}
