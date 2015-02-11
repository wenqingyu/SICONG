package sicong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		File f = new File("feynman.txt");
		Scanner scan = new Scanner(f);
		
		String line = "";
		int[] arr = new int[123];
		char target = 0;
		int count = 0;
		
		// READ FILE BY LINE
		while(scan.hasNextLine()){
			line = scan.nextLine();
			// CLEAN 
			char c = 0;
			// CLEAN
			String newLine = "";
			for(int j = 0; j < line.length(); j ++){
				c = line.charAt(j);
				if(c < 65 || j >122){
					continue;
				}
				else{
					newLine += c;
				}
			}
			newLine = line.toLowerCase();
			// 
			// CLEAN SPACE AND SYMBOLS
			// COUNT
			for(int j = 0; j < newLine.length(); j ++){
				c = newLine.charAt(j);
				if(c == 'b'){
					// LAST CASE EXC. CATCH
					if(j >= (newLine.length() - 1)){
						break;
					}
					target = newLine.charAt(j+1);
					arr[target] ++;
					count ++;
				}	
			}
			
		}
		
		// PRINT OUTPUT
		System.out.println("Total: " + count);
		for(int i = 97; i < 123; i ++){
			System.out.println((char)i + ": " + arr[i] + " -- " + (float)arr[i]/count*100+"%");
		}
	}

}
