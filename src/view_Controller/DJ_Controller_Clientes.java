/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_Controller;

import bean.Dj_clientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author danie
 */
public class DJ_Controller_Clientes extends AbstractTableModel{
    private List lstVendedor;

    public void setList(List lstVendedor) {
        this.lstVendedor = lstVendedor;
    }
    
    public Dj_clientes getBean(int rowIndex) {
        return (Dj_clientes) lstVendedor.get(rowIndex);
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
        Dj_clientes djVendedor = (Dj_clientes) lstVendedor.get( rowIndex);
        if ( columnIndex == 0 ){
            return djVendedor.getDj_idClientes();
        } else if (columnIndex ==1) {
            return djVendedor.getDj_nome();        
        } else if (columnIndex ==2) {
            return djVendedor.getDj_telefone();
        } else if (columnIndex ==3) {
            return djVendedor.getDj_cpf();
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
