/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ST4_LTHDT_35_QUAN_LY_KHEN_THUONG_DAI_HOC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Khai
 */
public class DSGV extends HUMAN{
    private ArrayList<GIANGVIEN>dsgv=new ArrayList<GIANGVIEN>();;
    int n; 

    public DSGV() {
    }

    public DSGV(ArrayList<GIANGVIEN> dsgv, int n, String hoTen, String khoa, String gioiTinh) {
        this.dsgv = dsgv;
        this.n = n;
    }
    
    public void nhapDsGV(){
        System.out.println("\n⁂————————————————————————————————⁂");
        Scanner sc = new Scanner(System.in);
        System.out.print("Số giảng viên muốn thêm: ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            GIANGVIEN x = new GIANGVIEN();
            System.out.print("\nNhập Giảng Viên Thứ "+(i+1)+": ");
            x.nhapGV();
            dsgv.add(x);
        }
    }
    public void xuatDSGV(){
        System.out.println("\n⁂————————————————————————————————⁂");
        System.out.println("Danh Sách Giảng Viên Là: ");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s","HỌ TÊN|","KHOA|","GIỚI TÍNH|","CHUYÊN NGÀNH|","HỌC VỊ|","SỐ DỰ ÁN");
        for(GIANGVIEN x:dsgv){
            x.hienGV();
        }
    }
    public void timGV(){
        String timTen;
        System.out.println("\n⁂————————————————————————————————⁂");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập Tên Giảng Viên Muốn Tìm: ");
        timTen = sc.nextLine();
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s","HỌ TÊN|","KHOA|","GIỚI TÍNH|","CHUYÊN NGÀNH|","HỌC VỊ|","SỐ DỰ ÁN");
        for(int i=0;i<dsgv.size();i++){
            if(dsgv.get(i).getHoTen().equals(timTen))
                dsgv.get(i).hienGV();
        }
    }
    public void sapxepGV(){
        System.out.println("\n⁂————————————————————————————————⁂");
        Collections.sort(dsgv, new Comparator<GIANGVIEN>() {
            @Override
            public int compare(GIANGVIEN o1, GIANGVIEN o2) {
                if(o1.getSoDuAn() < o2.getSoDuAn())
                    return 1;
                else if(o1.getSoDuAn() == o2.getSoDuAn())
                    return 0;
                else 
                    return -1;
            }
        });
        System.out.println("\nDanh Sách Giảng Viên Sắp Xếp Theo Số Dự Án Giảm Dần Là: ");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s","HỌ TÊN|","KHOA|","GIỚI TÍNH|","CHUYÊN NGÀNH|","HỌC VỊ|","SỐ DỰ ÁN");
        for(int i=0;i<dsgv.size();i++)
            dsgv.get(i).hienGV();   
    }
    public void xetKTGV(){
        System.out.println("\n⁂————————————————————————————————⁂");
        System.out.println("\nDanh Sách Giảng Viên Được Khen Thưởng Là: ");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s","HỌ TÊN|","KHOA|","GIỚI TÍNH|","CHUYÊN NGÀNH|","HỌC VỊ|","SỐ DỰ ÁN","KHEN THƯỞNG");        
        for(int i=0;i<dsgv.size();i++){
            if(dsgv.get(i).getSoDuAn()>=5){
                dsgv.get(i).hienGV();
                System.out.printf("%-20s","CÁN BỘ XUẤT SẮC");
            }
        }
    }
    public void ghifileGV() throws FileNotFoundException, IOException{
        File f=new File("DSGV.dat");
        
        FileOutputStream fout=new FileOutputStream(f);
        ObjectOutputStream out= new ObjectOutputStream(fout);
        out.writeObject(dsgv);
        out.close();
        fout.close();
        System.out.println("\n»»»Ghi Vào File DSGV.dat Thành Công! . . .");
    }
    public void docfileGV() throws IOException, ClassNotFoundException{
        File f=new File("DSGV.dat");
        
        FileInputStream fin=new FileInputStream(f);
        ObjectInputStream in=new ObjectInputStream(fin);
        
        dsgv = (ArrayList) in.readObject();
        
        in.close();
        fin.close();
        
        System.out.println("\n»»»Đọc File DSGV.dat Thành Công! . . .");
    }
    public void xoaGV(){
        String tenXoa;
        System.out.println("\nNhập Tên Giảng Viên Cần Xóa: ");
        Scanner sc=new Scanner(System.in);
        tenXoa=sc.nextLine();
        for(GIANGVIEN x:dsgv){
            if(x.getHoTen().equalsIgnoreCase(tenXoa)){
                dsgv.remove(x);
                System.out.println("Đã Xóa Giảng Viên Tên: "+tenXoa);
                break;
            }
        }
        if(dsgv.isEmpty())
            System.out.println("Danh Sách Trống.");
        else
            xuatDSGV();
    }
}
