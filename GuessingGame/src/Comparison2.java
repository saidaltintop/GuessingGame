
public class Comparison2 {

	public Comparison2()
	{
		
	}
	
	public int comparison(int user_value,int random_value)//rakamın yanlıs basamakda oldugu sayısını sayar. döndürdügü deger yanlıs basamakda olan sayıların miktarıdır.
	{
		int wrong_step=0;
		String [] series=new String[4];
		String [] series2=new String[4];
		int lenght=4;
		for(int i=3;i>=0;i--)
		{
			series[i]=(Integer.toString(user_value).substring(lenght-1,lenght));
			series2[i]=(Integer.toString(random_value).substring(lenght-1,lenght));
			lenght--;
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(series[i].equals(series2[j]) && i!=j)
				{
				wrong_step++;	
				}
			}
		}
		return wrong_step;
	}
	
	
}
