
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
        int loaiSach;

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

        System.out.println("\nKIEM TRA SACH");

        boolean hopLe = true;

        if (donGia > 0) {
            System.out.println("Gia sach hop le");
        } else {
            System.out.println("Gia sach khong hop le");
            hopLe = false;
        }

        if (soLuong >= 0) {
            System.out.println("So luong hop le");
        } else {
            System.out.println("So luong khong hop le");
            hopLe = false;
        }

        if (namXuatBan >= 1 && namXuatBan <= 2026) {
            System.out.println("Nam xuat ban hop le");
        } else {
            System.out.println("Nam xuat ban khong hop le");
            hopLe = false;
        }

        System.out.println("\nPHAN LOAI GIA");

        if (donGia <= 0) {
            System.out.println("Khong the phan loai gia sach");
        } else if (donGia < 50000) {
            System.out.println("Sach gia thap");
        } else if (donGia < 100000) {
            System.out.println("Sach gia trung binh");
        } else if (donGia <= 200000) {
            System.out.println("Sach gia cao");
        } else {
            System.out.println("Sach gia dac biet");
        }

        System.out.println("\nPHAN LOAI TON KHO");

        if (soLuong < 0) {
            System.out.println("So luong khong hop le");
        } else if (soLuong == 0) {
            System.out.println("Het sach");
        } else if (soLuong <= 5) {
            System.out.println("Sap het");
        } else if (soLuong <= 20) {
            System.out.println("Con it");
        } else {
            System.out.println("Con nhieu");
        }

        System.out.println("\nCHON LOAI SACH");

        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");

        System.out.print("Nhap loai sach (1-4): ");
        loaiSach = sc.nextInt();

        switch (loaiSach) {
            case 1:
                System.out.println("Loai sach: Sach giao khoa");
                break;

            case 2:
                System.out.println("Loai sach: Sach tham khao");
                break;

            case 3:
                System.out.println("Loai sach: Sach chuyen nganh");
                break;

            case 4:
                System.out.println("Loai sach: Sach khac");
                break;

            default:
                System.out.println("Loai sach khong hop le");
        }

        if (hopLe) {
            double thanhTien = donGia * soLuong;
            double phiVanChuyen = thanhTien * 0.05;
            double tongTienNhap = thanhTien + phiVanChuyen;

            System.out.println("\nKET QUA NHAP KHO");
            System.out.println("Thanh tien: " + thanhTien);
            System.out.println("Phi van chuyen: " + phiVanChuyen);
            System.out.println("Tong tien nhap: " + tongTienNhap);
        } else {
            System.out.println("\nThong tin sach khong hop le, khong the tinh tien nhap kho");
        }

        sc.close();
    }
}
