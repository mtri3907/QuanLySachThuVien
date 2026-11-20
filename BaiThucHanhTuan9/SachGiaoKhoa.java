package BaiThucHanhTuan9;

import java.util.Scanner;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang;

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap tinh trang (Moi/Cu): ");
        tinhTrang = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Tinh trang: " + tinhTrang);
        System.out.println("Thanh tien: " + thanhTien());
    }

    @Override
    public double thanhTien() {
        if (tinhTrang.equalsIgnoreCase("Moi")) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * 0.5;
        }
    }
}