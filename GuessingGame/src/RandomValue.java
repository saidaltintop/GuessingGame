import java.util.Random;

/*main de sadece randomValueControl metotunu kullancagýz.
* bundan return olan deger rakamlarý farklý 4basamaklý sayýdýr.
* bu metot RandomValueProduce metotunu içinde bulunduruyor. RandomValueProduce metotu ise random deger uretir.*/
public class RandomValue {
private int value=0;//abd
public RandomValue()
{
    //selam
}
public int randomValueControl()//bu metotun amacý sayý içinde ayný olan rakam varsa o sayýyý degiþtirip tekrar random deger atar.
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
//System.err.println(value);//bu satýrý comment den cýkarýrsak consol ekranýnda random sayýnýn kaç oldugu yazar.
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