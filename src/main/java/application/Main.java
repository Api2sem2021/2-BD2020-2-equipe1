package application;

import java.math.BigDecimal;
import java.math.BigInteger;

import classes.Agua;
import classes.Conta;
import classes.Energia;
import classes.Instalacao;
import dao.AguaDAO;
import dao.ContaDAO;
import dao.EnergiaDAO;
import dao.InstalacaoDAO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Main extends Application {

    private static Stage stage;
    private static Scene mainScene;
    private static Scene tipoclienteScene;
    private static Scene cadastrarpessoafisicaScene;
    private static Scene cadastrarpessoajuridicaScene;
    private static Scene cadastrarfornecedorpfScene;
    private static Scene cadastrarfornecedorpjScene;
    private static Scene PJScene;
    private static Scene PFScene;
    private static Scene tipocontaScene;
    private static Scene agua1Scene;
    private static Scene agua2Scene;
    private static Scene tiporelatorioScene;
    private static Scene relatorioaguaScene;
    private static Scene relatorioenergiaScene;
    private static Scene aguasemendScene;
    private static Scene energia1Scene;
    private static Scene energia2Scene;
    private static Scene energiaSemendScene;
    private static Scene instalacaoCadastradaScene;
    private static Energia n;
    private static EnergiaDAO dao_ene;
    private static Conta cta;
    private static ContaDAO conta_dao;
    private static Instalacao i;
    private static InstalacaoDAO instalacao_dao;
    private static Agua a;
    private static AguaDAO agua_dao;

	@Override
	public void start(Stage primaryStage) {
		try {
            stage = primaryStage;

            Parent fxmlInstalacaoCadastrada = FXMLLoader.load(getClass().getResource("/view/InstalacaoCadastrada.fxml"));
            instalacaoCadastradaScene = new Scene(fxmlInstalacaoCadastrada);

            Parent fxmlCadastroAgua1semEnd = FXMLLoader.load(getClass().getResource("/view/CadastroAgua1semEnd.fxml"));
            aguasemendScene = new Scene(fxmlCadastroAgua1semEnd);

            Parent fxmlCadastroEnergia1 = FXMLLoader.load(getClass().getResource("/view/CadastroEnergia1.fxml"));
            energia1Scene = new Scene(fxmlCadastroEnergia1);

            Parent fxmlCadastroEnergia2 = FXMLLoader.load(getClass().getResource("/view/CadastroEnergia2.fxml"));
            energia2Scene = new Scene(fxmlCadastroEnergia2);

            Parent fxmlEnergiaSemEnd = FXMLLoader.load(getClass().getResource("/view/EnergiaSemEnd.fxml"));
            energiaSemendScene = new Scene(fxmlEnergiaSemEnd);

			Parent fxmlMain  = FXMLLoader.load(getClass().getResource("/view/TelaInicial.fxml"));
            mainScene = new Scene(fxmlMain);

            Parent fxmlTipoCliente = FXMLLoader.load(getClass().getResource("/view/TipoCliente.fxml"));
            tipoclienteScene = new Scene(fxmlTipoCliente);

            Parent fxmlPJ= FXMLLoader.load(getClass().getResource("/view/PessoaJuridica.fxml"));
            PJScene = new Scene(fxmlPJ);

            Parent fxmlPF= FXMLLoader.load(getClass().getResource("/view/PessoaFisica.fxml"));
            PFScene = new Scene(fxmlPF);

            Parent fxmlTipoConta = FXMLLoader.load(getClass().getResource("/view/TipoConta.fxml"));
            tipocontaScene = new Scene(fxmlTipoConta);

            Parent fxmlAgua1 = FXMLLoader.load(getClass().getResource("/view/CadastroAgua1.fxml"));
            agua1Scene = new Scene(fxmlAgua1);

            Parent fxmlAgua2 = FXMLLoader.load(getClass().getResource("/view/CadastroAgua2.fxml"));
            agua2Scene = new Scene(fxmlAgua2);

            Parent fxmlTipoRelatorio = FXMLLoader.load(getClass().getResource("/view/TipoRelatorio.fxml"));
            tiporelatorioScene = new Scene(fxmlTipoRelatorio);

            Parent fxmlCadastrarPessoaFisica = FXMLLoader.load(getClass().getResource("/view/CadastrarPessoaFisica.fxml"));
            cadastrarpessoafisicaScene = new Scene(fxmlCadastrarPessoaFisica);

            Parent fxmlCadastrarPessoaJuridica = FXMLLoader.load(getClass().getResource("/view/CadastrarPessoaJuridica.fxml"));
            cadastrarpessoajuridicaScene = new Scene(fxmlCadastrarPessoaJuridica);
            
            Parent fxmlCadastrarFornecedorPF = FXMLLoader.load(getClass().getResource("/view/CadastrarFornecedorPF.fxml"));
            cadastrarfornecedorpfScene = new Scene(fxmlCadastrarFornecedorPF);

            Parent fxmlCadastrarFornecedorPJ = FXMLLoader.load(getClass().getResource("/view/CadastrarFornecedorPJ.fxml"));
            cadastrarfornecedorpjScene = new Scene(fxmlCadastrarFornecedorPJ);

            //Parent fxmlRelatorioAgua = FXMLLoader.load(getClass().getResource("/view/RelatorioAgua.fxml"));
            //relatorioaguaScene = new Scene(fxmlRelatorioAgua);

            //Parent fxmlRelatorioEnergia = FXMLLoader.load(getClass().getResource("/view/RelatorioEnergia.fxml"));
            //relatorioenergiaScene = new Scene(fxmlRelatorioEnergia);

			primaryStage.setTitle("Cadastro de Contas");
			primaryStage.setScene(mainScene);
            primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

    public static void changeScreen(String tela){
        if (tela == "main"){
            stage.setScene(mainScene);
        }
        if (tela == "instalacaoCadastradaScene"){
            stage.setScene(instalacaoCadastradaScene);
        }
        
        if (tela == "aguasemend"){
            stage.setScene(aguasemendScene);
        }
        if (tela == "energia1Scene"){
            stage.setScene(energia1Scene);
        }
        if (tela == "energia2Scene"){
            stage.setScene(energia2Scene);
        }
        if (tela == "energiaSemend"){
            stage.setScene(energiaSemendScene);
        }
         if (tela == "tipocliente"){
            stage.setScene(tipoclienteScene);
        }
        if (tela == "pj"){
            stage.setScene(PJScene);
        }
        if (tela == "pf"){
            stage.setScene(PFScene);
        }
        if (tela == "tipoconta"){
            stage.setScene(tipocontaScene);
        }
        if (tela == "agua1"){
            stage.setScene(agua1Scene);
        }
        if (tela == "agua2"){
            stage.setScene(agua2Scene);
        }
        if (tela == "tiporelatorio"){
            stage.setScene(tiporelatorioScene);
        }
        if(tela == "cadastrarpessoafisica"){
            stage.setScene(cadastrarpessoafisicaScene);
        }
        if(tela == "cadastrarpessoajuridica"){
            stage.setScene(cadastrarpessoajuridicaScene);
        }
        if(tela == "cadastrarfornecedorpf"){
            stage.setScene(cadastrarfornecedorpfScene);
        }
        if(tela == "cadastrarfornecedorpj"){
            stage.setScene(cadastrarfornecedorpjScene);
        }
        //if (tela == "relatorioagua"){
           // stage.setScene(relatorioaguaScene);
        //}
        //if (tela == "relatorioenergia"){
            //stage.setScene(relatorioenergiaScene);
        //}
    }

     // Métodos Conta
    public static void salvarConta1(String RGI, TextField txtMesReferencia) {
            cta = new Conta();
            conta_dao = new ContaDAO();
            cta.setInt_numero_instalacao(BigInteger.valueOf(Long.parseLong(RGI)));
            cta.setCta_mes_referencia(txtMesReferencia.getText());
    }

    public static void salvarConta2(TextField txtVencimento) {
            cta.setCta_vencimento(txtVencimento.getText());

            conta_dao.create(cta);
    }

    // Métodos Instalacao
    public static void salvarIntalacaoCliente(String txtDocumento, String txtCNPJFornecedor) {
            i = new Instalacao();
            instalacao_dao = new InstalacaoDAO();
            i.setCli_documento(BigInteger.valueOf(Long.parseLong(txtDocumento)));
            i.setFor_cnpj(BigInteger.valueOf(Long.parseLong(txtCNPJFornecedor)));
    }

    public static void salvarIntalacaoEndereco(String txtCEP, TextField txtNumero) {
            i.setEnd_cep(BigInteger.valueOf(Long.parseLong(txtCEP)));
            i.setEnd_numero(BigInteger.valueOf(Long.parseLong(txtNumero.getText())));
    }
    
    public static void salvarIntalacaoNumero(String RGI) {
            i.setInt_numero_instalacao(BigInteger.valueOf(Long.parseLong(RGI)));
            instalacao_dao.create(i);
    }

    // Métodos Energia
    public static void salvarEnergia1(TextField txtCodigoFiscal, TextField txtGrupoSubgrupo,
            TextField txtClasseSubclasse, TextField txtFornecimento, TextField txtTarifaria,
            TextField txtRoteiroLeitura, TextField txtTensaoNominal) {
            n = new Energia();
            dao_ene = new EnergiaDAO();
            n.setEne_codigo_fiscal(BigInteger.valueOf(Long.parseLong(txtCodigoFiscal.getText())));
            n.setEne_grupo_subgrupo(txtGrupoSubgrupo.getText());
            n.setEne_classe_subclasse(txtClasseSubclasse.getText());
            n.setEne_tipo_fornecimento(txtFornecimento.getText());
            n.setEne_modalidade_tarifaria(txtTarifaria.getText());
            n.setEne_roteiro_leitura(txtRoteiroLeitura.getText());
            n.setEne_tensao_nominal(txtTensaoNominal.getText());
    }

    public static void salvarEnergia2(TextField txtContaMes, TextField txtNumeroInstalacao, TextField txtConsumo, TextField txtTotalPagar, TextField txtConstMulti, TextField txtNRmedidor, TextField txtLeituraAnterior, TextField txtLeituraAtual ,TextField txtDataLeituraAnterior, TextField txtDataLeituraAtual, ComboBox comboBandeirasTarifarias ){
            if(txtConstMulti.equals("")){
                n.setCta_mes_referencia(txtContaMes.getText());
                n.setInt_numero_instalacao(BigInteger.valueOf(Long.parseLong(txtNumeroInstalacao.getText())));
                n.setEne_consumo_conta_mes(BigInteger.valueOf(Long.parseLong(txtConsumo.getText())));
                n.setEne_valor_total(BigDecimal.valueOf(Double.parseDouble(txtTotalPagar.getText())));
                n.setEne_const_multi(null);
                n.setEne_numero_medidor(BigInteger.valueOf(Long.parseLong(txtNRmedidor.getText())));
                n.setEne_leitura_anterior_cod(BigInteger.valueOf(Long.parseLong(txtLeituraAnterior.getText())));
                n.setEne_leitura_atual_cod(BigInteger.valueOf(Long.parseLong(txtLeituraAtual.getText())));
                n.setEne_data_leitura_anterior(txtDataLeituraAnterior.getText());
                n.setEne_data_leitura_atual(txtDataLeituraAtual.getText());
                n.setEne_tipo_bandeira(String.valueOf(comboBandeirasTarifarias.getValue()));
            } else {
                n.setCta_mes_referencia(txtContaMes.getText());
                n.setInt_numero_instalacao(BigInteger.valueOf(Long.parseLong(txtNumeroInstalacao.getText())));
                n.setEne_consumo_conta_mes(BigInteger.valueOf(Long.parseLong(txtConsumo.getText())));
                n.setEne_valor_total(BigDecimal.valueOf(Double.parseDouble(txtTotalPagar.getText())));
                n.setEne_const_multi(BigDecimal.valueOf(Double.parseDouble(txtConstMulti.getText())));
                n.setEne_numero_medidor(BigInteger.valueOf(Long.parseLong(txtNRmedidor.getText())));
                n.setEne_leitura_anterior_cod(BigInteger.valueOf(Long.parseLong(txtLeituraAnterior.getText())));
                n.setEne_leitura_atual_cod(BigInteger.valueOf(Long.parseLong(txtLeituraAtual.getText())));
                n.setEne_data_leitura_anterior(txtDataLeituraAnterior.getText());
                n.setEne_data_leitura_atual(txtDataLeituraAtual.getText());
                n.setEne_tipo_bandeira(String.valueOf(comboBandeirasTarifarias.getValue()));
            }

            dao_ene.create(n);
    }

    // Métodos Agua
    public static void salvarAgua1(String RGI, TextField txtGR, TextField txtMesReferencia, TextField txtConsumo,
    TextField txtCodigoCliente,TextField txtNumeroConta, TextField txtLeituraAntData, TextField txtLeituraAtualData, 
    TextField txtLeituraAntNumero, TextField txtLeituraAtualNumero, TextField txtHidrometro, TextField txtTipoLigacao) {
            a = new Agua();
            agua_dao = new AguaDAO();
            a.setInt_numero_instalacao(BigInteger.valueOf(Long.parseLong(RGI)));
            a.setAgu_gr(BigInteger.valueOf(Long.parseLong(txtGR.getText())));
            a.setCta_mes_referencia(txtMesReferencia.getText());
            a.setAgu_consumo(BigInteger.valueOf(Long.parseLong(txtConsumo.getText())));
            a.setAgu_codigo_cliente(BigInteger.valueOf(Long.parseLong(txtCodigoCliente.getText())));
            a.setAgu_numero_conta(BigInteger.valueOf(Long.parseLong(txtNumeroConta.getText())));
            a.setAgu_data_leitura_anterior(txtLeituraAntData.getText());
            a.setAgu_data_leitura_atual(txtLeituraAtualData.getText());
            a.setAgu_leitura_anterior(BigInteger.valueOf(Long.parseLong(txtLeituraAntNumero.getText())));
            a.setAgu_leitura_atual(BigInteger.valueOf(Long.parseLong(txtLeituraAtualNumero.getText())));
            a.setAgu_hidrometro(txtHidrometro.getText());
            a.setAgu_tipo_ligacao(txtTipoLigacao.getText());
    }

    public static void salvarAgua2(TextField txtTarifa10agua, TextField txtTarifa20agua, TextField txtTarifa30agua,
    TextField txtTarifa50agua, TextField txtTarifaMais50agua,TextField txtValorAgua1, TextField txtValorAgua2, 
    TextField txtTarifa10esgoto, TextField txtTarifa20esgoto, TextField txtTarifa30esgoto, TextField txtTarifa50esgoto, 
    TextField txtTarifaMais50esgoto, TextField txtValorEsgoto1, TextField txtValorEsgoto2,TextField txtTotalAgua,
    TextField txtTotalEsgoto, TextField txtTaxaRegulacao, TextField txtMulta){
            a.setAgu_tarifa_ate10_agua(BigDecimal.valueOf(Double.parseDouble(txtTarifa10agua.getText())));
            a.setAgu_tarifa_ate20_agua(BigDecimal.valueOf(Double.parseDouble(txtTarifa20agua.getText())));
            a.setAgu_tarifa_ate30_agua(BigDecimal.valueOf(Double.parseDouble(txtTarifa30agua.getText())));
            a.setAgu_tarifa_ate50_agua(BigDecimal.valueOf(Double.parseDouble(txtTarifa50agua.getText())));
            a.setAgu_tarifa_acima50_agua(BigDecimal.valueOf(Double.parseDouble(txtTarifaMais50agua.getText())));
            a.setAgu_valor_agua1(BigDecimal.valueOf(Double.parseDouble(txtValorAgua1.getText())));
            a.setAgu_valor_agua2(BigDecimal.valueOf(Double.parseDouble(txtValorAgua2.getText())));
            a.setAgu_tarifa_ate10_esgoto(BigDecimal.valueOf(Double.parseDouble(txtTarifa10esgoto.getText())));
            a.setAgu_tarifa_ate20_esgoto(BigDecimal.valueOf(Double.parseDouble(txtTarifa20esgoto.getText())));
            a.setAgu_tarifa_ate30_esgoto(BigDecimal.valueOf(Double.parseDouble(txtTarifa30esgoto.getText())));
            a.setAgu_tarifa_ate50_esgoto(BigDecimal.valueOf(Double.parseDouble(txtTarifa50esgoto.getText())));
            a.setAgu_tarifa_acima50_esgoto(BigDecimal.valueOf(Double.parseDouble(txtTarifaMais50esgoto.getText())));
            a.setAgu_valor_esgoto1(BigDecimal.valueOf(Double.parseDouble(txtValorEsgoto1.getText())));
            a.setAgu_valor_esgoto2(BigDecimal.valueOf(Double.parseDouble(txtValorEsgoto2.getText())));
            a.setAgu_valor_agua(BigDecimal.valueOf(Double.parseDouble(txtTotalAgua.getText())));
            a.setAgu_valor_esgoto(BigDecimal.valueOf(Double.parseDouble(txtTotalEsgoto.getText())));
            a.setAgu_taxa_regulamentacao(BigDecimal.valueOf(Double.parseDouble(txtTaxaRegulacao.getText())));
            a.setAgu_multa(BigDecimal.valueOf(Double.parseDouble(txtMulta.getText())));
            
            agua_dao.create(a);
    }


    public static void main(String[] args) {
		launch(args);
	}
}
