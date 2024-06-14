public class Sach {
    private static int nextId =10000;
    private int idSach;
    private String tenSach;
    private String tacGia;
    private String chuyenNganh;
    private int namXuatBan;

    public Sach(String tenSach,String tacGia, String chuyenNganh, int namXuatBan){
        this.idSach=nextId++;
        this.tenSach=tenSach;
        this.tacGia=tacGia;
        this.chuyenNganh=chuyenNganh;
        this.namXuatBan=namXuatBan;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getIdSach() {
        return idSach;
    }

    public void setIdSach(int idSach) {
        this.idSach = idSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }


}

