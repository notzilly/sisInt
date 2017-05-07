package controller;

import gui.CasoGUI;
import gui.MainGUI;
import java.util.LinkedList;
import javax.swing.JFrame;
import jcolibri.cbrcore.CBRCase;
import representation.DescCaso;
import representation.TableModelCaso;

/**
 *
 * @author Zilly
 */
public class CBRController {
    
    private MainGUI view;
    private TableModelCaso tabelaCasos;

    public CBRController(LinkedList<CBRCase> casos) {
        this.tabelaCasos = new TableModelCaso(casos);
        this.view = new MainGUI(tabelaCasos, this);
        this.view.setVisible(true);
        this.view.setExtendedState(this.view.getExtendedState() | JFrame.MAXIMIZED_BOTH);
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
