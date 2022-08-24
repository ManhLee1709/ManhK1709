package ST4_LTHDT_35_QUAN_LY_KHEN_THUONG_DAI_HOC;
import java.io.Serializable;
import java.util.*;
public class SINHVIEN extends HUMAN implements Serializable{
    private String maSV, lop;
    private float diemRenLuyen,DTB;
    private int soTinChi, soHoatDong;
    
    public SINHVIEN(){
        this.maSV="";
        this.lop="";
        this.diemRenLuyen=60;
        this.soTinChi=15;
        this.DTB=9;
        this.soHoatDong=1;
    }
    public SINHVIEN(String maSV, String lop, float diemRenLuyen, int soTinChi, String hoTen, String khoa, String gioiTinh) {
        this.maSV = maSV;
        this.lop = lop;
        this.diemRenLuyen = diemRenLuyen;
        this.soTinChi = soTinChi;
        this.DTB=DTB;
        this.soHoatDong=soHoatDong;
    }    
    public void nhapSV(){
        super.nhapHM();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập Mã Sinh Viên: ");
        maSV=sc.nextLine();
        System.out.print("Nhập lớp: ");
        lop=sc.nextLine();
        System.out.print("Nhập DRL: ");
        diemRenLuyen=sc.nextFloat();
        System.out.print("Nhập Số Tín Chỉ: ");
        soTinChi=sc.nextInt();
        System.out.print("Nhập Điểm TB: ");
        DTB=sc.nextFloat();
        System.out.print("Nhập Số Hoạt Động Đã Tham Gia: ");
        soHoatDong=sc.nextInt();
    }
    public void hienSV(){
        super.hienHM();
        System.out.printf("%-20s",maSV);
        System.out.printf("%-20s",lop);
        System.out.printf("%-20s",diemRenLuyen);
        System.out.printf("%-20s",soTinChi);
        System.out.printf("%-20s",DTB);
        System.out.printf("%-20s",soHoatDong);
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setDiemRenLuyen(float diemRenLuyen) {
        this.diemRenLuyen = diemRenLuyen;
    }

    public void setDTB(float DTB) {
        this.DTB = DTB;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public void setSoHoatDong(int soHoatDong) {
        this.soHoatDong = soHoatDong;
    }

    public String getLop() {
        return lop;
    }

    public float getDiemRenLuyen() {
        return diemRenLuyen;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public String getMaSV() {
        return maSV;
    }

    public float getDTB() {
        return DTB;
    }

    public int getSoHoatDong() {
        return soHoatDong;
    }
    

    @Override
    public String toString() {
        return super.toString()
                +" - MÃ SV: "+maSV+" - LỚP: "+lop+" - DRL: "+diemRenLuyen
                +" - SỐ TC: "+soTinChi;
    }  
}
