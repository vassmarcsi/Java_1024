package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{ //beírom hogy implements Initializable, aztán add ... methods

    @FXML
    private TableView<Szemely> tabla;
    
    @FXML
    private TableColumn<Szemely, String> tablaID; //<?, ?> cserélem erre <Szemely, String>

    @FXML
    private TableColumn<Szemely, String> tablaVezNev;

    @FXML
    private TableColumn<Szemely, String> tablaKerNev;

    @FXML
    private TableColumn<Szemely, String> tablaSzulDatum;

    @FXML
    private TextField idMezo;

    @FXML
    private TextField VezNevMezo;

    @FXML
    private TextField KerNevMezo;

    @FXML
    private TextField SzulDatumMezo;
    
    //személy típusú lista
    private ObservableList<Szemely> tablaAdatok = FXCollections.observableArrayList(); 

    @FXML
    void menuItemKilepes(ActionEvent event) {
    	Platform.exit();
    }

    @FXML
    void menuItemNevjegy(ActionEvent event) {

    }
    
    @FXML
    void menuItemSzerkeszt(ActionEvent event) {
    	Szemely szemelySzerkeszt = tabla.getSelectionModel().getSelectedItem();
    	tablaAdatok.remove(szemelySzerkeszt);
    	idMezo.setText(szemelySzerkeszt.getId());
    	VezNevMezo.setText(szemelySzerkeszt.getVezeteknev());
    	KerNevMezo.setText(szemelySzerkeszt.getKeresztnev());
    	SzulDatumMezo.setText(szemelySzerkeszt.getSzuletesidatum());
    }
    
    //töröl
    @FXML
    void menuItemTorol(ActionEvent event) {
    	Szemely szemelyTorol = tabla.getSelectionModel().getSelectedItem();
    	tablaAdatok.remove(szemelyTorol);
    }
    
    @FXML
    void hozzadGomb(ActionEvent event) {
    	Szemely szemelyAdd = new Szemely(idMezo.getText(), 
    			VezNevMezo.getText(), 
    			KerNevMezo.getText(), 
    			SzulDatumMezo.getText());
    	
    	tablaAdatok.add(szemelyAdd);
    	
//    	System.out.println(idMezo.getText());
//    	System.out.println(VezNevMezo.getText());
//    	System.out.println(KerNevMezo.getText());
//    	System.out.println(SzulDatumMezo.getText());
    }
    
    // kezdő adatok rögzítése
    private void kezdoAdatok()
    {
    	Szemely szemely1 = new Szemely("1","Pusztai", "Bence","1990-02-13");
    	Szemely szemely2 = new Szemely("2","Juhász","Bence","1994-03-27");
    	Szemely szemely3 = new Szemely("3","Kis","Balázs","1983-02-04");
    	
    	tablaAdatok.add(szemely1);
    	tablaAdatok.add(szemely2);
    	tablaAdatok.add(szemely3);
    }
    
    //setTableData
    private void tablaAdatokBeallitasa() {
    	tablaID.setCellValueFactory(cellData -> cellData.getValue().idProperty());
    	tablaVezNev.setCellValueFactory(cellData -> cellData.getValue().vezeteknevProperty());
    	tablaKerNev.setCellValueFactory(cellData -> cellData.getValue().keresztnevProperty());
    	tablaSzulDatum.setCellValueFactory(cellData -> cellData.getValue().szuletesidatumProperty());
    	
    	tabla.setItems(tablaAdatok);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		kezdoAdatok();
		tablaAdatokBeallitasa();
		
	}

}
