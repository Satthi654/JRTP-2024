public class PalindromeOrNot{
	public static void main(String[] args){
		String originalString = "racecar";
		String reverse = "";
		if(originalString.length()>0){
			for(int i = 0; i<originalString.length(); i++){
				reverse = originalString.charAt(i)+reverse;
			}
			System.out.println("Original String is : "+originalString);
			System.out.println("Reversed String is : "+reverse);
			if(originalString.equals(reverse)){
				System.out.println("Given String is Palindrome");
			}else{
				System.err.println("Given String is NOT Palindrome");
			}
		}
	}
}