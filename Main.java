package scoutingApp;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.io.*;
import java.lang.management.ManagementFactory;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.awt.Dimension;
import javax.swing.SwingUtilities;




public class Main {
    public JPanel panel, panel2, panel3, panel4, panel5;
    public JFrame frame;
    public JButton bn1, bp2, bn2, bp3, bn3, bp4, bn4, bp5, bSubmit;
    public int nextx = 450;
    public int nexty = 500;
    public int prevx = 0;
    public int prevy = 500;
    public int buttonw = 150;
    public int buttonh = 50;
    public Color bkcolor = new Color(255, 140, 0);
    public JLabel team, match, page1, page2, page3, page4, page5, bottom, top, topCenter, spinWheel, powerCellLevel, choose1;
    public JSpinner teamSpinner, matchSpinner, bottomSpinner, topSpinner, topCenterSpinner;
    public JSpinner bottomSpinner3, topSpinner3, topCenterSpinner3;
    public JCheckBox spinWheelCheckBoxNo, spinWheelCheckBoxYes, spinWheelCheckBoxNo3, spinWheelCheckBoxYes3, heavy, medium, light, climb;
    public JTextArea otherInfo;



    public void createFrame() {
        frame = new JFrame("5442 Scouting Application 2020");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 600));
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



        //create panel one
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(bkcolor);
        createNext1();
        createTeamLabel();
        createSpinnerTeam();
        createMatchLabel();
        createSpinnerMatch();
        createPage1Label();

        //create panel two
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(bkcolor);
        createPrev2();
        createNext2();
        createPage2Label();
        createBottomLabel();
        createTopCenterLabel();
        createTopLabel();
        createTopSpinner();
        createTopCenterSpinner();
        createBottomSpinner();
        createSpinWheelLabel();
        createSpinWheelCheckboxNo();
        createSpinWheelCheckboxYes();
        createPowerCellLevelLabel2();

        //create panel three
        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBackground(bkcolor);
        createPrev3();
        createNext3();
        createPage3Label();
        createBottomLabel3();
        createTopCenterLabel3();
        createTopLabel3();
        createTopSpinner3();
        createTopCenterSpinner3();
        createBottomSpinner3();
        createSpinWheelLabel3();
        createSpinWheelCheckboxNo3();
        createSpinWheelCheckboxYes3();
        createPowerCellLevelLabel3();




        //create panel four
        panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setBackground(bkcolor);
        createPrev4();
        createNext4();
        createPage4Label();
        createHeavyCheckbox4();
        createMediumCheckbox4();
        createLightCheckbox4();
        createChoose1label();
        createClimbCheckbox4();

        //create panel five
        panel5 = new JPanel();
        panel5.setLayout(null);
        panel5.setBackground(bkcolor);
        createPrev5();
        createOtherInfoBox();
        createSubmitButton();


        frame.setContentPane(panel);                                                    //set the starting panel on the frame

    }


    public void createNext1(){                                                          //page 1 next button creation method
        bn1 = new JButton("Next panel (2)");
        panel.add(this.bn1);
        bn1.setVisible(true);
        bn1.setBounds(nextx, nexty,buttonw, buttonh);
        bn1.addActionListener(this::actionBn1);
    }

    public void createPrev2(){                                                          //page 2 previous button creation method
        bp2 = new JButton("Previous panel (1)");
        panel2.add(this.bp2);
        bp2.setVisible(true);
        bp2.setBounds(prevx, prevy,buttonw, buttonh);
        bp2.addActionListener(this::actionBp2);
    }

    public void createNext2(){                                                          //page 3 next button creation method
        bn2 = new JButton("Next panel (3)");
        panel2.add(this.bn2);
        bn2.setVisible(true);
        bn2.setBounds(nextx, nexty,buttonw, buttonh);
        bn2.addActionListener(this::actionBn2);
    }

    public void createPrev3(){                                                         //page 3 previous button creation method
        bp3 = new JButton("Previous Panel (2)");
        panel3.add(this.bp3);
        bp3.setVisible(true);
        bp3.setBounds(prevx, prevy,buttonw, buttonh);
        bp3.addActionListener(this::actionBp3);
    }

    public void createNext3(){                                                          //page 3 next button creation method
        bn3 = new JButton("Next panel (4)");
        panel3.add(this.bn3);
        bn3.setVisible(true);
        bn3.setBounds(nextx, nexty,buttonw, buttonh);
        bn3.addActionListener(this::actionBn3);
    }

    public void createPrev4(){                                                          //page 4 previous button creation method
        bp4 = new JButton("Previous Panel (3)");
        panel4.add(this.bp4);
        bp4.setVisible(true);
        bp4.setBounds(prevx, prevy,buttonw, buttonh);
        bp4.addActionListener(this::actionBp4);
    }

    public void createNext4(){                                                          //page 4 next button creation method
        bn4 = new JButton("Next panel (5)");
        panel4.add(this.bn4);
        bn4.setVisible(true);
        bn4.setBounds(nextx, nexty,buttonw, buttonh);
        bn4.addActionListener(this::actionBn4);
    }

    public void createPrev5(){                                                          //page 5 previous button creation method
        bp5 = new JButton("Previous Panel (4)");
        panel5.add(this.bp5);
        bp5.setVisible(true);
        bp5.setBounds(prevx, prevy,buttonw, buttonh);
        bp5.addActionListener(this::actionBp5);
    }

    public void createPage1Label(){                                                     //page 1 title label
        page1 = new JLabel("PRE-MATCH");
        page1.setBounds(145, 15, 500, 70);
        page1.setVisible(true);
        page1.setFont(new Font ("Times New Roman", Font.BOLD, 50));
        panel.add(this.page1);
    }

    public void createTeamLabel(){                                                      //page 1 team # label
        team = new JLabel("Team #: ");
        team.setBounds(20, 120, 100, 40);
        team.setVisible(true);
        team.setFont(new Font ("Times New Roman", Font.BOLD, 20));
        panel.add(this.team);
    }

    public void createMatchLabel(){                                                     //page 1 match # label
        match = new JLabel("Match #: ");
        match.setBounds(20, 170, 100, 40);
        match.setVisible(true);
        match.setFont(new Font ("Times New Roman", Font.BOLD, 20));
        panel.add(this.match);
    }

    public void createPage2Label(){                                                     //page 2 title label
        page2 = new JLabel("AUTONOMOUS");
        page2.setBounds(115, 15, 500, 70);
        page2.setVisible(true);
        page2.setFont(new Font ("Times New Roman", Font.BOLD, 50));
        panel2.add(this.page2);
    }
    public void createTopLabel(){                                                       //page 2 top area label
        top = new JLabel("Top: ");
        top.setBounds(20, 220, 100, 40);
        top.setVisible(true);
        top.setFont(new Font ("Times New Roman", Font.BOLD, 20));
        panel2.add(this.top);
    }
    public void createBottomLabel(){                                                    //page 2 bottom area label
        bottom = new JLabel("Bottom: ");
        bottom.setBounds(20, 170, 100 ,40);
        bottom.setVisible(true);
        bottom.setFont(new Font ("Times New Roman", Font.BOLD, 20));
        panel2.add(this.bottom);
    }
    public void createTopCenterLabel(){                                                 //page 2 top center area label
        topCenter = new JLabel("Top Center: ");
        topCenter.setBounds(20, 270, 200, 40);
        topCenter.setVisible(true);
        topCenter.setFont(new Font ("Times New Roman", Font.BOLD, 20));
        panel2.add(this.topCenter);

    }
    public void createSpinWheelLabel(){
        spinWheel = new JLabel("Spin the Wheel?");
        spinWheel.setBounds(20, 350, 200, 40);
        spinWheel.setVisible(true);
        spinWheel.setFont(new Font ("Times New Roman", Font.BOLD, 20));
        panel2.add(this.spinWheel);
    }
    public void createPowerCellLevelLabel2(){
        powerCellLevel = new JLabel("Power Cell Level");
        powerCellLevel.setBounds(130, 80, 500, 70);
        powerCellLevel.setVisible(true);
        powerCellLevel.setFont(new Font ("Times New Roman", Font.BOLD, 40));
        panel2.add(this.powerCellLevel);
    }



    public void createSpinnerTeam(){                                                    //page 1 team # spinner
        teamSpinner = new JSpinner();
        panel.add(this.teamSpinner);
        teamSpinner.setVisible(true);
        teamSpinner.setBounds(120, 120, 100, 40);
        teamSpinner.setBorder(BorderFactory.createLineBorder(Color.black, 5));
    }

    public void createSpinnerMatch(){                                                   //page 1 match # spinner
        matchSpinner = new JSpinner();
        panel.add(this.matchSpinner);
        matchSpinner.setVisible(true);
        matchSpinner.setBounds(120, 170, 100, 40);
        matchSpinner.setBorder(BorderFactory.createLineBorder(Color.black, 5));
    }
    public void createTopSpinner(){                                                     //page 2 top area spinner
        topSpinner = new JSpinner();
        panel2.add(this.topSpinner);
        topSpinner.setVisible(true);
        topSpinner.setBounds(300, 220, 100, 40);
        topSpinner.setBorder(BorderFactory.createLineBorder(Color.black, 5));
    }
    public void createBottomSpinner(){                                                      //page 2 bottom area spinner
        bottomSpinner = new JSpinner();
        panel2.add(this.bottomSpinner);
        bottomSpinner.setVisible(true);
        bottomSpinner.setBounds(300, 170, 100, 40);
        bottomSpinner.setBorder(BorderFactory.createLineBorder(Color.black, 5));
    }
    public void createTopCenterSpinner(){                                               //page 2 top center spinner
        topCenterSpinner = new JSpinner();
        panel2.add(this.topCenterSpinner);
        topCenterSpinner.setVisible(true);
        topCenterSpinner.setBounds(300, 270, 100, 40);
        topCenterSpinner.setBorder(BorderFactory.createLineBorder(Color.black, 5));
    }

    public void createSpinWheelCheckboxYes(){
        spinWheelCheckBoxYes = new JCheckBox("YES");
        panel2.add(this.spinWheelCheckBoxYes);
        spinWheelCheckBoxYes.setVisible(true);
        spinWheelCheckBoxYes.setSelected(false);
        spinWheelCheckBoxYes.setBounds(250, 340, 60, 60);
        spinWheelCheckBoxYes.setBackground(bkcolor);
    }
    public void createSpinWheelCheckboxNo(){
        spinWheelCheckBoxNo = new JCheckBox("NO");
        panel2.add(this.spinWheelCheckBoxNo);
        spinWheelCheckBoxNo.setVisible(true);
        spinWheelCheckBoxNo.setSelected(false);
        spinWheelCheckBoxNo.setBounds(350, 340, 60, 60);
        spinWheelCheckBoxNo.setBackground(bkcolor);
    }











    public void createPage3Label(){                                                     //page 3 title label
        page3 = new JLabel("TELEOPERATED");
        page3.setBounds(95, 15, 500, 70);
        page3.setVisible(true);
        page3.setFont(new Font ("Times New Roman", Font.BOLD, 50));
        panel3.add(this.page3);
    }
    public void createTopLabel3(){                                                       //page 3 top area label
        top = new JLabel("Top: ");
        top.setBounds(20, 220, 100, 40);
        top.setVisible(true);
        top.setFont(new Font ("Times New Roman", Font.BOLD, 20));
        panel3.add(this.top);
    }
    public void createBottomLabel3(){                                                    //page 3 bottom area label
        bottom = new JLabel("Bottom: ");
        bottom.setBounds(20, 170, 100 ,40);
        bottom.setVisible(true);
        bottom.setFont(new Font ("Times New Roman", Font.BOLD, 20));
        panel3.add(this.bottom);
    }
    public void createTopCenterLabel3(){                                                 //page 3 top center area label
        topCenter = new JLabel("Top Center: ");
        topCenter.setBounds(20, 270, 200, 40);
        topCenter.setVisible(true);
        topCenter.setFont(new Font ("Times New Roman", Font.BOLD, 20));
        panel3.add(this.topCenter);

    }
    public void createSpinWheelLabel3(){
        spinWheel = new JLabel("Spin the Wheel?");
        spinWheel.setBounds(20, 350, 200, 40);
        spinWheel.setVisible(true);
        spinWheel.setFont(new Font ("Times New Roman", Font.BOLD, 20));
        panel3.add(this.spinWheel);
    }
    public void createPowerCellLevelLabel3(){
        powerCellLevel = new JLabel("Power Cell Level");
        powerCellLevel.setBounds(130, 80, 500, 70);
        powerCellLevel.setVisible(true);
        powerCellLevel.setFont(new Font ("Times New Roman", Font.BOLD, 40));
        panel3.add(this.powerCellLevel);
    }


    public void createTopSpinner3(){                                                     //page 3 top area spinner
        topSpinner3 = new JSpinner();
        panel3.add(this.topSpinner3);
        topSpinner3.setVisible(true);
        topSpinner3.setBounds(300, 220, 100, 40);
        topSpinner3.setBorder(BorderFactory.createLineBorder(Color.black, 5));
    }
    public void createBottomSpinner3(){                                                      //page 3 bottom area spinner
        bottomSpinner3 = new JSpinner();
        panel3.add(this.bottomSpinner3);
        bottomSpinner3.setVisible(true);
        bottomSpinner3.setBounds(300, 170, 100, 40);
        bottomSpinner3.setBorder(BorderFactory.createLineBorder(Color.black, 5));
    }
    public void createTopCenterSpinner3(){                                               //page 3 top center spinner
        topCenterSpinner3 = new JSpinner();
        panel3.add(this.topCenterSpinner3);
        topCenterSpinner3.setVisible(true);
        topCenterSpinner3.setBounds(300, 270, 100, 40);
        topCenterSpinner3.setBorder(BorderFactory.createLineBorder(Color.black, 5));
    }

    public void createSpinWheelCheckboxYes3(){
        spinWheelCheckBoxYes3 = new JCheckBox("YES");
        panel3.add(this.spinWheelCheckBoxYes3);
        spinWheelCheckBoxYes3.setVisible(true);
        spinWheelCheckBoxYes3.setSelected(false);
        spinWheelCheckBoxYes3.setBounds(250, 340, 60, 60);
        spinWheelCheckBoxYes3.setBackground(bkcolor);
    }
    public void createSpinWheelCheckboxNo3(){
        spinWheelCheckBoxNo3 = new JCheckBox("NO");
        panel3.add(this.spinWheelCheckBoxNo3);
        spinWheelCheckBoxNo3.setVisible(true);
        spinWheelCheckBoxNo3.setSelected(false);
        spinWheelCheckBoxNo3.setBounds(350, 340, 60, 60);
        spinWheelCheckBoxNo3.setBackground(bkcolor);
    }

    public void createPage4Label(){
        page4 = new JLabel("Endgame");
        page4.setBounds(95, 15, 500, 70);
        page4.setVisible(true);
        page4.setFont(new Font("Times New Roman", Font.BOLD, 50));
        panel4.add(this.page4);
    }

    public void createChoose1label(){
        choose1 = new JLabel("Estimate Robot's Weight: ");
        choose1.setBounds(frame.getWidth()/2-200, 300, 400, 100);
        choose1.setVisible(true);
        choose1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panel4.add(this.choose1);
    }

    public void createHeavyCheckbox4(){
        heavy = new JCheckBox("Heavy");
        panel4.add(this.heavy);
        heavy.setVisible(true);
        heavy.setSelected(false);
        heavy.setBounds(frame.getWidth()/4, 400, 100, 15);
        heavy.setBackground(bkcolor);
    }

    public void createMediumCheckbox4(){
        medium = new JCheckBox("Medium");
        panel4.add(this.medium);
        medium.setVisible(true);
        medium.setSelected(false);
        medium.setBounds(frame.getWidth()/4+frame.getWidth()/4, 400, 100, 15);
        medium.setBackground(bkcolor);
    }

    public void createLightCheckbox4(){
        light = new JCheckBox("Light");
        panel4.add(this.light);
        light.setVisible(true);
        light.setSelected(false);
        light.setBounds(frame.getWidth()/4+frame.getWidth()/4+frame.getWidth()/4, 400, 100, 15);
        light.setBackground(bkcolor);
    }

    public void createClimbCheckbox4(){
        climb = new JCheckBox("Climb?");
        panel4.add(this.climb);
        climb.setVisible(true);
        climb.setSelected(false);
        climb.setBounds(frame.getWidth()/2, 200, 400, 50);
        climb.setFont(new Font("Times New Roman", Font.BOLD, 40));
        climb.setBackground(bkcolor);
    }


    public void createOtherInfoBox(){
        otherInfo = new JTextArea();
        otherInfo.setVisible(true);
        otherInfo.setBounds(100, 100, 300, 300);
        panel5.add(this.otherInfo);
        otherInfo.setLineWrap(true);
        otherInfo.setBorder(BorderFactory.createLineBorder(Color.black, 5));

    }

    public void createSubmitButton(){
        bSubmit = new JButton("Submit");
        panel5.add(this.bSubmit);
        bSubmit.setVisible(true);
        bSubmit.setBounds(nextx, nexty,buttonw, buttonh);
        bSubmit.addActionListener(this::actionBSubmit);
    }



    public void actionBn1 (ActionEvent actionEvent){                                     //Action event for clicking next on page 1
        frame.setContentPane(panel2);
        frame.repaint();
        frame.revalidate();
    }
    public void actionBp2 (ActionEvent actionEvent){                                        //Action event for clicking previous on page 2
        frame.setContentPane(panel);
        frame.repaint();
        frame.revalidate();
    }
    public void actionBn2 (ActionEvent actionEvent){                                    //Action event for clicking next on page 2
        frame.setContentPane(panel3);
        frame.repaint();
        frame.revalidate();
    }
    public void actionBp3 (ActionEvent actionEvent){                                    //action event for clicking previous on page 3
        frame.setContentPane(panel2);
        frame.repaint();
        frame.revalidate();
    }
    public void actionBn3 (ActionEvent actionEvent){                                    //action event for clicking next button on page 3
        frame.setContentPane(panel4);
        frame.repaint();
        frame.revalidate();
    }
    public void actionBp4 (ActionEvent actionEvent){                                    //action event for clicking previous button on page 4
        frame.setContentPane(panel3);
        frame.repaint();
        frame.revalidate();
    }
    public void actionBn4 (ActionEvent actionEvent){                                        //action event for clicking next button on page 4
        frame.setContentPane(panel5);
        frame.repaint();
        frame.revalidate();
    }
    public void actionBp5 (ActionEvent actionEvent){                                        //action event for clicking previous button on page 5
        frame.setContentPane(panel4);
        frame.repaint();
        frame.revalidate();
    }
    public void actionBSubmit (ActionEvent actionEvent){
        //page 1
        System.out.println("Page 1");
        System.out.println("Team spinner value: " + this.teamSpinner.getValue());
        System.out.println("Match number value: " + this.matchSpinner.getValue());

        //page 2
        System.out.println("Page 2:");
        System.out.println("Power cell level Auto: bottom:   " + this.bottomSpinner.getValue() + "  Top: " + this.topSpinner.getValue() + "  Top Center:  " + this.topCenterSpinner.getValue());
        if (this.spinWheelCheckBoxYes.isSelected() == true){
            System.out.println("Spin the Wheel: Yes");
        } else{
            System.out.println("Spin the Wheel: No");
        }

        //page 3
        System.out.println("Page 3:");
        System.out.println("Power cell level Tele-op: bottom:   " + this.bottomSpinner3.getValue() + "  Top: " + this.topSpinner3.getValue() + "  Top Center:  " + this.topCenterSpinner3.getValue());
        if (this.spinWheelCheckBoxYes3.isSelected() == true){
            System.out.println("Spin the Wheel: Yes");
        } else {
            System.out.println("Spin the Wheel: No");
        }

        //page 4
        System.out.println("Page 4:");
        if (this.climb.isSelected() == true){
            System.out.println("Can climb: Yes");
        } else {
            System.out.println("Can climb: No");
        }
        if (this.heavy.isSelected() == true){
            System.out.println("Heavy Robot");
        } else if (this.medium.isSelected() == true){
            System.out.println("Medium Robot");
        } else if (this.light.isSelected() == true){
            System.out.println("Light Robot");
        } else{
            System.out.println("Robot weight is unclear");
        }

        System.out.println("Page 5:");
        System.out.println("Other Info:   " + otherInfo.getText());

    }



    public static void main(String[] args){                                                 //main method that runs the program
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main run = new Main();
                run.createFrame();
            }
        });
    }

}
