package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class InstalacaoCadastrada implements Initializable{
    @FXML
    private TextField txtNumeroInstalacao;
    @FXML 
    private TextField txtRGI;
    @FXML
	private Button txtBotaoBuscarNumInstalacao;
	@FXML
	private Button txtBotaoBuscarRGI;
	@FXML
    private Button txtBotaoRetornar;
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
    }
    public void changeScreenBuscar(ActionEvent event){

    }
    public void changeScreenRetornar(ActionEvent event){

    }
}