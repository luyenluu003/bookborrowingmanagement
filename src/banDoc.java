import java.util.Scanner;

public class banDoc {
    Scanner sc = new Scanner(System.in);
    private static int nextId =10000;
    private int id;
    private String hoTen;
    private String diaChi;
    private String SDT;
    private String loaiBanDoc;

    public banDoc(String hoTen, String diaChi, String SDT, String loaiBanDoc) {
        this.id=nextId++;
        this.hoTen=hoTen;
        this.diaChi=diaChi;
        this.SDT=SDT;
        this.loaiBanDoc=loaiBanDoc;
    }


    public int getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public String getLoaiBanDoc() {
        return loaiBanDoc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setLoaiBanDoc(String loaiBanDoc) {
        this.loaiBanDoc = loaiBanDoc;
    }


}
