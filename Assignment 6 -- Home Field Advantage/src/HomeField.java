import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * CS312 Assignment 6
 * 
 * On my honor, Danyal Saeed, this programming assignment is my own work and I have
 * not shared my solution with any other student in the class.
 *
 * A program to play determine the extend of home field advantage in sports.
 *
 *  email address: danyalsaeed@utexas.edu
 *  UTEID: das6689
 *  Unique 5 digit course ID: 52530
 *  Grader name: Tanay Garg
 *  Number of slip days used on this assignment: 0
 */

/**
 * Data from 14 input files and analysis of Home Field Advantate go here.
Filename: cfb05.txt

**********   College Football --- 2005   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 4,069
Number of games with a home team: 3,955
Percentage of games with a home team: 97.2%
Number of games the home team won: 2,257
Home team win percentage: 57.1%
Home team average margin: 4.24

Filename: cfb08.txt

**********   College Football --- 2008   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 4,702
Number of games with a home team: 4,592
Percentage of games with a home team: 97.7%
Number of games the home team won: 2,617
Home team win percentage: 57.0%
Home team average margin: 4.28

Filename: mbb12.txt

**********   NCAA Men's Basketball --- 2011 - 2012   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 15,842
Number of games with a home team: 14,481
Percentage of games with a home team: 91.4%
Number of games the home team won: 9,178
Home team win percentage: 63.4%
Home team average margin: 5.37

Filename: mbb14.txt

**********   NCAA Men's Basketball --- 2013 - 2014   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 16,219
Number of games with a home team: 14,754
Percentage of games with a home team: 91.0%
Number of games the home team won: 9,276
Home team win percentage: 62.9%
Home team average margin: 5.18

Filename: mlb12.txt

**********   Major League Baseball --- 2012   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 2,467
Number of games with a home team: 2,465
Percentage of games with a home team: 99.9%
Number of games the home team won: 1,312
Home team win percentage: 53.2%
Home team average margin: 0.16

Filename: mscc06.txt

**********   College Men's Soccer --- 2006   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 8,380
Number of games with a home team: 7,373
Percentage of games with a home team: 88.0%
Number of games the home team won: 3,962
Home team win percentage: 53.7%
Home team average margin: 0.51

Filename: wbb00.txt

**********   NCAA Women's Basketball --- 1999 - 2000   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 4,607
Number of games with a home team: 4,345
Percentage of games with a home team: 94.3%
Number of games the home team won: 2,696
Home team win percentage: 62.0%
Home team average margin: 5.60

Filename: wbb05.txt

**********   NCAA Women's Basketball --- 2004 - 2005   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 14,687
Number of games with a home team: 13,261
Percentage of games with a home team: 90.3%
Number of games the home team won: 8,043
Home team win percentage: 60.7%
Home team average margin: 4.95

Filename: wbb08s.txt

**********   NCAA Women's Basketball --- 2011 - 2012   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 14
Number of games with a home team: 9
Percentage of games with a home team: 64.3%
Number of games the home team won: 6
Home team win percentage: 66.7%
Home team average margin: 6.00

Filename: wbb12.txt

**********   NCAA Women's Basketball --- 2011 - 2012   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 15,640
Number of games with a home team: 14,303
Percentage of games with a home team: 91.5%
Number of games the home team won: 8,496
Home team win percentage: 59.4%
Home team average margin: 4.41

Filename: wbb13.txt

**********   NCAA Women's Basketball --- 2012 - 2013   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 15,722
Number of games with a home team: 14,341
Percentage of games with a home team: 91.2%
Number of games the home team won: 8,512
Home team win percentage: 59.4%
Home team average margin: 4.23

Filename: wbb14.txt

**********   NCAA Women's Basketball --- 2013 - 2014   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 15,790
Number of games with a home team: 14,305
Percentage of games with a home team: 90.6%
Number of games the home team won: 8,471
Home team win percentage: 59.2%
Home team average margin: 4.24

Filename: wscc10.txt

**********   NCAA Women's Soccer --- 2010   **********

HOME FIELD ADVANTAGE RESULTS

Total number of games: 10,593
Number of games with a home team: 9,941
Percentage of games with a home team: 93.8%
Number of games the home team won: 5,392
Home team win percentage: 54.2%
Home team average margin: 0.51
 * 
 * 
 Based on the data collected, a home field advantage appears to exist in sports. Out of the 13 
 seasons analyzed from many different sports leagues including NCAA Men's Basketball, NCAA Women's 
 Basketball, NCAA Women's Soccer, College Men's Soccer, College Football, and the MLB, the home team
 win percentage ranged from as low as 53.2% to as high as 66.7%. It is possible to 
 consider the wbb08s.txt file as an outlier due to the smaller sample size, but the rest of the 12
 files still confirm at least some advantage. Even at the lowest percentage won with the MLB 2012 
 season, the home team still won a majority of the time. In general, NCAA Men's basketball and NCAA 
 Women's basketball saw the biggest home field advantages as compared to the other sports. The win 
 percentages for basketball ranged from 62.0% to 66.7%. Basketball seems to have a higher home team 
 advantage due to the high scoring nature of basketball which makes fan interaction and environment 
 more important. The win margins ranged from 4.23 to 6.00 which is also fairly significant. 
 College football saw the second largest home team advantage with win percentages of 57.1% and 
 57.0%. The win margins were 4.24 and 4.28 which is about a field goal. This doesn't seem like much, 
 but the win percentage is more significant. Fan environment is extremely important to college 
 football culture which probably explains why teams tend to perform better at home. College women's and 
 men's soccer had small home field advantages: 53.7% and 54.2% respectively with an average win 
 margin of .51 for both. This could be considered statistical noise, so a better study would be 
 needed to fully determine that, but based on this analysis even this small advantage still points 
 to a home field advantage in soccer. Overall, based on this basic analysis, there does seem to be a 
 home field advantage, but a better study would also account for relative overperformance in 
 relation to expectations of home teams. It's also clear that the home field advantage is more 
 prevalent is some sports like basketball and football than other sports like soccer and baseball.
 */

public class HomeField {

	// Ask the user for the name of a data file and process
	// it until they want to quit.
	public static void main(String[] args) throws IOException {
		System.out.println("A program to analyze home field advantage in sports.");
		System.out.println();
		// CS312 students. Do not create any other Scanners connected to System.in.
		// Pass keyboard as a parameter to all the methods that need it.
		Scanner keyboard = new Scanner(System.in);
		boolean playAgain = true;
		//This loop will run once for each time the user wishes to process another file.
		while (playAgain) {
			File mainFile = new File(getFileName(keyboard));
			Scanner fileReader = new Scanner(mainFile);
			printHeader(mainFile, fileReader);
			runAnalysis(fileReader, mainFile);

			playAgain = runProgramAgain(playAgain, keyboard);
			System.out.println();

		}

		// CS312 students - Add your code here

		keyboard.close();
	}

	// CS312 Students - Add your methods here.
	/**
	 * Used to get a valid file that exists. Ignores spaces
	 * @param Scanner keyboard takes input from the user
	 * @return String to return the fileName as a String which can then be used to open the file.
	 */
	public static String getFileName(Scanner keyboard) throws FileNotFoundException{
		System.out.print("Enter the file name: ");
		String fileName = keyboard.nextLine().replace(" ", "");
		File file = new File(fileName);
		//This loop will run once for each invalid file input.
		while (!file.exists()) {
			System.out.println("Sorry, that file does not exist");
			System.out.print("Enter the file name: ");
			fileName = keyboard.nextLine().replace(" ", "");
			file = new File(fileName);
		}
		fileName = file.getName();

		return fileName;

	}
	
	/**
	 * Prints the header for each file analyzed
	 * @param File mainFile is the file the user wants analyzed
	 * @param Scanner fileReader reads the file's lines 
	 * @return void
	 */
	public static void printHeader(File mainFile, Scanner fileReader) {
		// System.out.printf("Filename: %s", mainFile);
		String sportName = fileReader.nextLine();
		String sportYear = fileReader.nextLine();
		System.out.printf("\n**********   %s --- %s   **********", sportName, sportYear);
		System.out.println("\n\nHOME FIELD ADVANTAGE RESULTS");

	}
	
	/**
	 * Does the main work of analyzing all the data in the file and storing in double values.
	 * @param Scanner fileReader reads the file's line's for line based processing.
	 * @param File mainFile is the file the user wants analyzed.
	 * @return void
	 */
	public static void runAnalysis(Scanner fileReader, File mainFile) {
		double totalGames = 0;
		double homeTeamPresent = 0;
		double homeScore = 0;
		double homeWin = 0;
		double awayScore = 0;
		double totalHomePoints = 0;
		double totalAwayPoints = 0;
		//This loop will run once for each line that exists in the file
		while (fileReader.hasNextLine()) {
			totalGames++;
			homeScore = 0;
			awayScore = 0;
			String line = fileReader.nextLine();
			Scanner lineReader = new Scanner(line);
			lineReader.next();
			if (line.contains("@")) {
				homeTeamPresent++;
				if (lineReader.next().charAt(0) == '@') {
					while (!lineReader.hasNextInt()) {
						lineReader.next();
					}

					homeScore = lineReader.nextInt();
					totalHomePoints += homeScore;
				} else {
					while (!lineReader.hasNextInt()) {
						lineReader.next();
					}
					awayScore = lineReader.nextInt();
					totalAwayPoints += awayScore;

				}

				if (lineReader.next().charAt(0) == '@') {
					while (!lineReader.hasNextInt()) {
						lineReader.next();
					}

					homeScore = lineReader.nextInt();
					totalHomePoints += homeScore;

				} else {
					while (!lineReader.hasNextInt()) {
						lineReader.next();
					}
					awayScore = lineReader.nextInt();
					totalAwayPoints += awayScore;

				}
				if (homeScore > awayScore) {
					homeWin++;
				}
			}
			lineReader.close();
		}

		printResults(totalGames, homeTeamPresent, homeWin, totalHomePoints, totalAwayPoints);

	}
	
	/**
	 * Used to see if user wants to process another file
	 * @param boolean playAgain flag that allows for while loop to continue
	 * @param Scanner keyboard takes input from the user
	 * @return boolean to return true or false and continue or end program
	 */
	public static boolean runProgramAgain(boolean playAgain, Scanner keyboard) {
		System.out.println("\nDo you want to check another data set?");
		System.out.print("Enter Y or y to analyze another file, anything else to quit: ");
		if (keyboard.hasNextLine()) {
			String input = keyboard.nextLine().toUpperCase();

			if (input.charAt(0) != 'Y') {
				return false;
			}

		}
		return true;

	}
	
	/**
	 * Prints all the results of the analysis
	 * @param double totalGames is the total amount of games contained in the file
	 * @param double homeTeamPresent is the amount of games the home team participates in.
	 * @param double homeWin is the amount of games the home team wins.
	 * @param double totalHomePoints is the overall amount of points the home team scores across all 
	 * games.
	 * @param double totalAwayPoints the overall amount of points the away team scores across all
	 * games played against a home team.
	 * @return void
	 */
	public static void printResults(double totalGames, double homeTeamPresent, double homeWin, 
			double totalHomePoints, double totalAwayPoints) {
		double margin = (totalHomePoints - totalAwayPoints) / homeTeamPresent;
		double marginRounded = Math.round(margin * 100.0) / 100.0;
		double percentage = (homeTeamPresent / (totalGames)) * 100;
		double winPercentage = (homeWin / homeTeamPresent) * 100;
		System.out.printf("\nTotal number of games: %,d\n", (int) totalGames);
		System.out.printf("Number of games with a home team: %,d\n", (int) homeTeamPresent);
		System.out.printf("Percentage of games with a home team: %.1f%%\n", percentage);
		System.out.printf("Number of games the home team won: %,d\n", (int) homeWin);
		System.out.printf("Home team win percentage: %1.1f%%\n", winPercentage);

		System.out.printf("Home team average margin: %.2f\n", marginRounded);

	}
}
