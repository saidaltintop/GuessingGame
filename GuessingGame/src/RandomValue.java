import java.util.Random;

/*main de sadece randomValueControl metotunu kullancagız.
 * bundan return olan deger rakamları farklı 4basamaklı sayıdır.
 * bu metot RandomValueProduce metotunu içinde bulunduruyor. RandomValueProduce metotu ise random deger uretir.*/ 
public class RandomValue {
	private int value;
	public RandomValue()
	{
    
	}
	public int randomValueControl()//bu metotun amacı sayı içinde aynı olan rakam varsa o sayıyı degiştirip tekrar random deger atar. 
	{
		boolean son=true;
		RandomValueProduce();
		do
			{
			son=true;
			String [] series=new String[4];
			
		int lenght=4;
		for(int i=3;i>=0;i--)
		{
			series[i]=(Integer.toString(value).substring(lenght-1,lenght));
			lenght--;
		}
		for (int i = 0; i < 4; i++) {
			  for (int j = 0; j < 4; j++) {
				if(series[j].equals(series[i]) && i!=j)
				{
					son=RandomValueProduce();
					break;
				}
					
			}
			  if(son==false)
				  break;

		}
		//System.err.println(value);//bu satırı comment den cıkarırsak consol ekranında random sayının kaç oldugu yazar.
			}while(son==false);

		return value;
	}
	private boolean RandomValueProduce() {
		Random rnd = new Random();
        value = rnd.nextInt(9000)+1000;
		return false;
	}
	public int getValeu() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
