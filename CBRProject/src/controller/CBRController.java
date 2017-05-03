package controller;

import gui.CasoGUI;
import gui.MainGUI;
import javax.swing.JFrame;
import representation.DescCaso;
import representation.TableModelCaso;

/**
 *
 * @author Zilly
 */
public class CBRController {
    
    private MainGUI view;
    private TableModelCaso tabelaCasos;

    public CBRController(MainGUI view, TableModelCaso tabelaCasos) {
        this.view = view;
        this.tabelaCasos = tabelaCasos;
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
