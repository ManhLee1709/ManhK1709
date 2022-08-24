package ST4_LTHDT_35_QUAN_LY_KHEN_THUONG_DAI_HOC;
import java.io.Serializable;
import java.util.*;
public class GIANGVIEN extends HUMAN implements Serializable{
    private int hocVi,soDuAn;
    private String chuyenNganh;
    public GIANGVIEN() {
        this.chuyenNganh="";
        this.hocVi=1;
        this.soDuAn=10;
    }

    public GIANGVIEN(String chuyenNganh, int hocVi, int soDuAn, String hoTen, String khoa, String gioiTinh) {
        this.chuyenNganh = chuyenNganh;
        this.hocVi = hocVi;
        this.soDuAn = soDuAn;
    }
    public void nhapGV(){
        super.nhapHM(); // kế thừa phần nhập của lớp HUMAN
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập Chuyên Ngành: ");
        chuyenNganh=sc.nextLine();
        System.out.println("Học Vị: ");
        System.out.printf("%-20s%-20s\n","1. Thạc Sĩ","2. Tiến Sĩ");
        System.out.print("Chọn Học Vị: ");
        hocVi=sc.nextInt();
        System.out.print("Nhập Số Dự Án: ");
        soDuAn=sc.nextInt();
    }
    public void hienGV(){
        super.hienHM();
        System.out.printf("%-20s",chuyenNganh);
        switch(hocVi){
            case 1: System.out.printf("%-20s","Thạc Sĩ");break;
            case 2: System.out.printf("%-20s","Tiến Sĩ");break;
        }
        System.out.printf("%-20s",soDuAn);
    }

    public void setSoDuAn(int soDuAn) {
        this.soDuAn = soDuAn;
    }

    public int getSoDuAn() {
        return soDuAn;
    }

    @Override
    public String toString() {
        return super.toString()+" - CHUYÊN NGÀNH: "+chuyenNganh
                +" - HỌC VỊ: "+hocVi+" - SỐ DỰ ÁN: "+soDuAn;
    }
    
}
