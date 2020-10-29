package TestIOPractice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;


public class CSVReaderByIterator {

	public static void main(String[] args) throws IOException {
		CSVReader reader = new CSVReader(new FileReader("D://file_input.csv")); 
		String [] nextLine; 
//		while ((nextLine = reader.readNext()) != null) {  
//		    System.out.println(nextLine[0] + nextLine[1] + "\n"); 
//		}
		List<String[]> myEntries = reader.readAll();
		for(int i=0;i<myEntries.size();i++) {
			for(String temp:myEntries.get(i)) {
				System.out.printf("%s : %s %n",i,temp);
			}
		}
		
//		CSVWriter writer = new CSVWriter(new FileWriter("D://File.csv"), '\t'); 
//		String[] entries1 = "data1,data2,data3". split(","); 
//		String[] entries2 = {"data1","data2","data3"}; 
//		writer.writeNext(entries1);
//		writer.writeNext(entries2);  
//		writer.close();

	}

}
