/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_Controller;

import bean.DjVendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author danie
 */
public class DJ_Controller_Vendedor extends AbstractTableModel{
    private List lstVendedor;

    public void setList(List lstVendedor) {
        this.lstVendedor = lstVendedor;
    }
    
    public DjVendedor getBean(int rowIndex) {
        return (DjVendedor) lstVendedor.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstVendedor.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DjVendedor djVendedor = (DjVendedor) lstVendedor.get( rowIndex);
        if ( columnIndex == 0 ){
            return djVendedor.getDjIdVendedor();
        } else if (columnIndex ==1) {
            return djVendedor.getDjNome();        
        } else if (columnIndex ==2) {
            return djVendedor.getDjTelefone();
        } else if (columnIndex ==3) {
            return djVendedor.getDjCpf();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Nome";         
        } else if ( columnIndex == 2) {
            return "Telefone";
        } else if ( columnIndex == 3) {
            return "CPF";
        } 
        return "";
    }
}
