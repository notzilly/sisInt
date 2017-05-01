package representation;

import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;
import jcolibri.cbrcore.CBRCase;

/**
 *
 * @author Zilly
 */
public class TableModelCaso extends AbstractTableModel {

    // Lista de casos
    private LinkedList<CBRCase> casos;

    // Array com os nomes das colunas da tabela
    private static final String[] nomeColunas = {"ID", "Carta 1", "Carta2", "Carta3", "R1CartaMinha", "R1CartaAdv", "R1PediuEnvido", "R1AceitouEnvido", "R1PediuTruco", 
        "R1AceitouTruco", "R1PediuRetruco", "R1AceitouRetruco", "R1PediuValeQuatro", "R1AceitouValeQuatro", "R2CartaMinha", "R2CartaAdv", "R2PediuEnvido" , "R2AceitouEnvido",
        "R2PediuTruco", "R2AceitouTruco", "R2PediuRetruco", "R2AceitouRetruco", "R2PediuValeQuatro", "R2AceitouValeQuatro", "R3CartaMinha", "R3CartaAdv", "R3PediuEnvido" ,
        "R3AceitouEnvido", "R3PediuTruco", "R3AceitouTruco", "R3PediuRetruco", "R3AceitouRetruco", "R3PediuValeQuatro", "R3AceitouValeQuatro", "PontosMeus", "PontosAdv"};

    
    //Construtor Padrão
    public TableModelCaso(){
        casos = new LinkedList<CBRCase>();
    }
    
    //Construtor alternativo
    public TableModelCaso(LinkedList<CBRCase> listCasos){
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

    //Retorna o valor da célula acessada por rowIndex de columnIndex
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CBRCase c = casos.get(rowIndex);
        DescCaso dc = (DescCaso) c.getDescription();
        switch (columnIndex) {
            case 0:
                return dc.getCasoId();
            case 1:
                return dc.getCarta1();
            case 2:
                return dc.getCarta2();
            case 3:
                return dc.getCarta3();
            case 4:
                return dc.getR1CartaMinha();
            case 5:
                return dc.getR1CartaAdv();
            case 6:
                return dc.getR1PediuEnvido();
            case 7:
                return dc.getR1AceitouEnvido();
            case 8:
                return dc.getR1PediuTruco();
            case 9:
                return dc.getR1AceitouTruco();
            case 10:
                return dc.getR1PediuRetruco();
            case 11:
                return dc.getR1AceitouRetruco();
            case 12:
                return dc.getR1PediuValeQuatro();
            case 13:
                return dc.getR1AceitouValeQuatro();
            case 14:
                return dc.getR2CartaMinha();
            case 15:
                return dc.getR2CartaAdv();
            case 16:
                return dc.getR2PediuEnvido();
            case 17:
                return dc.getR2AceitouEnvido();
            case 18:
                return dc.getR2PediuTruco();
            case 19:
                return dc.getR2AceitouTruco();
            case 20:
                return dc.getR2PediuRetruco();
            case 21:
                return dc.getR2AceitouRetruco();
            case 22:
                return dc.getR2PediuValeQuatro();
            case 23:
                return dc.getR2AceitouValeQuatro();
            case 24:
                return dc.getR3CartaMinha();
            case 25:
                return dc.getR3CartaAdv();
            case 26:
                return dc.getR3PediuEnvido();
            case 27:
                return dc.getR3AceitouEnvido();
            case 28:
                return dc.getR3PediuTruco();
            case 29:
                return dc.getR3AceitouTruco();
            case 30:
                return dc.getR3PediuRetruco();
            case 31:
                return dc.getR3AceitouRetruco();
            case 32:
                return dc.getR3PediuValeQuatro();
            case 33:
                return dc.getR3AceitouValeQuatro();
            case 34:
                return dc.getPontosMeus();
            case 35:
                return dc.getPontosAdv();
        }
        return null;
    }
    
}
