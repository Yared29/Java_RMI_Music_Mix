
import java.rmi.Naming;
import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;

public class Clinet extends javax.swing.JFrame {
    private static Socket socket;
    private static BufferedInputStream inputStream;
    MusicMixInterface stub;
    public Clinet() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playAudioBtn = new javax.swing.JButton();
        ipAddressTf = new javax.swing.JTextField();
        portNumTf = new javax.swing.JTextField();
        stopAudioBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        playAudioBtn.setText("Play Audio");
        playAudioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAudioBtnActionPerformed(evt);
            }
        });

        ipAddressTf.setText("IP Address");
        ipAddressTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipAddressTfActionPerformed(evt);
            }
        });

        portNumTf.setText("Port");
        portNumTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portNumTfActionPerformed(evt);
            }
        });

        stopAudioBtn.setText("Stop Audio");
        stopAudioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopAudioBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ipAddressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(portNumTf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playAudioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stopAudioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(ipAddressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(portNumTf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(playAudioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stopAudioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playAudioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAudioBtnActionPerformed
        try {
            stub = (MusicMixInterface) Naming.lookup("rmi://"+ipAddressTf.getText()+":"+portNumTf.getText()+"/MUSIC");
            stub.playAudio();
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }//GEN-LAST:event_playAudioBtnActionPerformed

        
        
    private void ipAddressTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipAddressTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipAddressTfActionPerformed

    private void portNumTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portNumTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portNumTfActionPerformed

    private void stopAudioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopAudioBtnActionPerformed
                                       
        try {
           
            stub.stopAudio();
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }//GEN-LAST:event_stopAudioBtnActionPerformed


    public static void main(String args[]) throws LineUnavailableException {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clinet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ipAddressTf;
    private javax.swing.JButton playAudioBtn;
    private javax.swing.JTextField portNumTf;
    private javax.swing.JButton stopAudioBtn;
    // End of variables declaration//GEN-END:variables
}
