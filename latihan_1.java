/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zahra300922;

/**
 *
 * @author HP
 */

import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException;

public class latihan_1 {
    
 public static void main( String[] args ){ 
 
 BufferedReader dataIn = new BufferedReader(new 
 InputStreamReader( System.in) ); 
 
 String name = ""; 
 String adres = ""; 
 String jurusan = ""; 
 
 System.out.print("Please Enter Your Name:"); 
 
 try{ 
 System.out.print("Please Enter Your Name:"); 
 name = dataIn.readLine(); 
 System.out.print("Please Enter Your adres:"); 
 adres = dataIn.readLine(); 
 System.out.print("Please Enter Your jurusan:"); 
 jurusan = dataIn.readLine(); 
 }catch( IOException e ){ 
 System.out.println("Error!"); 
 } 
 System.out.println("Hello " + name +"!");
 System.out.println("Alamat saya " + adres +"!"); 
 System.out.println("jurusan saya " + jurusan +"!"); 
 }
}
