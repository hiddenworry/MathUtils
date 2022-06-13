/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiddenwory.mathutil.test.core;

import com.hiddenwory.mathutil.core.MathUtil;
import static com.hiddenwory.mathutil.core.MathUtil.getFactorial;
import junit.framework.Assert;
import org.junit.Test;



/**
 *
 * @author ADMIN
 */
public class MathUtilTest {
    
   // Đây là class sẽ sử dụng các hàm của thư viện junit để kiểm thử, kiểm tra code chính- hàm tính 
    // giai thừa bên class core.MathUtil
    // viết code để test code chính bên kia
    
    
    // có nhiều quy tắc đặt tên hàm kiểm thử, nhưng thường nói lên các mục địch, các case, các tình huống
    // xài hàm theo các kiểu thành công hoặc thất bại
    // hàm dưới đây là hàm return well- đưa 5!, 6!, ko chơi: -5!, 30!
    // @Test junit sẽ phối hợp với JVM chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    // @có nhiều @Test ứng với nhiều case khác nhau để kiểm thử tình huống test giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 0; // test thưt tình huongod tử tế đầu vào
        long expected = 1;
        //long actual = ; gọi hàm cần test bên core
        long actual = MathUtil.getFactorial(n);
        
        // so sánh dùng frameword
        Assert.assertEquals(expected, actual);
        // Hàm giúp so sánh 2 giá trị nào đó có giống nhau ko, nếu giống thì màu xanh, ko giống thì màu đỏ
        
        // gộp thêm vài case thành công //
         Assert.assertEquals(1, MathUtil.getFactorial(1));// 1 giai thừa
         Assert.assertEquals(2, MathUtil.getFactorial(2));
                  Assert.assertEquals(24, MathUtil.getFactorial(4));
                  // các quy ước xanh đỏ của unit test nói chung và jnuit nói riêng
                  // bạn liệt kê ra hàm cần test co những tình huống nào để xài, các đầu vào là gì
                  // liêt kê các đầu vào cần test
                  // tính trước các expected
                  // viết code để test code cho các case- gọi hàm với các đầu vào khác nhau đã liệt kê
                  // Run 
                  // nêu tất cả các case đều ngon, expected==actual=> xanh cho tất cả
                  // chỉ có ít nhất 1 case tạch expexted!=actual cho ít nhất 1 case => 1 màu đỏ cho tất cả
                  // Nghệ thuật đảm bảo chất lượng code của dân dev hay dân CI là cố gắng tưởng tưởng các trường hợp sử dụng hàm 1 các tốt nhất
                  // cần xanh cho tất cả các case đã
                  // liệt kê thiếu soát thì ko nói, đã đưa ra case phải xanh hết
                  // đỏ gồm 2 nguyên nhân (actual != expected)
                  // Nguyên nhân 1 viết code sai giá trị trở về
                  // nguyên nhân: mình kì vọng sai, tính bằng tay bị sai
                  
                  
                  
    }
    
    
    // Có 2 tình huống xử lý
    // 1. đưa data tử tế [0..20] -> tính đc n!
    // 2. đưa data vào cà chớn, âm, > 20; thiết kế của hàm là ném ra ngoại lệ
    // Tại kì vọng ngoại lệ xuất hiện khi N < 0 || N > 20
    // rất mong xuất hiện tình trạng cà chớn này
    // nếu hàm nhận vào n < 0 hoặc n > 20 thì hàm ném ra ngoại lệ => hàm chạy đúng=> màu xanh(mọi thứ như kì vọng)
    // nếu hàm nhận vào n< 0 và n> 20 thì hàm chạy sai thiết kế, sai kì vọng, màu đỏ
    
   
    //test case :
    // input : -5
    // excpected: IllegalAgrument xuất hiện
    // titnhf huống ngoại lệ, ngoài dự tính
    // là những thứ ko thể đo lường so sánh theo kiểu value
    // mà chỉ so sánh chúng có xuất hiện hay ko
    // asserEquals () ko dùng để so sánh 2 ngoại lệ
    // equals là bằng nhau hay ko
    
    //Màu đỏ do hàm có ném ngoại lệ nhưng ko phải ngoại lệ như kì vọng
//     @Test(expected = NumberFormatException.class)
//     public void testGetFactorialGivenRightArgumentReturnsWellThrowsExcpection(){
//            
//         MathUtil.getFactorial(-5); // Hàm @Test hay hàm getF này chạy sẽ ném ra ngoại lệ NumberFormat...
//         
//         
//         
//     }
    
    
     @Test(expected = IllegalArgumentException.class)
     public void testGetFactorialGivenRightArgumentReturnsWellThrowsExcpection(){
            
         MathUtil.getFactorial(-5); // Hàm @Test hay hàm getF này chạy sẽ ném ra ngoại lệ NumberFormat...
         
         
         
     }
     
     // Cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn và xài lambda
     
     
     // hàm sẽ ném về ngoại lệ nếu nhận vào 21
     // tui cần thấy màu xanh khi chơi voiwa 21!
     
     // vài bữa qua junit 5 xài
      @Test()
     public void testGetFactorialGivenRightArgumentReturnsWellThrowsExcpection_LambdaVersion(){
           // Assert.assertThrows
//         MathUtil.getFactorial(-5); // Hàm @Test hay hàm getF này chạy sẽ ném ra ngoại lệ NumberFormat...
         
         
         
     }
     
     // Bắt xem hàm có ném vào ngoại lệ hay ko, nếu ném hàm đúng
     
      @Test()
     public void testGetFactorialGivenRightArgumentReturnsWellThrowsExcpection_TryCatchVersion(){
        try{
         MathUtil.getFactorial(-5); // Hàm @Test hay hàm getF này chạy sẽ ném ra ngoại lệ NumberFormat...
        } catch(Exception e){
        // bắt try-catch là junit sẽ ra màu xanh do đã chủ động kiểm soát ngoại lệ
        // có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException
        Assert.assertEquals("Invalid agrument n must be bettwen 0..20", e.getMessage() );
        }
         
         
     }
     
}

