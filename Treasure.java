import java.io.*;
import java.util.Date;
public class Treasure{
   static String password="alibaba";
   static String log="./.stamp.txt";
   static long diff=0;
   public static void main(String args[])throws FileNotFoundException{ 
      File stamp = new File(log); 
      if(!stamp.exists()){
         PrintWriter pw = new PrintWriter(stamp);
      }   
      else{
         Date now=new Date();
         diff = now.getTime();
         diff-=stamp.lastModified();
      } 
      if(diff>5000){
         System.out.println("Time for attempts exhausted!");
         File file = new File("./Treasure.class");
         if(file.delete()){
            System.out.println("Program deleted!");
         }
         else{
            System.out.println("Failed to delete");}
      }         
      else if(args[0].equals(password)){
         System.out.println("The treasure is hidden 0.5m underground, 5m northeast of the front door!");
      }
      //System.out.println(diff);
   }
}