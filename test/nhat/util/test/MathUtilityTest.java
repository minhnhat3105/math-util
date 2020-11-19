/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhat.util.test;

import nhat.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gwi99
 */
public class MathUtilityTest {

    @Test // kí hiệu của JUnit đưa ra, biến hàm ngay sau đây thành
    // public static void main(), app có nhiều main()
    // F6 chạy main() mặc định, Shift-F6 là chạy main() ở @Test
    // đây là 1 trong những cách đặt tên cho hàm test, để test code chính
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
    }
    // XANH chỉ đặt được nếu tất cả cùng xanh, hàm ý hàm đúng hết tất cả
    // ĐỎ chỉ cần ít nhất 1 thằng đỏ, coi như đỏ tất cả
    // ý nghĩa: hàm đã đúng thì phải đúng hết, sai 1 cái hay vài cái
    // hàm ko đáng tin
    
    public MathUtilityTest() {

    }

    // viết code để test code chính (MathUtility)
    // viết code dùng thư viện JUnit, NUnit, xUnit, Jasmine, ... để test
    // xem code chính chạy ổn không trước khi đem qua bên QC/Khách hàng trải nghiệm
    // và thư viện này cung cấp cái cơ chế báo đúng sai qua mày sắc xanh đỏ
    // mắt chỉ nhìn 2 màu là đủ, khỏi cần so sánh expected và actual rồi kết
}
