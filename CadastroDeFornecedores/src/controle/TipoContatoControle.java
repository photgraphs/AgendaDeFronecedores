package controle;

import interfaces.InterfaceControle;
import modelo.TipoContatoModelo;
import dao.TipoControleDao;

/**
 *
 * @author Elaine
 */
public class TipoContatoControle implements InterfaceControle {

    TipoContatoModelo tcm = new TipoContatoModelo();
    TipoControleDao tcd = new TipoControleDao();

    @Override
    public void salvarControle(Object... valor) {

        if ("".equals(valor[0])) {
            tcm.setId(0);
        } else {
            tcm.setId((int) valor[0]);
        }

        tcm.setNome((String) valor[1]);
        tcm.setCnpj((String) valor[2]);
        tcm.setEndereco((String) valor[3]);
        tcm.setEstado((String) valor[4]);
        tcm.setCidade((String) valor[5]);
        tcm.setTelefone((String) valor[6]);

        //Enviar todas as anotacoes para DAO.
        tcd.salvarDao(tcm);
    }

    @Override
    public void excluirControle(int id) {

    }

    @Override
    public void consultarControle(Object... valor) {
      
   }


}
