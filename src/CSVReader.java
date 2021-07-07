import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CSVReaderPractice.csv
		
		String path = "/Users/pgupta/Desktop/CSVReaderPractice.csv";
		String line ="";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while((line = br.readLine()) != null) {
				String[] Title = line.split(",");
				System.out.println(Title[0]);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
