
package hw72;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Приложение "Часы"
 * @author Егор
 */
public class Clock extends JFrame{

    /**
    * Показывает системное время in real-time.
    */
    public void showTime() {
        labelSettings();
        showForm();
        javax.swing.Timer timer = new javax.swing.Timer( 1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calendar cal = Calendar.getInstance();
                int hour = cal.get(Calendar.HOUR_OF_DAY);
                int min = cal.get(Calendar.MINUTE);
                int sec = cal.get(Calendar.SECOND);
                String s1 = new String();
                s1 += hour / 10;
                s1 += hour % 10;
                String s2 = new String();
                s2 += min / 10;
                s2 += min % 10;
                String s3 = new String();
                s3 += sec / 10;
                s3 += sec % 10;
                label.setText(s1 + ":" + s2 + ":" + s3);
                add(label);
            }
        } );
        timer.start();
    }

    private JLabel label= new JLabel();

    /**
    * Настраивает все параметры для надписи.
    */
    private void labelSettings() {
        label.setVerticalAlignment(JLabel.CENTER);
	label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Courier New", Font.TYPE1_FONT, 54));
        label.setForeground(Color.white);
    }

    /**
    * Настраивает все параметры для окна.
    */
    private void showForm() {
        getContentPane().setBackground(Color.black);
        setSize(380, 180);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setTitle(" Awesome Clock v1.1");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension windowSize = getSize();
        int windowX = Math.max(0, (screenSize.width  - windowSize.width ) / 2);
        int windowY = Math.max(0, (screenSize.height - windowSize.height) / 2);
        setLocation(windowX, windowY);
    }

}
