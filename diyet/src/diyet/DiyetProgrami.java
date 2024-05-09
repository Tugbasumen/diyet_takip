package diyet;

public class DiyetProgrami extends Kullanici{
	private String programadi;

	private double verilecekKilo;
	private double alinacakKilo;
	
	public double getVerilecekKilo() {
		return verilecekKilo;
	}
	public void setVerilecekKilo(double verilecekKilo) {
		this.verilecekKilo = verilecekKilo;
	}
	public double getAlinacakKilo() {
		return alinacakKilo;
	}
	public void setAlinacakKilo(double alinacakKilo) {
		this.alinacakKilo = alinacakKilo;
	}
	public DiyetProgrami() {
		
	}
	public String getProgramadi() {
		return programadi;
	}
	public void setProgramadi(String programadi) {
		this.programadi = programadi;
	}
	
	
	public DiyetProgrami(String programadi,double verilecekKilo,double alinacakKilo) {
		this.programadi=programadi;
		
		this.verilecekKilo=verilecekKilo;
		this.alinacakKilo=alinacakKilo;
		
	}
	
	public void idealKiloHesapla(double kilo, double boy) {
		if(getCinsiyet()=="e" || getCinsiyet()=="E")
		{
			idealKilo=50+2.3*((boy/2.54)-60);
		}
		else {
			idealKilo=45.5+2.3*((boy/2.54)-60);
		}
	System.out.println("ideal kilonuz:"+idealKilo);
	if(kilo>idealKilo)
	{
		verilecekKilo=kilo-idealKilo;
		System.out.println("Zayıflamalısınız , verilecek kilo miktarı:"+verilecekKilo);
		hedefler();
		System.out.println("3. Günde ortalama 500 kalori açığı sağlayarak kilo verme hedefine odaklanın.");
		diyetSureHesapla(verilecekKilo);
	}  
	else {
		alinacakKilo=idealKilo-kilo;
		System.out.println("Kilo almalısınız, alınacak kilo miktarı:"+alinacakKilo);
		hedefler();
		diyetSureHesapla(alinacakKilo);
	}
	}
    public void hedefler() {
		
		System.out.println("Hedef kilonuza ulaşmak için aşağıdaki diyet programını uygulayabilirsiniz: ");
		System.out.println("1. Düzenli egzersiz yapın.");
        System.out.println("2. Sağlıklı beslenme alışkanlıkları geliştirin.");
        
		
	}
    
    public void diyetSureHesapla(double kilodegisimMiktari) {
    	double sure=kilodegisimMiktari*7;
    	int sureInt = (int) Math.ceil(sure);
    	
    	System.out.println("Diyet süresi " + sureInt+" gündür");
    	
    	
	}
  

}
