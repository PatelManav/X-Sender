
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MANAV PATEL
 */
public class chat1 extends javax.swing.JFrame {

    /**
     *
     */

    
    /**
     * Creates new form chat
     */
    public chat1() {

        initComponents();
        setLocation(1000,500);
        setSize(750,480);
        
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        repaint();
    }

    /*@Override
    public void paint(Graphics g)
    {
        super.paint(g);
        try {
            //InputStream s1_in = s3.getInputStream();
            //DataInputStream dics = new DataInputStream(s1_in);
            s3 = new Socket("localhost",1272);
        } catch (IOException ex) {
            Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
        }
                String st="";
        while(true)
        {
            InputStream s1_in = null;
                    try {
                        s1_in = s3.getInputStream(); //Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
                    }
                DataInputStream dics = new DataInputStream(s1_in);
            try {
                st = dics.readUTF();
                if(st.equals("Over"))
                    break;
            } catch (IOException ex) {
                //Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
                //st = dics.readUTF();
                jTextArea1.append("\nAdmin: "+st);
            }            
            System.out.println(st);
        } 
        
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHAT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 20, 260, 50);

        jTextArea1.setBackground(new java.awt.Color(204, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 3, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 0, 255));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 100, 530, 240);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MANAV PATEL\\Documents\\NetBeansProjects\\JavaApplication2\\src\\CCC.png")); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(610, 240, 90, 90);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\MANAV PATEL\\Documents\\NetBeansProjects\\JavaApplication2\\src\\BBB.png")); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(610, 110, 90, 90);

        jLabel3.setBackground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("hvgfhhvgv");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(410, 180, 140, 20);

        jTextField1.setBackground(new java.awt.Color(204, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(40, 370, 530, 40);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 750, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ServerSocket s = null;
        try {
            s = new ServerSocket(1272);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
       Socket s1 = null;
        try {
            s1 = s.accept(); // OutputStream s1_out = s1.getOutputStream(); DataOutputStream docs = new DataOutputStream(s1_out)) {
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
            Scanner sc= new Scanner(System.in); 
            
            
            String s2=null;
    
                OutputStream s1_out = null; 
            try {
                s1_out = s1.getOutputStream();
                s2=jTextField1.getText();
                jTextArea1.append("\nYOU : "+s2);
                jTextField1.setText("");
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
            }
                DataOutputStream docs = new DataOutputStream(s1_out);
                
            try {
                docs.writeUTF(s2);                
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
            }                                       

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Socket s3 = null;
        try {
            s3 = new Socket("localhost",1273);
        } catch (IOException ex) {
            Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
        }
                //InputStream s1_in = s3.getInputStream();
                //DataInputStream dics = new DataInputStream(s1_in);
                String st="";
   InputStream s1_in = null;
        try {
            s1_in = s3.getInputStream();
        } catch (IOException ex) {
            Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
        }
                DataInputStream dics = new DataInputStream(s1_in);
        try {
            st = dics.readUTF();
            jTextArea1.append("\nAdmin : "+st);
        } catch (IOException ex) {
            Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
        }   
        try {
            dics.close();
        } catch (IOException ex) {
            Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            s1_in.close();
        } catch (IOException ex) {
            Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            s3.close();
        } catch (IOException ex) {
            Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
        }
            //System.out.println(st);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chat1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
