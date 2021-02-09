package P00_interviewQuestion;

public class IQ_02_printStringChar_InDiffLine {

	public static void main(String[] args) {
		String str = "mango";
		
		char[] cr = str.toCharArray();
		
		for(int i=0; i<cr.length; i++) {
			System.out.println(cr[i]);
		}

	}

}
