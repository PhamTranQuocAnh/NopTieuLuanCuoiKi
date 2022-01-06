/*
*  crated date: 30 thg 12, 2022
*  author: PhamTranQuocAnh
*/
package BaiTieuLuanCuoiKi;
public class ThongKeHangHoa {

    ThongKeHangHoa() {
    };

    // Tổng số lượng hàng hóa
    public void tongSoLuongPhanTu(DanhSachQuanLy dsql) {
        int sum = 0;
        for (int i = 0; i < dsql.getDanhSachHangHoa().size(); i++) {
            sum += 1;
        }
        System.out.println("Tong so luong hang hoa trong kho " + sum);
    }


    // Tổng giá trị hàng hóa
    public void tongGiaTriNhapKho(DanhSachQuanLy dsql) {
        int sum = 0;
        for (int i = 0; i < dsql.getDanhSachHangHoa().size(); i++) {
            sum += dsql.getDanhSachHangHoa().get(i).getGiaNhap();
        }
        System.out.println("Tong gia tri cua kho la: " + sum + " VND");

    }

    // Số lượng thực phẩm
    public void soLuongHangThucPham(DanhSachQuanLy dsql) {
        System.out.println("So luong hang thuc pham: " + ThucPham.count);
    }

    // Số lượng điện máy
    public void soLuongHangDienTu(DanhSachQuanLy dsql) {
        System.out.println("So luong hang dien tu " + DienMay.count);
    }

    // Số lượng sành sứ
    public void soLuongHangSanhSu(DanhSachQuanLy dsql) {
        System.out.println("So luong hang sanh su: " + SanhSu.count);
    }

}