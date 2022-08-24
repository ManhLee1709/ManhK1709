package ST4_LTHDT_35_QUAN_LY_KHEN_THUONG_DAI_HOC;
import java.io.Serializable;
import java.util.*;
public class HUMAN implements Serializable{
    private String hoTen,khoa ;
    private byte gioiTinh;

    public HUMAN() {
        this.hoTen="";
        this.khoa="";
        this.gioiTinh=1;
    }
    public HUMAN(String hoTen, String khoa, byte gioiTinh) {
        this.hoTen = hoTen;
        this.khoa = khoa;
        this.gioiTinh= gioiTinh;
    } 
    public void nhapHM(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nNhập Tên: ");
        hoTen=sc.nextLine();
        System.out.print("Nhập Khoa: ");
        khoa=sc.nextLine();
        System.out.println("Giới Tính: ");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. Khác");
        System.out.print("Chọn giới tính: ");
        gioiTinh=sc.nextByte();
    }
    public void hienHM(){
        System.out.printf("\n%-20s",hoTen);
        System.out.printf("%-20s",khoa);
        switch(gioiTinh){
            case 1: System.out.printf("%-20s","Nam");break;
            case 2: System.out.printf("%-20s","Nữ");break;
            case 3: System.out.printf("%-20s","Khác");break;
            default: System.out.printf("%-20s","Ko Xác Định");
        }
        
    }

    public String getKhoa() {
        return khoa;
    }


    @Override
    public String toString() {
        return "HỌ & TÊN: "+hoTen+" - KHOA: "+khoa
                +" - GIỚI TÍNH: "+gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }
    
}
