package epic;

class MainClass {
	
	static char[][] letter =
		{
				{},{},{'A','B','C'},{'D','E','F'},{'G','H','I'},{'J','K','L'},{'M','N','O'},{'P','Q','R'},
				{'S','T','U'},{'V','W','X','Y','Z'}
		};
		
		public static void generatePhoneDigits(String s, char[][] letters,int index, String temp)
		{
			if (index == s.length()) {System.out.println(temp); return;}
			if ((s.charAt(index)-'0')==0||(s.charAt(index)-'0')==1)
				generatePhoneDigits(s,letters,index+1,temp);
			for (int i=0;i<letters[((int)(s.charAt(index)-'0'))].length;i++)
				generatePhoneDigits(s,letters,index+1,temp+(letters[((int)(s.charAt(index)-'0'))][i]));
		}
		
	public static void main(String[] args) {
		String s="27190000";
		generatePhoneDigits(s,letter,0,"");	
		
	}
}
