package hello_world;

import java.util.*;


public class ClearScreen{
    public  static void main (String [] args){
    	
    	//Scanner sc=new Scanner(System.in);
    	
      //  System.out.println("Hello World");
        
        
        ClearConsole();
        
        
    }

    public static void ClearConsole()
    {
        try{
            String operatingSystem = System.getProperty("os.name") ;//Check the current operating system
              
            if(operatingSystem.contains("Windows")){        
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            } 
        }catch(Exception e){
            System.out.println(e+"tartanoim");
        }
    }
}