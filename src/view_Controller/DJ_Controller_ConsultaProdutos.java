/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_Controller;

import bean.Dj_produtos;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author danie
 */
public class DJ_Controller_ConsultaProdutos extends AbstractTableModel{
    private List lstConsultaProdutos;

    public void setList(List lstConsultaProdutos) {
        this.lstConsultaProdutos = lstConsultaProdutos;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstConsultaProdutos.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dj_produtos dj_produtos = (Dj_produtos) lstConsultaProdutos.get( rowIndex);
        if ( columnIndex == 0 ){
            return dj_produtos.getDj_idProdutos();
        } else if (columnIndex ==1) {
            return dj_produtos.getDj_nome();        
        } else if (columnIndex ==2) {
            return dj_produtos.getDj_avaliacao();
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
            return "Avaliação";
        }
        return "";
    }
}
