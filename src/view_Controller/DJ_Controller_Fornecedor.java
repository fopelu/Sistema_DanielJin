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
public class DJ_Controller_Fornecedor extends AbstractTableModel{
    private List lstFornecedor;

    public void setList(List lstFornecedor) {
        this.lstFornecedor = lstFornecedor;
    }
    
    public Dj_fornecedor getBean(int rowIndex) {
        return (Dj_fornecedor) lstFornecedor.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstFornecedor.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dj_fornecedor djFornecedor = (Dj_fornecedor) lstFornecedor.get( rowIndex);
        if ( columnIndex == 0 ){
            return djFornecedor.getDj_idFornecedor();
        } else if (columnIndex ==1) {
            return djFornecedor.getDj_nome();        
        } else if (columnIndex ==2) {
            return djFornecedor.getDj_telefone();
        } else if (columnIndex ==3) {
            return djFornecedor.getDj_cnpj();
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
            return "CNPJ";
        } 
        return "";
    }
}
