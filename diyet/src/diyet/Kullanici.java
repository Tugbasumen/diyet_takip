package diyet;

import java.security.PublicKey;

public class Kullanici {
	private String kullaniciad;
	private int yas;
	private String cinsiyet;
	private double kilo;
	private double boy;
	double idealKilo;
	
	public String getKullaniciad() {
		return kullaniciad;
	}
	public void setKullaniciad(String kullaniciad) {
		this.kullaniciad = kullaniciad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public double getKilo() {
		return kilo;
	}
	public void setKilo(double kilo) {
		this.kilo = kilo;
	}
	public double getBoy() {
		return boy;
	}
	public void setBoy(double boy) {
		this.boy = boy;
	}
	public Kullanici( String kullanciad,int yas, String cinsiyet, double kilo, double boy)
	{
		this.kullaniciad=kullanciad;
		this.yas=yas;
		this.cinsiyet=cinsiyet;
		this.kilo=kilo;
		this.boy=boy;
	}

	public Kullanici() {
		
	}

}
