/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhat.util;

/**
 *
 * @author Gwi99
 */
public class MathUtility {
    // làm hàng fake giognos như hàng thật
    // JDK có class java.util.Math, có 1 loạt hàm static
    //                              . abs()  .sin()  .sqrt()    .pow(a, b)
    //                              .PI = 3.1415...
    public static final double PI = 3.1415;
    
    // hàm tính n! = 1.2.3..n!
    // n! tăng nhanh, nên mình chỉ tính 20! tối da, 21! tràn (kiểu long)
    // 0! = 1! = 1, quy ước
    // ko có âm giai thừa, nếu tham số n là âm, mình chửi, ném ra Exception
    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("n must be between 1..20");
        }
        if(n == 0 || n == 1){
            n = 1;
        }
        
        // sống sót đến lệnh này tức là n = 2..20 rồi, thằng nào xài else biết tay ông
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("5! = " + getFactorial(5));
        // tui gọi hàm tính 5! hy vọng hàm trả về 120
        // lát hồi hàm chạy, coi thực tế là mấy - ACTUAL
        // tui so sánh với cái tui hy vọng trước khi tính, EXPECTED 120
        // ACTUAL == EXPECTED, hàm chạy đúng cho tình huống này, test case này
        System.out.println("0! = " + getFactorial(0));
        // expected: 1, actual: ? chạy mới biết
        // chạy xong mới biết hàm đúng sai
        System.out.println("-5 = " + getFactorial(-5));
        // expected: đập vào mặt ILLEGALARGUMENTEXCEPTION
        // cách test kiểu này gọi là: MANUAL
        // vì ta phải nhìn bằng mắt để luận kết quả
        // cách xịn sò, ta dùng màu sắc xanh đỏ để luận kết quả đúng sai của hàm
        // cách này gọi là test automation
        // thứ 3 ổng giảng tiếp
    }
}
