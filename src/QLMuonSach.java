public class QLMuonSach {
    private banDoc BanDoc;
    private Sach[] sachMuon;
    private int[] soLuong;
    private int soLuongMuon;

    public QLMuonSach(banDoc BanDoc){
        this.BanDoc=BanDoc;
        this.sachMuon= new Sach[5];
        this.soLuong= new int[5];
        this.soLuongMuon= 0;
    }

    public Sach[] getSachMuon() {
            return sachMuon;
    }

    public banDoc getBanDoc() {
        return BanDoc;
    }

    public int[] getSoLuong() {
        return soLuong;
    }

    public boolean addBock(Sach sach , int soSachMuon){
        if(soLuongMuon >=5 || soSachMuon>3){
            return  false;
        }

        for(int i=0;i<soLuongMuon;i++){
            if(sachMuon[i].getIdSach() == sach.getIdSach()){
                if(soLuong[i] + soSachMuon>3){
                    return  false;
                }else{
                    soLuong[i] += soSachMuon;
                    return true;
                }
            }
        }
        sachMuon[soLuongMuon] =sach;
        soLuong[soLuongMuon]= soSachMuon;
        soLuongMuon++;
        return true;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Bản ghi mượn sách của " + BanDoc.getHoTen() + ":\n");
        for (int i = 0; i < soLuongMuon; i++) {
            result.append("Book: ").append(sachMuon[i].getTenSach()).append(", Quantity: ").append(soLuong[i]).append("\n");
        }
        return result.toString();
    }
}
