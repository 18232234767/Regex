import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo{
	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("o");//������ʽ  ƥ��ģʽ
		//Pattern pattern=Pattern.compile("(?<test>o)");//������ʽ  ƥ��ģʽ
		Matcher matcher=pattern.matcher("heololo");//ƥ�������,����һ��ƥ������ƥ��������������ģʽ�� 
		//ȫ��ƥ��
//		if(matcher.matches()) {//���Խ�����������ģʽ����ƥ�䡣 
//			System.out.println(matcher.group());//���ƥ���� ���ظ������������������ named-capturing group��ǰ��ƥ������ڼ䡣
//		}
		//�ֲ�����ƥ��
		while(matcher.find()) {
			System.out.println(matcher.group());
			//System.out.println(matcher.group("test"));
		}
	}
}