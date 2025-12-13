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
public class DJ_Controller_ConsultaCompras extends AbstractTableModel{
    private List lstConsultaCompras;

    public void setList(List lstConsultaCompras) {
        this.lstConsultaCompras = lstConsultaCompras;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstConsultaCompras.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dj_compras dj_compras = (Dj_compras) lstConsultaCompras.get( rowIndex);
        if ( columnIndex == 0 ){
            return dj_compras.getDj_idCompras();
        } else if (columnIndex ==1) {
            return dj_compras.getDj_fkFornecedor().getDj_nome();        
        } else if (columnIndex ==2) {
            return dj_compras.getDj_total();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) { 
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Fornecedor";         
        } else if ( columnIndex == 2) {
            return "Total";
        }
        return "";
    }
}
