
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author NiTRO
 */
public class TicGUI extends javax.swing.JFrame {
    
    private String startGame="X";
    private int xCount=0;
    private int oCount=0;
    

    /**
     * Creates new form TicGUI
     */
    public TicGUI() {
        initComponents();
    }
    
    private void gameScore()
    {
        plax.setText(String.valueOf(xCount));
        plao.setText(String.valueOf(oCount)); 
    }
    
    private void choose_a_player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    
    
    private void winningGame()
    {
        String b1 = t1.getText();
        String b2 = t2.getText();
        String b3 = t3.getText();

        String b4 = t4.getText();
        String b5 = t5.getText();
        String b6 = t6.getText();

        String b7 = t7.getText();
        String b8 = t8.getText();
        String b9 = t9.getText();

        
        if(b1==("X")&&b2==("X")&&b3==("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            t1.setBackground(Color.ORANGE);
            t2.setBackground(Color.ORANGE);
            t3.setBackground(Color.ORANGE);
        }
        
        if(b4==("X")&&b5==("X")&&b6==("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            t4.setBackground(Color.ORANGE);
            t5.setBackground(Color.ORANGE);
            t6.setBackground(Color.ORANGE);
        }
        
        if(b7==("X")&&b8==("X")&&b9==("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            t7.setBackground(Color.ORANGE);
            t8.setBackground(Color.ORANGE);
            t9.setBackground(Color.ORANGE);
        }
        
        if(b1==("X")&&b4==("X")&&b7==("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            t1.setBackground(Color.ORANGE);
            t4.setBackground(Color.ORANGE);
            t7.setBackground(Color.ORANGE);
        }
        
        if(b2==("X")&&b5==("X")&&b8==("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            t2.setBackground(Color.ORANGE);
            t5.setBackground(Color.ORANGE);
            t8.setBackground(Color.ORANGE);
        }
        
        if(b3==("X")&&b6==("X")&&b9==("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            t3.setBackground(Color.ORANGE);
            t6.setBackground(Color.ORANGE);
            t9.setBackground(Color.ORANGE);
        }
        
        if(b1==("X")&&b5==("X")&&b9==("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            t1.setBackground(Color.ORANGE);
            t5.setBackground(Color.ORANGE);
            t9.setBackground(Color.ORANGE);
        }
        
                if(b3==("X")&&b5==("X")&&b7==("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            t3.setBackground(Color.ORANGE);
            t5.setBackground(Color.ORANGE);
            t7.setBackground(Color.ORANGE);
        }
         
                if(b1==("O")&&b2==("O")&&b3==("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            t1.setBackground(Color.ORANGE);
            t2.setBackground(Color.ORANGE);
            t3.setBackground(Color.ORANGE);
        }
        
        if(b4==("O")&&b5==("O")&&b6==("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            t4.setBackground(Color.ORANGE);
            t5.setBackground(Color.ORANGE);
            t6.setBackground(Color.ORANGE);
        }
        
        if(b7==("O")&&b8==("O")&&b9==("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            t7.setBackground(Color.ORANGE);
            t8.setBackground(Color.ORANGE);
            t9.setBackground(Color.ORANGE);
        }
        
        if(b1==("O")&&b4==("O")&&b7==("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            t1.setBackground(Color.ORANGE);
            t4.setBackground(Color.ORANGE);
            t7.setBackground(Color.ORANGE);
        }
        
        if(b2==("O")&&b5==("O")&&b8==("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            t2.setBackground(Color.ORANGE);
            t5.setBackground(Color.ORANGE);
            t8.setBackground(Color.ORANGE);
        }
        
        if(b3==("O")&&b6==("O")&&b9==("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            t3.setBackground(Color.ORANGE);
            t6.setBackground(Color.ORANGE);
            t9.setBackground(Color.ORANGE);
        }
        
        if(b1==("O")&&b5==("O")&&b9==("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            t1.setBackground(Color.ORANGE);
            t5.setBackground(Color.ORANGE);
            t9.setBackground(Color.ORANGE);
        }
        
                if(b3==("O")&&b5==("O")&&b7==("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",
            JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            t3.setBackground(Color.ORANGE);
            t5.setBackground(Color.ORANGE);
            t7.setBackground(Color.ORANGE);
        }
         
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        t2 = new javax.swing.JButton();
        t3 = new javax.swing.JButton();
        t1 = new javax.swing.JButton();
        t4 = new javax.swing.JButton();
        t5 = new javax.swing.JButton();
        t7 = new javax.swing.JButton();
        t8 = new javax.swing.JButton();
        t9 = new javax.swing.JButton();
        t6 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        playero = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        plax = new javax.swing.JLabel();
        plao = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("TAC.");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 176, 2));
        jLabel2.setText("TOE.");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(253, 176, 2));
        jLabel3.setText("TIC.");

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));

        t2.setBackground(new java.awt.Color(102, 0, 102));
        t2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t3.setBackground(new java.awt.Color(102, 0, 102));
        t3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        t1.setBackground(new java.awt.Color(102, 0, 102));
        t1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        t4.setBackground(new java.awt.Color(102, 0, 102));
        t4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });

        t5.setBackground(new java.awt.Color(102, 0, 102));
        t5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });

        t7.setBackground(new java.awt.Color(102, 0, 102));
        t7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });

        t8.setBackground(new java.awt.Color(102, 0, 102));
        t8.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });

        t9.setBackground(new java.awt.Color(102, 0, 102));
        t9.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });

        t6.setBackground(new java.awt.Color(102, 0, 102));
        t6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        reset.setBackground(new java.awt.Color(51, 0, 51));
        reset.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(51, 0, 51));
        exit.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 0, 255), new java.awt.Color(51, 0, 51)));

        playero.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        playero.setForeground(new java.awt.Color(253, 176, 2));
        playero.setText("PLAYER O :");

        playerx.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        playerx.setForeground(new java.awt.Color(0, 204, 204));
        playerx.setText("PLAYER X :");

        plax.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        plax.setForeground(new java.awt.Color(0, 204, 204));
        plax.setText("x");

        plao.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        plao.setForeground(new java.awt.Color(253, 176, 2));
        plao.setText("o");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playero, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(playerx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plax)
                    .addComponent(plao, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plax, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        jPanel4.setBackground(new java.awt.Color(51, 0, 51));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TIC TAC TOE GAME...");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("GAMES");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 204, 255));
        jLabel5.setText("NT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(36, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
        
         t2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
        t2.setForeground(Color.CYAN);
        }
        else
        {
        t2.setForeground(Color.YELLOW);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
        
        t3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
        t3.setForeground(Color.CYAN);
        }
        else
        {
        t3.setForeground(Color.YELLOW);
        }
        choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_t3ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
        
        t1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
        t1.setForeground(Color.CYAN);
        }
        else
        {
        t1.setForeground(Color.YELLOW);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_t1ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
        t4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
        t4.setForeground(Color.CYAN);
        }
        else
        {
        t4.setForeground(Color.YELLOW);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_t4ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
        
        t5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
        t5.setForeground(Color.CYAN);
        }
        else
        {
        t5.setForeground(Color.YELLOW);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_t5ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
        
        t7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
        t7.setForeground(Color.CYAN);
        }
        else
        {
        t7.setForeground(Color.YELLOW);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_t7ActionPerformed

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        // TODO add your handling code here:
        
        t8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
        t8.setForeground(Color.CYAN);
        }
        else
        {
        t8.setForeground(Color.YELLOW);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_t8ActionPerformed

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
        
        t9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
        t9.setForeground(Color.CYAN);
        }
        else
        {
        t9.setForeground(Color.YELLOW);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_t9ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
        
        t6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
        t6.setForeground(Color.CYAN);
        }
        else
        {
        t6.setForeground(Color.YELLOW);
        }
        choose_a_player();
        winningGame();
    }//GEN-LAST:event_t6ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        
        t1.setText(null);
        t2.setText(null);
        t3.setText(null);
        t4.setText(null);
        t5.setText(null);
        t6.setText(null);
        t7.setText(null);
        t8.setText(null);
        t9.setText(null);
        
        t1.setBackground(Color.getColor(startGame));
        t2.setBackground(Color.getColor(startGame));
        t3.setBackground(Color.getColor(startGame));
        
        t4.setBackground(Color.getColor(startGame));
        t5.setBackground(Color.getColor(startGame));
        t6.setBackground(Color.getColor(startGame));
        
        t7.setBackground(Color.getColor(startGame));
        t8.setBackground(Color.getColor(startGame));
        t9.setBackground(Color.getColor(startGame));


    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new  JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Are you sure if you want to Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)
                ==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel plao;
    private javax.swing.JLabel plax;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JButton reset;
    private javax.swing.JButton t1;
    private javax.swing.JButton t2;
    private javax.swing.JButton t3;
    private javax.swing.JButton t4;
    private javax.swing.JButton t5;
    private javax.swing.JButton t6;
    private javax.swing.JButton t7;
    private javax.swing.JButton t8;
    private javax.swing.JButton t9;
    // End of variables declaration//GEN-END:variables
}
