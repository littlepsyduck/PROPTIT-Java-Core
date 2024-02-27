package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test01 {
    @Test
    // GivenNullUsernameWhenCreateStudentThenShouldThrowException
    public void test_01_khi_lay_diem_top_2_sinh_vien_thi_tra_ve_dung(){
        Main01 main = new Main01();
        sinhVien sv1 = new sinhVien();
        sv1.name = "Mina";
        sv1.grade = 10;
        sinhVien sv2 = new sinhVien();
        sv2.name = "Hiu";
        sv2.grade = 11;
        sinhVien sv3 = new sinhVien();
        sv3.name = "Milo";
        sv3.grade = 12;
        ArrayList<sinhVien> arr = new ArrayList<>();
        arr.add(sv1);
        arr.add(sv2);
        arr.add(sv3);
        String kq = main.output(arr);
        Assertions.assertEquals("Milo Hiu", kq);
    }
    @Test
    public void test_02_khi_lay_diem_top_2_sinh_vien_khi_list_co_1_sinh_vien_thi_tra_ve_1_sinh_vien(){
        Main01 main = new Main01();
        sinhVien sv1 = new sinhVien();
        sv1.name = "Mina";
        sv1.grade = 10;
        ArrayList<sinhVien> arr = new ArrayList<>();
        arr.add(sv1);
        String kq = main.output(arr);
        Assertions.assertEquals("Chi co 1 nguoi", kq);
    }
    @Test
    public void test_03_khi_lay_diem_top_2_sinh_vien_khi_list_rong_thi_tra_ve_khong_co_sinh_vien(){
        Main01 main = new Main01();
        ArrayList<sinhVien> arr = new ArrayList<>();
        String kq = main.output(arr);
        Assertions.assertEquals("List khong co sinh vien", kq);
    }
}

