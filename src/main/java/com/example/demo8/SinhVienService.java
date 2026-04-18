package com.example.demo8;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    List<SinhVien> sinhViens = new ArrayList<SinhVien>();

    public void updateSV(SinhVien sv,String tenMoi,float diemMoi,int tuoiMoi,int kyMoi,String nganhMoi){
        if(tenMoi == null||tenMoi.trim().isEmpty()){
            throw new IllegalArgumentException("Ten moi khong duoc trong");
        }
        if (tuoiMoi<0||tuoiMoi>100){
            throw new IllegalArgumentException("Tuo moi khong duoc trong khoảng từ 1-100");
        }
        if(diemMoi<0||diemMoi>10){
            throw new IllegalArgumentException("Diem moi nam tu 0-10");
        }
        if (kyMoi<1||kyMoi>6){
            throw new IllegalArgumentException("Ky moi nằm trong khoảng từ 0-6");
        }
        if(nganhMoi==null||nganhMoi.trim().isEmpty()){
            throw new IllegalArgumentException("Nganh moi khong duoc trong");
        }
        sv.setTen(tenMoi);
        sv.setDiemTB(diemMoi);
        sv.setTuoi(tuoiMoi);
        sv.setKyHoc(kyMoi);
        sv.setChuyenNganh(nganhMoi);
    }

}
