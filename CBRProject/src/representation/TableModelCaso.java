package representation;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Zilly
 */
public class TableModelCaso extends AbstractTableModel {

    // Lista de casos
    private ArrayList<DescCaso> casos;

    // Array com os nomes das colunas da tabela
    private static final String[] nomeColunas = {"ID", "Carta 1", "Carta2", "Carta3", "R1CartaMinha", "R1CartaAdv", "R1PediuEnvido", "R1AceitouEnvido", "R1PediuTruco", 
        "R1AceitouTruco", "R1PediuRetruco", "R1AceitouRetruco", "R1PediuValeQuatro", "R1AceitouValeQuatro", "R2CartaMinha", "R2CartaAdv", "R2PediuEnvido" , "R2AceitouEnvido",
        "R2PediuTruco", "R2AceitouTruco", "R2PediuRetruco", "R2AceitouRetruco", "R2PediuValeQuatro", "R2AceitouValeQuatro", "R3CartaMinha", "R3CartaAdv", "R3PediuEnvido" ,
        "R3AceitouEnvido", "R3PediuTruco", "R3AceitouTruco", "R3PediuRetruco", "R3AceitouRetruco", "R3PediuValeQuatro", "R3AceitouValeQuatro", "PontosMeus", "PontosAdv"};

    
    //Construtor Padrão
    public TableModelCaso(){
        casos = new ArrayList();
    }
    
    //Construtor alternativo
    public TableModelCaso(ArrayList<DescCaso> listCasos){
        this.casos = listCasos;
    }
    
    //Pega o nome de uma coluna da tabela
    @Override
    public String getColumnName(int columnIndex) {
        return nomeColunas[columnIndex];
    }
    
    //Retorna o número de linhas da tabela
    @Override
    public int getRowCount() {
        return casos.size();
    }

    //Retorna o número de colunas da tabela
    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
    
}
