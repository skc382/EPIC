package epic.prep;

public class MainClass {
	
	public static void main(String[] argc)
	{
		System.out.println(RGBParse("308014"));
	}
	
	public static String RGBParse(String RGB)
	{
		
		int r = Integer.parseInt(RGB.substring(0,1), 16);
		int g = Integer.parseInt(RGB.substring(2,3), 16);
		int b = Integer.parseInt(RGB.substring(3,4), 16);
		
		if(r == g && g == b)
			return "RGB all are equal";
		
		if(r == g)
		{
			if(r+g > b)
				return "r equals g";
			else
				return "b is biggest";
		}
		else if(g == b)
		{
			if(b+g > r)
				return "b equals g";
			else
				return "r is biggest";
		}
		else if(r == b)
		{
			if(r+b > g)
				return "r equals b";
			else
				return "g is biggest";
		}
		
		if(r > g)
		{
			if(r > b)
				return "r is biggest";
			else 
				return "b is biggest";
		}
		else 
		{
			return (g > b)? "g is greater" : "b is greater";
		}
		
	}

}
