/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_Controller;

import bean.dj_produtos;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author danie
 */
public class DJ_Controller_Produtos extends AbstractTableModel{
    private List lstProdutos;

    public void setList(List lstProdutos) {
        this.lstProdutos = lstProdutos;
    }
    
    public dj_produtos getBean(int rowIndex) {
        return (dj_produtos) lstProdutos.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstProdutos.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        dj_produtos djProdutos = (dj_produtos) lstProdutos.get( rowIndex);
        if ( columnIndex == 0 ){
            return djProdutos.getDj_idProdutos();
        } else if (columnIndex ==1) {
            return djProdutos.getDj_nome();        
        } else if (columnIndex ==2) {
            return djProdutos.getDj_material();
        } else if (columnIndex ==3) {
            return djProdutos.getDj_preco();
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
            return "Material";
        } else if ( columnIndex == 3) {
            return "Preco";
        } 
        return "";
    }
}
