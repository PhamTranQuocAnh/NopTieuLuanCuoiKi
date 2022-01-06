/*
*  crated date: 30 thg 12, 2022
*  author: PhamTranQuocAnh
*/
package BaiTieuLuanCuoiKi;

import java.util.Scanner;

public class SuaXoaHangHoa {

    SuaXoaHangHoa() {
    };

    public DanhSachQuanLy suaHangHoa(DanhSachQuanLy dsql, Scanner sc) {
        String loai1 = "Dien may";
        String loai2 = "Thuc Pham";
        String loai3 = "Sanh su";
        System.out.println("\nSua hang hoa");
        System.out.print("Nhap ma hang hoa: ");
        int id = sc.nextInt();
        sc.nextLine();
        HangHoa hh1 = new HangHoa(id);
        for (int i = 0; i < dsql.getDanhSachHangHoa().size(); i++) {
            {
                if (hh1.equals(dsql.getDanhSachHangHoa().get(i))) {
                    System.out.println();
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai1)) {
                        DienMay.count -= 1;
                    }
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai2)) {
                        ThucPham.count -= 1;
                    }
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai3)) {
                        SanhSu.count -= 1;
                    }
                    System.out.println("\nThong tin hang hoa se bi sua");
                    System.out.println(dsql.getDanhSachHangHoa().get(i));
                    System.out.print("Nhap lai loai hang hoa: ");
                    String loaiHang = sc.nextLine();
                    System.out.print("Nhap lai ten hang: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhap lai gia hang hoa: ");
                    int gia = sc.nextInt();
                    sc.nextLine();
                    LayNgayGioHienTai d = new LayNgayGioHienTai();
                    String ngay = d.layThoiGianHienTai();
                    System.out.print("Nhap lai so luong ton: ");
                    int soLuong = sc.nextInt();
                    dsql.getDanhSachHangHoa().get(i).setLoaiHangHoa(loaiHang);
                    dsql.getDanhSachHangHoa().get(i).setTenHangHoa(ten);
                    dsql.getDanhSachHangHoa().get(i).setGiaNhap(gia);
                    dsql.getDanhSachHangHoa().get(i).setNgayNhapKho(ngay);
                    dsql.getDanhSachHangHoa().get(i).setSoLuongTonKho(soLuong);
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai1)) {
                        DienMay.count += 1;
                        break;
                    }
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai2)) {
                        ThucPham.count += 1;
                        break;
                    }
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai3)) {
                        SanhSu.count += 1;
                        break;
                    }
                    System.out.println("\t\t\tHang hoa da duoc cap nhat");
                    System.out.println(dsql.getDanhSachHangHoa().get(i));

                    break;
                } else {
                    if (i + 1 == dsql.getDanhSachHangHoa().size()) {
                        System.out.println("Ma hoang hoa da ton tai");
                    }
                }
            }
        }
        return dsql;
    }

   

    public DanhSachQuanLy xoaHangHoa(DanhSachQuanLy dsql, Scanner sc) {
        System.out.println("\n---Xoa hang hoa---");
        String loai1 = "Dien may";
        String loai2 = "Thuc pham";
        String loai3 = "Sang su";
        System.out.print("Nhap ma hang hoa muon xoa: ");
        int id = sc.nextInt();
        sc.nextLine();
        HangHoa hh2 = new HangHoa(id);
        for (int i = 0; i < dsql.getDanhSachHangHoa().size(); i++) {
            if (hh2.equals(dsql.getDanhSachHangHoa().get(i))) {
                System.out.println("\nThong tin hang hoa se bi xoa\n" + dsql.getDanhSachHangHoa().get(i));
                System.out.println("1. Xac nhan xoa hang");
                System.out.println("2. Huy");
                System.out.print("Lua chon cua ban: ");
                int choice = sc.nextInt();
                if (choice == 1) {
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai1)) {
                        DienMay.count -= 1;
                    }
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai2)) {
                        ThucPham.count -= 1;
                    }
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai3)) {
                        SanhSu.count -= 1;
                    }
                    dsql.getDanhSachHangHoa().remove(i);
                    System.out.println("\n---Da xoa hang hoa---");
                    break;
                } else
                    break;
            } else {
                if (i + 1 == dsql.getDanhSachHangHoa().size()) {
                    System.out.println("Ma hang hoa da ton tai");
                }
            }
        }
        return dsql;

    }

   

}