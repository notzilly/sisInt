package controller;

import cbr.CBRApplication;
import gui.CasoGUI;
import gui.MainGUI;
import java.awt.Component;
import java.awt.Container;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.exception.ExecutionException;
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
            //JOptionPane.showMessageDialog(view, "Clicou no radio button geral");
            enableAll(view.getjPanelNovaQuery());
        }
        else if(evt.getSource() == view.getjRadioButtonQueryEnvido()){
            view.getjRadioButtonRodada2().setEnabled(false);
            view.getjRadioButtonRodada3().setEnabled(false);
            view.getjComboBoxGanheiVolta().setEnabled(false);
            view.getjComboBoxPontosAdv().setEnabled(false);
            view.getjComboBoxPontosMeus().setEnabled(false);
            view.getjComboBoxGanheiEnvido().setSelectedIndex(2);
            
        }
        else if(evt.getSource() == view.getjRadioButtonQueryVale4()){
            JOptionPane.showMessageDialog(view, "Clicou no radio button vale 4");
        }
    }
    
    public void trocaRodada(java.awt.event.ActionEvent evt){
        if(evt.getSource() == view.getjRadioButtonRodada1()){
            JOptionPane.showMessageDialog(view, "Clicou no radio button geral");
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
