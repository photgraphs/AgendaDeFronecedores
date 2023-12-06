
package visao;

import javax.swing.JFrame;
/**
 *
 * @author Elaine Alves
 */
public class Principal extends javax.swing.JFrame {

   
    
    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDescktop = new javax.swing.JPanel();
        jmbBarraMenu = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jmSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGFORM - Agenda de Controle de Fornecedores");

        jDescktop.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jDescktopLayout = new javax.swing.GroupLayout(jDescktop);
        jDescktop.setLayout(jDescktopLayout);
        jDescktopLayout.setHorizontalGroup(
            jDescktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1143, Short.MAX_VALUE)
        );
        jDescktopLayout.setVerticalGroup(
            jDescktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );

        jmArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arquivo.png"))); // NOI18N
        jmArquivo.setMnemonic('a');
        jmArquivo.setText("Arquivo");

        jRadioButtonMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Buscador");
        jRadioButtonMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mecanismo-de-busca.png"))); // NOI18N
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jmArquivo.add(jRadioButtonMenuItem2);

        jRadioButtonMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("Cadastro de Fornecedores");
        jRadioButtonMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cidade.png"))); // NOI18N
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        jmArquivo.add(jRadioButtonMenuItem3);

        jmbBarraMenu.add(jmArquivo);

        jmSobre.setMnemonic('s');
        jmSobre.setText("Sobre");
        jmbBarraMenu.add(jmSobre);

        setJMenuBar(jmbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDescktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDescktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
       
        ContatoFornVisao tela = new ContatoFornVisao();
        jDescktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        BuscadorPadrao tela = new  BuscadorPadrao ();
        jDescktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed
   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jDescktop;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmSobre;
    private javax.swing.JMenuBar jmbBarraMenu;
    // End of variables declaration//GEN-END:variables
}
