package diyet;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import javadiyet.Diyet;

public class main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Kullanici kisi = new Kullanici();

        System.out.print("Lütfen isminizi giriniz: ");
        String kullaniciad= scanner.nextLine();
        kisi.setKullaniciad(kullaniciad);
        
        
        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas=scanner.nextInt();
        kisi.setYas(yas);
        
        scanner.nextLine();
        
        System.out.print("Cinsiyetinizi giriniz (Cinsiyet kız:'K' veya 'k' erkek:'E' veya 'e')");
        String cinsiyet=scanner.nextLine();
        kisi.setCinsiyet(cinsiyet);
        
        System.out.print("Kilonuzu kg cinsinden giriniz:");
        double kilo=scanner.nextDouble();
        kisi.setKilo(kilo);
        
        System.out.print("Boyunuzu cm cinsinden giriniz:");
        double boy=scanner.nextDouble();
        kisi.setBoy(boy);
        System.out.println("Merhaba, " + kisi.getKullaniciad() + " :)");
        DiyetProgrami kisi2=new DiyetProgrami();
        kisi2.idealKiloHesapla(kilo,boy);
        Besin kisi1 =new Besin();
        
        kisi1.besinKontrol();
        kisi1.toplamKaloriHesapla();
       
       
        		
		

	}

}
