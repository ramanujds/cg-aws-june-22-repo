package regularexpressions;

import java.util.regex.Pattern;

public class RegularExpressionBasics {

	public static void main(String[] args) {
		
		String pattern = "[a-z]{3,}[@]{1}[a-z0-9]{5,}\\.com";
		
		String input = "ram@yahoo.com";
		
		boolean output = Pattern.matches(pattern, input);
		
		System.out.println(output);
		
		

	}

}
