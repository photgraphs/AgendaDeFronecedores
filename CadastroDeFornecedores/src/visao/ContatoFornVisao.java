package visao;

import controle.TipoContatoControle;

/**
 *
 * @author Elaine Alves
 */
public class ContatoFornVisao extends FornPadrao {
        
    public ContatoFornVisao(){
    
        setTitle("Cadastro de Fornecedores");
        
    }
    TipoContatoControle tcc = new TipoContatoControle();
    @Override
    public void salvarFornecedorVisao() {
        tcc.salvarControle(jtfId.getText(), jtfNome.getText(),jtfCNPJ.getText(),
        jtfEndereco.getText(), jtfEstado.getText(), jtfCidade.getText(), 
        jtfTelefone.getText());
    }

  
}
