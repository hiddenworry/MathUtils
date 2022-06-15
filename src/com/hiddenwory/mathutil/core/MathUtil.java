/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiddenwory.mathutil.core;

/**
 *
 * @author ADMIN
 */
public class MathUtil {
   // Trong class này cung cấp cho ai đó rất nhiều hàm xxuwr lý toán học
    // clone class Math của JDK
    // hàm thư viện xài chung ko cần lưu giá trị trạng thái thì là static
    
    
    //hàm tính giai thừa !!!
    // n! = 1, 2, 3 ,...
    // ko có số âm
    // 0 ! = 1! quy ước
    // giai thừa hồ đồ thị dốc đứng, tăng nhanh giá trị
    // 20 giai thừa vừa kịp con số kiểu long
    // bài này quy ước từ 0 -20
//    public static long getFactorial(int n){
//        if (n < 0 || n> 20) throw  new IllegalArgumentException("Invalid agrument n must be bettwen 0..20");
//        
//        if (n==0 || n==1){
//            return 1;      
//        }
//        long product = 1;
//        for (int i = 2; i <= n; i++) 
//           product*=i;
//        return product;
//            
//        
//    
//    }
    // học về đệ quy 30s
    // Hiện tượng gọi lại chính mình vìới 1 quy mô khác
    // Ví dụ: con búp bê Nga
    
    public static long getFactorial(int n){
        if (n < 0 || n> 20) throw  new IllegalArgumentException("Invalid agrument n must be bettwen 0..20");
        
        if (n==0 || n==1){
            return 1;      
        }
        return n * getFactorial(n-1);
        
    
    }
    
}
