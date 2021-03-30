package com.thepackage;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CurrencyConverter {

    private JFrame TheApplication;
    private JButton btnConvert;
    private JTextField txtInput;
    private JLabel lblOutput;
    private JComboBox cbFirstCurrency;
    private JComboBox cbSecondCurrency;
    private String[] Currencies ={"USD","EUR","JPY","GBP","AUD","CAD","CHF","CNY","SEK","NZD","INR"};


    public CurrencyConverter()
    {
        //create gui
        TheApplication = new JFrame("Currency Converter");

        //create button
        btnConvert = new JButton("Convert Currency");
        btnConvert.setBounds(20,100,160,20);
        TheApplication.add(btnConvert);

        //create input
        txtInput = new JTextField("Input Amount");
        txtInput.setBounds(20,20,100,20);
        TheApplication.add(txtInput);

        //inputs currencybox
        cbFirstCurrency = new JComboBox(Currencies);
        cbFirstCurrency.setBounds(130, 20, 50,20);
        TheApplication.add(cbFirstCurrency);

        //outputs curreny
        lblOutput = new JLabel("Click Convert");
        Border border = BorderFactory.createLineBorder(Color.black, 1);
        lblOutput.setBorder(border);
        lblOutput.setBounds(20, 50, 100,20);
        TheApplication.add(lblOutput);

        //outputs currencybox
        cbSecondCurrency = new JComboBox(Currencies);
        cbSecondCurrency.setBounds(130, 50, 50,20);
        TheApplication.add(cbSecondCurrency);

        //display the application
        TheApplication.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        TheApplication.setResizable(true);
        TheApplication.setLayout(null);
        TheApplication.setSize(210,180);
        TheApplication.setVisible(true);

        //listen to button click
        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    //get input
                    double num = Double.parseDouble(txtInput.getText());

                    //send both currency types and actual # to logic function
                    num = ConversionLogic(cbFirstCurrency.getSelectedItem().toString(),cbSecondCurrency.getSelectedItem().toString(), num);
                    lblOutput.setText(String.format("%.2f", num));//display new value to 2 decimal places

                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(new JFrame(), "Please enter number", "Retry", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private double ConversionLogic(String Finput, String Sinput, double num)
    {
        //as of 5/5/18
        double output = 0;

        //Currencies ={"USD","EUR","JPY","GBP","AUD","CAD","CHF","CNY","SEK","NZD","INR"};
        if(Finput == "USD")
        {
            //currencies compared to USD
        /*
        usd = 1
        eur = 0.84
        jpy = 110.45
        gbp = 0.74
        aud= 1.34
        cad = 1.29
        chf = 1.00
        cny = 6.37
        sek = 8.69
        nzd = 1.46
        inr = 72.40
        
         */
            switch(Sinput)
            {
                case "USD":
                    output = num;
                    break;
                case "EUR":
                    output = num * 0.84;
                    break;
                case "JPY":
                    output = num * 110.45;
                    break;
                case "GBP":
                    output = num * 0.74;
                    break;
                case "AUD":
                    output = num * 1.34;
                    break;
                case "CAD":
                    output = num * 1.29;
                    break;
                case "CHF":
                    output = num * 1.00;
                    break;
                case "CNY":
                    output = num * 6.37;
                    break;
                case "SEK":
                    output = num * 8.69;
                    break;
                case "NZD":
                    output = num * 1.46;
                    break;
                case "INR":
                	output = num * 72.40;
                
            }
        }
        else if(Finput == "EUR")
        {
            //currencies compared to EUR
        /*
        usd = 1.18
        eur = 1
        jpy = 130.09
        gbp = 0.87
        aud= 1.57
        cad = 1.51
        chf = 1.18
        cny = 7.52
        sek = 10.27
        nzd = 1.71
        inr = 86.12
         */
            switch(Sinput)
            {
                case "USD":
                    output = num* 1.18;
                    break;
                case "EUR":
                    output = num;
                    break;
                case "JPY":
                    output = num * 130.09;
                    break;
                case "GBP":
                    output = num * 0.87;
                    break;
                case "AUD":
                    output = num * 1.57;
                    break;
                case "CAD":
                    output = num * 1.51;
                    break;
                case "CHF":
                    output = num * 1.18;
                    break;
                case "CNY":
                    output = num * 7.52;
                    break;
                case "SEK":
                    output = num * 10.27;
                    break;
                case "NZD":
                    output = num * 1.71;
                    break;
                case "INR":
                	output = num * 86.12;
            }
        }
        else if(Finput == "JPY")
        {
            //currencies compared to JPY
        /*
        usd = 0.0091
        eur = 0.0077
        jpy = 1
        gbp = 0.0067
        aud= 0.012
        cad = 0.012
        chf = .0091
        cny = 0.058
        sek = 0.079
        nzd = 0.013
        inr = 0.67
         */
            switch(Sinput)
            {
                case "USD":
                    output = num* 0.0091;
                    break;
                case "EUR":
                    output = num * 0.0077;
                    break;
                case "JPY":
                    output = num;
                    break;
                case "GBP":
                    output = num * 0.0067;
                    break;
                case "AUD":
                    output = num * 0.012;
                    break;
                case "CAD":
                    output = num * 0.012;
                    break;
                case "CHF":
                    output = num * 0.0091;
                    break;
                case "CNY":
                    output = num * 0.058;
                    break;
                case "SEK":
                    output = num * 0.079;
                    break;
                case "NZD":
                    output = num * 0.013;
                    break;
                case "INR":
                	output = num * 0.67;
            }
        }
        else if(Finput == "GBP")
        {
            //currencies compared to GBP
        /*
        usd = 1.35
        eur = 1.14
        jpy = 148.65
        gbp = 1
        aud= 1.80
        cad = 1.73
        chf = 1.35
        cny = 8.60
        sek = 11.75
        nzd = 1.96
        inr = 100.75
         */
            switch(Sinput)
            {
                case "USD":
                    output = num* 1.35;
                    break;
                case "EUR":
                    output = num * 1.14;
                    break;
                case "JPY":
                    output = num * 148.65;
                    break;
                case "GBP":
                    output = num;
                    break;
                case "AUD":
                    output = num * 1.80;
                    break;
                case "CAD":
                    output = num * 1.73;
                    break;
                case "CHF":
                    output = num * 1.35;
                    break;
                case "CNY":
                    output = num * 8.60;
                    break;
                case "SEK":
                    output = num * 11.75;
                    break;
                case "NZD":
                    output = num * 1.96;
                    break;
                case "INR":
                    output = num * 100.75;
                    break;    
            }
        }
        else if(Finput == "AUD")
        {
            //currencies compared to AUD
        /*
        usd = 0.75
        eur = 0.64
        jpy = 82.81
        gbp = 0.56
        aud= 1
        cad = 0.96
        chf = 0.75
        cny = 4.79
        sek = 6.54
        nzd = 1.09
        inr = 55.91
         */
            switch(Sinput)
            {
                case "USD":
                    output = num* 0.75;
                    break;
                case "EUR":
                    output = num * 0.64;
                    break;
                case "JPY":
                    output = num * 82.81;
                    break;
                case "GBP":
                    output = num * 0.56;
                    break;
                case "AUD":
                    output = num;
                    break;
                case "CAD":
                    output = num *0.96;
                    break;
                case "CHF":
                    output = num * 0.75;
                    break;
                case "CNY":
                    output = num * 4.79;
                    break;
                case "SEK":
                    output = num * 6.54;
                    break;
                case "NZD":
                    output = num * 1.09;
                    break;
                case "INR":
                    output = num * 55.91;
                    break;
            }
        }
        else if(Finput == "CAD")
        {
            //currencies compared to CAD
        /*
        usd = 0.78
        eur = 0.66
        jpy = 86.14
        gbp = 0.58
        aud= 1.04
        cad = 1
        chf = 0.78
        cny = 4.98
        sek = 6.80
        nzd = 1.13
        inr = 58.19
         */
            switch(Sinput)
            {
                case "USD":
                    output = num* 0.78;
                    break;
                case "EUR":
                    output = num * 0.66;
                    break;
                case "JPY":
                    output = num * 86.14;
                    break;
                case "GBP":
                    output = num * 0.58;
                    break;
                case "AUD":
                    output = num * 1.04;
                    break;
                case "CAD":
                    output = num;
                    break;
                case "CHF":
                    output = num * 0.78;
                    break;
                case "CNY":
                    output = num * 4.98;
                    break;
                case "SEK":
                    output = num * 6.80;
                    break;
                case "NZD":
                    output = num * 1.13;
                    break;
                case "INR":
                    output = num * 58.19;
                    break;
            }
        }
        else if(Finput == "CHF")
        {
            //currencies compared to CHF
        /*
        usd = 1
        eur = 0.85
        jpy = 110.13
        gbp = 0.74
        aud= 1.33
        cad = 1.28
        chf = 1
        cny = 6.37
        sek = 8.70
        nzd = 1.45
        inr = 77.90
         */
            switch(Sinput)
            {
                case "USD":
                    output = num* 1;
                    break;
                case "EUR":
                    output = num * 0.85;
                    break;
                case "JPY":
                    output = num * 110.13;
                    break;
                case "GBP":
                    output = num * 0.74;
                    break;
                case "AUD":
                    output = num * 1.33;
                    break;
                case "CAD":
                    output = num * 1.28;
                    break;
                case "CHF":
                    output = num;
                    break;
                case "CNY":
                    output = num * 6.37;
                    break;
                case "SEK":
                    output = num * 8.70;
                    break;
                case "NZD":
                    output = num * 1.45;
                    break;
                case "INR":
                    output = num * 77.90;
                    break;
            }
        }
        else if(Finput == "CNY")
        {
            //currencies compared to CNY
        /*
        usd = 0.16
        eur = 0.13
        jpy = 17.29
        gbp = 0.12
        aud= 0.21
        cad = 0.20
        chf = 0.16
        cny = 1
        sek = 1.37
        nzd = 0.23
        inr = 11.18
         */
            switch(Sinput)
            {
                case "USD":
                    output = num* 0.16;
                    break;
                case "EUR":
                    output = num * 0.13;
                    break;
                case "JPY":
                    output = num * 17.29;
                    break;
                case "GBP":
                    output = num * 0.12;
                    break;
                case "AUD":
                    output = num * 0.21;
                    break;
                case "CAD":
                    output = num * 0.20;
                    break;
                case "CHF":
                    output = num * 0.16;
                    break;
                case "CNY":
                    output = num;
                    break;
                case "SEK":
                    output = num * 1.37;
                    break;
                case "NZD":
                    output = num * 0.23;
                    break;
                case "INR":
                    output = num * 11.18;
                    break;
            }
        }
        else if(Finput == "SEK")
        {
            //currencies compared to SEK
        /*
        usd = 0.12
        eur = 0.097
        jpy = 12.67
        gbp = 0.085
        aud= 0.15
        cad = 0.15
        chf = 0.11
        cny = 0.73
        sek = 1
        nzd = 0.17
        inr = 8.40
         */
            switch(Sinput)
            {
                case "USD":
                    output = num* 0.12;
                    break;
                case "EUR":
                    output = num * 0.097;
                    break;
                case "JPY":
                    output = num * 12.67;
                    break;
                case "GBP":
                    output = num * 0.085;
                    break;
                case "AUD":
                    output = num * 0.15;
                    break;
                case "CAD":
                    output = num * 0.15;
                    break;
                case "CHF":
                    output = num * 0.11;
                    break;
                case "CNY":
                    output = num * 0.73;
                    break;
                case "SEK":
                    output = num;
                    break;
                case "NZD":
                    output = num * 0.17;
                    break;
                case "INR":
                    output = num * 8.40;
                    break;
            }
        }
        else if(Finput == "NZD")
        {
            //currencies compared to NZD
        /*
        usd = 0.69
        eur = 0.58
        jpy = 76.06
        gbp = 0.51
        aud= 0.92
        cad = 0.88
        chf = 0.69
        cny = 4.40
        sek = 6.01
        nzd = 1
        inr = 51.30
         */
            switch(Sinput)
            {
                case "USD":
                    output = num* 0.69;
                    break;
                case "EUR":
                    output = num * 0.58;
                    break;
                case "JPY":
                    output = num * 76.06;
                    break;
                case "GBP":
                    output = num * 0.51;
                    break;
                case "AUD":
                    output = num * 0.92;
                    break;
                case "CAD":
                    output = num * 0.88;
                    break;
                case "CHF":
                    output = num * 0.69;
                    break;
                case "CNY":
                    output = num * 4.40;
                    break;
                case "SEK":
                    output = num * 6.01;
                    break;
                case "NZD":
                    output = num;
                    break;
                case "INR":
                    output = num * 51.30;
                    break;
            }
        }

        else if(Finput == "INR")
        {
            //currencies compared to NZD
        /*
        usd = 0.014
        eur = 0.012
        jpy = 1.50
        gbp = 0.0099
        aud= 0.018
        cad = 0.017
        chf = 0.013
        cny = 0.090
        sek = 0.12
        nzd = 0.019
        inr = 1
         */
            switch(Sinput)
            {
                case "USD":
                    output = num* 0.014;
                    break;
                case "EUR":
                    output = num * 0.012;
                    break;
                case "JPY":
                    output = num * 1.50;
                    break;
                case "GBP":
                    output = num * 0.0099;
                    break;
                case "AUD":
                    output = num * 0.018;
                    break;
                case "CAD":
                    output = num * 0.017;
                    break;
                case "CHF":
                    output = num * 0.013;
                    break;
                case "CNY":
                    output = num * 0.090;
                    break;
                case "SEK":
                    output = num * 0.12;
                    break;
                case "NZD":
                    output = num * 0.019 ;
                    break;
                case "INR":
                    output = num;
                    break;
            }
        }
        return output;
    }



    public static void main(String[] args)
    {
        //Create GUI/application
        new CurrencyConverter();
    }

}
