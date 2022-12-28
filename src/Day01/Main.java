package Day01;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		BufferedReader reader;
		int mostCalories = 0;
		int calories = 0;
		
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\adamc\\eclipse-workspace\\Day01\\src\\Day01\\calories.txt"));
			String line = reader.readLine();

			while (line != null) {
							
				if(!line.isEmpty()) {
					int temp = Integer.valueOf(line);
					System.out.println(calories);
					calories += temp;
					line = reader.readLine();
					
				}else {
					
					if(calories >= mostCalories) {
						mostCalories = calories;
					}
					calories = 0;
					line = reader.readLine();
					continue;
				}
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("");
		System.out.printf("Answer is:" + mostCalories);
	}
		
	
	

}
