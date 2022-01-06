/*
*  crated date: 30 thg 12, 2022
*  author: PhamTranQuocAnh
*/
package BaiTieuLuanCuoiKi;

import java.util.Scanner;

public class ThemHangHoa {

    ThemHangHoa() {
    };

    public DanhSachQuanLy themHangDienTu(DanhSachQuanLy dsql, Scanner sc) {
        System.out.println("---Them dien may---");
        String loaiHang = "Dien may";
        System.out.print("Nhap ma hang hoa: ");
        int maHangHoa = sc.nextInt();
        {
            for (int i = 0; i < dsql.getDanhSachHangHoa().size(); i++) {
// Xem mã hàng hóa them vào có trùng với mã đã tồn tại hay không
                if (maHangHoa == (dsql.getDanhSachHangHoa().get(i)).getMaHangHoa()) {
                    System.out.println("\nMa hang hoa da ton tai");
                    System.out.println("Nhap lai ma khac...\n");
                     break;
                } else {
// Nếu đến cuối danh sách không thấy trùng mã hàng hóa thì được phép thêm mã đó vào danh sách
                    if (i + 1 == dsql.getDanhSachHangHoa().size()) {
                        sc.nextLine();
                        System.out.print("Nhap ten hang hoa: ");
                        String t = sc.nextLine();
                        System.out.print("Nhap gia hang hoa: ");
                        int g = sc.nextInt();
                        sc.nextLine();
// cập nhật lại thời gian theo thời gian thực 
                        LayNgayGioHienTai d = new LayNgayGioHienTai();
                        String ngay = d.layThoiGianHienTai();
                        System.out.print("Nhap so luong ton kho: ");
                        int sl = sc.nextInt();
                        HangHoa hangHoa = new SanhSu(maHangHoa, loaiHang, t, g, ngay, sl);
                        dsql.themVaoDanhSach(hangHoa);
                        break;
                    }
                }
            }
            return dsql;
        }      

    }


    public DanhSachQuanLy themHangThucPham(DanhSachQuanLy dsql, Scanner sc) {
        System.out.println("---Them thuc pham---");
        String loaiHang = "Thuc pham";
        System.out.print("Nhap ma hang hoa: ");
        int m = sc.nextInt();
        {
            for (int i = 0; i < dsql.getDanhSachHangHoa().size(); i++) {
// Xem mã hàng hóa them vào có trùng với mã đã tồn tại hay không
                if (m == (dsql.getDanhSachHangHoa().get(i)).getMaHangHoa()) {
                    System.out.println("\nMa hang hoa da ton tai");
                    System.out.println("Nhap lai ma khac...\n");
                     break;
                } else {
//  Nếu đến cuối danh sách không thấy trùng mã hàng hóa thì được phép thêm mã đó vào danh sách
                    if (i + 1 == dsql.getDanhSachHangHoa().size()) {
                        sc.nextLine();
                        System.out.print("Nhap ten hang hoa: ");
                        String t = sc.nextLine();
                        System.out.print("Nhap gia hang hoa: ");
                        int g = sc.nextInt();
                        sc.nextLine();
// cập nhật lại thời gian theo thời gian thực 
                        LayNgayGioHienTai d = new LayNgayGioHienTai();
                        String ngay = d.layThoiGianHienTai();
                        System.out.print("Nhap so luong ton kho: ");
                        int sl = sc.nextInt();
                        HangHoa hangHoa = new ThucPham(m, loaiHang, t, g, ngay, sl);
                        dsql.themVaoDanhSach(hangHoa);
                        break;
                    }
                }
            }
            return dsql;
        }      

    }


    public DanhSachQuanLy themHangSanhSu(DanhSachQuanLy dsql, Scanner sc) {
        System.out.println("---Them sanh su---");
        String loaiHang = "Sanh su";
        System.out.print("Nhap ma hang hoa: ");
        int m = sc.nextInt();
        {
            for (int i = 0; i < dsql.getDanhSachHangHoa().size(); i++) {
// Xem mã hàng hóa them vào có trùng với mã đã tồn tại hay không
                if (m == (dsql.getDanhSachHangHoa().get(i)).getMaHangHoa()) {
                    System.out.println("\nMa hang hoa da ton tai");
                    System.out.println("Nhap lai ma khac...\n");
                     break;
                } else {
// Nếu đến cuối danh sách không thấy trùng mã hàng hóa thì được phép thêm mã đó vào danh sách
                    if (i + 1 == dsql.getDanhSachHangHoa().size()) {
                        sc.nextLine();
                        System.out.print("Nhap ten hang hoa: ");
                        String t = sc.nextLine();
                        System.out.print("Nhap gia hang hoa: ");
                        int g = sc.nextInt();
                        sc.nextLine();
// cập nhật lại thời gian theo thời gian thực 
                        LayNgayGioHienTai d = new LayNgayGioHienTai();
                        String ngay = d.layThoiGianHienTai();
                        System.out.print("Nhap so luong ton kho: ");
                        int sl = sc.nextInt();
                        HangHoa hangHoa = new SanhSu(m, loaiHang, t, g, ngay, sl);
                        dsql.themVaoDanhSach(hangHoa);
                        break;
                    }
                }
            }
            return dsql;
        }      

    }


    
}