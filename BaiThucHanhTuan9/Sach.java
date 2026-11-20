package BaiThucHanhTuan9;

import java.time.LocalDate;
import java.util.Scanner;

public class Sach {
    protected String maSach;
    protected LocalDate ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    public void nhap(Scanner sc) {
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();

        System.out.print("Nhap ngay nhap (ngay thang nam): ");
        int ngay = sc.nextInt();
        int thang = sc.nextInt();
        int nam = sc.nextInt();
        sc.nextLine();

        ngayNhap = LocalDate.of(nam, thang, ngay);

        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();

        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ngay nhap: " + ngayNhap);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
    }

    public double thanhTien() {
        return 0;
    }

    public double getDonGia() {
        return donGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
}