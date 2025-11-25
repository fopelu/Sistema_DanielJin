/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_Controller;

import bean.Dj_compras_produtos;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author danie
 */
public class DJ_Controller_ComprasProdutos extends AbstractTableModel{
    private List lstComProdutos;

    public void setList(List lstCompras) {
        this.lstComProdutos = lstCompras;
        this.fireTableDataChanged();
    }
    
    public Dj_compras_produtos getBean(int rowIndex) {
        return (Dj_compras_produtos) lstComProdutos.get(rowIndex);
    }
    
    public void addBean(Dj_compras_produtos dj_compras_produtos){
        this.lstComProdutos.add(dj_compras_produtos);
        this.fireTableDataChanged();
    }

    public void removeBean(int rowIndex){
        this.lstComProdutos.remove(rowIndex);
        this.fireTableDataChanged();
    }
    
    public int getRowCount() {
        return lstComProdutos.size();
                
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dj_compras_produtos dj_compras_produtos = (Dj_compras_produtos) lstComProdutos.get( rowIndex);
        if ( columnIndex == 0 ){
            return dj_compras_produtos.getDj_fkProdutos().getDj_idProdutos();
        } else if (columnIndex ==1) {
            return dj_compras_produtos.getDj_fkProdutos().getDj_nome();        
        } else if (columnIndex ==2) {
            return dj_compras_produtos.getDj_quantidade();
        } else if (columnIndex ==3) {
            return dj_compras_produtos.getDj_valor_unitario();
        } else if (columnIndex ==4) {
            return dj_compras_produtos.getDj_quantidade()* dj_compras_produtos.getDj_valor_unitario();
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
            return "Quantidade";
        } else if ( columnIndex == 3) {
            return "Valor Unitário";
        } else if ( columnIndex == 4) {
            return "Total";
        } 
        return "";
    }
}
