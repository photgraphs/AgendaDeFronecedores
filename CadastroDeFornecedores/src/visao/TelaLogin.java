package visao;
import dao.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Elaine Alves
 */
public class TelaLogin extends javax.swing.JFrame {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
  
    
    public void logar(){
    
        String sql = "SELECT * FROM acesso WHERE login = ? and senha = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, jtLogin.getText());
            pst.setString(2, jtSenha.getText());
            
            rs = pst.executeQuery();
            if(rs.next()){
        
            TelaPrincipal principal = new TelaPrincipal();
            
            principal.setVisible(true);
        
        }else{
            
        JOptionPane.showMessageDialog(null, "Usuario ou senha invalido(s)");
        
        }
            
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
            
        }
    
    
    }
   
    public TelaLogin() {
        initComponents();
        conexao = ConexaoBanco.abreConexao();
     
        // a linha a baixo serve de apoio a conexao
        //System.out.println(conexao);
           if(conexao != null){
        
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/databaseOn.png")));
        
        }else{
            
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/databaseOff.png")));
        
        }
        
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtSenha = new javax.swing.JPasswordField();
        jbAcessar = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        jbCadastroUsuario = new javax.swing.JLabel();
        jbCliqueAqui = new javax.swing.JButton();
        jcbMotrarSenha = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setBackground(new java.awt.Color(255, 255, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel3.setText("BEM VINDO AO AGFORN");

        jLabel1.setText("Login");

        jLabel2.setText("Senha");

        jbAcessar.setText("Acessar");
        jbAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAcessarActionPerformed(evt);
            }
        });

        jbCadastroUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbCadastroUsuario.setText("Cadastro de Usuario");

        jbCliqueAqui.setText("Clique aqui");
        jbCliqueAqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCliqueAquiActionPerformed(evt);
            }
        });

        jcbMotrarSenha.setText("Show All PassWord");
        jcbMotrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMotrarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbMotrarSenha)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbAcessar))
                                        .addComponent(jtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 110, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCadastroUsuario)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbCliqueAqui)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jbAcessar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jbCadastroUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCliqueAqui)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbMotrarSenha)
                            .addComponent(lblStatus))
                        .addContainerGap(74, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAcessarActionPerformed
              
        logar();
        this.dispose();
    }//GEN-LAST:event_jbAcessarActionPerformed

    private void jbCliqueAquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCliqueAquiActionPerformed
        CadastroUsuarios cadastrar = new CadastroUsuarios();
        cadastrar.setVisible(true);
        
    }//GEN-LAST:event_jbCliqueAquiActionPerformed

    private void jcbMotrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMotrarSenhaActionPerformed
     if(jcbMotrarSenha.isSelected()){
     jtSenha.setEchoChar((char)0);
             
             
              }else{
              jtSenha.setEchoChar('*');
                      
                      }
     
    }//GEN-LAST:event_jcbMotrarSenhaActionPerformed

   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAcessar;
    private javax.swing.JLabel jbCadastroUsuario;
    private javax.swing.JButton jbCliqueAqui;
    private javax.swing.JCheckBox jcbMotrarSenha;
    private javax.swing.JTextField jtLogin;
    private javax.swing.JPasswordField jtSenha;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
