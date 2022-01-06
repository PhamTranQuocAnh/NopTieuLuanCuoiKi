/*
*  crated date: 30 thg 12, 2022
*  author: PhamTranQuocAnh
*/
package BaiTieuLuanCuoiKi;

    public class DienMay extends HangHoa {
        static int count = 0; // de thong ke so luong tung loai hang hoa
    
        DienMay() {
        }
    
        DienMay(int maHangHoa, String loaiHangHoa, String tenHangHoa, int giaNhap, String ngayNhapKho,
                int soLuongTonKho) {
            super(maHangHoa, loaiHangHoa, tenHangHoa, giaNhap, ngayNhapKho, soLuongTonKho);
            count++;
        }
    
    }
    

