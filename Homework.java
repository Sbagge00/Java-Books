// Stephen Baggett

public class BusCon	{
	String title;	// title of the book
	String genre;	// genre where the book is
	int section;
	String author;
	
	// a constructor
	public BusCon(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}
	
	// display of the title and author
	public String displayTitleNumber()	{
		String retvar = String.format("%20s, %5, title, author
		);
		return retvar;
	}
	
	// display full book information
	public String displayFull() {
		String retvar = String.format(%d, %20s, %30s, %10d, &10s",
		title, genre, section, author);
		return retvar;
	}
	
	public static int getCounter()	{
		return myCount;
	}
}
