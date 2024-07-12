
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PomodoroApp {
    private static final int POMODORO_TIME = 45 * 60; // 45 minutes in seconds
    private static int timeLeft = POMODORO_TIME;
    private static Timer timer;
    private static JLabel timerLabel; // Declare timerLabel here

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pomodoro Timer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setAlwaysOnTop(true);

        timerLabel = new JLabel(String.valueOf(timeLeft), SwingConstants.CENTER); // Initialize timerLabel here
        timerLabel.setFont(new Font("Consolas", Font.BOLD, 100));

        JButton startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (timer == null || !timer.isRunning()) {
                    timer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            timeLeft--;
                            int minutes = timeLeft / 60;
                            int seconds = timeLeft % 60;
                            int firstDigitOfSeconds = seconds / 10;
                            int lastDigitOfSeconds = seconds % 10;
                            timerLabel.setText(String.format("<html>%02d:%d<font color='red'>%d</font></html>", minutes,
                                    firstDigitOfSeconds, lastDigitOfSeconds));
                            if (timeLeft <= 0) {
                                timer.stop();
                                timeLeft = POMODORO_TIME;
                            }
                        }
                    });
                    timer.start();
                }
            }
        });

        JButton stopButton = new JButton("Stop");
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (timer != null) {
                    timer.stop();
                    timeLeft = POMODORO_TIME;
                    timerLabel.setText(String.format("%02d:%02d", timeLeft / 60, timeLeft % 60));
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(startButton);
        panel.add(stopButton);

        frame.setLayout(new BorderLayout());
        frame.add(timerLabel, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}