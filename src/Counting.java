import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//Created a class Counting
public class Counting {
	public static void main(String[]args) throws IOException{
		BufferedReader reader= null;
		//we first initialize the charCount, wordCount and lineCount to zero
		int charCount=0;
		int wordCount=0;
		int lineCount=0;
		 // Here we create  BufferedReader object
		reader= new BufferedReader(new FileReader("E:\\prienc1.txt"));
		// Here the code is reading the first line into currentLine
		String currentLine = reader.readLine();
		//Applying the while loop
		while (currentLine != null){
			//updating the line count
			lineCount++;
			//Now getting the number of words
			String[]words= currentLine.split(" ");
			//Updating the word count
			wordCount= wordCount+words.length;
			//Iterating each word
			for(String word: words){
				 charCount = charCount + word.length();
            }
             
            //Reading next line into currentLine
             
            currentLine = reader.readLine();
        }
         
        // Printing charCount, wordCount and lineCount
         
        System.out.println("Number Of Chars In A File : "+charCount);
         
        System.out.println("Number Of Words In A File : "+wordCount);
        
        System.out.println("Number Of Lines In A File : "+lineCount);
        {
			}
		}
		
		
	}


