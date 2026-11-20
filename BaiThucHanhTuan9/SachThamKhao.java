package BaiThucHanhTuan9;

import java.util.Scanner;

public class SachThamKhao extends Sach {
    private double thue;

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap thue: ");
        thue = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Thue: " + thue);
        System.out.println("Thanh tien: " + thanhTien());
    }

    @Override
    public double thanhTien() {
        return soLuong * donGia + thue;
    }
}
