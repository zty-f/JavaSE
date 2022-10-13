package main.test09;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main{
 	public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
      //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(Paths.get("D:\\IDEA_Project\\JavaSE\\src\\main\\test09\\record.log"))));
      // BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\IDEA_Project\\JavaSE\\src\\main\\test09\\record.log"));
        FileWriter writer = new FileWriter("D:\\IDEA_Project\\JavaSE\\src\\main\\test09\\record.log");
        try{
      	while(true){
      	 String s = sc.nextLine();
         writer.write(s);
        if(s.equals("quit")){
        	break;
        }
       }	
      }catch(Exception e){
        System.out.println("程序出现异常"+e.toString());
      }finally{
        writer.close();
      }
   } 
}