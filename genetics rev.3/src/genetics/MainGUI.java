/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genetics;

import Constant.Const;
import Constant.Range;
import java.util.Properties;
import javax.swing.table.DefaultTableModel;
import org.mariuszgromada.math.mxparser.Expression;

/**
 *
 * @author Mahmud
 */
public class MainGUI extends javax.swing.JFrame {

    private static final long serialVersionUID = 6219781086375793993L;

    Properties prop = new Properties();

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
        prop.setProperty("start", "true");

//        // get the property value and print it out
//        System.out.println(prop.getProperty("database"));
//        System.out.println(prop.getProperty("dbuser"));
//        System.out.println(prop.getProperty("dbpassword"));
//        addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(ComponentEvent e) {
//                super.componentResized(e); //To change body of generated methods, choose Tools | Templates.
//                jButton1.setText(prop.getProperty("start"));
//            }
//
//            @Override
//            public void componentHidden(ComponentEvent e) {
//                super.componentHidden(e); //To change body of generated methods, choose Tools | Templates.
//                jButton1.setText(prop.getProperty("start"));
//            }
//
//            @Override
//            public void componentMoved(ComponentEvent e) {
//                super.componentMoved(e); //To change body of generated methods, choose Tools | Templates.
//                jButton1.setText(prop.getProperty("start"));
//            }
//
//            @Override
//            public void componentShown(ComponentEvent e) {
//                super.componentShown(e); //To change body of generated methods, choose Tools | Templates.
//                jButton1.setText(prop.getProperty("start"));
//            }
//
//        });
//        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("genetics/LANG"); // NOI18N
//        jButton1.setText(bundle.getString("compute")); // NOI18N
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Generation", "Mutation", "x", "y", "z", "f(x,y,z)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Compute");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Show Graph");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton1))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    DefaultTableModel model;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        model = (DefaultTableModel) jTable1.getModel();
        int iteration = 3_400_000;
        // model.removeRow(0);
        jProgressBar1.setValue(0);
        jProgressBar1.setMaximum(iteration);
        jProgressBar1.setStringPainted(true);
        jButton1.setEnabled(false);
        new Thread() {
            double last_x = 0;

            @Override
            public void run() {

                Const.setFunction((Double... x)
                        -> 50 * x[0] + 120 * x[1]
                //                        5.3578547 * x[2] * x[2] + 0.8356891 * x[0] * x[4] + 37.293239 * x[0] - 40792.141
                //3 * x[0] - 2 * x[1]
                //                4 * x[0] * x[0] + 2 * x[1] * x[2] - x[0] * x[1] + x[2] * x[2]
                //x[0] * x[0] + 3 * x[0] * x[1] + x[1] * x[1]
                //Math.pow(1 - x[0], 3) + Math.pow(2 - x[1], 4) + Math.pow(3 - x[2], 5)//x[0] * x[0] + x[1] * x[1] + x[2] * x[2]
                //21.5+x[0]*Math.sin(4*Math.PI*x[0])+x[1]*Math.sin(20*Math.PI*x[1]) 
                //15*x[0]-x[0]*x[0]
                //Math.pow(x[0] - 2, 2) + 100 * Math.pow(x[1] - 3, 2);
                );
    /*
    100 * x[0] + 200 * x[1] <= 10000
    10 * x[0] + 30 * x[1] <= 1200
    x[0] + x[1]<=110
    x[0]>=0
    x[1]>=0
     */
                Const.setConditions(
                        (Double... x) -> 100 * x[0] + 200 * x[1] <= 10000,//83.334407 + 0.0056858 * x[1] * x[4] - 0.0022053 * x[2] * x[4] >= 0,
                        (Double... x) -> 10 * x[0] + 30 * x[1] <= 1200,//92f - (85.334407 + 0.0056858 * x[1] * x[4] + 0.0006262 * x[0] * x[3] - 0.0022053 * x[2] * x[4]) >= 0,
                        (Double... x) -> x[0] + x[1]<=110,//80.51249 + 0.0071317 * x[1] * x[4] + 0.0029955 * x[0] * x[1] + 0.0021813 * x[2] * x[2] - 90.0 >= 0);
                        (Double... x) -> x[0]>=0,
                        (Double... x) -> x[1]>=0
                        );
                Const.setSearch(Const.MAX);
                Const.setRanges(new Range[]{
                    new Range(-240, 240),
                    new Range(-240, 240),
                    new Range(-240, 240),
                    new Range(27, 45),
                    new Range(27, 45)
                });
                Const.setVar_count(2);
                Population p = new Population();
                int generation = 0;
                /////first print begin
                p.computeAllChromosomeValue();
                Double[] vars = p.getOptimalChromosome();
//                                    chromosome.getMinElements();
                String[] data = new String[6];
                data[0] = "" + generation;
                data[1] = "" + false;
                for (int i = 0; i < 2; i++) {
                    data[i + 2] = String.format("%.8f", vars[i]);
                }
                double x = Const.compute(vars);
                last_x = x;
                data[5] = String.format("%.22f", x);
                model.addRow(data);
                //////first print end
                while (generation < iteration) {

                    p.computeAllChromosomeValue();
                    p.crossOver();
                    p.computeAllChromosomeValue();
                    p.createNewGeneration();
                    p.computeAllChromosomeValue();
                    p.crossOver();

                    boolean mutation = false;
                    if (generation % 2 == 0) {
                        p.mutate();
                        mutation = true;
                    }

                    p.computeAllChromosomeValue();
                    p.createNewGeneration();
                    p.computeAllChromosomeValue();
//                    
                    vars = p.getOptimalChromosome();
                    x = Const.compute(vars);
                    if (/*(generation + 1) % 50000 == 0*/x != last_x) {
                        last_x = x;
//                        int chrNumber = 1;
//                        for (Chromosome chromosome : p.chromosomes) {
//                                    chromosome.getMinElements();
                        data = new String[6];
                        data[0] = "" + (generation + 1);
                        data[1] = "" + mutation;
                        for (int i = 0; i < 2; i++) {
                            data[i + 2] = String.format("%.8f", vars[i]);
                        }
                        data[5] = String.format("%.22f", Const.compute(vars));
                        model.addRow(data);
//                        }

                    }
                    generation++;
                    jProgressBar1.setValue(generation);
                    // p.printValues();
                    prop.setProperty("generation", String.format("%07d%n", generation));

                }
                p.printOptimalChromosome();
                jButton1.setEnabled(true);
//                array = new DoubleArray();
//                gen = new DoubleArray();
            }

        }.start();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
