/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_Controller;

import bean.DjProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author danie
 */
public class DJ_Controller_Produtos extends AbstractTableModel{
    private List lstProdutos;

    public void setList(List lstUsuarios) {
        this.lstProdutos = lstUsuarios;
    }
    
    public DjProdutos getBean(int rowIndex) {
        return (DjProdutos) lstProdutos.get(rowIndex);
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
        DjProdutos djProdutos = (DjProdutos) lstProdutos.get( rowIndex);
        if ( columnIndex == 0 ){
            return djProdutos.getDjIdProdutos();
        } else if (columnIndex ==1) {
            return djProdutos.getDjNome();        
        } else if (columnIndex ==2) {
            return djProdutos.getDjMaterial();
        } else if (columnIndex ==3) {
            return djProdutos.getDjPreco();
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
