package org.example;


import java.util.ArrayList;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main01 {
    public String output (ArrayList<sinhVien> arr) {
        if(arr.isEmpty()) return "List khong co sinh vien";
        else if(arr.size() == 1) return "Chi co 1 nguoi";
        arr.sort((o1, o2) -> o2.grade - o1.grade);
        if(arr.get(0).grade == arr.get(1).grade) return "Co 2 nguoi bang diem nhau";
        return arr.get(0).name + " " + arr.get(1).name;
    }
    public static void main(String[] args) {
    }
}