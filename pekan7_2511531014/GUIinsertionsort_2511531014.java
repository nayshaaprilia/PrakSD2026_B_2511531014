package pekan7_2511531014;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class GUIinsertionsort_2511531014 extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private int[] array_1014;
    private JLabel[] labelArray_1014;
    private JButton stepButton_1014, resetButton_1014, setButton_1014;
    private JTextField inputField_1014;
    private JPanel panelArray_1014;
    private JTextArea stepArea_1014;

    private int i = 1, j;
    private boolean sorting_1014 = false;
    private int stepCount_1014 = 1;

    public GUIinsertionsort_2511531014() {

        setTitle("Insertion Sort Langkah per Langkah");
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel input
        JPanel inputPanel = new JPanel(new FlowLayout());

        inputField_1014 = new JTextField(30);
        setButton_1014 = new JButton("Set Array");

        inputPanel.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel.add(inputField_1014);
        inputPanel.add(setButton_1014);

        // Panel array visual
        panelArray_1014 = new JPanel();
        panelArray_1014.setLayout(new FlowLayout());

        // Panel kontrol
        JPanel controlPanel = new JPanel();
        stepButton_1014 = new JButton("Langkah Selanjutnya");
        resetButton_1014 = new JButton("Reset");
        stepButton_1014.setEnabled(false);
        controlPanel.add(stepButton_1014);
        controlPanel.add(resetButton_1014);
        
        //Area teks untuk log Lanngkah Langkah
        stepArea_1014 = new JTextArea(0, 60);
        stepArea_1014.setEditable(false);
        stepArea_1014.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(stepArea_1014);
        
     // Tambahkan panel ke frame
        add(inputPanel, BorderLayout.NORTH);
        add(panelArray_1014, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.EAST);

        // Event Set Array
        setButton_1014.addActionListener(e -> setArrayFromInput());

        // Event Langkah Selanjutnya
        stepButton_1014.addActionListener(e -> performStep());

        // Event Reset
        resetButton_1014.addActionListener(e -> reset());
    }
    private void setArrayFromInput() {
        String text = inputField_1014.getText().trim();
        if (text.isEmpty())
            return;
        String[] parts = text.split(",");
        array_1014 = new int[parts.length];
        try {
            for (int k = 0; k < parts.length; k++) {
                array_1014[k] = Integer.parseInt(parts[k].trim());
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this,"Masukkan hanya angka yang dipisahkan "
            		+ "dengan koma!","Error", JOptionPane.ERROR_MESSAGE);
            return;   }
        i = 1;
        stepCount_1014 = 1;
        sorting_1014 = true;
        stepButton_1014.setEnabled(true);
        stepArea_1014.setText("");
        panelArray_1014.removeAll();
        labelArray_1014 = new JLabel[array_1014.length];
        for (int k = 0; k < array_1014.length; k++) {
            labelArray_1014[k] = new JLabel(String.valueOf(array_1014[k]));
            labelArray_1014[k].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_1014[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_1014[k].setPreferredSize(new Dimension(50, 50));
            labelArray_1014[k].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_1014.add(labelArray_1014[k]);
        }
        panelArray_1014.revalidate();
        panelArray_1014.repaint();
        
    }
    	private void performStep() {
    	    if (i < array_1014.length && sorting_1014) {
    	        int key = array_1014[i];
    	        j = i - 1;

    	        StringBuilder stepLog = new StringBuilder();
    	        stepLog.append("Langkah ").append(stepCount_1014)
    	        .append(": Memasukkan ").append(key).append("\n");

    	        while (j >= 0 && array_1014[j] > key) {
    	            array_1014[j + 1] = array_1014[j];
    	            j--;
    	        }

    	        array_1014[j + 1] = key;

    	        updateLabels();
    	        stepLog.append("Hasil: ") .append(arrayToString(array_1014)).append("\n\n");
    	        stepArea_1014.append(stepLog.toString());

    	        i++;
    	        stepCount_1014++;

    	        if (i >= array_1014.length) {
    	            sorting_1014 = false;
    	            stepButton_1014.setEnabled(false);
    	            JOptionPane.showMessageDialog(this, "Sorting selesai!");
    	        }
    	    }
    	}
    	private void updateLabels() {
    	    for (int k = 0; k < array_1014.length; k++) {
    	        labelArray_1014[k].setText(String.valueOf(array_1014[k]));
    	    }
    	}
    	private void reset() {
    	    inputField_1014.setText("");
    	    panelArray_1014.removeAll();
    	    panelArray_1014.repaint();
    	    panelArray_1014.revalidate();
    	    stepArea_1014.setText("");
    	    stepButton_1014.setEnabled(false);
    	    sorting_1014 = false;
    	    i = 1;
    	    stepCount_1014 = 1;
    	}
    	private String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
    	    for (int k = 0; k < arr.length; k++) {
    	        sb.append(arr[k]);
    	        if (k < arr.length - 1) {
    	            sb.append(", ");
    	        }
    	    }
    	    return sb.toString();
    	}
    	public static void main(String[] args) {
    	    javax.swing.SwingUtilities.invokeLater(() -> {
    	        GUIinsertionsort_2511531014 gui =
    	                new GUIinsertionsort_2511531014();
    	        gui.setVisible(true);
    	    });
    	}
    }
