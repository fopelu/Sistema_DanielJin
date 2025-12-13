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
public class DJ_Controller_ConsultaClientes extends AbstractTableModel{
    private List lstConsultaClientes;

    public void setList(List lstConsultaClientes) {
        this.lstConsultaClientes = lstConsultaClientes;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstConsultaClientes.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dj_clientes dj_clientes = (Dj_clientes) lstConsultaClientes.get( rowIndex);
        if ( columnIndex == 0 ){
            return dj_clientes.getDj_idClientes();
        } else if (columnIndex ==1) {
            return dj_clientes.getDj_nome();        
        } else if (columnIndex ==2) {
            return dj_clientes.getDj_telefone();
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
        }
        return "";
    }
}
