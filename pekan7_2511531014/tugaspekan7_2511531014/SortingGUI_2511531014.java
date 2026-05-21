package tugaspekan7_2511531014;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SortingGUI_2511531014 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// DEKLARASI KOMPONEN GUI
	private JTextField txtNama_1014, txtNim_1014, txtProdi_1014;
	private JButton btnTambah_1014, btnHapus_1014, btnSort_1014;
	private JComboBox<String> cmbAlgoritma_1014;
	private JTable tabelData_1014;
	private DefaultTableModel tableModel_1014;
	private JTextArea txtAreaLog_1014;

	// ArrayList penyimpanan data mahasiswa
	private ArrayList<Mahasiswa_2511531014> listMahasiswa;

	// CONSTRUCTOR
	public SortingGUI_2511531014() {

		setTitle("Pengurutan Nama Mahasiswa - Pekan 7");
		setSize(850, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		listMahasiswa = new ArrayList<>();

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(15, 15));

		// PANEL INPUT
		JPanel panelInput = new JPanel(new GridLayout(4, 2, 10, 10));

		panelInput.setBorder(
			BorderFactory.createTitledBorder(
			"Form Input Mahasiswa"));

		panelInput.add(new JLabel("NIM Mahasiswa:"));

		txtNim_1014 = new JTextField();
		panelInput.add(txtNim_1014);

		panelInput.add(new JLabel("Nama Mahasiswa:"));

		txtNama_1014 = new JTextField();
		panelInput.add(txtNama_1014);

		panelInput.add(new JLabel("Program Studi:"));

		txtProdi_1014 = new JTextField();
		panelInput.add(txtProdi_1014);

		btnTambah_1014 = new JButton("Tambah Data");
		btnHapus_1014 = new JButton("Kosongkan Semua Data");

		panelInput.add(btnTambah_1014);
		panelInput.add(btnHapus_1014);

		contentPane.add(panelInput, BorderLayout.NORTH);

		// PANEL TENGAH
		JPanel panelTengah =
			new JPanel(new BorderLayout(10, 10));

		JPanel panelSaring =
			new JPanel(new FlowLayout(FlowLayout.LEFT));

		panelSaring.add(
			new JLabel("Pilih Algoritma Sorting:"));

		String[] pilihanAlgoritma = {
			"Insertion Sort",
			"Selection Sort",
			"Bubble Sort"
		};

		cmbAlgoritma_1014 =
			new JComboBox<>(pilihanAlgoritma);

		panelSaring.add(cmbAlgoritma_1014);

		btnSort_1014 =
			new JButton("Mulai Sorting");

		panelSaring.add(btnSort_1014);

		panelTengah.add(panelSaring, BorderLayout.NORTH);

		// TABEL
		String[] kolom = {
			"NIM",
			"Nama Mahasiswa",
			"Program Studi"
		};

		tableModel_1014 =
			new DefaultTableModel(kolom, 0);

		tabelData_1014 =
			new JTable(tableModel_1014);

		JScrollPane scrollTabel =
			new JScrollPane(tabelData_1014);

		scrollTabel.setPreferredSize(
			new Dimension(800, 150));

		panelTengah.add(scrollTabel,
			BorderLayout.CENTER);

		contentPane.add(panelTengah,
			BorderLayout.CENTER);

		// PANEL LOG
		JPanel panelBawah =
			new JPanel(new BorderLayout());

		panelBawah.setBorder(
			BorderFactory.createTitledBorder(
			"Visualisasi Proses Langkah demi Langkah"));

		txtAreaLog_1014 = new JTextArea();

		txtAreaLog_1014.setEditable(false);

		txtAreaLog_1014.setFont(
			new Font("Monospaced",
			Font.PLAIN, 13));

		JScrollPane scrollLog =
			new JScrollPane(txtAreaLog_1014);

		scrollLog.setPreferredSize(
			new Dimension(800, 220));

		panelBawah.add(scrollLog,
			BorderLayout.CENTER);

		contentPane.add(panelBawah,
			BorderLayout.SOUTH);

		// EVENT BUTTON TAMBAH
		btnTambah_1014.addActionListener(
			new ActionListener() {

			public void actionPerformed(
				ActionEvent e) {

				tambahDataKeList();
			}
		});

		// EVENT BUTTON HAPUS
		btnHapus_1014.addActionListener(
			new ActionListener() {

			@Override
			public void actionPerformed(
				ActionEvent e) {

				listMahasiswa.clear();

				refreshTabel();

				txtAreaLog_1014.setText("");
			}
		});

		// EVENT BUTTON SORT
		btnSort_1014.addActionListener(
			new ActionListener() {

			@Override
			public void actionPerformed(
				ActionEvent e) {

				eksekusiSorting();
			}
		});
	}

	// METHOD INPUT DATA
	private void tambahDataKeList() {

		String nim =
			txtNim_1014.getText().trim();

		String nama =
			txtNama_1014.getText().trim();

		String prodi =
			txtProdi_1014.getText().trim();

		if (nim.isEmpty() ||
			nama.isEmpty() ||
			prodi.isEmpty()) {

			JOptionPane.showMessageDialog(
				this,
				"Isi semua data terlebih dahulu!",
				"Peringatan",
				JOptionPane.WARNING_MESSAGE);

			return;
		}

		Mahasiswa_2511531014 mhs =
			new Mahasiswa_2511531014(
			nama, nim, prodi);

		listMahasiswa.add(mhs);

		refreshTabel();

		txtNim_1014.setText("");
		txtNama_1014.setText("");
		txtProdi_1014.setText("");

		txtNim_1014.requestFocus();
	}

	// METHOD REFRESH TABEL
	private void refreshTabel() {

		tableModel_1014.setRowCount(0);

		for (Mahasiswa_2511531014 mhs
			: listMahasiswa) {

			tableModel_1014.addRow(
				new Object[] {
					mhs.getNim(),
					mhs.getNama(),
					mhs.getProdi()
				});
		}
	}

	// METHOD SORTING
	private void eksekusiSorting() {

		if (listMahasiswa.size() < 2) {

			JOptionPane.showMessageDialog(
				this,
				"Masukkan minimal 2 data mahasiswa!",
				"Info",
				JOptionPane.INFORMATION_MESSAGE);

			return;
		}

		ArrayList<Mahasiswa_2511531014>
			dataUrut =
			new ArrayList<>(listMahasiswa);

		txtAreaLog_1014.setText("");

		String algoritmaTerpilih =
			(String)
			cmbAlgoritma_1014.getSelectedItem();

		if (algoritmaTerpilih.equals(
			"Insertion Sort")) {

			jalankanInsertionSort(dataUrut);

		} else if (algoritmaTerpilih.equals(
			"Selection Sort")) {

			jalankanSelectionSort(dataUrut);

		} else if (algoritmaTerpilih.equals(
			"Bubble Sort")) {

			jalankanBubbleSort(dataUrut);
		}

		listMahasiswa = dataUrut;

		refreshTabel();
	}

	// INSERTION SORT
	private void jalankanInsertionSort(
		ArrayList<Mahasiswa_2511531014> arr) {

		txtAreaLog_1014.append(
			"=== INSERTION SORT ===\n");

		txtAreaLog_1014.append(
			"Awal : " +
			arr.toString() + "\n\n");

		int n = arr.size();

		for (int i = 1; i < n; i++) {

			Mahasiswa_2511531014 key =
				arr.get(i);

			int j = i - 1;

			while (j >= 0 &&
				arr.get(j).getNama()
				.compareToIgnoreCase(
				key.getNama()) > 0) {

				arr.set(j + 1,
					arr.get(j));

				j = j - 1;
			}

			arr.set(j + 1, key);

			txtAreaLog_1014.append(
				"Langkah " + i +
				" : " +
				arr.toString() + "\n");
		}

		txtAreaLog_1014.append(
			"\nStatus: Pengurutan Berhasil!");
	}

	// SELECTION SORT
	private void jalankanSelectionSort(
		ArrayList<Mahasiswa_2511531014> arr) {

		txtAreaLog_1014.append(
			"=== SELECTION SORT ===\n");

		txtAreaLog_1014.append(
			"Awal : " +
			arr.toString() + "\n\n");

		int n = arr.size();

		for (int i = 0; i < n - 1; i++) {

			int indeksMinimal = i;

			for (int j = i + 1;
				j < n; j++) {

				if (arr.get(j).getNama()
					.compareToIgnoreCase(
					arr.get(indeksMinimal)
					.getNama()) < 0) {

					indeksMinimal = j;
				}
			}

			Mahasiswa_2511531014 temp =
				arr.get(indeksMinimal);

			arr.set(indeksMinimal,
				arr.get(i));

			arr.set(i, temp);

			txtAreaLog_1014.append(
				"Pass " + (i + 1) +
				" : " +
				arr.toString() + "\n");
		}

		txtAreaLog_1014.append(
			"\nStatus: Pengurutan Berhasil!");
	}

	// BUBBLE SORT
	private void jalankanBubbleSort(
		ArrayList<Mahasiswa_2511531014> arr) {

		txtAreaLog_1014.append(
			"=== BUBBLE SORT ===\n");

		txtAreaLog_1014.append(
			"Awal : " +
			arr.toString() + "\n\n");

		int n = arr.size();

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0;
				j < n - i - 1; j++) {

				if (arr.get(j).getNama()
					.compareToIgnoreCase(
					arr.get(j + 1)
					.getNama()) > 0) {

					Mahasiswa_2511531014 temp =
						arr.get(j);

					arr.set(j,
						arr.get(j + 1));

					arr.set(j + 1,
						temp);
				}
			}

			txtAreaLog_1014.append(
				"Pass " + (i + 1) +
				" : " +
				arr.toString() + "\n");
		}

		txtAreaLog_1014.append(
			"\nStatus: Pengurutan Berhasil!");
	}

	// MAIN METHOD
	public static void main(String[] args) {

		EventQueue.invokeLater(
			new Runnable() {

			public void run() {

				try {

					SortingGUI_2511531014 frame =
						new SortingGUI_2511531014();

					frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		});
	}
}