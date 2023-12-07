package modelo;

/**
 *
 * @author Elaine Alves
 */
public class TipoContatoModelo {
   private int id;
   private String nome;
   private String cnpj;
   private String endereco;
   private String estado;
   private String cidade;
   private String telefone;

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Object[]toArray(){
    Object[] obj = new Object[7];
    
         obj[1] = id;
         obj[2] = nome;
         obj[4] = cnpj;
         obj[5] = endereco;
         obj[6] = estado;
         obj[7] = cidade;
         obj[8] = telefone;
       return obj;
            
    }
}
