import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches
{
    public static void main( String args[] ){

        // ��ָ��ģʽ���ַ�������
        String line = "This order was placed for QT3000!  OK?";
        String pattern = "^([a-zA-Z\\s]*)(\\d+)(.*)$";
        pattern = "(.*)(\\d+)(.*)"; //greedy match

        pattern = "(.*?)(\\d+)(.*)"; // not greedy


        line="Windows 98 is isa old.";
        pattern = "(.*)(is\\B)(.*)";
        // ���� Pattern ����
        Pattern r = Pattern.compile(pattern);

        // ���ڴ��� matcher ����
        Matcher m = r.matcher(line);
        System.out.println(m.groupCount());
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );

        } else {
            System.out.println("NO MATCH");
        }
    }
}