package net;

import javax.swing.*;
import java.io.IOException;

public class MainFrame extends JFrame {

    public MainFrame() throws IOException {
        setTitle("Выполнил студент группы ИВТ-173 Мамонов Владислав");
        setSize(1020, 555);
        add(new BackgroundPanel("background.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        MainFrame frame = new MainFrame();
    }
}
