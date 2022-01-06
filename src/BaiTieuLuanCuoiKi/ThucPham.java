/*
*  crated date: 30 thg 12, 2022
*  author: PhamTranQuocAnh
*/
package BaiTieuLuanCuoiKi;
public class ThucPham extends HangHoa {
    static int count = 0; // Thống kê số lượng từng loại


    ThucPham(int maHangHoa, String loaiHangHoa, String tenHangHoa, int giaNhap, String ngayNhapKho,
            int soLuongTonKho) {
        super(maHangHoa, loaiHangHoa, tenHangHoa, giaNhap, ngayNhapKho, soLuongTonKho);
        count++;
    }
}