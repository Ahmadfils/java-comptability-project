/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

import java.awt.Component;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public final class Export_Excel {
    
    
   
    public Export_Excel(JTable table,Component frame){
        JFileChooser choixfichier=new JFileChooser("C:\\Users\\pc\\Documents\\Documents");
        //choixfichier.showSaveDialog(null);
        FileNameExtensionFilter extfichier=new FileNameExtensionFilter("Fichier Excel","xlsx","xlsn","xls");
        choixfichier.setFileFilter(extfichier);
       
        int excelchoix=choixfichier.showSaveDialog(frame);
        FileOutputStream out=null;
        BufferedOutputStream bout=null;
        if(excelchoix==choixfichier.APPROVE_OPTION)
        {
            
            try {
                 
                  XSSFWorkbook excelTable=new XSSFWorkbook();
                  XSSFSheet excelsheet=excelTable.createSheet();
                  Row row=excelsheet.createRow(0);
                  for(int k=0;k<table.getColumnCount();k++)
                  {
                     Cell cell=row.createCell(k);
                     cell.setCellValue(table.getColumnName(k));
                  }
                  for(int i=0;i<table.getRowCount();i++)
                  {
                     Row excelrow=excelsheet.createRow(i+1);
                     for(int j=0;j<table.getColumnCount();j++)
                     {
                       Cell excelcell=excelrow.createCell(j);
                       excelcell.setCellValue(table.getValueAt(i, j).toString());
                     }
                  }
                   out=new FileOutputStream(choixfichier.getSelectedFile());
                   bout=new BufferedOutputStream(out);
                    excelTable.write(bout);
                    out.close();
                    bout.close();
                    excelTable.close();
                    JOptionPane.showMessageDialog(null,"Export vers Excel réussi !");
            }    
                catch (IOException ex) {
                   JOptionPane.showMessageDialog(null, ex);
                }
            } 
                
               
            
       

}
    
}
    
