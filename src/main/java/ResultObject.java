import java.util.List;
import java.util.Map;

public class ResultObject {
    private String strFile;
    //private Map<String, Integer> repeatsAndStringsMap;
    private List<String> first10FrequentStrings;
    private boolean isBracketsOk;

    public ResultObject(String strFile, List<String> first10FrequentStrings, boolean isBracketsOk) {
        this.strFile = strFile;
        this.first10FrequentStrings = first10FrequentStrings;
        this.isBracketsOk = isBracketsOk;
    }

    public String getStrFile() {
        return strFile;
    }

    public void setStrFile(String strFile) {
        this.strFile = strFile;
    }

    public List<String> getFirst10FrequentStrings() {
        return first10FrequentStrings;
    }

    public void setFirst10FrequentStrings(List<String> first10FrequentStrings) {
        this.first10FrequentStrings = first10FrequentStrings;
    }

    public boolean isBracketsOk() {
        return isBracketsOk;
    }

    public void setBracketsOk(boolean bracketsOk) {
        isBracketsOk = bracketsOk;
    }

    @Override
    public String toString() {
        StringBuilder strB = new StringBuilder();
        System.out.println("Исследуемый файл: " + strFile + "\n");
        strB.append("10 самых часто встречающихся слов: \n");
        first10FrequentStrings.forEach(x -> strB.append(x + "\n"));
        strB.append(isBracketsOk==true? "\n Скобки расставлены верно" : "\n Скобки расставлены неправильно! \n");

        return strB.toString();
    }

    public List<String> getListOfString(){
        return first10FrequentStrings;
    }
}
