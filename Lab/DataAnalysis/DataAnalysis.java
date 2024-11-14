import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class DataAnalysis {

	public static void loadFile(String fname, String[] title,  String[] rank,  String[] date,  String[] artist,  String[] trend) {
			/* Use this command to read the given CSV file. It contains special characters and is encoded as UTF-8*/
			try{
				Scanner fin = new Scanner(new File(fname), "UTF-8");
				int i = 0;
				while(fin.hasNextLine()){
					String line = fin.nextLine();
					String[] parts = line.split(",");
					title[i] = parts[0];
					rank[i] = parts[1];
					date[i] = parts[2];
					artist[i] = parts[3];
					trend[i] = parts[4];
					i++;
				}
			} catch(FileNotFoundException e){
				System.out.println("File not found");
			}
	}
	
	public static int[] filterCol(String value, String[] arr) {
		int[] matchingIdxs = new int[arr.length];
		int idx = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i].equals(value)){
				matchingIdxs[idx] = i;
				idx++;
			}
		}
		return Arrays.copyOfRange(matchingIdxs, 0, idx);
	}

	public static void printHeader() {
		System.out.format("%-25s %8s %10s %8s %13s%n","Title", "Rank", "Date", "Artist", "Trend");
		System.out.println("------------------------- -------- ---------- -------- --------------");
	}

	public static void printFilterTable(String value, String[] arr, String[] title,  String[] rank,  String[] date,  String[] artist,  String[] trend) {
		int[] matchingIdxs = filterCol(value, arr);
		printHeader();
		float avgRank = 0; 
		String firstDate = date[matchingIdxs[0]]; 
		String lastDate = date[matchingIdxs[0]]; 
		int[] trendCounts = new int[4]; 

		for (int i = 0; i < matchingIdxs.length; i++) { 
		String currTitle = title[matchingIdxs[i]]; 
		String currRank = rank[matchingIdxs[i]]; 
		avgRank += Integer.parseInt(currRank); 
		String currDate = date[matchingIdxs[i]]; 

		if(currDate.compareTo(firstDate) < 0) 
		{ 
			firstDate = currDate; 
		}

		if(currDate.compareTo(firstDate) > 0) 
		{
			lastDate = currDate; 
		}

		String currArtist = artist[matchingIdxs[i]]; 
		String currTrend = trend[matchingIdxs[i]]; 

		if(currTrend.equals("MOVE_DOWN")) 
		{  
				trendCounts[0] = trendCounts[0] + 1; 
		}

		else if(currTrend.equals("SAME_POSITION")) 
		{
				trendCounts[1] = trendCounts[1] + 1; 
		}

		else if(currTrend.equals("NEW_ENTRY")) 
		{
				trendCounts[2] = trendCounts[2] + 1; 
		}

		else
		{
				trendCounts[3] = trendCounts[3] + 1; 
		}

		System.out.format("%-25s %8s %10s %8s %13s%n", currTitle, currRank, currDate, currArtist, currTrend); 

} 	
		avgRank /= matchingIdxs.length; 

		System.out.println(); 
		System.out.format("%-25s %13s%n", "Average Rank", avgRank); 
		System.out.format("%-25s %13s%n", "First Date on Chart", firstDate); 
		System.out.format("%-25s %13s%n", "Last Date on Chart", lastDate); 

		int maxIdx = 0; 

		for(int i = 1; i < trendCounts.length; i++) { 
				if(trendCounts[maxIdx] < trendCounts[i]) maxIdx = i; 
		} 

		String trendName = ""; 

		if(maxIdx == 0) 
		{
			trendName = "MOVE_DOWN"; 
		}
		else if(maxIdx == 1)
		{
			trendName = "SAME_POSITION"; 
		}
		else if(maxIdx == 2) 
		{
		trendName = "SAME_POSITION"; 
		}
		else 
		{
		trendName = "MOVE_UP"; 
		}

		System.out.format("%-25s %13s %8d%n", "Max Trend Count", trendName, trendCounts[maxIdx]); 
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a data file to read: ");
		String fname = input.nextLine();

		System.out.print("Enter the number of rows: ");
		int numRows = input.nextInt();
		input.nextLine();

		String[] title = new String[numRows];
		String[] rank = new String[numRows];
		String[] date = new String[numRows];
		String[] artist = new String[numRows];
		String[] trend = new String[numRows];

		loadFile(fname, title, rank, date, artist, trend);
		while(true){
			System.out.print("Enter a column to filter by: ");
			String col = input.nextLine();
			System.out.print("Enter a word to search for: ");
			String word = input.nextLine();
			if(col.equals("title")){
				printFilterTable(word, title, title, rank, date, artist, trend);
			}
			else if(col.equals("rank")){
				printFilterTable(word, rank, title, rank, date, artist, trend);
			}
			else if(col.equals("date")){
				printFilterTable(word, date, title, rank, date, artist, trend);
			}
			else if(col.equals("artist")){
				printFilterTable(word, artist, title, rank, date, artist, trend);
			}
			else if(col.equals("trend")){
				printFilterTable(word, trend, title, rank, date, artist, trend);
			}
			String response = "";
			while(true){
				System.out.print("Filter again? (Y/N): ");
				response = input.nextLine();
				if(response.equals("N") || response.equals("Y")){
					break;
				}
				if (!response.equals("Y") || !response.equals("N")) {
					System.out.println("Please input Y or N.");	
				}
			}
			if(response.equals("N")){
				break;
			}
	}
	input.close();
}
}