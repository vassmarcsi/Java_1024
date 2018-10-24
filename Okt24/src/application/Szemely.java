package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Szemely {
	private SimpleStringProperty id;
	private SimpleStringProperty vezeteknev;
	private SimpleStringProperty keresztnev;
	private SimpleStringProperty szuletesidatum;
	
	public Szemely(String id, String vezeteknev, String keresztnev, String szuletesidatum) { //kicserélem a belsejét
		//super(); //örökléshez
		this.id = new SimpleStringProperty(id);
		this.vezeteknev = new SimpleStringProperty(vezeteknev);
		this.keresztnev = new SimpleStringProperty(keresztnev);
		this.szuletesidatum = new SimpleStringProperty(szuletesidatum);
	}

	public final SimpleIntegerProperty idProperty() {
		return this.id;
	}
	
	public final int getId() {
		return this.idProperty().get();
	}
	
	public final void setId(final int id) {
		this.idProperty().set(id);
	}
	
	public final SimpleIntegerProperty vezeteknevProperty() {
		return this.vezeteknev;
	}
	
	public final int getVezeteknev() {
		return this.vezeteknevProperty().get();
	}
	
	public final void setVezeteknev(final int vezeteknev) {
		this.vezeteknevProperty().set(vezeteknev);
	}
	
	public final SimpleIntegerProperty keresztnevProperty() {
		return this.keresztnev;
	}
	
	public final int getKeresztnev() {
		return this.keresztnevProperty().get();
	}
	
	public final void setKeresztnev(final int keresztnev) {
		this.keresztnevProperty().set(keresztnev);
	}
	
	public final SimpleIntegerProperty szuletesidatumProperty() {
		return this.szuletesidatum;
	}
	
	public final int getSzuletesidatum() {
		return this.szuletesidatumProperty().get();
	}
	
	public final void setSzuletesidatum(final int szuletesidatum) {
		this.szuletesidatumProperty().set(szuletesidatum);
	}
	
	
	

}
