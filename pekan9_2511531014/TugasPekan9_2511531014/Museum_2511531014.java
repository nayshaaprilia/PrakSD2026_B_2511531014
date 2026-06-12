package TugasPekan9_2511531014;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Museum_2511531014 extends JFrame {


    Map<String, ArrayList<String>> graph_1014 = new HashMap<>();
    GraphPanel_1014 panelGraph_1014;
    JTextArea hasil_1014;
    JComboBox<String> start_1014;
    JComboBox<String> goal_1014;


    String[] node_1014 = {
            "PintuMasuk",
            "RuangSejarah",
            "RuangSeni",
            "RuangBudaya",
            "RuangArtefak",
            "Perpustakaan",
            "Auditorium",
            "RuangPameran",
            "TokoSouvenir",
            "Kantin"
    };

    HashMap<String,Point> posisi_1014 = new HashMap<>();
    ArrayList<String> warnaNode_1014 = new ArrayList<>();

    public Museum_2511531014(){
        setTitle("Peta Museum BFS DFS 2511531014");
        setSize(900,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buatGraph_1014();
        buatPosisi_1014();


        panelGraph_1014 = new GraphPanel_1014();
        start_1014 = new JComboBox<>(node_1014);
        goal_1014 = new JComboBox<>(node_1014);
        start_1014.setSelectedItem("PintuMasuk");
        goal_1014.setSelectedItem("Auditorium");


        JButton bfs_1014 = new JButton("BFS");
        JButton dfs_1014 = new JButton("DFS");
        JButton reset_1014 = new JButton("RESET");
        hasil_1014 = new JTextArea(5,60);
        hasil_1014.setEditable(false);


        bfs_1014.addActionListener(e->{
            warnaNode_1014.clear();
            ArrayList<String> hasil = 
                    BFS_1014(
                            start_1014.getSelectedItem().toString(),
                            goal_1014.getSelectedItem().toString()
                    );
            warnaNode_1014.addAll(hasil);
            hasil_1014.setText(
                    "Metode : BFS\n"+
                    "Jalur : "+hasil+
                    "\nJumlah Node Dieksplorasi : "+hasil.size()
            );
            panelGraph_1014.repaint();
        });
        dfs_1014.addActionListener(e->{
            warnaNode_1014.clear();
            ArrayList<String> hasil = 
                    DFS_1014(
                            start_1014.getSelectedItem().toString(),
                            goal_1014.getSelectedItem().toString()
                    );
            warnaNode_1014.addAll(hasil);
            hasil_1014.setText(
                    "Metode : DFS\n"+
                    "Jalur : "+hasil+
                    "\nJumlah Node Dieksplorasi : "+hasil.size()
            );
            panelGraph_1014.repaint();
        });
        reset_1014.addActionListener(e->{
            warnaNode_1014.clear();
            hasil_1014.setText("");
            panelGraph_1014.repaint();
        });

        JPanel atas_1014 = new JPanel();
        atas_1014.add(new JLabel("Start"));
        atas_1014.add(start_1014);
        atas_1014.add(new JLabel("Goal"));
        atas_1014.add(goal_1014);
        atas_1014.add(bfs_1014);
        atas_1014.add(dfs_1014);
        atas_1014.add(reset_1014);
        
        add(atas_1014,BorderLayout.NORTH);
        add(panelGraph_1014,BorderLayout.CENTER);
        add(new JScrollPane(hasil_1014),BorderLayout.SOUTH);
        setVisible(true);
    }

    void buatGraph_1014(){
        for(String x:node_1014)
            graph_1014.put(x,new ArrayList<>());

        tambah_1014("PintuMasuk","RuangSejarah");
        tambah_1014("PintuMasuk","RuangSeni");
        tambah_1014("RuangSejarah","RuangBudaya");
        tambah_1014("RuangSejarah","Perpustakaan");
        tambah_1014("RuangSeni","RuangArtefak");
        tambah_1014("RuangSeni","Auditorium");
        tambah_1014("RuangBudaya","RuangPameran");
        tambah_1014("RuangBudaya","TokoSouvenir");
        tambah_1014("RuangArtefak","RuangPameran");
        tambah_1014("RuangArtefak","Perpustakaan");
        tambah_1014("Perpustakaan","Auditorium");
        tambah_1014("Auditorium","Kantin");
        tambah_1014("RuangPameran","TokoSouvenir");
        tambah_1014("TokoSouvenir","Kantin");
        tambah_1014("RuangPameran","Kantin");
    }
    void tambah_1014(String a,String b){
        graph_1014.get(a).add(b);
        graph_1014.get(b).add(a);
    }
    ArrayList<String> BFS_1014(String start,String goal){
        Queue<ArrayList<String>> q = new LinkedList<>();
        ArrayList<String> awal = new ArrayList<>();
        awal.add(start);
        q.add(awal);
        HashSet<String> visit = new HashSet<>();
        while(!q.isEmpty()){
            ArrayList<String> jalan=q.poll();
            String akhir=jalan.get(jalan.size()-1);
            if(akhir.equals(goal))
                return jalan;
            if(!visit.contains(akhir)){
                visit.add(akhir);
                for(String next:graph_1014.get(akhir)){
                    ArrayList<String> baru =
                            new ArrayList<>(jalan);
                    baru.add(next);
                    q.add(baru);
                }
            }
        }
        return new ArrayList<>();
    }

    ArrayList<String> DFS_1014(String start,String goal){
        Stack<ArrayList<String>> stack=new Stack<>();
        ArrayList<String> awal=new ArrayList<>();
        awal.add(start);
        stack.push(awal);
        HashSet<String> visit=new HashSet<>();
        while(!stack.empty()){
            ArrayList<String> jalan=stack.pop();
            String akhir=jalan.get(jalan.size()-1);
            if(akhir.equals(goal))
                return jalan;
            if(!visit.contains(akhir)){
                visit.add(akhir);
                for(String next:graph_1014.get(akhir)){
                    ArrayList<String> baru =
                            new ArrayList<>(jalan);
                    baru.add(next);
                    stack.push(baru);
                }
            }
        }
        return new ArrayList<>();
    }
    void buatPosisi_1014(){
        posisi_1014.put("PintuMasuk",new Point(400,50));
        posisi_1014.put("RuangSejarah",new Point(400,130));
        posisi_1014.put("RuangSeni",new Point(250,180));
        posisi_1014.put("RuangBudaya",new Point(400,230));
        posisi_1014.put("RuangArtefak",new Point(600,180));
        posisi_1014.put("Perpustakaan",new Point(250,330));
        posisi_1014.put("Auditorium",new Point(600,330));
        posisi_1014.put("RuangPameran",new Point(400,330));
        posisi_1014.put("TokoSouvenir",new Point(300,430));
        posisi_1014.put("Kantin",new Point(550,430));
    }
    class GraphPanel_1014 extends JPanel{
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setFont(new Font("Arial",Font.PLAIN,12));
            for(String a:graph_1014.keySet()){
                for(String b:graph_1014.get(a)){
                    Point p1=posisi_1014.get(a);
                    Point p2=posisi_1014.get(b);
                    g.drawLine(
                            p1.x,p1.y,
                            p2.x,p2.y
                    );
                }
            }

            for(String x:node_1014){
                Point p=posisi_1014.get(x);
                if(warnaNode_1014.contains(x))
                    g.setColor(Color.GREEN);
                else
                    g.setColor(Color.LIGHT_GRAY);
                g.fillOval(
                        p.x-20,
                        p.y-20,
                        40,
                        40
                );
                g.setColor(Color.BLACK);
                g.drawOval(
                        p.x-20,
                        p.y-20,
                        40,
                        40
                );
                g.drawString(
                        x,
                        p.x-35,
                        p.y+40
                );
            }
        }
    }
    public static void main(String[] args){
        new Museum_2511531014();
    }
}