package BaiThucHanhTuan7;


import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        // Tạo danh sách sách bằng ArrayList
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        // Tạo các đối tượng Sach
        Sach sach1 = new Sach("S001", "Dac Nhan Tam", "Dale Carnegie", 1936, 10);
        Sach sach2 = new Sach("S002", "Nha Gia Kim", "Paulo Coelho", 1988, 15);
        Sach sach3 = new Sach("S003", "Mat Biec", "Nguyen Nhat Anh", 1990, 20);

        // Thêm các đối tượng vào danh sách
        danhSachSach.add(sach1);
        danhSachSach.add(sach2);
        danhSachSach.add(sach3);

        // Hiển thị danh sách sách
        System.out.println("===== DANH SACH SACH TRONG THU VIEN =====");

        for (Sach sach : danhSachSach) {
            sach.hienThiThongTin();
        }

        // Hiển thị tổng số sách trong danh sách
        System.out.println("Tong so dau sach: " + danhSachSach.size());
    }
}

