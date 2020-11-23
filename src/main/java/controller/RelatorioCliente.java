package controller;
import dao.InstalacaoDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import classes.Instalacao;

public class RelatorioCliente implements Initializable {
    @FXML
    private TableView <Instalacao> TableInstalacao;
    @FXML
    private TableColumn <Instalacao, BigInteger> ClNumeroInstalacao;
    @FXML
    private TableColumn <Instalacao, String> ClNomeCliente;
    @FXML
    private TableColumn <Instalacao, BigInteger> ClDocumentoCliente;
    @FXML
    private TableColumn <Instalacao, String> ClNomeFornecedor;
    @FXML
    private TableColumn <Instalacao, BigInteger> ClCNPJ;
    @FXML
    private TableColumn <Instalacao, BigInteger> ClCEP;
    @FXML
    private TableColumn <Instalacao, String> ClRua;
    @FXML
    private TableColumn <Instalacao, BigInteger> ClNumero;
   
    private List<Instalacao> listInstalacao;
    private ObservableList<Instalacao> observableListInstalacao;
       
    @Override
    public void initialize(URL url, ResourceBundle resources) {
        
        carregarTableViewInstalacao();
    }

    public void carregarTableViewInstalacao(){
        ClNumeroInstalacao.setCellValueFactory(new PropertyValueFactory<>("int_numero_instalacao"));
        ClNomeCliente.setCellValueFactory(new PropertyValueFactory<>("cli_cliente"));
        ClDocumentoCliente.setCellValueFactory(new PropertyValueFactory<>("cli_documento"));
        ClNomeFornecedor.setCellValueFactory(new PropertyValueFactory<>("for_nome"));
        ClCNPJ.setCellValueFactory(new PropertyValueFactory<>("for_cnpj"));
        ClCEP.setCellValueFactory(new PropertyValueFactory<>("cep_cep"));
        ClRua.setCellValueFactory(new PropertyValueFactory<>("cep_rua"));
        ClNumero.setCellValueFactory(new PropertyValueFactory<>("end_numero"));

        listInstalacao =  InstalacaoDAO.readinstalacao();
        observableListInstalacao = FXCollections.observableArrayList(listInstalacao);
        TableInstalacao.setItems(observableListInstalacao);       
    }
}