
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mai Minh Hieu
 */
public class Controller {
    
    public Controller() {
        Gui c = new Gui();
        c.setVisible(true);
        DrawArea drawArea = new DrawArea();
        Container content = c.getContentPane();
        content.setLayout(new BorderLayout());
        content.add(drawArea, BorderLayout.CENTER);
        JPanel controls = new JPanel();
       c.getBtnClear().addActionListener((e) -> {
            drawArea.clear();;
        });
        c.getBtnBlue().addActionListener((e) -> {
            drawArea.blue();;
        });
        c.getBtnGreen().addActionListener((e) -> {
            drawArea.green();;
        });
        c.getBtnBlack().addActionListener((e) -> {
            drawArea.black();;
        });
        c.getBtnRed().addActionListener((e) -> {
            drawArea.red();;
        });
    }
}
