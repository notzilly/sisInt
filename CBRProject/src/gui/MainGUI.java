package gui;

import controller.CBRController;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import representation.TableModelCaso;

/**
 *
 * @author Zilly
 */
public class MainGUI extends javax.swing.JFrame {

    private CBRController controller;
    private TableModelCaso tabelaCasos;
    
    /**
     * Creates new form MainGUI
     * @param tabelaCasos
     * @param controller
     */
    public MainGUI(TableModelCaso tabelaCasos, CBRController controller) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        
        this.tabelaCasos = tabelaCasos;
        this.controller = controller;
        
        initComponents();
    }

   public JTable getjTableTodosOsCasos() {
        return jTableTodosOsCasos;
    }
   
   public JPanel getjPanelNovaQuery(){
       return jPanelNovaQuery;
   }

    // Radio Buttons do tipo de query
    public JRadioButton getjRadioButtonQueryEnvido() {
        return jRadioButtonQueryEnvido;
    }

    public JRadioButton getjRadioButtonQueryGeral() {
        return jRadioButtonQueryGeral;
    }

    public JRadioButton getjRadioButtonQueryRetruco() {
        return jRadioButtonQueryRetruco;
    }

    public JRadioButton getjRadioButtonQueryTruco() {
        return jRadioButtonQueryTruco;
    }

    public JRadioButton getjRadioButtonQueryVale4() {
        return jRadioButtonQueryVale4;
    }

    // Radio Buttons da rodada
    public JRadioButton getjRadioButtonRodada1() {
        return jRadioButtonRodada1;
    }

    public JRadioButton getjRadioButtonRodada2() {
        return jRadioButtonRodada2;
    }

    public JRadioButton getjRadioButtonRodada3() {
        return jRadioButtonRodada3;
    }

    // Combo boxes das cartas da mão
    public JComboBox getjComboBoxCarta1() {
        return jComboBoxCarta1;
    }

    public JComboBox getjComboBoxCarta2() {
        return jComboBoxCarta2;
    }

    public JComboBox getjComboBoxCarta3() {
        return jComboBoxCarta3;
    }
    
    // Combo boxes de dados da volta
    public JComboBox getjComboBoxGanheiEnvido() {
        return jComboBoxGanheiEnvido;
    }

    public JComboBox getjComboBoxGanheiVolta() {
        return jComboBoxGanheiVolta;
    }

    public JComboBox getjComboBoxPontosAdv() {
        return jComboBoxPontosAdv;
    }

    public JComboBox getjComboBoxPontosMeus() {
        return jComboBoxPontosMeus;
    }
    
    // Getters da rodada 1
    public JComboBox getjComboBoxR1AceitouEnvido() {
        return jComboBoxR1AceitouEnvido;
    }

    public JComboBox getjComboBoxR1AceitouRetruco() {
        return jComboBoxR1AceitouRetruco;
    }

    public JComboBox getjComboBoxR1AceitouTruco() {
        return jComboBoxR1AceitouTruco;
    }

    public JComboBox getjComboBoxR1AceitouValeQuatro() {
        return jComboBoxR1AceitouValeQuatro;
    }

    public JComboBox getjComboBoxR1CartaAdv() {
        return jComboBoxR1CartaAdv;
    }

    public JComboBox getjComboBoxR1CartaMinha() {
        return jComboBoxR1CartaMinha;
    }

    public JComboBox getjComboBoxR1PediuEnvido() {
        return jComboBoxR1PediuEnvido;
    }

    public JComboBox getjComboBoxR1PediuRetruco() {
        return jComboBoxR1PediuRetruco;
    }

    public JComboBox getjComboBoxR1PediuTruco() {
        return jComboBoxR1PediuTruco;
    }

    public JComboBox getjComboBoxR1PediuValeQuatro() {
        return jComboBoxR1PediuValeQuatro;
    }
    
    // Getters da rodada 2
    public JComboBox getjComboBoxR2AceitouRetruco() {
        return jComboBoxR2AceitouRetruco;
    }

    public JComboBox getjComboBoxR2AceitouTruco() {
        return jComboBoxR2AceitouTruco;
    }

    public JComboBox getjComboBoxR2AceitouValeQuatro() {
        return jComboBoxR2AceitouValeQuatro;
    }

    public JComboBox getjComboBoxR2CartaAdv() {
        return jComboBoxR2CartaAdv;
    }

    public JComboBox getjComboBoxR2CartaMinha() {
        return jComboBoxR2CartaMinha;
    }

    public JComboBox getjComboBoxR2PediuRetruco() {
        return jComboBoxR2PediuRetruco;
    }

    public JComboBox getjComboBoxR2PediuTruco() {
        return jComboBoxR2PediuTruco;
    }

    public JComboBox getjComboBoxR2PediuValeQuatro() {
        return jComboBoxR2PediuValeQuatro;
    }
    
    // Getters da rodada 3
    public JComboBox getjComboBoxR3AceitouRetruco() {
        return jComboBoxR3AceitouRetruco;
    }

    public JComboBox getjComboBoxR3AceitouTruco() {
        return jComboBoxR3AceitouTruco;
    }

    public JComboBox getjComboBoxR3AceitouValeQuatro() {
        return jComboBoxR3AceitouValeQuatro;
    }

    public JComboBox getjComboBoxR3CartaAdv() {
        return jComboBoxR3CartaAdv;
    }

    public JComboBox getjComboBoxR3CartaMinha() {
        return jComboBoxR3CartaMinha;
    }

    public JComboBox getjComboBoxR3PediuRetruco() {
        return jComboBoxR3PediuRetruco;
    }

    public JComboBox getjComboBoxR3PediuTruco() {
        return jComboBoxR3PediuTruco;
    }

    public JComboBox getjComboBoxR3PediuValeQuatro() {
        return jComboBoxR3PediuValeQuatro;
    }
    
    public JPanel getjPanelDadosVoltas(){
        return jPanelDadosVolta;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroupTipoQuery = new javax.swing.ButtonGroup();
        buttonGroupRodada = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelNovaQuery = new javax.swing.JPanel();
        jPanelTipoQuery = new javax.swing.JPanel();
        jRadioButtonQueryRetruco = new javax.swing.JRadioButton();
        jRadioButtonQueryVale4 = new javax.swing.JRadioButton();
        jRadioButtonQueryTruco = new javax.swing.JRadioButton();
        jRadioButtonQueryEnvido = new javax.swing.JRadioButton();
        jRadioButtonQueryGeral = new javax.swing.JRadioButton();
        jPanelRodada = new javax.swing.JPanel();
        jRadioButtonRodada1 = new javax.swing.JRadioButton();
        jRadioButtonRodada2 = new javax.swing.JRadioButton();
        jRadioButtonRodada3 = new javax.swing.JRadioButton();
        jPanelDadosVolta = new javax.swing.JPanel();
        jLabelCarta1 = new javax.swing.JLabel();
        jComboBoxCarta1 = new javax.swing.JComboBox();
        jLabelCarta2 = new javax.swing.JLabel();
        jComboBoxCarta2 = new javax.swing.JComboBox();
        jLabelCarta3 = new javax.swing.JLabel();
        jComboBoxCarta3 = new javax.swing.JComboBox();
        jLabelGanheiEnvido = new javax.swing.JLabel();
        jLabelGanheiVolta = new javax.swing.JLabel();
        jComboBoxGanheiEnvido = new javax.swing.JComboBox();
        jComboBoxGanheiVolta = new javax.swing.JComboBox();
        jLabelPontosMeus = new javax.swing.JLabel();
        jLabelPontosAdv = new javax.swing.JLabel();
        jComboBoxPontosMeus = new javax.swing.JComboBox();
        jComboBoxPontosAdv = new javax.swing.JComboBox();
        jPanelRodada1 = new javax.swing.JPanel();
        jLabelR1CartaMinha = new javax.swing.JLabel();
        jLabelR1CartaAdv = new javax.swing.JLabel();
        jLabelR1PediuEnvido = new javax.swing.JLabel();
        jLabelR1AceitouEnvido = new javax.swing.JLabel();
        jLabelR1PediuTruco = new javax.swing.JLabel();
        jLabelR1AceitouTruco = new javax.swing.JLabel();
        jLabelR1PediuRetruco = new javax.swing.JLabel();
        jLabelR1AceitouRetruco = new javax.swing.JLabel();
        jLabelR1PediuValeQuatro = new javax.swing.JLabel();
        jLabelR1AceitouValeQuatro = new javax.swing.JLabel();
        jComboBoxR1CartaMinha = new javax.swing.JComboBox();
        jComboBoxR1CartaAdv = new javax.swing.JComboBox();
        jComboBoxR1PediuEnvido = new javax.swing.JComboBox();
        jComboBoxR1AceitouEnvido = new javax.swing.JComboBox();
        jComboBoxR1AceitouRetruco = new javax.swing.JComboBox();
        jComboBoxR1PediuRetruco = new javax.swing.JComboBox();
        jComboBoxR1PediuTruco = new javax.swing.JComboBox();
        jComboBoxR1AceitouValeQuatro = new javax.swing.JComboBox();
        jComboBoxR1AceitouTruco = new javax.swing.JComboBox();
        jComboBoxR1PediuValeQuatro = new javax.swing.JComboBox();
        jPanelRodada2 = new javax.swing.JPanel();
        jLabelR1CartaMinha1 = new javax.swing.JLabel();
        jLabelR1CartaAdv1 = new javax.swing.JLabel();
        jLabelR1PediuTruco1 = new javax.swing.JLabel();
        jLabelR1AceitouTruco1 = new javax.swing.JLabel();
        jLabelR1PediuRetruco1 = new javax.swing.JLabel();
        jLabelR1AceitouRetruco1 = new javax.swing.JLabel();
        jLabelR1PediuValeQuatro1 = new javax.swing.JLabel();
        jLabelR1AceitouValeQuatro1 = new javax.swing.JLabel();
        jComboBoxR2CartaMinha = new javax.swing.JComboBox();
        jComboBoxR2CartaAdv = new javax.swing.JComboBox();
        jComboBoxR2AceitouRetruco = new javax.swing.JComboBox();
        jComboBoxR2PediuRetruco = new javax.swing.JComboBox();
        jComboBoxR2PediuTruco = new javax.swing.JComboBox();
        jComboBoxR2AceitouValeQuatro = new javax.swing.JComboBox();
        jComboBoxR2AceitouTruco = new javax.swing.JComboBox();
        jComboBoxR2PediuValeQuatro = new javax.swing.JComboBox();
        jPanelRodada3 = new javax.swing.JPanel();
        jLabelR1CartaMinha2 = new javax.swing.JLabel();
        jLabelR1CartaAdv2 = new javax.swing.JLabel();
        jLabelR1PediuTruco2 = new javax.swing.JLabel();
        jLabelR1AceitouTruco2 = new javax.swing.JLabel();
        jLabelR1PediuRetruco2 = new javax.swing.JLabel();
        jLabelR1AceitouRetruco2 = new javax.swing.JLabel();
        jLabelR1PediuValeQuatro2 = new javax.swing.JLabel();
        jLabelR1AceitouValeQuatro2 = new javax.swing.JLabel();
        jComboBoxR3CartaMinha = new javax.swing.JComboBox();
        jComboBoxR3CartaAdv = new javax.swing.JComboBox();
        jComboBoxR3AceitouRetruco = new javax.swing.JComboBox();
        jComboBoxR3PediuRetruco = new javax.swing.JComboBox();
        jComboBoxR3PediuTruco = new javax.swing.JComboBox();
        jComboBoxR3AceitouValeQuatro = new javax.swing.JComboBox();
        jComboBoxR3AceitouTruco = new javax.swing.JComboBox();
        jComboBoxR3PediuValeQuatro = new javax.swing.JComboBox();
        jButtonRodarConsulta = new javax.swing.JButton();
        jPanelTodosOsCasos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTodosOsCasos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTipoQuery.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Consulta", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        buttonGroupTipoQuery.add(jRadioButtonQueryRetruco);
        jRadioButtonQueryRetruco.setText("Retruco");
        jRadioButtonQueryRetruco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCategoriaActionPerformed(evt);
            }
        });

        buttonGroupTipoQuery.add(jRadioButtonQueryVale4);
        jRadioButtonQueryVale4.setText("Vale Quatro");
        jRadioButtonQueryVale4.setToolTipText("");
        jRadioButtonQueryVale4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCategoriaActionPerformed(evt);
            }
        });

        buttonGroupTipoQuery.add(jRadioButtonQueryTruco);
        jRadioButtonQueryTruco.setText("Truco");
        jRadioButtonQueryTruco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCategoriaActionPerformed(evt);
            }
        });

        buttonGroupTipoQuery.add(jRadioButtonQueryEnvido);
        jRadioButtonQueryEnvido.setText("Envido");
        jRadioButtonQueryEnvido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCategoriaActionPerformed(evt);
            }
        });

        buttonGroupTipoQuery.add(jRadioButtonQueryGeral);
        jRadioButtonQueryGeral.setText("Geral");
        jRadioButtonQueryGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTipoQueryLayout = new javax.swing.GroupLayout(jPanelTipoQuery);
        jPanelTipoQuery.setLayout(jPanelTipoQueryLayout);
        jPanelTipoQueryLayout.setHorizontalGroup(
            jPanelTipoQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoQueryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonQueryTruco)
                    .addComponent(jRadioButtonQueryRetruco)
                    .addComponent(jRadioButtonQueryVale4)
                    .addComponent(jRadioButtonQueryGeral)
                    .addComponent(jRadioButtonQueryEnvido))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTipoQueryLayout.setVerticalGroup(
            jPanelTipoQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoQueryLayout.createSequentialGroup()
                .addComponent(jRadioButtonQueryGeral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonQueryEnvido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonQueryTruco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonQueryRetruco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonQueryVale4))
        );

        jPanelRodada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rodada", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        buttonGroupRodada.add(jRadioButtonRodada1);
        jRadioButtonRodada1.setText("Rodada 1");
        jRadioButtonRodada1.setEnabled(false);
        jRadioButtonRodada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRodadaActionPerformed(evt);
            }
        });

        buttonGroupRodada.add(jRadioButtonRodada2);
        jRadioButtonRodada2.setText("Rodada 2");
        jRadioButtonRodada2.setEnabled(false);
        jRadioButtonRodada2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRodadaActionPerformed(evt);
            }
        });

        buttonGroupRodada.add(jRadioButtonRodada3);
        jRadioButtonRodada3.setText("Rodada 3");
        jRadioButtonRodada3.setEnabled(false);
        jRadioButtonRodada3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRodadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRodadaLayout = new javax.swing.GroupLayout(jPanelRodada);
        jPanelRodada.setLayout(jPanelRodadaLayout);
        jPanelRodadaLayout.setHorizontalGroup(
            jPanelRodadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRodadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonRodada1)
                    .addComponent(jRadioButtonRodada3)
                    .addComponent(jRadioButtonRodada2))
                .addContainerGap())
        );
        jPanelRodadaLayout.setVerticalGroup(
            jPanelRodadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodadaLayout.createSequentialGroup()
                .addComponent(jRadioButtonRodada1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonRodada2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonRodada3))
        );

        jPanelDadosVolta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanelDadosVolta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabelCarta1.setText("Carta 1");

        jComboBoxCarta1.setMaximumRowCount(15);
        jComboBoxCarta1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" }));
        jComboBoxCarta1.setEnabled(false);

        jLabelCarta2.setText("Carta 2");

        jComboBoxCarta2.setMaximumRowCount(15);
        jComboBoxCarta2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" }));
        jComboBoxCarta2.setEnabled(false);

        jLabelCarta3.setText("Carta 3");

        jComboBoxCarta3.setMaximumRowCount(15);
        jComboBoxCarta3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" }));
        jComboBoxCarta3.setEnabled(false);

        jLabelGanheiEnvido.setText("Ganhei Envido");

        jLabelGanheiVolta.setText("Ganhei Volta");

        jComboBoxGanheiEnvido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxGanheiEnvido.setEnabled(false);

        jComboBoxGanheiVolta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não", "Sim" }));
        jComboBoxGanheiVolta.setEnabled(false);

        jLabelPontosMeus.setText("Pontos Meus");

        jLabelPontosAdv.setText("Pontos Adv");

        jComboBoxPontosMeus.setMaximumRowCount(15);
        jComboBoxPontosMeus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jComboBoxPontosMeus.setEnabled(false);

        jComboBoxPontosAdv.setMaximumRowCount(15);
        jComboBoxPontosAdv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jComboBoxPontosAdv.setEnabled(false);

        jPanelRodada1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rodada 1", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonGroupRodada, org.jdesktop.beansbinding.ELProperty.create("Rodada1"), jPanelRodada1, org.jdesktop.beansbinding.BeanProperty.create("name"));
        bindingGroup.addBinding(binding);

        jLabelR1CartaMinha.setText("Carta Minha");

        jLabelR1CartaAdv.setText("Carta Adv");

        jLabelR1PediuEnvido.setText("Pediu Envido");

        jLabelR1AceitouEnvido.setText("Aceitou Envido");

        jLabelR1PediuTruco.setText("Pediu Truco");

        jLabelR1AceitouTruco.setText("Aceitou Truco");

        jLabelR1PediuRetruco.setText("Pediu Retruco");

        jLabelR1AceitouRetruco.setText("Aceitou Retruco");

        jLabelR1PediuValeQuatro.setText("Pediu Vale Quatro");

        jLabelR1AceitouValeQuatro.setText("Aceitou Vale Quatro");

        jComboBoxR1CartaMinha.setMaximumRowCount(15);
        jComboBoxR1CartaMinha.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" }));
        jComboBoxR1CartaMinha.setEnabled(false);

        jComboBoxR1CartaAdv.setMaximumRowCount(15);
        jComboBoxR1CartaAdv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" }));
        jComboBoxR1CartaAdv.setEnabled(false);

        jComboBoxR1PediuEnvido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR1PediuEnvido.setEnabled(false);

        jComboBoxR1AceitouEnvido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR1AceitouEnvido.setEnabled(false);

        jComboBoxR1AceitouRetruco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR1AceitouRetruco.setEnabled(false);

        jComboBoxR1PediuRetruco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR1PediuRetruco.setEnabled(false);

        jComboBoxR1PediuTruco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR1PediuTruco.setEnabled(false);

        jComboBoxR1AceitouValeQuatro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR1AceitouValeQuatro.setEnabled(false);

        jComboBoxR1AceitouTruco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR1AceitouTruco.setEnabled(false);

        jComboBoxR1PediuValeQuatro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR1PediuValeQuatro.setEnabled(false);

        javax.swing.GroupLayout jPanelRodada1Layout = new javax.swing.GroupLayout(jPanelRodada1);
        jPanelRodada1.setLayout(jPanelRodada1Layout);
        jPanelRodada1Layout.setHorizontalGroup(
            jPanelRodada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodada1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRodada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRodada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRodada1Layout.createSequentialGroup()
                            .addComponent(jLabelR1CartaAdv)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxR1CartaAdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRodada1Layout.createSequentialGroup()
                            .addComponent(jLabelR1CartaMinha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                            .addComponent(jComboBoxR1CartaMinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelRodada1Layout.createSequentialGroup()
                        .addComponent(jLabelR1PediuEnvido)
                        .addGap(77, 77, 77)
                        .addComponent(jComboBoxR1PediuEnvido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRodada1Layout.createSequentialGroup()
                        .addGroup(jPanelRodada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelR1AceitouEnvido)
                            .addComponent(jLabelR1PediuTruco)
                            .addComponent(jLabelR1AceitouTruco)
                            .addComponent(jLabelR1PediuRetruco)
                            .addComponent(jLabelR1AceitouRetruco)
                            .addComponent(jLabelR1PediuValeQuatro))
                        .addGap(52, 52, 52)
                        .addGroup(jPanelRodada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxR1PediuValeQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxR1AceitouRetruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxR1PediuRetruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxR1AceitouTruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxR1PediuTruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxR1AceitouEnvido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelRodada1Layout.createSequentialGroup()
                        .addComponent(jLabelR1AceitouValeQuatro)
                        .addGap(42, 42, 42)
                        .addComponent(jComboBoxR1AceitouValeQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelRodada1Layout.setVerticalGroup(
            jPanelRodada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodada1Layout.createSequentialGroup()
                .addGroup(jPanelRodada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1CartaMinha)
                    .addComponent(jComboBoxR1CartaMinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanelRodada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1CartaAdv)
                    .addComponent(jComboBoxR1CartaAdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1PediuEnvido)
                    .addComponent(jComboBoxR1PediuEnvido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelRodada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1AceitouEnvido)
                    .addComponent(jComboBoxR1AceitouEnvido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelRodada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1PediuTruco)
                    .addComponent(jComboBoxR1PediuTruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1AceitouTruco)
                    .addComponent(jComboBoxR1AceitouTruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1PediuRetruco)
                    .addComponent(jComboBoxR1PediuRetruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1AceitouRetruco)
                    .addComponent(jComboBoxR1AceitouRetruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1PediuValeQuatro)
                    .addComponent(jComboBoxR1PediuValeQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1AceitouValeQuatro)
                    .addComponent(jComboBoxR1AceitouValeQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelRodada2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rodada 2", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonGroupRodada, org.jdesktop.beansbinding.ELProperty.create("Rodada2"), jPanelRodada2, org.jdesktop.beansbinding.BeanProperty.create("name"));
        bindingGroup.addBinding(binding);

        jLabelR1CartaMinha1.setText("Carta Minha");

        jLabelR1CartaAdv1.setText("Carta Adv");

        jLabelR1PediuTruco1.setText("Pediu Truco");

        jLabelR1AceitouTruco1.setText("Aceitou Truco");

        jLabelR1PediuRetruco1.setText("Pediu Retruco");

        jLabelR1AceitouRetruco1.setText("Aceitou Retruco");

        jLabelR1PediuValeQuatro1.setText("Pediu Vale Quatro");

        jLabelR1AceitouValeQuatro1.setText("Aceitou Vale Quatro");

        jComboBoxR2CartaMinha.setMaximumRowCount(15);
        jComboBoxR2CartaMinha.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" }));
        jComboBoxR2CartaMinha.setEnabled(false);

        jComboBoxR2CartaAdv.setMaximumRowCount(15);
        jComboBoxR2CartaAdv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" }));
        jComboBoxR2CartaAdv.setEnabled(false);

        jComboBoxR2AceitouRetruco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR2AceitouRetruco.setEnabled(false);

        jComboBoxR2PediuRetruco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR2PediuRetruco.setEnabled(false);

        jComboBoxR2PediuTruco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR2PediuTruco.setEnabled(false);

        jComboBoxR2AceitouValeQuatro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR2AceitouValeQuatro.setEnabled(false);

        jComboBoxR2AceitouTruco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR2AceitouTruco.setEnabled(false);

        jComboBoxR2PediuValeQuatro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR2PediuValeQuatro.setEnabled(false);

        javax.swing.GroupLayout jPanelRodada2Layout = new javax.swing.GroupLayout(jPanelRodada2);
        jPanelRodada2.setLayout(jPanelRodada2Layout);
        jPanelRodada2Layout.setHorizontalGroup(
            jPanelRodada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodada2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRodada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRodada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRodada2Layout.createSequentialGroup()
                            .addComponent(jLabelR1CartaAdv1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxR2CartaAdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRodada2Layout.createSequentialGroup()
                            .addComponent(jLabelR1CartaMinha1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                            .addComponent(jComboBoxR2CartaMinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelRodada2Layout.createSequentialGroup()
                        .addGroup(jPanelRodada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelR1PediuTruco1)
                            .addComponent(jLabelR1AceitouTruco1)
                            .addComponent(jLabelR1PediuRetruco1)
                            .addComponent(jLabelR1AceitouRetruco1)
                            .addComponent(jLabelR1PediuValeQuatro1))
                        .addGap(52, 52, 52)
                        .addGroup(jPanelRodada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxR2PediuValeQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxR2AceitouRetruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxR2PediuRetruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxR2AceitouTruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxR2PediuTruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelRodada2Layout.createSequentialGroup()
                        .addComponent(jLabelR1AceitouValeQuatro1)
                        .addGap(42, 42, 42)
                        .addComponent(jComboBoxR2AceitouValeQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRodada2Layout.setVerticalGroup(
            jPanelRodada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodada2Layout.createSequentialGroup()
                .addGroup(jPanelRodada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1CartaMinha1)
                    .addComponent(jComboBoxR2CartaMinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanelRodada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1CartaAdv1)
                    .addComponent(jComboBoxR2CartaAdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1PediuTruco1)
                    .addComponent(jComboBoxR2PediuTruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1AceitouTruco1)
                    .addComponent(jComboBoxR2AceitouTruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1PediuRetruco1)
                    .addComponent(jComboBoxR2PediuRetruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1AceitouRetruco1)
                    .addComponent(jComboBoxR2AceitouRetruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1PediuValeQuatro1)
                    .addComponent(jComboBoxR2PediuValeQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1AceitouValeQuatro1)
                    .addComponent(jComboBoxR2AceitouValeQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelRodada3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rodada 3", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonGroupRodada, org.jdesktop.beansbinding.ELProperty.create("Rodada3"), jPanelRodada3, org.jdesktop.beansbinding.BeanProperty.create("name"));
        bindingGroup.addBinding(binding);

        jLabelR1CartaMinha2.setText("Carta Minha");

        jLabelR1CartaAdv2.setText("Carta Adv");

        jLabelR1PediuTruco2.setText("Pediu Truco");

        jLabelR1AceitouTruco2.setText("Aceitou Truco");

        jLabelR1PediuRetruco2.setText("Pediu Retruco");

        jLabelR1AceitouRetruco2.setText("Aceitou Retruco");

        jLabelR1PediuValeQuatro2.setText("Pediu Vale Quatro");

        jLabelR1AceitouValeQuatro2.setText("Aceitou Vale Quatro");

        jComboBoxR3CartaMinha.setMaximumRowCount(15);
        jComboBoxR3CartaMinha.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" }));
        jComboBoxR3CartaMinha.setEnabled(false);

        jComboBoxR3CartaAdv.setMaximumRowCount(15);
        jComboBoxR3CartaAdv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" }));
        jComboBoxR3CartaAdv.setEnabled(false);

        jComboBoxR3AceitouRetruco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR3AceitouRetruco.setEnabled(false);

        jComboBoxR3PediuRetruco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR3PediuRetruco.setEnabled(false);

        jComboBoxR3PediuTruco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR3PediuTruco.setEnabled(false);

        jComboBoxR3AceitouValeQuatro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR3AceitouValeQuatro.setEnabled(false);

        jComboBoxR3AceitouTruco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR3AceitouTruco.setEnabled(false);

        jComboBoxR3PediuValeQuatro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não teve", "Não", "Sim" }));
        jComboBoxR3PediuValeQuatro.setEnabled(false);

        javax.swing.GroupLayout jPanelRodada3Layout = new javax.swing.GroupLayout(jPanelRodada3);
        jPanelRodada3.setLayout(jPanelRodada3Layout);
        jPanelRodada3Layout.setHorizontalGroup(
            jPanelRodada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodada3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRodada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRodada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRodada3Layout.createSequentialGroup()
                            .addComponent(jLabelR1CartaAdv2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxR3CartaAdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRodada3Layout.createSequentialGroup()
                            .addComponent(jLabelR1CartaMinha2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                            .addComponent(jComboBoxR3CartaMinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelRodada3Layout.createSequentialGroup()
                        .addGroup(jPanelRodada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelR1PediuTruco2)
                            .addComponent(jLabelR1AceitouTruco2)
                            .addComponent(jLabelR1PediuRetruco2)
                            .addComponent(jLabelR1AceitouRetruco2)
                            .addComponent(jLabelR1PediuValeQuatro2))
                        .addGap(52, 52, 52)
                        .addGroup(jPanelRodada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxR3PediuValeQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxR3AceitouRetruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxR3PediuRetruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxR3AceitouTruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxR3PediuTruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelRodada3Layout.createSequentialGroup()
                        .addComponent(jLabelR1AceitouValeQuatro2)
                        .addGap(42, 42, 42)
                        .addComponent(jComboBoxR3AceitouValeQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelRodada3Layout.setVerticalGroup(
            jPanelRodada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodada3Layout.createSequentialGroup()
                .addGroup(jPanelRodada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1CartaMinha2)
                    .addComponent(jComboBoxR3CartaMinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanelRodada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1CartaAdv2)
                    .addComponent(jComboBoxR3CartaAdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1PediuTruco2)
                    .addComponent(jComboBoxR3PediuTruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1AceitouTruco2)
                    .addComponent(jComboBoxR3AceitouTruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1PediuRetruco2)
                    .addComponent(jComboBoxR3PediuRetruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1AceitouRetruco2)
                    .addComponent(jComboBoxR3AceitouRetruco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1PediuValeQuatro2)
                    .addComponent(jComboBoxR3PediuValeQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRodada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelR1AceitouValeQuatro2)
                    .addComponent(jComboBoxR3AceitouValeQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonRodarConsulta.setText("Rodar Consulta");
        jButtonRodarConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRodarConsultaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosVoltaLayout = new javax.swing.GroupLayout(jPanelDadosVolta);
        jPanelDadosVolta.setLayout(jPanelDadosVoltaLayout);
        jPanelDadosVoltaLayout.setHorizontalGroup(
            jPanelDadosVoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosVoltaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosVoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCarta1)
                    .addComponent(jLabelCarta2)
                    .addComponent(jLabelCarta3)
                    .addComponent(jLabelGanheiEnvido)
                    .addComponent(jLabelGanheiVolta)
                    .addComponent(jLabelPontosMeus)
                    .addComponent(jLabelPontosAdv))
                .addGap(39, 39, 39)
                .addGroup(jPanelDadosVoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxPontosAdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPontosMeus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxGanheiVolta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxGanheiEnvido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jPanelRodada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelDadosVoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosVoltaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelRodada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelRodada3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosVoltaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRodarConsulta)
                        .addGap(24, 24, 24))))
        );
        jPanelDadosVoltaLayout.setVerticalGroup(
            jPanelDadosVoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosVoltaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDadosVoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosVoltaLayout.createSequentialGroup()
                        .addGroup(jPanelDadosVoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCarta1)
                            .addComponent(jComboBoxCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosVoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCarta2)
                            .addComponent(jComboBoxCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosVoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCarta3)
                            .addComponent(jComboBoxCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosVoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelGanheiEnvido)
                            .addComponent(jComboBoxGanheiEnvido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanelDadosVoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelGanheiVolta)
                            .addComponent(jComboBoxGanheiVolta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosVoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPontosMeus)
                            .addComponent(jComboBoxPontosMeus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosVoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPontosAdv)
                            .addComponent(jComboBoxPontosAdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDadosVoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelDadosVoltaLayout.createSequentialGroup()
                            .addGroup(jPanelDadosVoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanelRodada2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanelRodada3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, Short.MAX_VALUE)
                            .addComponent(jButtonRodarConsulta))
                        .addComponent(jPanelRodada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout jPanelNovaQueryLayout = new javax.swing.GroupLayout(jPanelNovaQuery);
        jPanelNovaQuery.setLayout(jPanelNovaQueryLayout);
        jPanelNovaQueryLayout.setHorizontalGroup(
            jPanelNovaQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNovaQueryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTipoQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRodada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDadosVolta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 178, Short.MAX_VALUE))
        );
        jPanelNovaQueryLayout.setVerticalGroup(
            jPanelNovaQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNovaQueryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNovaQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNovaQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelRodada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelTipoQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelDadosVolta, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(334, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nova Consulta", jPanelNovaQuery);

        jTableTodosOsCasos.setModel(tabelaCasos);
        jTableTodosOsCasos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableTodosOsCasos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTodosOsCasosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTodosOsCasos);

        javax.swing.GroupLayout jPanelTodosOsCasosLayout = new javax.swing.GroupLayout(jPanelTodosOsCasos);
        jPanelTodosOsCasos.setLayout(jPanelTodosOsCasosLayout);
        jPanelTodosOsCasosLayout.setHorizontalGroup(
            jPanelTodosOsCasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTodosOsCasosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1373, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTodosOsCasosLayout.setVerticalGroup(
            jPanelTodosOsCasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTodosOsCasosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Todos os Casos", jPanelTodosOsCasos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableTodosOsCasosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTodosOsCasosMouseClicked
        controller.selecionaCaso();
    }//GEN-LAST:event_jTableTodosOsCasosMouseClicked

    private void jRadioButtonCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCategoriaActionPerformed
        controller.trocaCategoria(evt);
    }//GEN-LAST:event_jRadioButtonCategoriaActionPerformed

    private void jRadioButtonRodadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRodadaActionPerformed
        controller.trocaRodada(evt);
    }//GEN-LAST:event_jRadioButtonRodadaActionPerformed

    private void jButtonRodarConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRodarConsultaMouseClicked
        controller.rodarConsulta();
    }//GEN-LAST:event_jButtonRodarConsultaMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainGUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupRodada;
    private javax.swing.ButtonGroup buttonGroupTipoQuery;
    private javax.swing.JButton jButtonRodarConsulta;
    private javax.swing.JComboBox jComboBoxCarta1;
    private javax.swing.JComboBox jComboBoxCarta2;
    private javax.swing.JComboBox jComboBoxCarta3;
    private javax.swing.JComboBox jComboBoxGanheiEnvido;
    private javax.swing.JComboBox jComboBoxGanheiVolta;
    private javax.swing.JComboBox jComboBoxPontosAdv;
    private javax.swing.JComboBox jComboBoxPontosMeus;
    private javax.swing.JComboBox jComboBoxR1AceitouEnvido;
    private javax.swing.JComboBox jComboBoxR1AceitouRetruco;
    private javax.swing.JComboBox jComboBoxR1AceitouTruco;
    private javax.swing.JComboBox jComboBoxR1AceitouValeQuatro;
    private javax.swing.JComboBox jComboBoxR1CartaAdv;
    private javax.swing.JComboBox jComboBoxR1CartaMinha;
    private javax.swing.JComboBox jComboBoxR1PediuEnvido;
    private javax.swing.JComboBox jComboBoxR1PediuRetruco;
    private javax.swing.JComboBox jComboBoxR1PediuTruco;
    private javax.swing.JComboBox jComboBoxR1PediuValeQuatro;
    private javax.swing.JComboBox jComboBoxR2AceitouRetruco;
    private javax.swing.JComboBox jComboBoxR2AceitouTruco;
    private javax.swing.JComboBox jComboBoxR2AceitouValeQuatro;
    private javax.swing.JComboBox jComboBoxR2CartaAdv;
    private javax.swing.JComboBox jComboBoxR2CartaMinha;
    private javax.swing.JComboBox jComboBoxR2PediuRetruco;
    private javax.swing.JComboBox jComboBoxR2PediuTruco;
    private javax.swing.JComboBox jComboBoxR2PediuValeQuatro;
    private javax.swing.JComboBox jComboBoxR3AceitouRetruco;
    private javax.swing.JComboBox jComboBoxR3AceitouTruco;
    private javax.swing.JComboBox jComboBoxR3AceitouValeQuatro;
    private javax.swing.JComboBox jComboBoxR3CartaAdv;
    private javax.swing.JComboBox jComboBoxR3CartaMinha;
    private javax.swing.JComboBox jComboBoxR3PediuRetruco;
    private javax.swing.JComboBox jComboBoxR3PediuTruco;
    private javax.swing.JComboBox jComboBoxR3PediuValeQuatro;
    private javax.swing.JLabel jLabelCarta1;
    private javax.swing.JLabel jLabelCarta2;
    private javax.swing.JLabel jLabelCarta3;
    private javax.swing.JLabel jLabelGanheiEnvido;
    private javax.swing.JLabel jLabelGanheiVolta;
    private javax.swing.JLabel jLabelPontosAdv;
    private javax.swing.JLabel jLabelPontosMeus;
    private javax.swing.JLabel jLabelR1AceitouEnvido;
    private javax.swing.JLabel jLabelR1AceitouRetruco;
    private javax.swing.JLabel jLabelR1AceitouRetruco1;
    private javax.swing.JLabel jLabelR1AceitouRetruco2;
    private javax.swing.JLabel jLabelR1AceitouTruco;
    private javax.swing.JLabel jLabelR1AceitouTruco1;
    private javax.swing.JLabel jLabelR1AceitouTruco2;
    private javax.swing.JLabel jLabelR1AceitouValeQuatro;
    private javax.swing.JLabel jLabelR1AceitouValeQuatro1;
    private javax.swing.JLabel jLabelR1AceitouValeQuatro2;
    private javax.swing.JLabel jLabelR1CartaAdv;
    private javax.swing.JLabel jLabelR1CartaAdv1;
    private javax.swing.JLabel jLabelR1CartaAdv2;
    private javax.swing.JLabel jLabelR1CartaMinha;
    private javax.swing.JLabel jLabelR1CartaMinha1;
    private javax.swing.JLabel jLabelR1CartaMinha2;
    private javax.swing.JLabel jLabelR1PediuEnvido;
    private javax.swing.JLabel jLabelR1PediuRetruco;
    private javax.swing.JLabel jLabelR1PediuRetruco1;
    private javax.swing.JLabel jLabelR1PediuRetruco2;
    private javax.swing.JLabel jLabelR1PediuTruco;
    private javax.swing.JLabel jLabelR1PediuTruco1;
    private javax.swing.JLabel jLabelR1PediuTruco2;
    private javax.swing.JLabel jLabelR1PediuValeQuatro;
    private javax.swing.JLabel jLabelR1PediuValeQuatro1;
    private javax.swing.JLabel jLabelR1PediuValeQuatro2;
    private javax.swing.JPanel jPanelDadosVolta;
    private javax.swing.JPanel jPanelNovaQuery;
    private javax.swing.JPanel jPanelRodada;
    private javax.swing.JPanel jPanelRodada1;
    private javax.swing.JPanel jPanelRodada2;
    private javax.swing.JPanel jPanelRodada3;
    private javax.swing.JPanel jPanelTipoQuery;
    private javax.swing.JPanel jPanelTodosOsCasos;
    private javax.swing.JRadioButton jRadioButtonQueryEnvido;
    private javax.swing.JRadioButton jRadioButtonQueryGeral;
    private javax.swing.JRadioButton jRadioButtonQueryRetruco;
    private javax.swing.JRadioButton jRadioButtonQueryTruco;
    private javax.swing.JRadioButton jRadioButtonQueryVale4;
    private javax.swing.JRadioButton jRadioButtonRodada1;
    private javax.swing.JRadioButton jRadioButtonRodada2;
    private javax.swing.JRadioButton jRadioButtonRodada3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableTodosOsCasos;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
