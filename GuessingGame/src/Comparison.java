
public class Comparison 
{
	private int [] val=new int[4];
	private int[] say=new int[4];
	public Comparison()
	{
		
	}
	
	public int compari(int sayi,int deger)// bu metod count dediğimiz değeri dönderir.count sayi ve deger sayılarının basamaklarını karşılaştırıp kaç tanesinin eşit olduğunu gösterir. 
	{
		
		girilenbasamaklarınaayır(sayi);
		randomubasamaklarınaayır(deger);
		int count=0;
		for (int i = 0; i < 4; i++)
		{
			
				if (say[i]==val[i]) 
				{
					count++;
				}
			
			
		}
		return  count;
	}
public int[] girilenbasamaklarınaayır(int sayi)
{
	int set1=0,set2=0;
	
	say[0]=sayi/1000;
	set1=sayi%1000;
	say[1]=set1/100;
	set2=set1%100;
	say[2]=set2/10;
	say[3]=set2%10;
	return say;
}	
	public int[] randomubasamaklarınaayır(int deger)
	{	
		int vset1=0,vset2=0;
		val[0]=deger/1000;
		vset1=deger%1000;
		val[1]=vset1/100;
		vset2=vset1%100;
		val[2]=vset2/10;
		val[3]=vset2%10;
		return val;
	
}
}
