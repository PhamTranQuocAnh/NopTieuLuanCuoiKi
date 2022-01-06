/*
*  crated date: 30 thg 12, 2022
*  author: PhamTranQuocAnh
*/
package BaiTieuLuanCuoiKi;

import java.util.Scanner;

public class mainTestDrive {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DanhSachQuanLy qlhh = new DanhSachQuanLy(); 
        DuLieuHangHoa dlhh = new DuLieuHangHoa();
        MenuSmall menu = new MenuSmall();
        qlhh = dlhh.danhSach(); // Tiếp nhận 20 dự liệu hàng hóa
        int luaChon = 0;

        do {
            menu.menuBig(input);
            luaChon = input.nextInt();
            switch (luaChon) {
// Chương trình 1
                case 1:
                    int luaChonBai1 = 0;
                    do {
                        menu.menuBai1ThemHangHoa();
                        luaChonBai1 = input.nextInt();
                        input.nextLine();
                        switch (luaChonBai1) {
                                        case 1: // Thêm hàng hóa điện máy
                                            System.out.println();
                                            ThemHangHoa th1 = new ThemHangHoa();
                                            qlhh = th1.themHangDienTu(qlhh, input);
                                            break;
                                        case 2: // Thêm hàng hóa thực phẩm
                                            System.out.println();
                                            ThemHangHoa th2 = new ThemHangHoa();
                                            qlhh = th2.themHangThucPham(qlhh, input);
                                            break;
                                        case 3: // Thêm hàng hóa sành sứ
                                            System.out.println();
                                            ThemHangHoa th3 = new ThemHangHoa();
                                            qlhh = th3.themHangSanhSu(qlhh, input);
                                            break;
                                        case 4: // Cập nhật lại danh sách
                                            System.out.println();
                                            qlhh.inDanhSach();
                                        case 5:
                                            break;
                                        default :   System.out.println("Chon tu 1 - 5");

                                    }
                            
                    } while (luaChonBai1 >= 1 && luaChonBai1 <= 3);
// Kết thức chương trình 1
                    break;
// Chương trình 2
                case 2: 
                int luaChonBaii = 0;
                do {
                    menu.menuBai2SuaXoaHangHoa();
                    SuaXoaHangHoa suaXoa = new SuaXoaHangHoa();
                    luaChonBaii = input.nextInt();
                    input.nextLine();
                    switch(luaChonBaii) {
                        case 1  :    // Sửa hàng hóa
                        suaXoa.suaHangHoa(qlhh, input);
                        break;
                    case 2:         // Xóa hàng hóa
                        System.out.println();   
                        suaXoa.xoaHangHoa(qlhh, input);
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Chon tu 1 - 2");

                } 
                }while(luaChonBaii >= 1 && luaChonBaii <=2);
// Kết thức chương trình 2
                break;


// Chương trình 3
                case 3:
                    int luaChonBai3 = 0;
                    do {
                        menu.menuBai3TimKiemHangHoa();
                        TimKiemHangHoa timKiem = new TimKiemHangHoa();
                        luaChonBai3 = input.nextInt();
                        input.nextLine();
                        switch (luaChonBai3) {
                            case 1: // Tìm kiếm theo loại
                                System.out.println(); 
                                timKiem.timKiemTheoLoai(qlhh, input);
                                break;
                            case 2: // Tìm kiếm theo giá
                                System.out.println();
                                timKiem.timKiemTheoGia(qlhh, input);
                                break;
                            case 3: // Tìm kiếm theo ngày
                                System.out.println();
                                timKiem.timKiemTheoNgay(qlhh, input);
                                break;
                            case 4:
                                break;
                            default:
                                System.out.print("Chon tu 1 - 4");
                                break;
                        }

                    } while (luaChonBai3 >= 1 && luaChonBai3 <= 3);
// Kết thức chương trình 3
                    break;

// Chương trình 4
                case 4:
                    int luaChonBai4 = 0;
                    do {
                        menu.menuBai4SapXepHangHoa();
                        SapXepHangHoa sapXep = new SapXepHangHoa();
                        luaChonBai4 = input.nextInt();
                        input.nextLine();
                        switch (luaChonBai4) {
                            case 1: // Sắp xếp theo giá
                                System.out.println();
                                sapXep.sapXepTheoGia(qlhh, input);
                                break;
                            case 2: // Sắp xếp theo ngày
                                System.out.println();
                                sapXep.sapXepTheoNgay(qlhh, input);
                                break;
                            case 3: // Sắp xếp loại hàng hóa và theo giá
                                System.out.println();
                                sapXep.sapXepTheoLoaiVaGia(qlhh, input);
                                break;
                            case 4: // Sắp xếp loại hàng hóa và theo ngày
                                System.out.println();
                                sapXep.sapXepTheoLoaiVaNgay(qlhh, input);
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Chon tu 1 - 5");
                        }
                    } while (luaChonBai4 >= 1 && luaChonBai4 <= 4);
 // Kết thức chương trình 4

                    break;


// Chương trình 5
                case 5:
                    int luaChonBai5 = 0;
                    do {
                        menu.menuBai5ThongKeHangHoa();
                        ThongKeHangHoa thongKe = new ThongKeHangHoa();
                        luaChonBai5 = input.nextInt();
                        input.nextLine();
                        switch (luaChonBai5) {
                            case 1: // Thống kê số lượng hàng hóa   
                                System.out.println();
                                thongKe.tongSoLuongPhanTu(qlhh);
                                break;
                            case 2: // Thống kê giá trình hàng hóa
                                System.out.println();
                                thongKe.tongGiaTriNhapKho(qlhh);
                                break;
                            case 3: // Thống kê số lượng từng loại
                                System.out.println();
                                thongKe.soLuongHangDienTu(qlhh);
                                thongKe.soLuongHangThucPham(qlhh);
                                thongKe.soLuongHangSanhSu(qlhh);
                                break;
                            case 4:
                                break;
                        }
                    } while (luaChonBai5 >= 1 && luaChonBai5 <= 3);
//Kết thức chương trình 5

                    break;

// Chương trình 6
                case 6: // In danh sách hàng hóa
                    System.out.println();
                    qlhh.inDanhSach();
                    break;
                case 7: // Thoát chương trình
                    break;
                default:
                    System.out.println("Chon tu 1 den 7");
                    break;

            }

        } while (luaChon >= 1 && luaChon <= 6);
        System.out.println("Thoat chuong trinh....");

    }

}