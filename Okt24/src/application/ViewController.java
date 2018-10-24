package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{ //beírom hogy implements Initializable, aztán add ... methods

    @FXML
    private TableView<?> tabla;
    
    @FXML
    private TableColumn<?, ?> tablaID;

    @FXML
    private TableColumn<?, ?> tablaVezNev;

    @FXML
    private TableColumn<?, ?> tablaKerNev;

    @FXML
    private TableColumn<?, ?> tablaSzulDatum;

    @FXML
    private TextField idMezo;

    @FXML
    private TextField VezNevMezo;

    @FXML
    private TextField KerNevMezo;

    @FXML
    private TextField SzulDatumMezo;

    @FXML
    void menuItemKilepes(ActionEvent event) {
    	Platform.exit();
    }

    @FXML
    void menuItemNevjegy(ActionEvent event) {

    }
    
    @FXML
    void hozzadGomb(ActionEvent event) {
    	System.out.println(idMezo.getText());
    	System.out.println(VezNevMezo.getText());
    	System.out.println(KerNevMezo.getText());
    	System.out.println(SzulDatumMezo.getText());
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
