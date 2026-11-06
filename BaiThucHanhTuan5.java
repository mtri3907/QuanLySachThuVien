
import java.util.Scanner;
import java.util.ArrayList;

public class BaiThucHanhTuan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] soLuong = new int[5];
        int tongSoLuongMang = 0;

        System.out.println("Mang so luong sach");

        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
                soLuong[i] = sc.nextInt();

                if (soLuong[i] < 0) {
                    System.out.println("So luong khong hop le!");
                }
            } while (soLuong[i] < 0);

            tongSoLuongMang += soLuong[i];
        }

        int soLuongLonNhat = soLuong[0];

        for (int i = 1; i < 5; i++) {
            if (soLuong[i] > soLuongLonNhat) {
                soLuongLonNhat = soLuong[i];
            }
        }

        System.out.println("Tong so luong: " + tongSoLuongMang);
        System.out.println("So luong lon nhat: " + soLuongLonNhat);

        sc.nextLine();

        ArrayList<String> maSachList = new ArrayList<>();
        ArrayList<String> danhSachSach = new ArrayList<>();

        int n;

        do {
            System.out.print("\nNhap so luong sach can quan ly: ");
            n = sc.nextInt();
            sc.nextLine();
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap sach thu " + (i + 1) + ": ");

            String maSach;

            do {
                System.out.print("Nhap ma sach: ");
                maSach = sc.nextLine();

                if (maSachList.contains(maSach)) {
                    System.out.println("Ma sach da ton tai!");
                }
            } while (maSachList.contains(maSach));

            System.out.print("Nhap ten sach: ");
            String tenSach = sc.nextLine();

            System.out.print("Nhap tac gia: ");
            String tacGia = sc.nextLine();

            System.out.print("Nhap nam xuat ban: ");
            int namXuatBan = sc.nextInt();

            System.out.print("Nhap don gia: ");
            double donGia = sc.nextDouble();

            System.out.print("Nhap so luong: ");
            int soLuongSach = sc.nextInt();
            sc.nextLine();

            maSachList.add(maSach);

            String thongTinSach = maSach + "|" + tenSach + "|" + tacGia
                    + "|" + namXuatBan + "|" + donGia + "|" + soLuongSach;

            danhSachSach.add(thongTinSach);
        }

        int luaChon;

        do {
            System.out.println("\nMenu quan ly sach:");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");

            System.out.print("Nhap lua chon: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {

                case 1:
                    // Them sach
                    System.out.println("\nThem sach");

                    String maMoi;

                    do {
                        System.out.print("Nhap ma sach: ");
                        maMoi = sc.nextLine();

                        if (maSachList.contains(maMoi)) {
                            System.out.println("Ma sach da ton tai!");
                        }
                    } while (maSachList.contains(maMoi));

                    System.out.print("Nhap ten sach: ");
                    String tenMoi = sc.nextLine();

                    System.out.print("Nhap tac gia: ");
                    String tacGiaMoi = sc.nextLine();

                    System.out.print("Nhap nam xuat ban: ");
                    int namMoi = sc.nextInt();

                    System.out.print("Nhap don gia: ");
                    double giaMoi = sc.nextDouble();

                    System.out.print("Nhap so luong: ");
                    int soLuongMoi = sc.nextInt();
                    sc.nextLine();

                    maSachList.add(maMoi);

                    danhSachSach.add(maMoi + "|" + tenMoi + "|" + tacGiaMoi
                            + "|" + namMoi + "|" + giaMoi + "|" + soLuongMoi);

                    System.out.println("Them sach thanh cong!");
                    break;

                case 2:
                    // Hien thi danh sach sach
                    System.out.println("\nDanh sach sach");

                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach sach dang trong!");
                    } else {
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            String[] thongTin = danhSachSach.get(i).split("\\|");

                            System.out.println("\nSach thu " + (i + 1));
                            System.out.println("Ma sach: " + thongTin[0]);
                            System.out.println("Ten sach: " + thongTin[1]);
                            System.out.println("Tac gia: " + thongTin[2]);
                            System.out.println("Nam xuat ban: " + thongTin[3]);
                            System.out.println("Don gia: " + thongTin[4]);
                            System.out.println("So luong: " + thongTin[5]);
                        }
                    }
                    break;

                case 3:
                    // Tim sach theo ma
                    System.out.println("\nTim sach");

                    System.out.print("Nhap ma sach can tim: ");
                    String maCanTim = sc.nextLine();

                    int viTriTim = -1;

                    for (int i = 0; i < maSachList.size(); i++) {
                        if (maSachList.get(i).equalsIgnoreCase(maCanTim)) {
                            viTriTim = i;
                            break;
                        }
                    }

                    if (viTriTim != -1) {
                        String[] thongTin = danhSachSach.get(viTriTim).split("\\|");

                        System.out.println("Ma sach: " + thongTin[0]);
                        System.out.println("Ten sach: " + thongTin[1]);
                        System.out.println("Tac gia: " + thongTin[2]);
                        System.out.println("Nam xuat ban: " + thongTin[3]);
                        System.out.println("Don gia: " + thongTin[4]);
                        System.out.println("So luong: " + thongTin[5]);
                    } else {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 4:
                    // Xoa sach
                    System.out.println("\nXoa sach");

                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();

                    int viTriXoa = -1;

                    for (int i = 0; i < maSachList.size(); i++) {
                        if (maSachList.get(i).equalsIgnoreCase(maXoa)) {
                            viTriXoa = i;
                            break;
                        }
                    }

                    if (viTriXoa != -1) {
                        maSachList.remove(viTriXoa);
                        danhSachSach.remove(viTriXoa);

                        System.out.println("Xoa sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sach can xoa!");
                    }
                    break;

                case 5:
                    // Sua sach
                    System.out.println("\nSua sach");

                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = sc.nextLine();

                    int viTriSua = -1;

                    for (int i = 0; i < maSachList.size(); i++) {
                        if (maSachList.get(i).equalsIgnoreCase(maSua)) {
                            viTriSua = i;
                            break;
                        }
                    }

                    if (viTriSua != -1) {
                        System.out.println("Nhap thong tin moi:");

                        System.out.print("Nhap ten sach: ");
                        String tenSua = sc.nextLine();

                        System.out.print("Nhap tac gia: ");
                        String tacGiaSua = sc.nextLine();

                        System.out.print("Nhap nam xuat ban: ");
                        int namSua = sc.nextInt();

                        System.out.print("Nhap don gia: ");
                        double giaSua = sc.nextDouble();

                        System.out.print("Nhap so luong: ");
                        int soLuongSua = sc.nextInt();
                        sc.nextLine();

                        String thongTinMoi = maSachList.get(viTriSua) + "|"
                                + tenSua + "|" + tacGiaSua + "|" + namSua
                                + "|" + giaSua + "|" + soLuongSua;

                        danhSachSach.set(viTriSua, thongTinMoi);

                        System.out.println("Sua sach thanh cong!");
                    } else {
                        System.out.println("Khong tim thay sach can sua!");
                    }
                    break;

                case 6:
                    // Tinh tong so luong sach
                    int tongSoLuong = 0;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] thongTin = danhSachSach.get(i).split("\\|");

                        tongSoLuong += Integer.parseInt(thongTin[5]);
                    }

                    System.out.println("Tong so luong sach: " + tongSoLuong);
                    break;

                case 7:
                    // Tinh tong gia tri sach
                    double tongGiaTri = 0;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] thongTin = danhSachSach.get(i).split("\\|");

                        double donGia = Double.parseDouble(thongTin[4]);
                        int soLuongSach = Integer.parseInt(thongTin[5]);

                        tongGiaTri += donGia * soLuongSach;
                    }

                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;

                case 8:
                    System.out.println("Da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (luaChon != 8);

        sc.close();
    }
}
