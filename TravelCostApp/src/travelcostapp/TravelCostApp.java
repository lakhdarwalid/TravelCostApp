package travelcostapp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class TravelCostApp {
        
    static JFrame frame;
        static JPanel panel;
        static JLabel TitleLabel;
        static JLabel MtoDriveLabel;
        static JLabel MperGLabel;
        static JLabel GasPriceLabel;
        static JLabel ParkingCostLabel;
        static JLabel TollsCostLabel;
        static JLabel ResultLabel;
        static JTextField MtoDrive;
        static JTextField MperG;
        static JTextField GasPrice;
        static JTextField ParkingCost;
        static JTextField TollsCost;
        static JTextField Result;
        static JButton Calculate;
        static JButton Clear;
   
    public static void main(String[] args) {
         
        frame = new JFrame("Travel Cost App ver.2.0");
        Image img = Toolkit.getDefaultToolkit().getImage("car.png");
        frame.setIconImage(img);
        
        panel = new JPanel();
        panel.setLayout(null);
        
        TitleLabel = new JLabel("TRAVEL COST APP");
        TitleLabel.setForeground(Color.blue);
        Font font = new Font("arial bold", 0, 25);
        TitleLabel.setFont(font);
        TitleLabel.setBounds(125, 40, 250, 30);
        
        MtoDriveLabel = new JLabel("Miles to Drive :");
        font = new Font("arial bold", 0, 15);
        MtoDriveLabel.setFont(font);
        MtoDriveLabel.setBounds(125, 100, 150, 30);
        
        MperGLabel = new JLabel("Miles per Gallon :");
        MperGLabel.setFont(font);
        MperGLabel.setBounds(108, 140, 150, 30);
        
        GasPriceLabel = new JLabel("Gasoline Price :");
        GasPriceLabel.setFont(font);
        GasPriceLabel.setBounds(120, 180, 150, 30);
        
        ParkingCostLabel = new JLabel("Parking Cost :");
        ParkingCostLabel.setFont(font);
        ParkingCostLabel.setBounds(132, 220, 150, 30);
        
        TollsCostLabel = new JLabel("Tolls Cost :");
        TollsCostLabel.setFont(font);
        TollsCostLabel.setBounds(150, 260, 150, 30);
        
        ResultLabel = new JLabel("Result :");
        ResultLabel.setFont(font);
        ResultLabel.setBounds(175, 380, 150, 30);
        
        
        MtoDrive = new JTextField(30);
        font = new Font("arial bold", 0, 15);
        MtoDrive.setFont(font);
        MtoDrive.setBounds(240, 100, 150, 30);
        
        MperG = new JTextField(30);
        MperG.setFont(font);
        MperG.setBounds(240, 140, 150, 30);
        
        GasPrice = new JTextField(30);
        GasPrice.setFont(font);
        GasPrice.setBounds(240, 180, 150, 30);
        
        ParkingCost = new JTextField(30);
        ParkingCost.setFont(font);
        ParkingCost.setBounds(240, 220, 150, 30);
        
        TollsCost = new JTextField(30);
        TollsCost.setFont(font);
        TollsCost.setBounds(240, 260, 150, 30);
        
        Result = new JTextField(30);
        Result.setFont(font);
        Result.setBackground(Color.GREEN);
        Result.setForeground(Color.red);
        Result.setBorder(null);
        Result.setEditable(false);
        Result.setBounds(240, 380, 150, 30);
        
        Calculate = new JButton("Calculate");
        Calculate.setFont(font);
        Calculate.setBounds(100, 310, 120, 30);
        Calculate.addActionListener(new CalculateCostListener());
                
        Clear = new JButton("Clear");
        Clear.setFont(font);
        Clear.setBounds(250, 310, 120, 30);
        Clear.addActionListener(new ClearFileds());
        
        panel.add(TitleLabel);
        panel.add(MtoDriveLabel);
        panel.add(MperGLabel);
        panel.add(GasPriceLabel);
        panel.add(ParkingCostLabel);
        panel.add(TollsCostLabel);
        panel.add(ResultLabel);
        panel.add(MtoDrive);
        panel.add(MperG);
        panel.add(GasPrice);
        panel.add(ParkingCost);
        panel.add(TollsCost);
        panel.add(Result);
        panel.add(Calculate);
        panel.add(Clear);
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocation(500, 200);
        frame.setResizable(false);
        frame.setVisible(true);
        
    }
    
    static class ClearFileds implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            MtoDrive.setText("");
            MperG.setText("");
            GasPrice.setText("");
            ParkingCost.setText("");
            TollsCost.setText("");
            Result.setText("");
        }
    
    }
    
    static class CalculateCostListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            double MiletoDrive;
            double MileperG;
            double GsPrice;
            double PCost;
            double TCost;
            MiletoDrive = Double.parseDouble(MtoDrive.getText());
            MileperG = Double.parseDouble(MperG.getText());
            GsPrice = Double.parseDouble(GasPrice.getText());
            PCost = Double.parseDouble(ParkingCost.getText());
            TCost = Double.parseDouble(TollsCost.getText());
            TravelCost travelCost= new TravelCost(MiletoDrive, MileperG, GsPrice, PCost, TCost);
            travelCost.CalCost();
            Result.setText(""+travelCost.getTotalCost());
            
        }
    
    }
}
