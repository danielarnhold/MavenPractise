package de.arnhold;
import java.io.*;

/**
 * Class for getting Strings in Uppercases
 *
 */
public class touppercasetest
{
    public static void main( String[] args )
    {

	try{
		InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                System.out.print("Gib was ein: ");
                String Str =  br.readLine();

                System.out.print("Ausgabe: " );
                System.out.println(Str.toUpperCase() );
	}catch(IOException ioe){
	}

    }
}

