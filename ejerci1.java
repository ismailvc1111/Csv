import java.util.*;
import java.io.*;
import java.security.AccessController;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
public class ejerci1 {
Scanner sc = new Scanner(System.in);
String ruta;

public ejerci1(){

this.ruta = ruta;
}

public void listar(){
System.out.println("Introduce la ruta para imprimir los resultados");
String in = sc.nextLine();
//introduccion de la ruta para imprimir los elementos
File carpeta = new File(in);
 String[] listado = carpeta.list();
    if (listado == null || listado.length == 0) {
      System.out.println("No hay elementos dentro de la carpeta actual");
      return;
    }
 //Lo mismo que lo anterior pero con objetos File para poder ver sus propiedades
    System.out.println("//// LISTADO CON OBJETOS File" );

    File[] archivos = carpeta.listFiles();
    if (archivos == null || archivos.length == 0) {
      System.out.println("No hay elementos dentro de la carpeta actual");
      return;
    }
    else {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
      for (int i=0; i< archivos.length; i++) {
        File archivo = archivos[i];
        String[] permisos = new String[3];
        if(archivo.canWrite()) {
         permisos[0] = "W";
        }else {
          permisos[0] = "-";
         }
         if(archivo.canExecute()){
          permisos[1]= "X";
        }else{
           permisos[1]= "-";
         }
         if(archivo.canRead()){
           permisos[2]= "R";
         } else{
           permisos[2]="-";

         }
String  ps= permisos[0] +"-"+ permisos[1] +"-"+ permisos[2];
String compraf;
if( archivo.isDirectory() ){
  compraf="Carpeta";
}else{
  compraf="Archivo";
}
System.out.println(archivo.getName() +" "+ compraf +" "+
                                    archivo.length()+" "+
                                    sdf.format(archivo.lastModified())+" "+ps
                                          );
      }
    }



//https://www.banggood.com/es/Geek-Customized-SK61-61-Keys-Mechanical-Keyboard-NKRO-Gateron-Optical-Axis-Type-C-Wired-RGB-Backlight-White-Case-Gaming-Keyboard-p-1593028.html?utm_source=googleshopping&utm_medium=cpc_organic&gmcCountry=ES&utm_content=minha&utm_campaign=minha-es-es-pc&currency=EUR&cur_warehouse=ES&createTmp=1&utm_source=googleshopping&utm_medium=cpc_bgs&utm_content=dcr&utm_campaign=dcr-ssc-es-es-up1-0603&ad_id=525477009726&gclid=Cj0KCQiAtJeNBhCVARIsANJUJ2GX5Rq87pJgriYlGhWfP_4qSCGUYNJIPLSX0vhR8CYkoc5vofJ5ERYaAn2-EALw_wcB&ID=5156306157199
}



}