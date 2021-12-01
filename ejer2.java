import java.util.*;
import java.io.*;
import java.security.AccessController;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
import java.util.Scanner;  


public class ejer2 {
String ruta ;

public ejer2(){




}

public void escanear()  throws FileNotFoundException  {
try{
Scanner sc = new Scanner(new File("Restaurants.csv"));

sc.useDelimiter(",");  
while (sc.hasNext())  
{  
System.out.print(sc.next());  
}   
sc.close();  
}catch (IOException e) {
        e.printStackTrace(); 
    }


  
}}