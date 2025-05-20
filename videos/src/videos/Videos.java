package videos;

import java.io.File;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Videos {
    private JFrame frame;
    private JButton playButton;
    private JButton stopButton;
    private JPanel panel;
    
    public Videos() {
        inicializarComponentes();
        configurarVentana();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Videos();
        });
    }
    
    public static void video() {
        main(new String[]{});
    }
    
    private void inicializarComponentes() {
        playButton = new JButton("Reproducir");
        stopButton = new JButton("Detener");
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(playButton);
        panel.add(stopButton);
    }
    
    private void configurarVentana() {
        frame = new JFrame("Reproductor Simple");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        // Configurar acciones de botones usando Desktop para abrir el video
        playButton.addActionListener(e -> {
            try {
                File video = new File("video.mp4");
                if(video.exists()) {
                    Desktop.getDesktop().open(video);
                } else {
                    JOptionPane.showMessageDialog(frame, "Video no encontrado");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Error al reproducir: " + ex.getMessage());
            }
        });
        
        stopButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Para detener el video, cierre el reproductor del sistema");
        });
    }
}
