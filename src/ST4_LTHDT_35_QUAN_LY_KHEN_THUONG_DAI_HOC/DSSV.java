package ST4_LTHDT_35_QUAN_LY_KHEN_THUONG_DAI_HOC;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.System.out;
import java.util.*;
public class DSSV extends HUMAN{
    private ArrayList<SINHVIEN>dssv=new ArrayList<SINHVIEN>();
    private int n;

    public DSSV() {
    }

    public DSSV(ArrayList<SINHVIEN> dssv, int n) {
        this.dssv = dssv;
        this.n = n;
    }
    public void nhapDsSV(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\n⁂————————————————————————————————⁂");
        System.out.print("Số Sinh Viên Muốn Thêm: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            SINHVIEN s=new SINHVIEN(); //Thêm một biến s lấy từ class SINHVIEN
            System.out.print("\nNhập Sinh Viên Thứ "+(i+1)+": ");
            s.nhapSV();
            dssv.add(s); //Thêm sinhvien vừa nhập vào ArrayList dssv
        }
    }
    public void xuatDsSV(){ 
        System.out.println("\n⁂————————————————————————————————⁂");
        System.out.println("Danh Sách Sinh Viên Là: ");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s","HỌ TÊN|","KHOA|","GIỚI TÍNH|","MÃ SV|","LỚP|","|ĐRL","|SỐ TC","|ĐTB","|SỐ HĐ");
        dssv.forEach((s) -> {//?
            s.hienSV();
        });
    }
    public void timSV(){
        String ma;//Mã SV cần tìm
        System.out.println("\n⁂————————————————————————————————⁂");
        Scanner sc=new Scanner(System.in);
        System.out.print("\nNhập Mã Sinh Viên Cần Tìm: ");
        ma=sc.nextLine();
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s","HỌ TÊN|","KHOA|","GIỚI TÍNH|","MÃ SV|","LỚP|","|ĐRL","|SỐ TC","|ĐTB","|Số HĐ");
        for(int i=0;i<dssv.size();i++){
            if(dssv.get(i).getMaSV().equals(ma))
                dssv.get(i).hienSV();
        }
    }
    public void xetKTSV(){
        System.out.println("\n⁂————————————————————————————————⁂");
        System.out.println("\nDanh Sách Sinh Viên Được Khen Thưởng Là: ");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s","HỌ TÊN|","KHOA|","GIỚI TÍNH|","MÃ SV|","LỚP|","ĐRL|","SỐ TC","ĐTB","SỐ HĐ","KHEN THƯỞNG");
        for(int i=0;i<dssv.size();i++){
            if(dssv.get(i).getDiemRenLuyen()>=80&&dssv.get(i).getSoTinChi()>=15&&dssv.get(i).getDTB()>7&&dssv.get(i).getDTB()<8){
                dssv.get(i).hienSV();
                System.out.printf("%-20s","HỌC BỔNG LOẠI KHÁ");
            } else if(dssv.get(i).getDiemRenLuyen()>=80&&dssv.get(i).getSoTinChi()>=15&&dssv.get(i).getDTB()>=8&&dssv.get(i).getDTB()<9){
                dssv.get(i).hienSV();
                System.out.printf("%-20s","HỌC BỔNG LOẠI GIỎI");
            } else if(dssv.get(i).getDiemRenLuyen()>=80&&dssv.get(i).getSoTinChi()>=15&&dssv.get(i).getDTB()>=9){
                dssv.get(i).hienSV();
                System.out.printf("%-20s","HỌC BỔNG LOẠI XUẤT SẮC");
            }
            if(dssv.get(i).getDiemRenLuyen()>=90&&dssv.get(i).getDTB()>=9){
                dssv.get(i).hienSV();
                System.out.printf("%-20s","TIỀN THƯỞNG SINH VIÊN XUẤT SẮC");
            }
            if(dssv.get(i).getSoHoatDong()>=6&&dssv.get(i).getDiemRenLuyen()>=75&&dssv.get(i).getDTB()>=6.25){
                dssv.get(i).hienSV();
                System.out.printf("%-20s","SINH VIÊN 5 TỐT");
            }
        }
    }
    public void sapxepSV(){
        System.out.println("\n⁂————————————————————————————————⁂");
        Collections.sort(dssv, new Comparator<SINHVIEN>(){ //Tạo một phương thức mới so sánh của class SINHVIEN
            @Override
            public int compare(SINHVIEN t, SINHVIEN t1) { // biến t là phần tử trước, biến t1 là phần tử sau
                if(t.getDiemRenLuyen()<t1.getDiemRenLuyen()) // lấy điểm rèn luyện từ class SINHVIEN, so sánh phần tử trước và sau
                    return 1;   //đổi chỗ
                else if(t.getDiemRenLuyen()==t1.getDiemRenLuyen())
                    return 0;   //giữ nguyên
                else return -1;// bỏ qua
            }  
        });
        System.out.println("\nDanh Sách Sinh Viên Sắp Xếp Theo ĐRL Giảm Dần Là: ");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s","HỌ TÊN|","KHOA|","GIỚI TÍNH|","MÃ SV|","LỚP|","|ĐRL","|SỐ TC","|ĐTB","|Số HĐ");
        for(int i=0;i<dssv.size();i++)
            dssv.get(i).hienSV();
    }
    public void sxSV(){
        Collections.sort(dssv, (a,b) ->
        a.getHoTen().compareTo(b.getHoTen()));
        System.out.println("\nDanh Sách Sinh Viên Sắp Xếp Theo Tên A-Z Là: ");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s","HỌ TÊN|","KHOA|","GIỚI TÍNH|","MÃ SV|","LỚP|","|ĐRL","|SỐ TC","|ĐTB","|Số HĐ");
        for(int i=0;i<dssv.size();i++)
            dssv.get(i).hienSV();
    }
    public void ghifileSV() throws FileNotFoundException, IOException{
        File f=new File("DSSV.dat");
        
        FileOutputStream fout=new FileOutputStream(f);
        ObjectOutputStream out= new ObjectOutputStream(fout);
        out.writeObject(dssv);
        out.close();
        fout.close();
        System.out.println("\n»»»Ghi Vào File DSSV.dat Thành Công! . . .");
    }
    public void docfileSV() throws IOException, ClassNotFoundException{
        File f=new File("DSSV.dat");
        
        FileInputStream fin=new FileInputStream(f);
        ObjectInputStream in=new ObjectInputStream(fin);
        
        dssv = (ArrayList) in.readObject();
        
        in.close();
        fin.close();
        
        System.out.println("\n»»»Đọc File DSSV.dat Thành Công! . . .");
    }
    public void xoaSV(){
        String maXoa;
        System.out.println("\nNhập Mã Sinh Viên Cần Xóa: ");
        Scanner sc=new Scanner(System.in);
        maXoa=sc.nextLine();
        for(SINHVIEN x:dssv){
            if(x.getMaSV().equals(maXoa)){
                dssv.remove(x);
                System.out.println("Đã Xóa Sinh Viên Mã: "+maXoa);
                break;
            }
        }
        if(dssv.isEmpty())// Xử lí ngoại lệ
            System.out.println("Danh Sách Trống.");
        else 
            xuatDsSV();
    }
}
