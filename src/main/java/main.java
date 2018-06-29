import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //String strResult = new String();
        TextAnalyzerService tas = new TextAnalyzerService();
        ResultObject resultObject;
        List<String> resultList = new ArrayList<>();
        String path = "1.txt";
        boolean isBracketsOk = false;

        try {
            isBracketsOk = tas.parsing(path).equals("correct") ? true : false;
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            resultList = tas.readFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        resultObject = new ResultObject(path, resultList, isBracketsOk);
        //System.out.println(resultObject.toString());

        for(String x : resultObject.getListOfString()){
            System.out.println(x);
        }
    }
}
