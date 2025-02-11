// Nome.: Louise Paccola Peccin  
// RA...: 2475502

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leitura{ 

	public String entDados(String ler){

		System.out.println(ler);
		String r = "";
		InputStreamReader tec = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(tec);
		try{
			r = buff.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO \n");	
		}
		return r;
	}


}