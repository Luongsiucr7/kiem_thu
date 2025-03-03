package repository;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    List<SanPham> listSanPham= new ArrayList<>();

    public SanPhamService() {
        listSanPham.add(new SanPham("SP001","May",2012,12000f,12,"Tet"));
        listSanPham.add(new SanPham("SP002","Maya",2011,13000f,1,"TetD"));
    }

    public String update(String ma, String tenMoi){
        if (ma.isEmpty()){
            return "";
        }
        for (SanPham sanPham: listSanPham){
            if (sanPham.getMa().equals(ma)){
                sanPham.setTen(tenMoi);
                return "Thanh cong";
            }
        }
        return "Khong tim thay";
    }
}
