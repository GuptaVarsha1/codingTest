package Test;

import java.io.FileReader; 

//Q. Design a program that reads data from a file using the FileReader class. Use a BufferedReader to handle IOException
public class FileReaderEX {
   
    public static void main(String args[]) 
    { 
        try { 
            //filereader to read file from same folder 
            FileReader fileReader = new FileReader( "C:\\Users\\varsha\\OneDrive\\Desktop\\Anudip Java Practice\\Test\\input.txt"); 
            int i; 
            //to read each character from the input file
            while ((i = fileReader.read()) != -1) 
                System.out.print((char)i); 
            fileReader.close(); 
        } 
        catch (Exception e) { 
            //to show error if any
            System.out.println("Error: " + e.toString()); 
        } 
    } 
}

