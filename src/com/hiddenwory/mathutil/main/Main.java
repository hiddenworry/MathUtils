/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiddenwory.mathutil.main;

import com.hiddenwory.mathutil.core.MathUtil;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        // thử nghiệm hàm tính giai thà có chạy đúng thiết kế hay ko
        // ta phải đưa ra các tình huống sửa dụng hàm trong thực tế
       // ví dụ : đưa vào 0 , 20 , -5, 21... ==> Test case: những tình huống cần phải test
       // test case là tình huống xài app : bào gồm: data đầu vào và output đầu ra ứng với chức năng xử lý của app
       //Kì vọng: Mong hàm sẽ trả về values để ứng với input ỏ trên
       
       long Expected = 120;// hàm trả về 120 nếu tính 5!;
       long actual = MathUtil.getFactorial(5);
        System.out.println("5! =120(expected); actual:" +  actual);
    }
}
