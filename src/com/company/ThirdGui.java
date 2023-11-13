package com.company;
import javax.swing.*;import java.awt.*;
import java.util.HashMap;
import java.util.Map;
public class ThirdGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Приложение с изображениями и подписями");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        Map<String, ImageIcon> images = new HashMap<>();
        images.put("Мейкун", new ImageIcon("C:\\Users\\Настя\\Downloads\\meikyn.jpg"));
        images.put("Шпиц", new ImageIcon("C:\\Users\\Настя\\Downloads\\spic.jpeg"));
        for (Map.Entry<String, ImageIcon> entry : images.entrySet()) {
            JLabel label = new JLabel(entry.getKey(), entry.getValue(), JLabel.CENTER);
            panel.add(label);
        }
        frame.getContentPane().add(panel);

        frame.setPreferredSize(new Dimension(1000, 1400));
        frame.pack();
        frame.setVisible(true);
    }
}
