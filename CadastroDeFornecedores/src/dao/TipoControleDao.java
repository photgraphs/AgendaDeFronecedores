package dao;

import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import javax.swing.JOptionPane;
import modelo.TipoContatoModelo;

/**
 *
 * @author Elaine Alves
 */
public class TipoControleDao implements InterfaceDao{
    
    String sql;
    PreparedStatement stm;
    ResultSet rs;
    
    @Override
    public void salvarDao(Object... valor) {
        TipoContatoModelo tcm = (TipoContatoModelo) valor[0];
        
        
        //Codigo descobrir de alteracao ou inclusao
        if (tcm.getId() == 0){
        sql = "INSERT INTO fornecedor (nome,cnpj,endereco,estado,cidade,telefone) VALUES (?,?,?,?,?,?)";
        
        }else{ 
        sql = "UPDATE tipo_fornecedor_ SET nome = ? WHERE id_tipo_nome";
       
        }
        
        try {
            //Preparando a conexao e manipulando os dados.
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            stm.setString(1 ,tcm.getNome());
            stm.setString(2 ,tcm.getCnpj());
            stm.setString(3 ,tcm.getEndereco());
            stm.setString(4 ,tcm.getEstado());
            stm.setString(5 ,tcm.getCidade());
            stm.setString(6 ,tcm.getTelefone());
            
            if(tcm.getId()>0)stm.setInt(2, tcm.getId());
                                
            stm.execute();
            stm.close();
            
           JOptionPane.showMessageDialog(null,"Registro Gravado com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao Gravar"+e);
        }
        
        
        }
    @Override
    public void excluirDao(int id) {
        
    }

    @Override
    public void consutarDao(Object... valor) throws SQLDataException {
        
  
    }
}
