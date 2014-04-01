import java.awt.Component;

import javax.swing.JOptionPane;

public class GuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try
		{
			int hak,sayi = 0,denemesayisi=0,girilendeaynırakamsayacı=0; 
			RandomValue random=new RandomValue();//RandomValue classımızdan random diye bir nesne oluşturuyoruz.
			int [] sayidizisi=new int[4];//girilen sayinin rakamlarını bu dizide tutacagız
			int random_value=random.randomValueControl();//randomValueControl metotu içinde hem random sayı atattırıyoruz hemde bu random sayıyının içinde aynı rakam varmı diye kontrol ediyor. Varsa yeniden random deger üretiyor. 
			Comparison comparison=new Comparison();//comparison classında random sayı ile girilen sayiyi karsılastırıp aynı basamakda aynı olan rakam sayısını sayarız
			Comparison2 comparison2=new Comparison2();//comparison2 classında random sayi ile girilen sayiyi karsılastırıp aynı basamakda olmayıpda aynı olan rakamları sayarız
			for(hak=8;hak>=1;hak--)
			{
				denemesayisi++;
				do{
					girilendeaynırakamsayacı=0;
					try
					{
						sayi=Integer.parseInt((JOptionPane.showInputDialog(null, "Tahmin hakkınız "+ (hak) +"\nLütfen bir değer giriniz!!!")));
					}
					catch (Exception e) {
						JOptionPane.showMessageDialog(null, "LÜTFEN 4 BASAMAKLI BİR SAYİ GİRİNİZ!!");
						sayi=Integer.parseInt((JOptionPane.showInputDialog(null, "Tahmin hakkınız "+ (hak) +"\nLütfen bir değer giriniz!!!")));
					}
					sayidizisi=comparison.girilenbasamaklarınaayır(sayi); 
					for (int i = 0; i < 4; i++) {
						for (int j = 0; j < 4; j++) {
							if(sayidizisi[j]==(sayidizisi[i]) && i!=j)
							{
								girilendeaynırakamsayacı=1;
								break;
							}
							if(girilendeaynırakamsayacı==1)
								break;

						}
					}

					if(sayi<1000)
						JOptionPane.showMessageDialog(null, "YANLIŞ DEĞER GİRDİNİZ!! LÜTFEN 4 BASAMAKLI BİR SAYİ GİRİNİZ!!");
					else if(girilendeaynırakamsayacı==1)
					{
						JOptionPane.showMessageDialog(null, "LÜTFEN FARKLI RAKAMLAR İÇEREN SAYİ GİRİNİZ!!");
					}
					else if(sayi>9999)
						JOptionPane.showMessageDialog(null, "YANLIŞ DEĞER GİRDİNİZ!! LÜTFEN 4 BASAMAKLI BİR SAYİ GİRİNİZ!!");
				}while(sayi<=1000 || sayi>=9999 || girilendeaynırakamsayacı==1);


				if(comparison.compari(sayi,random_value)==4)
				{
					JOptionPane.showMessageDialog(null,"TEBRİKLER DOĞRU SAYI!!! "+denemesayisi+". denemede buldunuz..");
					break;
				}
				else
				{
					JOptionPane.showMessageDialog(null,comparison.compari( sayi,random_value)+" tane rakam doğru basamaktadır.."+comparison2.comparison(sayi, random_value)+" tane rakamın basamağı yanlıştır..");
				}
			}
			if(hak==0)
			{
				JOptionPane.showMessageDialog(null, "ÜZGÜNÜM 8 TAHMİN HAKKINIZ BİTMİŞTİR!!! Tutulan sayi => "+ random_value);
			}
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Program sonlandırıldı....");
		}
	}
}
