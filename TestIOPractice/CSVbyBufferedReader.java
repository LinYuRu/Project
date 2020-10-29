package TestIOPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CSVbyBufferedReader {

	public static void main(String[] args) throws IOException {
		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream("D://file_input.csv"));// 檔案讀取路徑
			BufferedReader reader = new BufferedReader(isr);
			BufferedWriter bw = new BufferedWriter(new FileWriter("D://file_output.csv"));// 檔案輸出路徑
			String line = null;
			while ((line = reader.readLine()) != null) {
				String item[] = line.split(",");
				/** 讀取 **/
				String[] dataArray = {item[0].trim(),item[1].trim(),item[2].trim()};
				System.out.print(dataArray[0]+"\t"+ dataArray[1]+"\t"+ dataArray[2]+"\n"); 
//				String data1 = item[0].trim();
//				String data2 = item[1].trim();
//				String data3 = item[2].trim();
//				System.out.print(data1 + "\t" + data2 + "\t" + data3 + "\n");

				// 可自行變化成存入陣列或arrayList方便之後存取
				
				/** 寫出 **/
			    bw.newLine();//新起一行
			   bw.write("data1,data2,data3\n");//寫到新檔案中
			   bw.write(dataArray[0]+","+ dataArray[1]+","+ dataArray[2]+"\n");

			    //用陣列讀也可以,重點是中間記得加上"逗號",才可以順利分欄位
			    //內容中如有逗號,記得換成別的,以免被csv誤會成分欄
			}
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
