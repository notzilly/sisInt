package controller;

import cbr.CBRApplication;
import gui.CasoGUI;
import gui.MainGUI;
import java.awt.Component;
import java.awt.Container;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.JFXPanel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.exception.ExecutionException;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import representation.DescCaso;
import representation.TableModelCaso;

/**
 *
 * @author Zilly
 */
public class CBRController {
    
    private MainGUI view;
    private TableModelCaso tabelaCasos;
    private DescCaso dc;
    private CBRApplication cbrApp;
    
    public CBRController(DescCaso dc, CBRApplication cbrApp) {
        this.dc = dc;
        
        this.cbrApp = cbrApp;
        
        try {
            cbrApp.configure();
            cbrApp.preCycle();
        } catch (ExecutionException ex) {
            Logger.getLogger(CBRController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        this.tabelaCasos = new TableModelCaso(cbrApp.retornaCasos());
        
        this.view = new MainGUI(tabelaCasos, this);
        this.view.setVisible(true);
        this.view.setExtendedState(this.view.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }  
    
    public void disableAll(Container evt){
        for(Component c : evt.getComponents()){
                if(c instanceof JRadioButton){
                    c.setEnabled(false);
                }
                else if(c instanceof JComboBox){
                    c.setEnabled(false);
                    ((JComboBox)c).setSelectedIndex(0);
                }
                else{
                    if(c instanceof Container){
                        disableAll((Container)c);
                    }
                }                    
            }   
    }
    
    public void enableAll(Container evt){
        for(Component c : evt.getComponents()){
                if(c instanceof JRadioButton){
                    c.setEnabled(true);
                }
                else if(c instanceof JComboBox){
                    c.setEnabled(true);
                    ((JComboBox)c).setSelectedIndex(0);
                }
                else{
                    if(c instanceof Container){
                        enableAll((Container)c);
                    }
                }                    
            }   
    }
    
    public void disableEnvido(Container cont){
        //Disable Fields
        for(Component c : cont.getComponents()){
            if(c instanceof JComboBox){ 
                c.setEnabled(false);
            }
            else{
                if(c instanceof Container){
                    disableEnvido((Container)c);
                }
            }
        }        
    }
    
    public void rodarConsulta() {
        // Mão
        dc.setCarta1((Integer) view.getjComboBoxCarta1().getSelectedIndex());
        dc.setCarta2((Integer) view.getjComboBoxCarta2().getSelectedIndex());
        dc.setCarta3((Integer) view.getjComboBoxCarta3().getSelectedIndex());
        
        // Volta
        dc.setGanheiEnvido((Integer) view.getjComboBoxGanheiEnvido().getSelectedIndex());
        dc.setGanheiVolta((Integer) view.getjComboBoxGanheiEnvido().getSelectedIndex());
        dc.setPontosMeus((Integer) view.getjComboBoxGanheiEnvido().getSelectedIndex());
        dc.setPontosAdv((Integer) view.getjComboBoxGanheiEnvido().getSelectedIndex());
        
        // Rodada 1
        dc.setR1CartaMinha((Integer) view.getjComboBoxR1CartaMinha().getSelectedIndex());
        dc.setR1CartaAdv((Integer) view.getjComboBoxR1CartaAdv().getSelectedIndex());
        dc.setR1PediuEnvido((Integer) view.getjComboBoxR1PediuEnvido().getSelectedIndex());
        dc.setR1AceitouEnvido((Integer) view.getjComboBoxR1AceitouEnvido().getSelectedIndex());
        dc.setR1PediuTruco((Integer) view.getjComboBoxR1PediuTruco().getSelectedIndex());
        dc.setR1AceitouTruco((Integer) view.getjComboBoxR1AceitouTruco().getSelectedIndex());
        dc.setR1PediuRetruco((Integer) view.getjComboBoxR1PediuRetruco().getSelectedIndex());
        dc.setR1AceitouRetruco((Integer) view.getjComboBoxR1AceitouRetruco().getSelectedIndex());
        dc.setR1PediuValeQuatro((Integer) view.getjComboBoxR1PediuValeQuatro().getSelectedIndex());
        dc.setR1AceitouValeQuatro((Integer) view.getjComboBoxR1AceitouValeQuatro().getSelectedIndex());
        
        // Rodada 2
        dc.setR2CartaMinha((Integer) view.getjComboBoxR2CartaMinha().getSelectedIndex());
        dc.setR2CartaAdv((Integer) view.getjComboBoxR2CartaAdv().getSelectedIndex());
        dc.setR2PediuTruco((Integer) view.getjComboBoxR2PediuTruco().getSelectedIndex());
        dc.setR2AceitouTruco((Integer) view.getjComboBoxR2AceitouTruco().getSelectedIndex());
        dc.setR2PediuRetruco((Integer) view.getjComboBoxR2PediuRetruco().getSelectedIndex());
        dc.setR2AceitouRetruco((Integer) view.getjComboBoxR2AceitouRetruco().getSelectedIndex());
        dc.setR2PediuValeQuatro((Integer) view.getjComboBoxR2PediuValeQuatro().getSelectedIndex());
        dc.setR2AceitouValeQuatro((Integer) view.getjComboBoxR2AceitouValeQuatro().getSelectedIndex());
        
        // Rodada 3
        dc.setR3CartaMinha((Integer) view.getjComboBoxR3CartaMinha().getSelectedIndex());
        dc.setR3CartaAdv((Integer) view.getjComboBoxR3CartaAdv().getSelectedIndex());
        dc.setR3PediuTruco((Integer) view.getjComboBoxR3PediuTruco().getSelectedIndex());
        dc.setR3AceitouTruco((Integer) view.getjComboBoxR3AceitouTruco().getSelectedIndex());
        dc.setR3PediuRetruco((Integer) view.getjComboBoxR3PediuRetruco().getSelectedIndex());
        dc.setR3AceitouRetruco((Integer) view.getjComboBoxR3AceitouRetruco().getSelectedIndex());
        dc.setR3PediuValeQuatro((Integer) view.getjComboBoxR3PediuValeQuatro().getSelectedIndex());
        dc.setR3AceitouValeQuatro((Integer) view.getjComboBoxR3AceitouValeQuatro().getSelectedIndex());
        
        NNConfig cnf;
        //Geral
        if(view.getjRadioButtonQueryGeral().isSelected()){
            
            if(view.getjRadioButtonRodada1().isSelected()){
                cnf = cbrApp.getSimilarityGeralR1();
            }
            else if(view.getjRadioButtonRodada2().isSelected()){
                cnf = cbrApp.getSimilarityGeralR2();
            }
            else if(view.getjRadioButtonRodada3().isSelected()){
                cnf = cbrApp.getSimilarityGeralR3();
            }
        }
        else if(view.getjRadioButtonQueryEnvido().isSelected()){
            cnf = cbrApp.getSimilarityEnvido();
        }
        else if(view.getjRadioButtonQueryTruco().isSelected()){
            if(view.getjRadioButtonRodada1().isSelected()){
                cnf = cbrApp.getSimilarityTrucoR1();
            }
            else if(view.getjRadioButtonRodada2().isSelected()){
                cnf = cbrApp.getSimilarityTrucoR2();
            }
            else if(view.getjRadioButtonRodada3().isSelected()){
                cnf = cbrApp.getSimilarityTrucoR3();
            }
        }
        else if(view.getjRadioButtonQueryRetruco().isSelected()){
            if(view.getjRadioButtonRodada1().isSelected()){
                cnf = cbrApp.getSimilarityRetrucoR1();
            }
            else if(view.getjRadioButtonRodada2().isSelected()){
                cnf = cbrApp.getSimilarityRetrucoR2();
            }
            else if(view.getjRadioButtonRodada3().isSelected()){
                cnf = cbrApp.getSimilarityRetrucoR3();
            }
        }
        else if(view.getjRadioButtonQueryValeQuatro().isSelected()){
            if(view.getjRadioButtonRodada1().isSelected()){
                cnf = cbrApp.getSimilarityValeQuatroR1();
            }
            else if(view.getjRadioButtonRodada2().isSelected()){
                cnf = cbrApp.getSimilarityValeQuatroR2();
            }
            else if(view.getjRadioButtonRodada3().isSelected()){
                cnf = cbrApp.getSimilarityValeQuatroR3();
            }
        }
        
        CBRQuery query = new CBRQuery();

        query.setDescription(this.dc);
        
        System.out.println(query);
        
        try {
            cbrApp.cycle(query);
            cbrApp.postCycle();
        } catch (ExecutionException ex) {
            Logger.getLogger(CBRController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void trocaCategoria(java.awt.event.ActionEvent evt){
        if(evt.getSource() == view.getjRadioButtonQueryGeral()){
            disableAll(view.getjPanelDadosVoltas());
            view.getjRadioButtonRodada1().setEnabled(true);
            view.getjRadioButtonRodada2().setEnabled(true);
            view.getjRadioButtonRodada3().setEnabled(true);
        }
        else if(evt.getSource() == view.getjRadioButtonQueryEnvido()){
            disableEnvido(view.getjPanelNovaQuery());
            view.getjRadioButtonRodada1().setEnabled(false);
            view.getjRadioButtonRodada2().setEnabled(false);
            view.getjRadioButtonRodada3().setEnabled(false);
            view.getjComboBoxCarta1().setEnabled(true);
            view.getjComboBoxCarta2().setEnabled(true);
            view.getjComboBoxCarta3().setEnabled(true);
            view.getjComboBoxGanheiEnvido().setEnabled(true);
            view.getjComboBoxR1AceitouEnvido().setEnabled(true);
            view.getjComboBoxR1PediuEnvido().setEnabled(true);
            view.getjComboBoxGanheiEnvido().setSelectedIndex(2);
        }
        else if(evt.getSource() == view.getjRadioButtonQueryTruco()){
            enableAll(view.getjPanelNovaQuery());
            disableAll(view.getjPanelDadosVoltas());
            view.getjComboBoxGanheiEnvido().setEnabled(false);
            view.getjComboBoxR1AceitouRetruco().setEnabled(false);
            view.getjComboBoxR1PediuRetruco().setEnabled(false);
            view.getjComboBoxR1PediuValeQuatro().setEnabled(false);
            view.getjComboBoxR1AceitouValeQuatro().setEnabled(false);
        }
        else if(evt.getSource() == view.getjRadioButtonQueryRetruco()){
            enableAll(view.getjPanelNovaQuery());
            disableAll(view.getjPanelDadosVoltas());
            
        }
        else if(evt.getSource() == view.getjRadioButtonQueryVale4()){
            enableAll(view.getjPanelNovaQuery());
            disableAll(view.getjPanelDadosVoltas());
        }
    }
    
    public void trocaRodada(java.awt.event.ActionEvent evt){
        enableAll(view.getjPanelNovaQuery());
        if( view.getjRadioButtonRodada1().isSelected() ){
            view.getjComboBoxGanheiEnvido().setEnabled(false);
            view.getjComboBoxR1AceitouEnvido().setEnabled(false);
            view.getjComboBoxR1AceitouRetruco().setEnabled(false);
            view.getjComboBoxR1AceitouValeQuatro().setEnabled(false);
            view.getjComboBoxR1PediuEnvido().setEnabled(false);
            view.getjComboBoxR1PediuRetruco().setEnabled(false);
            view.getjComboBoxR1PediuValeQuatro().setEnabled(false);
        }
        if( view.getjRadioButtonRodada2().isSelected() ){
            view.getjComboBoxR1AceitouTruco().setEnabled(false);
            view.getjComboBoxR1PediuTruco().setEnabled(false);
            view.getjComboBoxR2AceitouRetruco().setEnabled(false);
            view.getjComboBoxR2PediuRetruco().setEnabled(false);
            view.getjComboBoxR2AceitouValeQuatro().setEnabled(false);
            view.getjComboBoxR2PediuValeQuatro().setEnabled(false);
            
            view.getjComboBoxGanheiEnvido().setEnabled(false);
            view.getjComboBoxR1AceitouEnvido().setEnabled(false);
            view.getjComboBoxR1AceitouRetruco().setEnabled(false);
            view.getjComboBoxR1AceitouValeQuatro().setEnabled(false);
            view.getjComboBoxR1PediuEnvido().setEnabled(false);
            view.getjComboBoxR1PediuRetruco().setEnabled(false);
            view.getjComboBoxR1PediuValeQuatro().setEnabled(false);
        }
        if( view.getjRadioButtonRodada3().isSelected() ){
            view.getjComboBoxR3AceitouRetruco().setEnabled(false);
            view.getjComboBoxR3PediuRetruco().setEnabled(false);
            view.getjComboBoxR3AceitouValeQuatro().setEnabled(false);
            view.getjComboBoxR3PediuValeQuatro().setEnabled(false);
            view.getjComboBoxR2AceitouTruco().setEnabled(false);
            view.getjComboBoxR2PediuTruco().setEnabled(false);
            
            
            view.getjComboBoxR1AceitouTruco().setEnabled(false);
            view.getjComboBoxR1PediuTruco().setEnabled(false);
            view.getjComboBoxR2AceitouRetruco().setEnabled(false);
            view.getjComboBoxR2PediuRetruco().setEnabled(false);
            view.getjComboBoxR2AceitouValeQuatro().setEnabled(false);
            view.getjComboBoxR2PediuValeQuatro().setEnabled(false);
            
            view.getjComboBoxGanheiEnvido().setEnabled(false);
            view.getjComboBoxR1AceitouEnvido().setEnabled(false);
            view.getjComboBoxR1AceitouRetruco().setEnabled(false);
            view.getjComboBoxR1AceitouValeQuatro().setEnabled(false);
            view.getjComboBoxR1PediuEnvido().setEnabled(false);
            view.getjComboBoxR1PediuRetruco().setEnabled(false);
            view.getjComboBoxR1PediuValeQuatro().setEnabled(false);
        }
        if(view.getjRadioButtonQueryRetruco().isSelected()
           && evt.getSource() == view.getjRadioButtonRodada1()){
            view.getjComboBoxR1AceitouRetruco().setEnabled(true);
            view.getjComboBoxR1PediuRetruco().setEnabled(true);
        }
        else if(view.getjRadioButtonQueryRetruco().isSelected()
           && evt.getSource() == view.getjRadioButtonRodada2()){
            view.getjComboBoxR2AceitouRetruco().setEnabled(true);
            view.getjComboBoxR2PediuRetruco().setEnabled(true);
            view.getjComboBoxR1AceitouTruco().setEnabled(true);
            view.getjComboBoxR1PediuTruco().setEnabled(true);
        }
        else if(view.getjRadioButtonQueryRetruco().isSelected()
           && evt.getSource() == view.getjRadioButtonRodada3()){
            view.getjComboBoxR2AceitouTruco().setEnabled(true);
            view.getjComboBoxR2PediuTruco().setEnabled(true);
            view.getjComboBoxR1AceitouTruco().setEnabled(true);
            view.getjComboBoxR1PediuTruco().setEnabled(true);
            view.getjComboBoxR3AceitouRetruco().setEnabled(true);
            view.getjComboBoxR3PediuRetruco().setEnabled(true);
        }
        if(view.getjRadioButtonQueryVale4().isSelected()
           && evt.getSource() == view.getjRadioButtonRodada1()){
            view.getjComboBoxR1AceitouTruco().setEnabled(true);
            view.getjComboBoxR1PediuTruco().setEnabled(true);
            view.getjComboBoxR1AceitouRetruco().setEnabled(true);
            view.getjComboBoxR1PediuRetruco().setEnabled(true);
            view.getjComboBoxR1AceitouValeQuatro().setEnabled(true);
            view.getjComboBoxR1PediuValeQuatro().setEnabled(true);
        }
        else if(view.getjRadioButtonQueryVale4().isSelected()
           && evt.getSource() == view.getjRadioButtonRodada2()){
            view.getjComboBoxR1AceitouTruco().setEnabled(true);
            view.getjComboBoxR1PediuTruco().setEnabled(true);
            view.getjComboBoxR1AceitouRetruco().setEnabled(true);
            view.getjComboBoxR1PediuRetruco().setEnabled(true);
            
            view.getjComboBoxR2AceitouTruco().setEnabled(true);
            view.getjComboBoxR2PediuTruco().setEnabled(true);
            view.getjComboBoxR2AceitouRetruco().setEnabled(true);
            view.getjComboBoxR2PediuRetruco().setEnabled(true);            
            view.getjComboBoxR2AceitouValeQuatro().setEnabled(true);
            view.getjComboBoxR2PediuValeQuatro().setEnabled(true);
        }
        else if(view.getjRadioButtonQueryVale4().isSelected()
           && evt.getSource() == view.getjRadioButtonRodada3()){
            view.getjComboBoxR1AceitouTruco().setEnabled(true);
            view.getjComboBoxR1PediuTruco().setEnabled(true);
            view.getjComboBoxR1AceitouRetruco().setEnabled(true);
            view.getjComboBoxR1PediuRetruco().setEnabled(true);            
            view.getjComboBoxR2AceitouTruco().setEnabled(true);
            view.getjComboBoxR2PediuTruco().setEnabled(true);
            view.getjComboBoxR2AceitouRetruco().setEnabled(true);
            view.getjComboBoxR2PediuRetruco().setEnabled(true);            
            
            view.getjComboBoxR3AceitouRetruco().setEnabled(true);
            view.getjComboBoxR3PediuRetruco().setEnabled(true);
            view.getjComboBoxR3AceitouValeQuatro().setEnabled(true);
            view.getjComboBoxR3PediuValeQuatro().setEnabled(true);
        }
        if(evt.getSource() == view.getjRadioButtonRodada1()){
            for(Component c : view.getjPanelDadosVoltas().getComponents()){
                if(c instanceof JPanel){
                    if( !((JPanel)c).getName().equals("Rodada1") ){
                       for(Component d :((JPanel)c).getComponents()){
                           if(d instanceof JComboBox)
                               d.setEnabled(false);
                       }
                    }
                }
            }
        }
        if(evt.getSource() == view.getjRadioButtonRodada2()){
            for(Component c : view.getjPanelDadosVoltas().getComponents()){
                if(c instanceof JPanel){
                    if( ((JPanel)c).getName().equals("Rodada3") ){
                       for(Component d :((JPanel)c).getComponents()){
                           if(d instanceof JComboBox)
                               d.setEnabled(false);
                       }
                    }
                }
            }
        }
    }
    
    public void selecionaCaso(){
        int row = view.getjTableTodosOsCasos().getSelectedRow();
        if (row >= 0) {
            DescCaso dc = tabelaCasos.select(row);
            System.out.println("Caso de id " + dc.getCasoId() + " selecionado");
            
            CasoGUI casoView = new CasoGUI(dc);
            casoView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            casoView.setVisible(true);
        }
    }
    
}
