/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_Controller;

import bean.DjUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author danie
 */
public class DJ_Controller_Usuarios extends AbstractTableModel{
    private List lstUsuarios;

    public void setList(List lstUsuarios) {
        this.lstUsuarios = lstUsuarios;
    }
    
    public DjUsuarios getBean(int rowIndex) {
        return (DjUsuarios) lstUsuarios.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstUsuarios.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DjUsuarios djusuarios = (DjUsuarios) lstUsuarios.get( rowIndex);
        if ( columnIndex == 0 ){
            return djusuarios.getDjIdUsuarios();
        } else if (columnIndex ==1) {
            return djusuarios.getDjNome();        
        } else if (columnIndex ==2) {
            return djusuarios.getDjApelido();
        } else if (columnIndex ==3) {
            return djusuarios.getDjCpf();
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
            return "Apelido";
        } else if ( columnIndex == 3) {
            return "Cpf";
        } 
        return "";
    }
}
