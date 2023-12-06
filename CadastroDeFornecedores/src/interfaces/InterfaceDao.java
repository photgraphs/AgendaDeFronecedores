
package interfaces;

import java.sql.SQLDataException;

/**
 *
 * @author Elaine Alves
 */
public interface InterfaceDao {
   
    
    public void salvarDao(Object...valor);

    public void excluirDao(int id);
    
    public void consutarDao(Object... valor) throws SQLDataException;
    

}
