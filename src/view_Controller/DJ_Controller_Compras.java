/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_Controller;

import bean.Dj_compras;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author danie
 */
public class DJ_Controller_Compras extends AbstractTableModel{
    private List lstCompras;

    public void setList(List lstCompras) {
        this.lstCompras = lstCompras;
    }
    
    public Dj_compras getBean(int rowIndex) {
        return (Dj_compras) lstCompras.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstCompras.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dj_compras dj_compras = (Dj_compras) lstCompras.get( rowIndex);
        if ( columnIndex == 0 ){
            return dj_compras.getDj_idCompras();
        } else if (columnIndex ==1) {
            return dj_compras.getDj_fkUsuarios();        
        } else if (columnIndex ==2) {
            return dj_compras.getDj_fkFornecedor();
        } else if (columnIndex ==3) {
            return dj_compras.getDj_total();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Usuários";         
        } else if ( columnIndex == 2) {
            return "Fornecedor";
        } else if ( columnIndex == 3) {
            return "Total";
        } 
        return "";
    }
}
