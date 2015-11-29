import java.io.*;
import java.util.Scanner;
public class filebuffer {
public static void main(String[] args)
{
	String word=null;
	Scanner in=new Scanner(System.in);
	word=in.nextLine();
	System.out.println("Enter word:"+word);
	
	int count=0;
	try{
	File file=new File("wordsEn,.txt");
	FileReader filereader=new FileReader(file);
	BufferedReader reader=new BufferedReader(filereader);
	String line=null;
	while((line=reader.readLine())!=null){
		//System.out.println(line);
		if(line==word){
		count++;
		}
	}
	reader.close();
	}catch(IOException ex){
		ex.printStackTrace();
	}
if(count>=0){
	System.out.println("String is a valid word");
}else
{
	System.out.println("String is not a valid word");
}
}

}
