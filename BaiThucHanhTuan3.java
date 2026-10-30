
import java.util.Scanner;

public class BaiThucHanhTuan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String maSach;
        String tenSach;
        String tacGia;
        int namXuatBan;
        double donGia;
        int soLuong;

        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = sc.nextInt();

        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();

        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();

        System.out.println("\n===== THONG TIN SACH =====");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);

        double thanhTien = donGia * soLuong;

        double phiVanChuyen = thanhTien * 0.05;

        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n===== KET QUA NHAP KHO =====");
        System.out.println("Thanh tien: " + thanhTien);
        System.out.println("Phi van chuyen: " + phiVanChuyen);
        System.out.println("Tong tien nhap: " + tongTienNhap);

        sc.close();
    }
}
