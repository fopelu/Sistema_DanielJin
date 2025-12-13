/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_Controller;

import bean.Dj_fornecedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author danie
 */
public class DJ_Controller_ConsultaFornecedor extends AbstractTableModel{
    private List lstConsultaFornecedor;

    public void setList(List lstConsultaFornecedor) {
        this.lstConsultaFornecedor = lstConsultaFornecedor;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstConsultaFornecedor.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dj_fornecedor dj_fornecedor = (Dj_fornecedor) lstConsultaFornecedor.get( rowIndex);
        if ( columnIndex == 0 ){
            return dj_fornecedor.getDj_idFornecedor();
        } else if (columnIndex ==1) {
            return dj_fornecedor.getDj_nome();        
        } else if (columnIndex ==2) {
            return dj_fornecedor.getDj_cnpj();
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
            return "CNPJ";
        }
        return "";
    }
}
