import java.util.Scanner;

public class main {
    private static  banDoc[] banDocs= new banDoc[100];
    private  static  int soLuongBanDoc= 0;

    private static  Sach[] sachs = new Sach[100];
    private static int soLuongSach = 0;

    private static  QLMuonSach[] qLMuonSachs= new QLMuonSach[100];
    private static  int soLuongMuonSach = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\nLibrary Management System");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Thêm bạn đọc");
            System.out.println("4. Hiển thị bạn đọc");
            System.out.println("5. Mượn sách");
            System.out.println("6. Hiển thị danh sách mượn");
            System.out.println("7. Sắp xếp theo tên bạn đọc");
            System.out.println("8. Sắp xếp bạn đọc theo số lượng sách mượn");
            System.out.println("9. Tìm kiếm bạn đọc theo tên");
            System.out.println("0. Thoát...");
            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    themSach();
                    pause();
                    break;
                case 2:
                    hienThiSach();
                    pause();
                    break;
                case 3:
                    themBanDoc();
                    pause();
                    break;
                case 4:
                    hienThiBanDoc();
                    pause();
                    break;
                case 5:
                    muonSach();
                    pause();
                    break;
                case 6:
                    hienThiDanhSachMuonSach();
                    pause();
                    break;
                case 7:
                    sapXepTheoTenBanDoc();
                    pause();
                    break;
                case 8:
                    sapXepTheoTongSoLuongMuon();
                    pause();
                    break;
                case 9:
                    timKiemTheoTen();
                    pause();
                    break;
                case 0:
                    System.out.println("Thoátttttt...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ vui lòng thử lại.");
            }
        } while (choice != 0);

        sc.close();

    }

    public static void themSach(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách bạn muốn thêm:");
        int n= sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Nhập sách thứ "+(i+1)+":");
            System.out.print("Nhập tên sách:");
            String tenSach = sc.nextLine();
            System.out.print("Nhập tên tác giả:");
            String tacGia = sc.nextLine();
            System.out.print("Lựa chọn chuyên ngành theo số (1. Khoa học tự nhiên, 2. Văn học - Nghệ thuật, 3. Điện tử Viễn thông, 4. Công nghệ thông tin): ");
            int check =sc.nextInt();
            sc.nextLine();
            String chuyenNganh="";
            switch (check){
                case 1:
                    chuyenNganh = "Khoa học tự nhiên";
                    break;
                case 2:
                     chuyenNganh = "Văn học - Nghệ thuật";
                    break;
                case 3:
                     chuyenNganh = "Điện tử viễn thông";
                    break;
                case 4:
                     chuyenNganh = "Công nghệ thông tin";
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ nên lựa chọn mặc định của bạn là 'Khoa học tự nhiên'.");
                    chuyenNganh = "Khoa học tự nhiên";
            }
            System.out.print("Năm xuất bản:");
            int namXuatBan= sc.nextInt();
            sc.nextLine();

            Sach newSach = new Sach(tenSach,tacGia,chuyenNganh,namXuatBan);
            sachs[soLuongSach++] = newSach;

        }
    }

    private static void hienThiSach(){
        System.out.println("Hiển thị danh sách sách:");
        for(int i=0;i<soLuongSach;i++){
            System.out.println("\nSách thứ "+(i+1)+":");
            System.out.print("Id sách:"+ sachs[i].getIdSach());
            System.out.print("\nTên sách:"+ sachs[i].getTenSach());
            System.out.print("\nChuyên ngành:"+ sachs[i].getChuyenNganh());
            System.out.print("\nNăm xuất bản:"+sachs[i].getNamXuatBan());
        }
    }
    private static void themBanDoc(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng bạn đọc bạn muốn thêm:");
        int n= sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Nhập bạn đọc thứ "+(i+1)+":");
            System.out.print("Nhập tên bạn đọc:");
            String hoTen = sc.nextLine();
            System.out.print("Nhập địa chỉ:");
            String diaChi = sc.nextLine();
            System.out.print("Nhập số điện thoại:");
            String SDT = sc.nextLine();
            System.out.print("Lựa chọn loại bạn đọc theo số (1. Sinh viên, 2. Học viên cao học, 3. Giáo viên): ");
            int check =sc.nextInt();
            sc.nextLine();
            String loaiBanDoc="";
            switch (check){
                case 1:
                    loaiBanDoc = "Sinh viên";
                    break;
                case 2:
                    loaiBanDoc = "Học viên cao học";
                    break;
                case 3:
                    loaiBanDoc = "Giáo viên";
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ nên lựa chọn mặc định của bạn là 'Sinh viên'.");
                    loaiBanDoc = "Sinh viên";
            }

            banDoc newBanDoc = new banDoc(hoTen,diaChi,SDT,loaiBanDoc);
            banDocs[soLuongBanDoc++] = newBanDoc;
        }
    }

    private static void hienThiBanDoc(){
        System.out.println("Hiển thị danh sách bạn đọc:");
        for(int i=0;i<soLuongBanDoc;i++){
            System.out.println("\nBạn đọc thứ "+(i+1)+":");
            System.out.print("Id:"+ banDocs[i].getId());
            System.out.print("\nTên bạn đọc:"+ banDocs[i].getHoTen());
            System.out.print("\nSDT:"+ banDocs[i].getSDT());
            System.out.print("\nLoại bạn đọc:"+banDocs[i].getLoaiBanDoc());
        }
    }

    private static void muonSach(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id bạn đọc:");
        int findId= sc.nextInt();
        sc.nextLine();

        banDoc BD=timKiemBanDoc(findId);
        if(BD==null){
            System.out.println("Không tìm thấy bạn đọc!");
            return;
        }

        QLMuonSach qlMuonSach= findOrCreateQLMuonSach(BD);

        System.out.print("Nhập số lượng sách bạn muốn mượn:");
        int slSach = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<slSach;i++){
            System.out.print("Nhập Id sách:");
            int idSach = sc.nextInt();
            sc.nextLine();
            Sach sach = timKiemSach(idSach);
            if(sach==null){
                System.out.println("Không tìm thấy sách");
                continue;
            }
            System.out.print("Nhập số lượng cần mượn:");
            int sl = sc.nextInt();
            sc.nextLine();
            boolean added= qlMuonSach.addBock(sach,sl);
            if(added){
                System.out.println("Mượn sách thành công!!");
            }else{
                System.out.println("Không thể mượn sách. Số lượng vượt quá giới hạn hoặc đã đạt đến số lượng sách khác nhau được mượn tối đa.");
            }
        }

    }

    private static QLMuonSach findOrCreateQLMuonSach(banDoc BD){
        for(int i=0;i<soLuongMuonSach;i++){
            if(qLMuonSachs[i].getBanDoc().getId()==BD.getId()){
                return qLMuonSachs[i];
            }
        }

        QLMuonSach newQlMuonSach= new QLMuonSach(BD);
        qLMuonSachs[soLuongMuonSach++] = newQlMuonSach;
        return newQlMuonSach;
    }

    private static void hienThiDanhSachMuonSach(){
        System.out.println("Danh sách mượn sách là:");
        for(int i=0;i<soLuongMuonSach;i++){
            System.out.println(qLMuonSachs[i]);
        }
    }

    private static void sapXepTheoTenBanDoc(){
        if (soLuongMuonSach <= 1) {
            System.out.println("Không có hoặc chỉ có một bản ghi, không cần sắp xếp.");
            return;
        }
        for(int i=0;i<soLuongMuonSach-1;i++){
            for(int j=i+1;j<soLuongMuonSach;j++){

                if(qLMuonSachs[i].getBanDoc().getHoTen().compareTo(qLMuonSachs[j].getBanDoc().getHoTen())>0){
                    QLMuonSach temp = qLMuonSachs[i];
                    qLMuonSachs[i]=qLMuonSachs[j];
                    qLMuonSachs[j]=temp;
                }
            }
            hienThiDanhSachMuonSach();

        }
    }
    private static void sapXepTheoTongSoLuongMuon(){
        if (soLuongMuonSach <= 1) {
            System.out.println("Không có hoặc chỉ có một bản ghi, không cần sắp xếp.");
            return;
        }
        for(int i=0;i<soLuongMuonSach-1;i++){
            for(int j=i+1;j<soLuongMuonSach;j++){

                if(tongSoLuongMuon(qLMuonSachs[i])<tongSoLuongMuon(qLMuonSachs[j])){
                    QLMuonSach temp = qLMuonSachs[i];
                    qLMuonSachs[i]=qLMuonSachs[j];
                    qLMuonSachs[j]=temp;
                }
            }
            hienThiDanhSachMuonSach();

        }
    }

    private static void timKiemTheoTen(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên bạn muốn tìm kiếm:");
        String name = sc.nextLine();
        boolean check =false;
        for(int i=0;i<soLuongMuonSach;i++){
            if(qLMuonSachs[i].getBanDoc().getHoTen().equalsIgnoreCase(name)){
                check= true;
            }
        }
        if(check == true){
            System.out.println("Tên bạn tìm kiếm có trong dánh sách!!");
            for(int i=0;i<soLuongMuonSach;i++){
                if(qLMuonSachs[i].getBanDoc().getHoTen().equalsIgnoreCase(name)){
                    System.out.println(qLMuonSachs[i]);
                }
            }
        }else{
            System.out.println("Tên bạn tìm kiếm không có trong dánh sách!!!");
        }
    }


    private static int tongSoLuongMuon(QLMuonSach qlMuonSach){
        int total=0;
        for(int quantity: qlMuonSach.getSoLuong()){
            total+=quantity;
        }
        return total;
    }

    private static banDoc timKiemBanDoc(int findId){
        for(int i=0;i<soLuongBanDoc;i++){
            if(banDocs[i].getId()==findId){
                return banDocs[i];
            }
        }
        return null;
    }

    private static Sach timKiemSach(int findId){
        for(int i=0;i<soLuongSach;i++){
            if(sachs[i].getIdSach()==findId){
                return sachs[i];
            }
        }
        return null;
    }
    public static void pause() {
        System.out.println("Nhấn phím Enter để tiếp tục...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
