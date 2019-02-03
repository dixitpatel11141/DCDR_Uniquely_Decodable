import java.util.Scanner;

public class Uniquely_Decodable {
	
	
public static void  main(String args[]) {
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter The Codes:\n Enter Number Of Codes: ");
		int n = x.nextInt();
		String code[] = new String[n];
		int status = 1;
		int l=0, k=0 , in = 0; 
	
		for(int i = 0; i<n; i++)
		{
			System.out.println("Enter Code For (" + i + "):");
			code[i] = x.next();
		}
		
		for(int i=0; i < n; i++)
		{
			
			for(int j=0; j < n; j++)
			{
				if(code[i] != (code[j]))
				{ 
					String a = code[i];
					String b = code[j];
					
					int aa = a.length();
					int bb = b.length();
					
					for( k=0,l=0; k < aa && l < bb ;k++,l++)
					{
							if(a.charAt(l) == b.charAt(k) && a.charAt(0) == b.charAt(0))
							{
								status = 0;
								in = i;
																
							}
						}
					}
			}
		}
		
		if (status == 0)
		{
			String pre = code[in].substring(l);
			
			for(int dd=0; dd<n; dd++)
			{
				if(pre.equals(code[dd]))
				{	
				System.out.println("Uniquly Not Decodable ");
				break;
				}
			}
		}
		else
		{
			System.out.println("Uniquly Decodable " );
		}
		
	x.close();
	}
}