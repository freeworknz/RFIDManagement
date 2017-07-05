package RFIDManagement.view;

import RFIDManagement.model.*;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * @author Team 16
 * @created 20/05/2016 - v1.0
 * @tag scan for registration
 */
public class RegTag extends javax.swing.JFrame {

    private Student std = null;
    private Teacher tch = null;
    private Card cd = null;
    private int room = 0;
    //private int check = 0;

    /**
     * Creates new form NewJFrame
     *
     * @param a stpg param from starting page
     */
    public RegTag() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("5.png")));
    }

    /*
    private RegTag() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     */
    //identify the registration type(student, teacher or card) and create the xml file accordingly
    public void createFile() throws IOException {
        if (this.getStd() != null) {
            room = getStd().getRoom();
            generateXML(1);
        } else if (this.getTch() != null) {
            room = getTch().getRoomnum();
            generateXML(2);
        } else if (this.getCd() != null) {
            generateXML(3);
        }
    }

    //generate XML file as data storage for different type of registration
    private boolean generateXML(int check) {
        //System.out.println(check);
        if (check == 1 || check == 2) {
            String path = System.getProperty("user.home")+"/Documents/RFID Database/" + room + "/" + this.inputRegID.getText() + ".xml";
            //System.out.print(path);
            File file = new File(path);

            if (file.exists()) {
                RegNoteLbl.setForeground(Color.red);
                this.RegNoteLbl.setText("File already exits!");
                return false;

            } else {
                file.getParentFile().mkdirs();
                if (check == 1) {
                    StudentName nameList = new StudentName();
                    nameList.printStuName();
                    
                    if (nameList.contains(std.getName())) {
                        this.std = null;
                        RegNoteLbl.setForeground(Color.red);
                        this.RegNoteLbl.setText("Name already exits!");
                        return false;
                    }
                    
                    this.getStd().setTagID(this.inputRegID.getText());
                    //create a new text file under room directory and check the creation results
                    try {
                        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
                        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
                        // output pretty printed
                        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                        jaxbMarshaller.marshal(getStd(), file);
                        //jaxbMarshaller.marshal(std, System.out);
                        this.setStd(null);
                        this.dispose();

                    } catch (JAXBException ex) {
                        Logger.getLogger(RegTag.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (check == 2) {
                    this.getTch().setTagID(this.inputRegID.getText());
                    //create a new text file under room directory and check the creation results
                    try {
                        JAXBContext jaxbContext = JAXBContext.newInstance(Teacher.class);
                        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
                        // output pretty printed
                        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                        jaxbMarshaller.marshal(getTch(), file);
                        //jaxbMarshaller.marshal(std, System.out);
                        this.setTch(null);
                        this.dispose();

                    } catch (JAXBException ex) {
                        Logger.getLogger(RegTag.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                JOptionPane.showMessageDialog(null, "Registration completed!");
            }
        } else if (check == 3) {
            this.getCd().setTagID(this.inputRegID.getText());
            String path = System.getProperty("user.home")+"/Documents/RFID Database/cards/" + this.inputRegID.getText() + ".xml";
            File file = new File(path);
            if (file.exists()) {
                RegNoteLbl.setForeground(Color.red);
                this.RegNoteLbl.setText("Record already exits!");
                return false;

            } else {
                file.getParentFile().mkdirs();
                try {
                    JAXBContext jaxbContext = JAXBContext.newInstance(Card.class);
                    Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
                    // output pretty printed
                    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                    jaxbMarshaller.marshal(getCd(), file);
                    //jaxbMarshaller.marshal(std, System.out);

                    this.setCd(null);
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Registration completed!");
                    return true;

                } catch (JAXBException ex) {
                    Logger.getLogger(RegTag.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            RegNoteLbl.setForeground(Color.red);
            this.RegNoteLbl.setText("Registration failed!");
        }
        return false;

    }

    //@Override
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputRegID = new javax.swing.JTextField();
        RegNoteLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RFID Management");

        jLabel1.setText("Please Scan Your RFID Tag:");

        inputRegID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRegIDActionPerformed(evt);
            }
        });
        inputRegID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputRegIDKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputRegID, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputRegID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RegNoteLbl.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegNoteLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(RegNoteLbl)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 21, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 21, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputRegIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputRegIDKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                createFile();
            } catch (IOException ex) {
                Logger.getLogger(RegTag.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_inputRegIDKeyPressed

    private void inputRegIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRegIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputRegIDActionPerformed

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
            java.util.logging.Logger.getLogger(RegTag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegTag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegTag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegTag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegTag().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegNoteLbl;
    private javax.swing.JTextField inputRegID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the std
     */
    public Student getStd() {
        return std;
    }

    /**
     * @param std the std to set
     */
    public void setStd(Student std) {
        this.std = std;
    }

    /**
     * @return the tch
     */
    public Teacher getTch() {
        return tch;
    }

    /**
     * @param tch the tch to set
     */
    public void setTch(Teacher tch) {
        this.tch = tch;
    }

    /**
     * @return the cd
     */
    public Card getCd() {
        return cd;
    }

    /**
     * @param cd the cd to set
     */
    public void setCd(Card cd) {
        this.cd = cd;
    }

}
