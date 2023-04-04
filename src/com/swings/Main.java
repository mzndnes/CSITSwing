package com.swings;


import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        final JFrame frame = new JFrame("JTable Demo");

        String[] columns = {"Code", "Name"};

        String[][] data = {
            {"MBF", "CITYGROUP"},
            {"MBL", "BANK OF AMERICA"},
            {"MJP", "Morgan Stanley Dean Witter & Co."}
        };

        JTable table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 200);
        frame.setVisible(true);
    }
}