import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BookSlot {

	// Teh books only can have 30 min to 90 min
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books = initBooks();

		int MIN30 = 30*60000;
		int MIN60 = 60*60000;
		int MIN90 = 90*60000;
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		try {
			Date open = sdf.parse("9:00");
			Date close = sdf.parse("17:00");
			for (Book bo : books) {
				Integer plusMin = Integer.parseInt(bo.getDuration());
				Date  lastBooking = new Date(bo.getTime()+ plusMin);
				Date time = sdf.parse(bo.getTime());
				if ( time.getTime() - open.getTime() > MIN30 && close.getTime() - time.getTime()  > MIN30) {
					System.out.println(time.getTime() - open.getTime());
				}
			}

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<Book> initBooks() {
		Book a = new Book("9:15", "30");
		Book b = new Book("10:30", "60");
		Book c = new Book("11:45", "90");
		Book d = new Book("14:15", "30");
		Book e = new Book("16:15", "30");
		final List<Book> books = Arrays.asList(a, b, c, d, e);

		return books;
	}
}

class Book {
	private String time;
	private String duration;

	public Book(String time, String duration) {
		super();
		this.time = time;
		this.duration = duration;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
}
