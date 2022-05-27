package com.example.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Form {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String mouaref;

	
	private String adad_sejel;

	
	private String tarikh;
	
	
	private String tasmiya;
	
	
	private String tasmiyaLatin;
	
	
	private String esmTijari;
	

	private String esmTijariLatin;
	
	
	private String makarEjtima;
	
	
	private String makarNachat;
	
	
	private String nithamKanouni;
	
	
	private String rasMal;
	
	
	private String adadFar;
	

	private String nachatRaisi;
	
	
	private String tarikhBideyetNachat;
	
	
	private String tarikhEchhar;
	
	
	private String modatCharika;
	
	

	public Form(){
		
	}


	public Form(long id, String mouaref, String adad_sejel, String tarikh, String tasmiya,
			String tasmiyaLatin, String esmTijari, String esmTijariLatin, String makarEjtima, String makarNachat,
			String nithamKanouni, String rasMal, String adadFar, String nachatRaisi, String tarikhBideyetNachat,
			String tarikhEchhar, String modatCharika) {
		super();
		this.id = id;
		
		this.mouaref = mouaref;
		this.adad_sejel = adad_sejel;
		this.tarikh = tarikh;
		this.tasmiya = tasmiya;
		this.tasmiyaLatin = tasmiyaLatin;
		this.esmTijari = esmTijari;
		this.esmTijariLatin = esmTijariLatin;
		this.makarEjtima = makarEjtima;
		this.makarNachat = makarNachat;
		this.nithamKanouni = nithamKanouni;
		this.rasMal = rasMal;
		this.adadFar = adadFar;
		this.nachatRaisi = nachatRaisi;
		this.tarikhBideyetNachat = tarikhBideyetNachat;
		this.tarikhEchhar = tarikhEchhar;
		this.modatCharika = modatCharika;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}





	public String getMouaref() {
		return mouaref;
	}



	public void setMouaref(String mouaref) {
		this.mouaref = mouaref;
	}



	public String getAdad_sejel() {
		return adad_sejel;
	}



	public void setAdad_sejel(String adad_sejel) {
		this.adad_sejel = adad_sejel;
	}



	public String getTarikh() {
		return tarikh;
	}



	public void setTarikh(String tarikh) {
		this.tarikh = tarikh;
	}



	public String getTasmiya() {
		return tasmiya;
	}



	public void setTasmiya(String tasmiya) {
		this.tasmiya = tasmiya;
	}



	public String getTasmiyaLatin() {
		return tasmiyaLatin;
	}



	public void setTasmiyaLatin(String tasmiyaLatin) {
		this.tasmiyaLatin = tasmiyaLatin;
	}



	public String getEsmTijari() {
		return esmTijari;
	}



	public void setEsmTijari(String esmTijari) {
		this.esmTijari = esmTijari;
	}



	public String getEsmTijariLatin() {
		return esmTijariLatin;
	}



	public void setEsmTijariLatin(String esmTijariLatin) {
		this.esmTijariLatin = esmTijariLatin;
	}



	public String getMakarEjtima() {
		return makarEjtima;
	}



	public void setMakarEjtima(String makarEjtima) {
		this.makarEjtima = makarEjtima;
	}



	public String getMakarNachat() {
		return makarNachat;
	}



	public void setMakarNachat(String makarNachat) {
		this.makarNachat = makarNachat;
	}



	public String getNithamKanouni() {
		return nithamKanouni;
	}



	public void setNithamKanouni(String nithamKanouni) {
		this.nithamKanouni = nithamKanouni;
	}



	public String getRasMal() {
		return rasMal;
	}



	public void setRasMal(String rasMal) {
		this.rasMal = rasMal;
	}



	public String getAdadFar() {
		return adadFar;
	}



	public void setAdadFar(String adadFar) {
		this.adadFar = adadFar;
	}



	public String getNachatRaisi() {
		return nachatRaisi;
	}



	public void setNachatRaisi(String nachatRaisi) {
		this.nachatRaisi = nachatRaisi;
	}



	public String getTarikhBideyetNachat() {
		return tarikhBideyetNachat;
	}



	public void setTarikhBideyetNachat(String tarikhBideyetNachat) {
		this.tarikhBideyetNachat = tarikhBideyetNachat;
	}



	public String getTarikhEchhar() {
		return tarikhEchhar;
	}



	public void setTarikhEchhar(String tarikhEchhar) {
		this.tarikhEchhar = tarikhEchhar;
	}



	public String getModatCharika() {
		return modatCharika;
	}



	public void setModatCharika(String modatCharika) {
		this.modatCharika = modatCharika;
	}

	
	
}