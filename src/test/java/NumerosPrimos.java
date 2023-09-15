
public class NumerosPrimos {

	public void printFirst100() {
		
		int counter = 0;
		int number = 1;
		
		while(counter <= 100 )
		{
			boolean primo = true;
			number++;
			for (int i = 2; i < number; i++) {
				if(number % i == 0)
				{
					primo = false;
					break;
				}
			}
			if(primo) 
			{
				counter++;
				System.out.println(number);
			}
		}
	}
}
