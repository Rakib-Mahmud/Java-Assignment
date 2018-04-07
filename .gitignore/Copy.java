import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class Copy 
{
    public static void main(String[] args)
    {	
    	Scanner scanf=new Scanner(System.in);
    	String source_location,destination_location,line;
    	System.out.println("Enter the directory of the source file");
    	source_location=scanf.nextLine();
    	System.out.println("Enter the directory of the destination file");
    	destination_location=scanf.nextLine();
    	
    	File file=new File(source_location);
    	File copyfile=new File(destination_location);
    	BufferedReader reader;
    	PrintWriter writer;
    	
    	System.out.println("Options:\n\t(1)Press 1 to create a new file.\n\t(2)Press 2 for appending to the file.\n\t(3)Press 3 to overwrite the file.");
    	int option=scanf.nextInt();
    	
    	if(option==1){    //To Create A New File...
    		try{
    			if(copyfile.createNewFile()){
    				System.out.println("File is created successfully...");
    			}
    			else{
    				System.err.println("File already exists!!!");
    			}
    		}catch(IOException ioexp){
    			System.err.println("Failed to create the file");
    		}
    	}
    	
    	
    	else if(option==2){   //To Append To The File...
    		try{
    			if(copyfile.createNewFile() || !copyfile.createNewFile()){
    				reader=new BufferedReader(new FileReader(file));
    				writer=new PrintWriter(new FileWriter(copyfile,true));
    				
    				while((line=reader.readLine()) != null){
    					writer.println(line);
    				}
    				
    				System.out.println("Appended To The File Successfully...");
    				
    				reader.close();
    				writer.close();
    			}
    		}catch(IOException ioexp){
    			System.err.println("Failed to copy the file");
    		}
    	}
    	
    	
    	else if(option==3){   //To Overwrite The File...
    		try{
    			if(!copyfile.createNewFile()){
    				reader=new BufferedReader(new FileReader(file));
    				writer=new PrintWriter(new FileWriter(copyfile,false));
    				
    				while((line=reader.readLine()) != null){
    					writer.println(line);
    				}
    				
    				System.out.println("Overwrite The File Successfully...");
    				
    				reader.close();
    				writer.close();
    			}
    		}catch(IOException ioexp){
    			System.err.println("Failed to copy the file");
    		}
    	}
    	
    	scanf.close();
    	
    }
}