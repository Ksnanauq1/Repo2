package src.models;

public class Druzyny {
	
private String pozycja;
private String nazwa;
private String mecze;
private String punkty;
private String bramki;

public Druzyny(String Pozycja, String Nazwa, String Mecze, String Punkty, String Bramki ){
	this.pozycja = Pozycja;
	this.nazwa = Nazwa;
	this.mecze = Mecze;
	this.punkty = Punkty;
	this.bramki = Bramki;
}

public String getPozycja() {
	return pozycja;
}

public void setPozycja(String pozycja) {
	this.pozycja = pozycja;
}

public String getNazwa() {
	return nazwa;
}

public void setNazwa(String nazwa) {
	this.nazwa = nazwa;
}

public String getMecze() {
	return mecze;
}

public void setMecze(String mecze) {
	this.mecze = mecze;
}

public String getPunkty() {
	return punkty;
}

public void setPunkty(String punkty) {
	this.punkty = punkty;
}

public String getBramki() {
	return bramki;
}

public void setBramki(String bramki) {
	this.bramki = bramki;
}



}
