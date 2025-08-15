package theatre2.dashboard;

import java.awt.Color;
import theatre2.LoginSignup.LoginFrame;
import theatre2.dashboard.AdminDashboardFrames.Movie;
import theatre2.dashboard.AdminDashboardFrames.Screen;

public class OldAdminDashboard extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(OldAdminDashboard.class.getName());
    
    Color DefaultColor, ClickedColor;

    public OldAdminDashboard() {
        initComponents();
        DefaultColor = new Color(0, 153, 153);
        ClickedColor = new Color(0, 204, 204);
        
        homePanel.setBackground(ClickedColor);
        homeLabel.setBackground(ClickedColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        homePanel = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        MoviePanel = new javax.swing.JPanel();
        movieLabel = new javax.swing.JLabel();
        ShowPanel = new javax.swing.JPanel();
        showLabel = new javax.swing.JLabel();
        ScreenPanel = new javax.swing.JPanel();
        screenLabel = new javax.swing.JLabel();
        ticketPricingPanel = new javax.swing.JPanel();
        ticketPricingLabel = new javax.swing.JLabel();
        bookingPanel = new javax.swing.JPanel();
        bookingLabel = new javax.swing.JLabel();
        reportsPanel = new javax.swing.JPanel();
        reportsLabel = new javax.swing.JLabel();
        logoutPanel = new javax.swing.JPanel();
        logoutLabel = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        MainDesktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1600, 940));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setPreferredSize(new java.awt.Dimension(1600, 940));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(250, 900));
        jPanel1.setMinimumSize(new java.awt.Dimension(250, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 900));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatre2/icon/logo1.png"))); // NOI18N

        homePanel.setBackground(new java.awt.Color(0, 153, 153));
        homePanel.setMaximumSize(new java.awt.Dimension(250, 60));
        homePanel.setMinimumSize(new java.awt.Dimension(250, 60));
        homePanel.setPreferredSize(new java.awt.Dimension(250, 60));
        homePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homePanelMousePressed(evt);
            }
        });

        homeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatre2/icon/home.png"))); // NOI18N
        homeLabel.setText("  Home");
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(homeLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(homeLabel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        MoviePanel.setBackground(new java.awt.Color(0, 153, 153));
        MoviePanel.setMaximumSize(new java.awt.Dimension(250, 60));
        MoviePanel.setMinimumSize(new java.awt.Dimension(250, 60));
        MoviePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MoviePanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoviePanelMousePressed(evt);
            }
        });

        movieLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        movieLabel.setForeground(new java.awt.Color(255, 255, 255));
        movieLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatre2/icon/clapperboard.png"))); // NOI18N
        movieLabel.setText("  Movie");
        movieLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movieLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movieLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout MoviePanelLayout = new javax.swing.GroupLayout(MoviePanel);
        MoviePanel.setLayout(MoviePanelLayout);
        MoviePanelLayout.setHorizontalGroup(
            MoviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoviePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(movieLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MoviePanelLayout.setVerticalGroup(
            MoviePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoviePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(movieLabel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        ShowPanel.setBackground(new java.awt.Color(0, 153, 153));
        ShowPanel.setMaximumSize(new java.awt.Dimension(250, 60));
        ShowPanel.setMinimumSize(new java.awt.Dimension(250, 60));
        ShowPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ShowPanelMousePressed(evt);
            }
        });

        showLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        showLabel.setForeground(new java.awt.Color(255, 255, 255));
        showLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatre2/icon/calendar.png"))); // NOI18N
        showLabel.setText("  Show");
        showLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ShowPanelLayout = new javax.swing.GroupLayout(ShowPanel);
        ShowPanel.setLayout(ShowPanelLayout);
        ShowPanelLayout.setHorizontalGroup(
            ShowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(showLabel)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        ShowPanelLayout.setVerticalGroup(
            ShowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(showLabel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        ScreenPanel.setBackground(new java.awt.Color(0, 153, 153));
        ScreenPanel.setMaximumSize(new java.awt.Dimension(250, 60));
        ScreenPanel.setMinimumSize(new java.awt.Dimension(250, 60));
        ScreenPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScreenPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ScreenPanelMousePressed(evt);
            }
        });

        screenLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        screenLabel.setForeground(new java.awt.Color(255, 255, 255));
        screenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatre2/icon/theater.png"))); // NOI18N
        screenLabel.setText("  Screen");
        screenLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                screenLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                screenLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ScreenPanelLayout = new javax.swing.GroupLayout(ScreenPanel);
        ScreenPanel.setLayout(ScreenPanelLayout);
        ScreenPanelLayout.setHorizontalGroup(
            ScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScreenPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(screenLabel)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        ScreenPanelLayout.setVerticalGroup(
            ScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScreenPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(screenLabel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        ticketPricingPanel.setBackground(new java.awt.Color(0, 153, 153));
        ticketPricingPanel.setMaximumSize(new java.awt.Dimension(250, 60));
        ticketPricingPanel.setMinimumSize(new java.awt.Dimension(250, 60));
        ticketPricingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticketPricingPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ticketPricingPanelMousePressed(evt);
            }
        });

        ticketPricingLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ticketPricingLabel.setForeground(new java.awt.Color(255, 255, 255));
        ticketPricingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatre2/icon/ticket.png"))); // NOI18N
        ticketPricingLabel.setText("  Ticket Pricing");
        ticketPricingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticketPricingLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ticketPricingLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ticketPricingPanelLayout = new javax.swing.GroupLayout(ticketPricingPanel);
        ticketPricingPanel.setLayout(ticketPricingPanelLayout);
        ticketPricingPanelLayout.setHorizontalGroup(
            ticketPricingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketPricingPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ticketPricingLabel)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        ticketPricingPanelLayout.setVerticalGroup(
            ticketPricingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketPricingPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ticketPricingLabel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        bookingPanel.setBackground(new java.awt.Color(0, 153, 153));
        bookingPanel.setMaximumSize(new java.awt.Dimension(250, 60));
        bookingPanel.setMinimumSize(new java.awt.Dimension(250, 60));
        bookingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bookingPanelMousePressed(evt);
            }
        });

        bookingLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bookingLabel.setForeground(new java.awt.Color(255, 255, 255));
        bookingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatre2/icon/booking.png"))); // NOI18N
        bookingLabel.setText("  Booking");
        bookingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bookingLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bookingLabelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout bookingPanelLayout = new javax.swing.GroupLayout(bookingPanel);
        bookingPanel.setLayout(bookingPanelLayout);
        bookingPanelLayout.setHorizontalGroup(
            bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(bookingLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bookingPanelLayout.setVerticalGroup(
            bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(bookingLabel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        reportsPanel.setBackground(new java.awt.Color(0, 153, 153));
        reportsPanel.setMaximumSize(new java.awt.Dimension(250, 60));
        reportsPanel.setMinimumSize(new java.awt.Dimension(250, 60));
        reportsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reportsPanelMousePressed(evt);
            }
        });

        reportsLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reportsLabel.setForeground(new java.awt.Color(255, 255, 255));
        reportsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatre2/icon/reports.png"))); // NOI18N
        reportsLabel.setText("  Reports");
        reportsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reportsLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout reportsPanelLayout = new javax.swing.GroupLayout(reportsPanel);
        reportsPanel.setLayout(reportsPanelLayout);
        reportsPanelLayout.setHorizontalGroup(
            reportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportsPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(reportsLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reportsPanelLayout.setVerticalGroup(
            reportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(reportsLabel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        logoutPanel.setBackground(new java.awt.Color(204, 0, 0));
        logoutPanel.setMaximumSize(new java.awt.Dimension(250, 60));
        logoutPanel.setMinimumSize(new java.awt.Dimension(250, 60));
        logoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutPanelMousePressed(evt);
            }
        });

        logoutLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatre2/icon/male_user_50px.png"))); // NOI18N
        logoutLabel.setText("  Logout");

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout logoutPanelLayout = new javax.swing.GroupLayout(logoutPanel);
        logoutPanel.setLayout(logoutPanelLayout);
        logoutPanelLayout.setHorizontalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(logoutLabel)
                .addGap(113, 113, 113)
                .addComponent(jDesktopPane2)
                .addContainerGap())
        );
        logoutPanelLayout.setVerticalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(logoutPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(logoutLabel)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MoviePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ShowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ScreenPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ticketPricingPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bookingPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reportsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MoviePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ticketPricingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(logoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainDesktopPane.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout MainDesktopPaneLayout = new javax.swing.GroupLayout(MainDesktopPane);
        MainDesktopPane.setLayout(MainDesktopPaneLayout);
        MainDesktopPaneLayout.setHorizontalGroup(
            MainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        MainDesktopPaneLayout.setVerticalGroup(
            MainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MainDesktopPane)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMousePressed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        dispose(); // close the login frame
    }//GEN-LAST:event_logoutPanelMousePressed

    private void homePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMousePressed
        // TODO add your handling code here:
        
        homePanel.setBackground(ClickedColor);
        homeLabel.setBackground(ClickedColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_homePanelMousePressed

    private void MoviePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoviePanelMousePressed
        // TODO add your handling code here:
        Movie movie = new Movie();
        MainDesktopPane.removeAll();
        MainDesktopPane.add(movie).setVisible(true);
        
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(ClickedColor);
        movieLabel.setBackground(ClickedColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_MoviePanelMousePressed

    private void ShowPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowPanelMousePressed
        // TODO add your handling code here:
        
        
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(ClickedColor);
        showLabel.setBackground(ClickedColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_ShowPanelMousePressed

    private void ScreenPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScreenPanelMousePressed
        // TODO add your handling code here:
        Screen screen = new Screen();
        MainDesktopPane.removeAll();
        MainDesktopPane.add(screen).setVisible(true);
        
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(ClickedColor);
        screenLabel.setBackground(ClickedColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_ScreenPanelMousePressed

    private void ticketPricingPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketPricingPanelMousePressed
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(ClickedColor);
        ticketPricingLabel.setBackground(ClickedColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_ticketPricingPanelMousePressed

    private void bookingPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingPanelMousePressed
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(ClickedColor);
        bookingLabel.setBackground(ClickedColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_bookingPanelMousePressed

    private void reportsPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsPanelMousePressed
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(ClickedColor);
        reportsLabel.setBackground(ClickedColor);
    }//GEN-LAST:event_reportsPanelMousePressed

    private void homeLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMousePressed
        // TODO add your handling code here:
        homePanel.setBackground(ClickedColor);
        homeLabel.setBackground(ClickedColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_homeLabelMousePressed

    private void movieLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movieLabelMousePressed
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(ClickedColor);
        movieLabel.setBackground(ClickedColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_movieLabelMousePressed

    private void showLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showLabelMousePressed
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(ClickedColor);
        showLabel.setBackground(ClickedColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_showLabelMousePressed

    private void screenLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_screenLabelMousePressed
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(ClickedColor);
        screenLabel.setBackground(ClickedColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_screenLabelMousePressed

    private void ticketPricingLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketPricingLabelMousePressed
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(ClickedColor);
        ticketPricingLabel.setBackground(ClickedColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_ticketPricingLabelMousePressed

    private void bookingLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingLabelMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingLabelMouseReleased

    private void bookingLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingLabelMousePressed
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(ClickedColor);
        bookingLabel.setBackground(ClickedColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_bookingLabelMousePressed

    private void reportsLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsLabelMousePressed
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(ClickedColor);
        reportsLabel.setBackground(ClickedColor);
    }//GEN-LAST:event_reportsLabelMousePressed

    private void homePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseClicked
        // TODO add your handling code here:
        homePanel.setBackground(ClickedColor);
        homeLabel.setBackground(ClickedColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_homePanelMouseClicked

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseClicked
        // TODO add your handling code here:
        homePanel.setBackground(ClickedColor);
        homeLabel.setBackground(ClickedColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_homeLabelMouseClicked

    private void MoviePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoviePanelMouseClicked
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(ClickedColor);
        movieLabel.setBackground(ClickedColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_MoviePanelMouseClicked

    private void movieLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movieLabelMouseClicked
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(ClickedColor);
        movieLabel.setBackground(ClickedColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_movieLabelMouseClicked

    private void ShowPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowPanelMouseClicked
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(ClickedColor);
        showLabel.setBackground(ClickedColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_ShowPanelMouseClicked

    private void showLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showLabelMouseClicked
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(ClickedColor);
        showLabel.setBackground(ClickedColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_showLabelMouseClicked

    private void ScreenPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScreenPanelMouseClicked
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(ClickedColor);
        screenLabel.setBackground(ClickedColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_ScreenPanelMouseClicked

    private void screenLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_screenLabelMouseClicked
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(ClickedColor);
        screenLabel.setBackground(ClickedColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_screenLabelMouseClicked

    private void ticketPricingPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketPricingPanelMouseClicked
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(ClickedColor);
        ticketPricingLabel.setBackground(ClickedColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_ticketPricingPanelMouseClicked

    private void ticketPricingLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketPricingLabelMouseClicked
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(ClickedColor);
        ticketPricingLabel.setBackground(ClickedColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_ticketPricingLabelMouseClicked

    private void bookingPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingPanelMouseClicked
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(ClickedColor);
        bookingLabel.setBackground(ClickedColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_bookingPanelMouseClicked

    private void bookingLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingLabelMouseClicked
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(ClickedColor);
        bookingLabel.setBackground(ClickedColor);
        reportsPanel.setBackground(DefaultColor);
        reportsLabel.setBackground(DefaultColor);
    }//GEN-LAST:event_bookingLabelMouseClicked

    private void reportsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsPanelMouseClicked
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(ClickedColor);
        reportsLabel.setBackground(ClickedColor);
    }//GEN-LAST:event_reportsPanelMouseClicked

    private void reportsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsLabelMouseClicked
        // TODO add your handling code here:
        homePanel.setBackground(DefaultColor);
        homeLabel.setBackground(DefaultColor);
        MoviePanel.setBackground(DefaultColor);
        movieLabel.setBackground(DefaultColor);
        ShowPanel.setBackground(DefaultColor);
        showLabel.setBackground(DefaultColor);
        ScreenPanel.setBackground(DefaultColor);
        screenLabel.setBackground(DefaultColor);
        ticketPricingPanel.setBackground(DefaultColor);
        ticketPricingLabel.setBackground(DefaultColor);
        bookingPanel.setBackground(DefaultColor);
        bookingLabel.setBackground(DefaultColor);
        reportsPanel.setBackground(ClickedColor);
        reportsLabel.setBackground(ClickedColor);
    }//GEN-LAST:event_reportsLabelMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane MainDesktopPane;
    private javax.swing.JPanel MoviePanel;
    private javax.swing.JPanel ScreenPanel;
    private javax.swing.JPanel ShowPanel;
    private javax.swing.JLabel bookingLabel;
    private javax.swing.JPanel bookingPanel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JLabel movieLabel;
    private javax.swing.JLabel reportsLabel;
    private javax.swing.JPanel reportsPanel;
    private javax.swing.JLabel screenLabel;
    private javax.swing.JLabel showLabel;
    private javax.swing.JLabel ticketPricingLabel;
    private javax.swing.JPanel ticketPricingPanel;
    // End of variables declaration//GEN-END:variables
}
