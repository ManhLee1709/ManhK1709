package ST4_LTHDT_35_QUAN_LY_KHEN_THUONG_DAI_HOC;
import java.io.IOException;
import java.util.*;
public class QUANLYKHENTHUONGDH {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       DSSV sv=new DSSV();
       DSGV gv = new DSGV();
       
       Scanner sc=new Scanner(System.in);
       int chon,n;
       
       do{
           System.out.println("\n⁂————————————————————————————————⁂");
           System.out.println("PHẦN MỀM QUẢN LÝ KHEN THƯỞNG CỦA TRƯỜNG ĐẠI HỌC MỞ HÀ NỘI");
           System.out.println("\n1. SINH VIÊN");
           System.out.println("2. GIẢNG VIÊN");
           System.out.println("0. Thoát Chương Trình!");
           System.out.println("\n⁂————————————————————————————————⁂");
           System.out.print("»»»MỜI CHỌN ĐỐI TƯỢNG: ");
           n =sc.nextInt();
           
           if(n==1){
                   do{
                        System.out.println("\n⁂——————————SINH VIÊN—————————————————⁂");
                        System.out.println("\n1. Nhập Danh Sách Sinh Viên & Lưu File");            
                        System.out.println("2. Đọc File & Hiện Danh Sách Sinh Viên");
                        System.out.println("3. Tìm Kiếm Sinh Viên Theo Mã SV");
                        System.out.println("4. Sắp Xếp Danh Sách Sinh Viên Theo ĐRL Giảm Dần");
                        System.out.println("5. Hiện Danh Sách Khen Thưởng Của Các Sinh Viên");
                        System.out.println("6. Xóa Sinh Viên Theo Mã SV");
                        System.out.println("0. Thoát SINH VIÊN!");
                        System.out.println("\n⁂————————————————————————————————⁂");
                        System.out.print("»»»MỜI CHỌN CHỨC NĂNG: ");
                        chon=sc.nextInt();
                        switch(chon){
                            case 0: break;
                            case 1: sv.nhapDsSV();sv.ghifileSV(); break;
                            case 2: sv.docfileSV();sv.xuatDsSV();break;
                            case 3: sv.timSV(); break;
                            case 4: sv.sapxepSV();sv.sxSV(); break;
                            case 5: sv.xetKTSV(); break;
                            case 6: sv.xoaSV();break;
                            default: System.out.println("Nhập sai!");
                        } 
                    }while(chon!=0);  
               }
           else if(n==2)
                   do{
                        System.out.println("\n⁂——————————GIẢNG VIÊN————————————————⁂");
                        System.out.println("\n1. Nhập Danh Sách Giảng Viên & Lưu File ");
                        System.out.println("2. Đọc File & Hiện Danh Sách Giảng Viên");
                        System.out.println("3. Tìm Kiếm Giảng Viên Theo Tên");
                        System.out.println("4. Sắp Xếp Danh Sách Giảng Viên Theo Số DA Giảm Dần ");
                        System.out.println("5. Hiện Danh Sách Khen Thưởng Của Các Giảng Viên");
                        System.out.println("6. Xóa Giảng Viên Theo Tên");
                        System.out.println("0. Thoát GIẢNG VIÊN!");
                        System.out.println("\n⁂————————————————————————————————⁂");
                        System.out.print("»»»MỜI CHỌN CHỨC NĂNG: ");;
                        chon=sc.nextInt();
                        switch(chon){
                            case 1: gv.nhapDsGV();gv.ghifileGV(); break;
                            case 2: gv.docfileGV();gv.xuatDSGV();break;
                            case 3: gv.timGV();; break;
                            case 4: gv.sapxepGV(); break;
                            case 5: gv.xetKTGV(); break;
                            case 6: gv.xoaGV();break;
                            case 0: break;
                            default: System.out.println("Nhập sai!");
                        }    
                   }while(chon!=0);
           else if(n==0) break;
           else System.out.println("Nhập sai!");
       }while(n!=0);
    }
}