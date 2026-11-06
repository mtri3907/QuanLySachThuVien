
import java.util.Scanner;

public class BaiThucHanhTuan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("Nhap so luong sach: ");
            n = sc.nextInt();
        } while (n <= 0);

        String[] maSach = new String[n];
        String[] tenSach = new String[n];
        String[] tacGia = new String[n];
        int[] namXuatBan = new int[n];
        double[] donGia = new double[n];
        int[] soLuong = new int[n];

        // Bai 1: Nhap thong tin n cuon sach
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin sach thu " + (i + 1) + "");

            sc.nextLine();

            System.out.print("Nhap ma sach: ");
            maSach[i] = sc.nextLine();

            System.out.print("Nhap ten sach: ");
            tenSach[i] = sc.nextLine();

            System.out.print("Nhap tac gia: ");
            tacGia[i] = sc.nextLine();

            System.out.print("Nhap nam xuat ban: ");
            namXuatBan[i] = sc.nextInt();

            System.out.print("Nhap don gia: ");
            donGia[i] = sc.nextDouble();

            System.out.print("Nhap so luong: ");
            soLuong[i] = sc.nextInt();
        }

        // Bai 2: Tinh tong so luong va tong gia tri sach
        int tongSoLuong = 0;
        double tongGiaTri = 0;

        for (int i = 0; i < n; i++) {
            tongSoLuong += soLuong[i];

            double thanhTien = donGia[i] * soLuong[i];
            tongGiaTri += thanhTien;
        }

        // Bai 3: Menu lap den khi chon Thoat
        int luaChon;

        do {
            System.out.println("\nMenu sach quan ly");
            System.out.println("1. Hien thi danh sach sach");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("0. Thoat");

            System.out.print("Nhap lua chon: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    System.out.println("\nDanh sach sach");

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nSach thu " + (i + 1));
                        System.out.println("Ma sach: " + maSach[i]);
                        System.out.println("Ten sach: " + tenSach[i]);
                        System.out.println("Tac gia: " + tacGia[i]);
                        System.out.println("Nam xuat ban: " + namXuatBan[i]);
                        System.out.println("Don gia: " + donGia[i]);
                        System.out.println("So luong: " + soLuong[i]);
                    }
                    break;

                case 2:
                    System.out.println("\nTong kho sach");
                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;

                case 3:
                    // Bai 4: Tim sach theo ma
                    System.out.print("Nhap ma sach can tim: ");
                    String maCanTim = sc.nextLine();

                    boolean timThay = false;

                    for (int i = 0; i < n; i++) {
                        if (maSach[i].equalsIgnoreCase(maCanTim)) {
                            System.out.println("\nThong tin sach tim thay");
                            System.out.println("Ma sach: " + maSach[i]);
                            System.out.println("Ten sach: " + tenSach[i]);
                            System.out.println("Tac gia: " + tacGia[i]);
                            System.out.println("Nam xuat ban: " + namXuatBan[i]);
                            System.out.println("Don gia: " + donGia[i]);
                            System.out.println("So luong: " + soLuong[i]);

                            timThay = true;
                            break;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Khong tim thay sach co ma: " + maCanTim);
                    }
                    break;

                case 0:
                    System.out.println("Da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (luaChon != 0);

        sc.close();
    }
}
