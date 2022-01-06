/*
*  crated date: 30 thg 12, 2022
*  author: PhamTranQuocAnh
*/
package BaiTieuLuanCuoiKi;

public class DuLieuHangHoa {

    DuLieuHangHoa() {
    };

    public DanhSachQuanLy danhSach() {
            DanhSachQuanLy qlhh = new DanhSachQuanLy();
            HangHoa stt1 = new DienMay(100,  "Dien may", "May giat", 20000000, "10-12-2021 ", 10);
            HangHoa stt2 = new SanhSu(50,   "Sanh su",  "Bo tach tra", 300000, "15-3-2020 ", 50);
            HangHoa stt3 = new ThucPham(20, "Thuc pham","Gao", 20000, "20-01-2021", 1000);
            HangHoa stt4 = new DienMay(120,  "Dien may", "Loa", 30000, "25-01-2021", 5);
            HangHoa stt5 = new SanhSu(023,  "Sanh su",  "Ly su", 45000, "30-01-2021", 150);
            HangHoa stt6 = new ThucPham(012,"Thuc pham","Mi", 130000, "04-02-2021", 150);
            HangHoa stt7 = new DienMay(509,  "Dien may", "Dau dia", 25000000, "09-02-2021", 15);
            HangHoa stt8 = new SanhSu(456,  "Sanh su",  "Noi bang sanh", 350000, "14-02-2021", 55);
            HangHoa stt9 = new ThucPham(789,"Thuc pham","Sua tuoi", 4000, "19-02-2021", 100);
            HangHoa stt10 = new DienMay(563, "Dien may", "Dien thoai", 15000000, "24-02-2021", 15);
            HangHoa stt11 = new SanhSu(145, "Sanh su",  "Binh hoa", 250000, "25-02-2021", 10);
            HangHoa stt12 = new ThucPham(234,"Thuc pham", "Banh", 20000, "2-03-2021", 300);
            HangHoa stt13 = new DienMay(287, "Dien may",  "Laptop", 15000000, "07- 03-2021", 20);
            HangHoa stt14 = new SanhSu(753, "Sanh su",  "To su", 50000, "12-03-2021", 50);
            HangHoa stt15 = new ThucPham(752,"Thuc pham", "Nuoc giai khat", 10000, "17-03-2021", 1000);
            HangHoa stt16 = new DienMay(017, "Dien may",  "May chup hinh", 3500000, "22-03-2021", 15);
            HangHoa stt17 = new SanhSu(259, "Sanh su",  "Ly sanh", 35000, "27-03-2021", 100);
            HangHoa stt18 = new ThucPham(769,"Thuc pham", "Gia vi", 20000, "01-04-2021", 150);
            HangHoa stt19 = new DienMay(112,"Dien may",  "Head phone", 650000, "6-04-2021", 35);
            HangHoa stt20 = new SanhSu(045, "Sanh su",  "To su", 25000, "11-04-2021", 25);

            qlhh.themVaoDanhSach(stt1);
            qlhh.themVaoDanhSach(stt2);
            qlhh.themVaoDanhSach(stt3);
            qlhh.themVaoDanhSach(stt4);
            qlhh.themVaoDanhSach(stt5);
            qlhh.themVaoDanhSach(stt6);
            qlhh.themVaoDanhSach(stt7);
            qlhh.themVaoDanhSach(stt8);
            qlhh.themVaoDanhSach(stt9);
            qlhh.themVaoDanhSach(stt10);
            qlhh.themVaoDanhSach(stt11);
            qlhh.themVaoDanhSach(stt12);
            qlhh.themVaoDanhSach(stt13);
            qlhh.themVaoDanhSach(stt14);
            qlhh.themVaoDanhSach(stt15);
            qlhh.themVaoDanhSach(stt16);
            qlhh.themVaoDanhSach(stt17);
            qlhh.themVaoDanhSach(stt18);
            qlhh.themVaoDanhSach(stt19);
            qlhh.themVaoDanhSach(stt20);

            return qlhh;

    }

}