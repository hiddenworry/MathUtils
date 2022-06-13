/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiddenwory.mathutil.test.core;

import com.hiddenwory.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author ADMIN
 */

// câu lệnh này lầ của Junit báo hiệu rằng sẽ cần loop qua tập data để 
// lấy cặp data input/expected nhồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUntilDDTTest {
   // trả về mảng 2 chiều gồm Expected|Input  hoặc ngược lại
    
 @Parameterized.Parameters //Junit sẽ ngầm chạy loop qua từng dòng 
 // của mảng để lấy ra cặp data input/expected
 // tên hàm ko quan trọng, quan trong là @
   public static Object[][] initData(){
       
       return new Integer[][]{
           {0, 1},
           {1, 1},
           {2, 2},
           {3, 6},
           {4, 24},
           {5, 120},
           {6, 720},
       };
   }
   // giả sử loop qua đc từng dòng thì ta phải cần gán value vào biến input/ expected tương ứng để đưa 
   // vào hàm test
   
   @Parameterized.Parameter(value = 0)
   public int n; // biến map với value của cột 0 của mảng
   
   @Parameterized.Parameter(value = 1)
   public long expected; // kiểu long vì giá trị trả về của hàm getF;
   
   
   @Test
   public void testGetFactorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
   
   }
   
    
}
