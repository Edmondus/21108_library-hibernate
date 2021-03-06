/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.View;

import Library.Model.Bookcategory;
import Library.Model.Checkout;
import Library.Util.HibernateUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.print.PrinterException;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hwpf.usermodel.Paragraph;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author jean claude
 */
public class ReportForm extends javax.swing.JFrame {

    /**
     * Creates new form Report
     */
    public ReportForm() {
        initComponents();
        setTitle("Report_Form's Checking");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabledisplay = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        dob2 = new com.toedter.calendar.JDateChooser();
        dob1 = new com.toedter.calendar.JDateChooser();
        cbbook = new javax.swing.JComboBox<>();
        rbcheckin = new javax.swing.JRadioButton();
        rbcheckout = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnexportexcel = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        btnexportpdf = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabledisplay.setBackground(new java.awt.Color(0, 204, 51));
        tabledisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabledisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ClientName", "BookName", "Author", "Status", "Return Date"
            }
        ));
        jScrollPane3.setViewportView(tabledisplay);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 204, 102));

        cbbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbbookMousePressed(evt);
            }
        });

        buttonGroup1.add(rbcheckin);
        rbcheckin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbcheckin.setText("Check In");

        buttonGroup1.add(rbcheckout);
        rbcheckout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbcheckout.setText("Check Out");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Search BookCategory:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("To:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("From:");

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnsearch))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbook, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbcheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbcheckout))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dob1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dob2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbcheckin)
                    .addComponent(rbcheckout))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel2))
                            .addComponent(dob1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dob2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        btnexportexcel.setBackground(new java.awt.Color(0, 204, 51));
        btnexportexcel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnexportexcel.setText("Export Excel");
        btnexportexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportexcelActionPerformed(evt);
            }
        });

        btnclose.setBackground(new java.awt.Color(0, 204, 51));
        btnclose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        btnexportpdf.setBackground(new java.awt.Color(0, 204, 51));
        btnexportpdf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnexportpdf.setText("Export PDF");
        btnexportpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportpdfActionPerformed(evt);
            }
        });

        btnprint.setBackground(new java.awt.Color(0, 204, 51));
        btnprint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnprint.setText("Print");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnexportpdf)
                .addGap(28, 28, 28)
                .addComponent(btnexportexcel)
                .addGap(27, 27, 27)
                .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnprint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnclose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnexportexcel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnexportpdf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 869, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbookMousePressed
        // TODO add your handling code here:
        cbbook.removeAllItems();
        Transaction trans = null;
        Session sess = HibernateUtil.getSessionFactory().openSession();
        trans = sess.beginTransaction();
        SQLQuery query = sess.createSQLQuery("select categoryName from BookCategory");
        List ls = query.list();
        for(Object cat : ls){
            cbbook.addItem((String) cat);
        }
    }//GEN-LAST:event_cbbookMousePressed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        String stat = null;
        Transaction tr = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        tr = session.beginTransaction();
        if (rbcheckin.isSelected()) {
            stat = "Check in";
            Criteria cr = session.createCriteria(Checkout.class);
            cr.add(Restrictions.eq("status", stat));
            List res = cr.list();

            DefaultTableModel md = (DefaultTableModel) tabledisplay.getModel();
            md.setRowCount(0);
            Object[] row = new Object[5];
            for (Iterator i = res.iterator(); i.hasNext();) {
                Checkout ck = (Checkout) i.next();
                row[0] = ck.getClientname();
                row[1] = ck.getBookname();
                row[2] = ck.getAuthor();
                row[3] = ck.getReturndate();
                row[4] = ck.getStatus();

            }
            session.close();
        } else if (rbcheckout.isSelected()) {
            stat = "Check out";
            session = HibernateUtil.getSessionFactory().openSession();
            tr = session.beginTransaction();
            Criteria crOut = session.createCriteria(Checkout.class);
            crOut.add(Restrictions.eq("status", stat));
            List res = crOut.list();

            DefaultTableModel mdOut = (DefaultTableModel) tabledisplay.getModel();
            mdOut.setRowCount(0);
            Object[] rows = new Object[5];
            for (Iterator j = res.iterator(); j.hasNext();) {
                Checkout cko = (Checkout) j.next();
                rows[0] = cko.getClientname();
                rows[1] = cko.getBookname();
                rows[2] = cko.getAuthor();
                rows[3] = cko.getReturndate();
                rows[4] = cko.getStatus();
                mdOut.addRow(rows);

            }
            session.close();
        } else if (dob1.getDate() == null) {
            String id = null;
            int i = 0;
            String rnm = null;
            String nm = cbbook.getSelectedItem().toString();
            session = HibernateUtil.getSessionFactory().openSession();
            tr = session.beginTransaction();
            Criteria Bct = session.createCriteria(Bookcategory.class);
            SQLQuery query = session.createSQLQuery("select CategoryId from BookCategory where categoryName=?");
            query.setParameter(0, nm);
            List temp = query.list();
            for (Object obj : temp) {
                id = obj.toString();
            }
            i = Integer.parseInt(id);
            //select bookname from cat where id =id
            SQLQuery query2 = session.createSQLQuery("select categoryName  from BookCategory where CategoryId =?");
            query2.setParameter(0, i);
            List temp2 = query.list();
            for (Object obj : temp2) {
                rnm = obj.toString();
            }
            Criteria crOut = session.createCriteria(Checkout.class);
            crOut.add(Restrictions.ge("bookname", rnm));
            List temp3 = crOut.list();
            DefaultTableModel mdOut = (DefaultTableModel) tabledisplay.getModel();
            mdOut.setRowCount(0);
            Object[] rows = new Object[5];
            for (Iterator j = temp3.iterator(); j.hasNext();) {
                Checkout ck = (Checkout) j.next();
                rows[0] = ck.getClientname();
                rows[1] = ck.getBookname();
                rows[2] = ck.getAuthor();
                rows[3] = ck.getReturndate();
                rows[4] = ck.getStatus();
                mdOut.addRow(rows);

            }
            session.close();
        } else {
            Date fdt = dob1.getDate();
            Date tdt = dob2.getDate();
            session = HibernateUtil.getSessionFactory().openSession();
            tr = session.beginTransaction();
            Criteria crOut = session.createCriteria(Checkout.class);
            crOut.add(Restrictions.ge("returnDate", fdt));
            crOut.add(Restrictions.le("returnDate", tdt));
            List res = crOut.list();
            DefaultTableModel mdOut = (DefaultTableModel) tabledisplay.getModel();
            mdOut.setRowCount(0);
            Object[] rows = new Object[5];
            for (Iterator j = res.iterator(); j.hasNext();) {
                Checkout ck = (Checkout) j.next();
                rows[0] = ck.getClientname();
                rows[1] = ck.getBookname();
                rows[2] = ck.getAuthor();
                rows[3] = ck.getReturndate();
                rows[4] = ck.getStatus();
                mdOut.addRow(rows);

            }
            session.close();
        }
//        Report repo = new Report();
//        repo.setId(1);
//        repo.setOption(rbcheckin.isSelected()? "CheckIn":"CheckOut");
//        repo.setBookname(cbbook.getSelectedItem().toString());
//        repo.setFromdate(new Date(dob1.getDate().getTime()));
//        repo.setTodate(new Date(dob2.getDate().getTime()));
//        ReportDao rdao = new ReportDao();
//        rdao.MakeReport(repo);
//        JOptionPane.showMessageDialog(this, "Data Saved Successfully!!");
//        Show_Data();

    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        try {
            // TODO add your handling code here:
            tabledisplay.print();
        } catch (PrinterException ex) {
            Logger.getLogger(ReportForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnprintActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnexportpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportpdfActionPerformed
        // TODO add your handling code here:
        DefaultTableModel mdOut = (DefaultTableModel) tabledisplay.getModel();
        Paragraph p=null;
         try{
             PdfPTable tb= new PdfPTable(5);
             PdfPCell c1 = new  PdfPCell(new Phrase("ClientName"));
             tb.addCell(c1);
             c1 = new  PdfPCell(new Phrase("BookName"));
             tb.addCell(c1);
             c1 = new  PdfPCell(new Phrase("Author"));
             tb.addCell(c1);
             c1 = new  PdfPCell(new Phrase("Status"));
             tb.addCell(c1);
             c1 = new PdfPCell(new Phrase("Return Date"));
             tb.addCell(c1);
             tb.setHeaderRows(1);
             
            String file ="C:\\Users\\jean claude\\Documents\\NetBeansProjects\\LibrarySystem_Hibernation\\ReportPdf.pdf";
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream(file));
            doc.open();
            for(int i=0; i<mdOut.getRowCount();i++)
          {
              
              for(int j=0;j<mdOut.getColumnCount();j++)
              {
                 tb.addCell(mdOut.getValueAt(i, j).toString()+"\t");
                 
                
                 
                 
              }
          
          }
            doc.add(tb);
            doc.close();
            JOptionPane.showMessageDialog(null, "PDF Created Successfully!!");
        }catch(Exception e)
        {
            
        }
        
    }//GEN-LAST:event_btnexportpdfActionPerformed

    private void btnexportexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportexcelActionPerformed
        // TODO add your handling code here:
        FileOutputStream excelout = null;
        XSSFWorkbook excelJTableExport = null;
        BufferedOutputStream bw = null;
        XSSFSheet excelSheet = null;
        DefaultTableModel model = (DefaultTableModel) tabledisplay.getModel();

            //Choosing Saving Location
        //Set default location to C:\Users\Authentic\Desktop or your preferred location
        JFileChooser excelFileChooser = new JFileChooser();
        //Dialog box title
        excelFileChooser.setDialogTitle("Save As ..");
        //Filter only xls, xlsx, xlsm files
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("Files", "xls", "xlsx", "xlsm");
        //Setting extension for selected file names
        excelFileChooser.setFileFilter(fnef);
        int chooser = excelFileChooser.showSaveDialog(null);
        //Check if save button has been clicked
        if (chooser == JFileChooser.APPROVE_OPTION) {
            
                try {
                    
                    //If button is clicked execute this code
                    excelJTableExport = new XSSFWorkbook();
                    excelSheet = excelJTableExport.createSheet("Jtable Export");
                      for (int i = 0; i < model.getRowCount(); i++) {
                          model.getColumnName(i);
                        XSSFRow excelRow = excelSheet.createRow(i);
                        for (int j = 0; j < model.getColumnCount(); j++) {
                            XSSFCell excelCell = excelRow.createCell(j);
                            
                            excelCell.setCellValue(model.getValueAt(i, j).toString());
                        }
                        
                    }   excelout = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
                    bw = new BufferedOutputStream(excelout);
                    try {
                        excelJTableExport.write(bw);
                    } catch (IOException ex) {
                        Logger.getLogger(ReportForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null, "ExcelSheet Created Successfully");
                    
                        if(bw!=null){
                            bw.close();
                        }
                        if(excelout!=null){
                            excelout.close();
                        }
                        
                        if(excelJTableExport!=null){
                            excelJTableExport.close();
                        }
                } catch (FileNotFoundException ex) {
                    
                    Logger.getLogger(ReportForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                Logger.getLogger(ReportForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
    }//GEN-LAST:event_btnexportexcelActionPerformed

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
            java.util.logging.Logger.getLogger(ReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnexportexcel;
    private javax.swing.JButton btnexportpdf;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnsearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbbook;
    private com.toedter.calendar.JDateChooser dob1;
    private com.toedter.calendar.JDateChooser dob2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rbcheckin;
    private javax.swing.JRadioButton rbcheckout;
    private javax.swing.JTable tabledisplay;
    // End of variables declaration//GEN-END:variables

//    private void Show_Data() {
//        ReportDao dao = new ReportDao();
//            List<Report> b = dao.listAll();
//            DefaultTableModel tModel = (DefaultTableModel)tabledisplay.getModel();
//            tModel.setRowCount(0);
//            //b.stream().map((b1) -> new Object[]{
//            for (Report rp : b){
//                Object[] obj = new Object[] {
//                rp.getOption(), rp.getBookname(), rp.getFromdate(),rp.getTodate()
//                };
//            //}).forEach((o) -> {
//                tModel.addRow(obj);
//            //});
//            }
//    }
}
