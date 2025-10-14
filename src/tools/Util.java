/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import bean.Dj_compras;
import java.awt.Dimension;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jfree.data.category.CategoryDataset;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author danie
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... componentes ){
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);
        }
    }
    
    public static void limpar(JComponent ... componentes){
        for (int i = 0; i < componentes.length; i++) {
            if(componentes[i] instanceof JTextField){
                ((JTextField) componentes[i]).setText("");
            }
            if(componentes[i] instanceof JComboBox){
                ((JComboBox) componentes[i]).setSelectedIndex(-1);
            }
            if(componentes[i] instanceof JCheckBox){
                ((JCheckBox) componentes[i]).setSelected(false);
            }
        }
    }
    
    public static void mensagem(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }
    
    public static boolean perguntar(String cad){
        int perguntar = JOptionPane.showConfirmDialog(null, cad, cad, JOptionPane.YES_NO_OPTION);
            if(perguntar == JOptionPane.YES_OPTION){
                return true;
            }else{
                return false;
            }
    }
    
    public static int strToInt(String cad){
        return Integer.parseInt(cad);
    }
    public static String intToStr(int num){
        return String.valueOf(num);
    }
    public static double strToDouble(String cad){
        return Double.parseDouble(cad);
    }
    public static String DoubleToStr(double num){
        return String.valueOf(num);
    }
    public static Date strToDate (String cad){
        try {
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            return formatoData.parse(cad);
        } catch (ParseException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public CategoryDataset PegarDado(ArrayList<Dj_compras> listaDeCompras){
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (Dj_compras compras : listaDeCompras) {
            dataset.addValue(compras.getDj_total(),"Compra " + compras.getDj_idCompras() , "Total");
        }
        return dataset;
    }
    
    public JFreeChart CriarBarra(CategoryDataset dataset){
        JFreeChart graficoBarra = ChartFactory.createBarChart("Gráfico de vendas",
                "ID",
                "Total",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,
                false
        );
        return graficoBarra;
    }
    
    public ChartPanel criarGrafico(ArrayList<Dj_compras> listaDeCompras){
        
        CategoryDataset dataset = this.PegarDado(listaDeCompras);
        JFreeChart grafico = this.CriarBarra(dataset);
        
        ChartPanel painelGrafico = new ChartPanel(grafico);
        painelGrafico.setPreferredSize(new Dimension(400, 400));
        
        return painelGrafico;
    }
    
    public static String datetoStr(Date data){
        if(data == null) return "";
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        return formatoData.format(data); 
    }
}
