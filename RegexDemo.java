import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo{
	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("o");//正则表达式  匹配模式
		//Pattern pattern=Pattern.compile("(?<test>o)");//正则表达式  匹配模式
		Matcher matcher=pattern.matcher("heololo");//匹配的内容,创建一个匹配器，匹配给定的输入与此模式。 
		//全局匹配
//		if(matcher.matches()) {//尝试将整个区域与模式进行匹配。 
//			System.out.println(matcher.group());//输出匹配结果 返回给定捕获的输入子序列 named-capturing group以前的匹配操作期间。
//		}
		//局部查找匹配
		while(matcher.find()) {
			System.out.println(matcher.group());
			//System.out.println(matcher.group("test"));
		}
	}
}