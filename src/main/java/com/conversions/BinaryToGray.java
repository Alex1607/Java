package src.main.java.com.conversions;

public class BinaryToGray
{
	/*	This method convert the binary number into gray code
		@param binarycode need to convert binary number into gray code
		@return graycode return as string
	*/

	public String binaryToGray(String binarycode)
	{
				
		StringBuilder graycode = new StringBuilder(Character.toString(binarycode.charAt(0)));
		
		for(int i = 0; i < binarycode.length() - 1; i++)
		{
			
			if (binarycode.charAt(i) == binarycode.charAt(i+1))
				graycode.append("0");
			else
				graycode.append("1");
			
		}
	
		return graycode.toString();
	}

}