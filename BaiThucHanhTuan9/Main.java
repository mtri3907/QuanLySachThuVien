package BaiThucHanhTuan9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<SachGiaoKhoa> dsSachGiaoKhoa = new ArrayList<>();
        ArrayList<SachThamKhao> dsSachThamKhao = new ArrayList<>();

        // Nhap danh sach sach giao khoa
        System.out.print("Nhap so luong sach giao khoa: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap sach giao khoa thu " + (i + 1));
            SachGiaoKhoa sgk = new SachGiaoKhoa();
            sgk.nhap(sc);
            dsSachGiaoKhoa.add(sgk);
        }

        // Nhap danh sach sach tham khao
        System.out.print("\nNhap so luong sach tham khao: ");
        int m = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < m; i++) {
            System.out.println("\nNhap sach tham khao thu " + (i + 1));
            SachThamKhao stk = new SachThamKhao();
            stk.nhap(sc);
            dsSachThamKhao.add(stk);
        }

        // Xuat danh sach sach giao khoa
        System.out.println("\n---> DANH SACH SACH GIAO KHOA <---");
        for (SachGiaoKhoa sgk : dsSachGiaoKhoa) {
            sgk.xuat();
            System.out.println("-------------------------");
        }

        // Xuat danh sach sach tham khao
        System.out.println("\n---> DANH SACH SACH THAM KHAO <---");
        for (SachThamKhao stk : dsSachThamKhao) {
            stk.xuat();
            System.out.println("-------------------------");
        }

        // Tinh tong thanh tien sach giao khoa
        double tongSGK = 0;
        for (SachGiaoKhoa sgk : dsSachGiaoKhoa) {
            tongSGK += sgk.thanhTien();
        }

        // Tinh tong thanh tien sach tham khao
        double tongSTK = 0;
        for (SachThamKhao stk : dsSachThamKhao) {
            tongSTK += stk.thanhTien();
        }

        System.out.println("\nTong thanh tien sach giao khoa: " + tongSGK);
        System.out.println("Tong thanh tien sach tham khao: " + tongSTK);

        // Tinh trung binh don gia sach tham khao
        double tongDonGia = 0;
        for (SachThamKhao stk : dsSachThamKhao) {
            tongDonGia += stk.getDonGia();
        }

        if (dsSachThamKhao.size() > 0) {
            double trungBinhDonGia = tongDonGia / dsSachThamKhao.size();
            System.out.println("Trung binh don gia sach tham khao: " + trungBinhDonGia);
        } else {
            System.out.println("Khong co sach tham khao de tinh trung binh don gia.");
        }

        // Tim sach giao khoa theo nha xuat ban X
        System.out.print("\nNhap ten nha xuat ban X: ");
        String nhaXuatBanX = sc.nextLine();

        System.out.println("\n---> SACH GIAO KHOA CUA NHA XUAT BAN " + nhaXuatBanX + " <---");

        boolean timThay = false;

        for (SachGiaoKhoa sgk : dsSachGiaoKhoa) {
            if (sgk.getNhaXuatBan().equalsIgnoreCase(nhaXuatBanX)) {
                sgk.xuat();
                System.out.println("-------------------------");
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay sach cua nha xuat ban nay.");
        }

        sc.close();
    }
}
