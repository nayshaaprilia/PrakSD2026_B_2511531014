package pekan8_2511531014;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class BubbleSortGUI_2511531014 extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JTextField inputField;
    private JButton inputButton;
    private JButton stepButton;
    private JButton resetButton;
    private JPanel panelArray;
    private JTextArea stepArea;

    private int[] array;
    private JLabel[] labelArray;

    private int i = 0;
    private int j = 0;
    private int stepCount = 1;
    private boolean sorting = false;

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {

                    BubbleSortGUI_2511531014 frame_1014 =
                            new BubbleSortGUI_2511531014();

                    frame_1014.setVisible(true);

                } catch (Exception e_1014) {

                    e_1014.printStackTrace();
                }
            }
        });
    }

    public BubbleSortGUI_2511531014() {

        setTitle("Visualisasi Bubble Sort");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 500);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(new BorderLayout(10, 10));
        setContentPane(contentPane);

        JPanel topPanel_1014 = new JPanel(new FlowLayout());

        JLabel lblInput_1014 =
                new JLabel("Masukkan angka (pisahkan koma):");

        inputField = new JTextField(25);

        inputButton = new JButton("Tampilkan");

        topPanel_1014.add(lblInput_1014);
        topPanel_1014.add(inputField);
        topPanel_1014.add(inputButton);

        contentPane.add(topPanel_1014, BorderLayout.NORTH);

        panelArray = new JPanel();
        panelArray.setLayout(new FlowLayout());

        contentPane.add(panelArray, BorderLayout.CENTER);

        stepArea = new JTextArea();
        stepArea.setEditable(false);

        JScrollPane scrollPane_1014 =
                new JScrollPane(stepArea);

        scrollPane_1014.setPreferredSize(
                new Dimension(300, 0));

        contentPane.add(scrollPane_1014,
                BorderLayout.EAST);

        JPanel bottomPanel_1014 = new JPanel();

        stepButton =
                new JButton("Sorting Selanjutnya");

        resetButton =
                new JButton("Reset");

        stepButton.setEnabled(false);

        bottomPanel_1014.add(stepButton);
        bottomPanel_1014.add(resetButton);

        contentPane.add(bottomPanel_1014,
                BorderLayout.SOUTH);

        inputButton.addActionListener(
                e_1014 -> setArrayFromInput_2511531014());

        stepButton.addActionListener(
                e_1014 -> nextStep_2511531014());

        resetButton.addActionListener(
                e_1014 -> reset_2511531014());
    }

    private void setArrayFromInput_2511531014() {

        String text_1014 =
                inputField.getText().trim();

        if (text_1014.isEmpty())
            return;

        String[] parts_1014 =
                text_1014.split(",");

        array = new int[parts_1014.length];

        try {

            for (int k_1014 = 0;
                 k_1014 < parts_1014.length;
                 k_1014++) {

                array[k_1014] =
                        Integer.parseInt(
                                parts_1014[k_1014]
                                        .trim());
            }

        } catch (NumberFormatException e_1014) {

            JOptionPane.showMessageDialog(
                    this,
                    "Masukkan hanya angka yang dipisahkan koma!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);

            return;
        }

        i = 0;
        j = 0;
        stepCount = 1;
        sorting = true;

        stepButton.setEnabled(true);

        stepArea.setText("");

        panelArray.removeAll();

        labelArray =
                new JLabel[array.length];

        for (int k_1014 = 0;
             k_1014 < array.length;
             k_1014++) {

            labelArray[k_1014] =
                    new JLabel(
                            String.valueOf(
                                    array[k_1014]));

            labelArray[k_1014].setFont(
                    new Font(
                            "Arial",
                            Font.BOLD,
                            24));

            labelArray[k_1014].setOpaque(true);

            labelArray[k_1014].setBackground(
                    Color.WHITE);

            labelArray[k_1014].setBorder(
                    BorderFactory
                            .createLineBorder(
                                    Color.BLACK));

            labelArray[k_1014].setPreferredSize(
                    new Dimension(60, 50));

            labelArray[k_1014]
                    .setHorizontalAlignment(
                            SwingConstants.CENTER);

            panelArray.add(
                    labelArray[k_1014]);
        }

        panelArray.revalidate();
        panelArray.repaint();
    }

    private void nextStep_2511531014() {

        if (!sorting)
            return;

        resetColors_2511531014();

        if (j < array.length - i - 1) {

            labelArray[j]
                    .setBackground(Color.YELLOW);

            labelArray[j + 1]
                    .setBackground(Color.YELLOW);

            int nilaiKiri_1014 =
                    array[j];

            int nilaiKanan_1014 =
                    array[j + 1];

            if (array[j] > array[j + 1]) {

                int temp_1014 =
                        array[j];

                array[j] =
                        array[j + 1];

                array[j + 1] =
                        temp_1014;

                updateLabels_2511531014();

                labelArray[j]
                        .setBackground(Color.RED);

                labelArray[j + 1]
                        .setBackground(Color.RED);

                stepArea.append(
                        "Langkah "
                                + stepCount
                                + " : Tukar "
                                + nilaiKiri_1014
                                + " dengan "
                                + nilaiKanan_1014
                                + "\n");

            } else {

                stepArea.append(
                        "Langkah "
                                + stepCount
                                + " : Tidak ada pertukaran ("
                                + nilaiKiri_1014
                                + " dan "
                                + nilaiKanan_1014
                                + ")\n");
            }

            j++;

        } else {

            labelArray[
                    array.length - i - 1]
                    .setBackground(Color.GREEN);

            j = 0;
            i++;
        }

        stepCount++;

        if (i >= array.length - 1) {

            sorting = false;

            for (JLabel lbl_1014
                    : labelArray) {

                lbl_1014.setBackground(
                        Color.GREEN);
            }

            stepButton.setEnabled(false);

            stepArea.append(
                    "\n=== SORTING SELESAI ===\n");

            JOptionPane.showMessageDialog(
                    this,
                    "Sorting selesai!");
        }
    }

    private void updateLabels_2511531014() {

        for (int k_1014 = 0;
             k_1014 < array.length;
             k_1014++) {

            labelArray[k_1014]
                    .setText(
                            String.valueOf(
                                    array[k_1014]));
        }
    }

    private void resetColors_2511531014() {

        if (labelArray == null)
            return;

        for (JLabel lbl_1014
                : labelArray) {

            if (!Color.GREEN.equals(
                    lbl_1014.getBackground())) {

                lbl_1014.setBackground(
                        Color.WHITE);
            }
        }
    }

    private void reset_2511531014() {

        inputField.setText("");

        panelArray.removeAll();

        panelArray.revalidate();

        panelArray.repaint();

        stepArea.setText("");

        stepButton.setEnabled(false);

        array = null;
        labelArray = null;

        sorting = false;

        i = 0;
        j = 0;
        stepCount = 1;
    }
}