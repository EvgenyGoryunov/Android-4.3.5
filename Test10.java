import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test10 {

    public static void main(String[] args) {

        String text = "Иванов Иван Иванович 11-01-1956\n" +
                "Петров Петр Петрович 12.02.1947\n" +
                "Сидоров Сидор Сидорович 14/03/1968\n" +
                "Иванов Петр Сидорович 15+03+1987\n" +
                "Петров Сидор Иванович 17=04=1973\n" +
                "Сидоров Иван Петрович 20_05_1995\n";
        Pattern pat = Pattern.compile("\\d{2}.\\d{2}.\\d{4}");
        Matcher mat = pat.matcher(text);
        while (mat.find()) {
            String qqq1 = mat.group().replace('-', '.');
            String qqq2 = qqq1.replace('/', '.');
            String qqq3 = qqq2.replace('+', '.');
            String qqq4 = qqq3.replace('=', '.');
            String qqq5 = qqq4.replace('_', '.');
            System.out.println(qqq5);
        }
    }
}
