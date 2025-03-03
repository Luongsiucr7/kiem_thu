import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import repository.SanPhamService;

public class Bai2 {
    SanPhamService sanPhamService = new SanPhamService();

    @Test
    public void testDayDu(){
        Assertions.assertEquals("Thanh cong",sanPhamService.update("SP001","asd"));
    }

    @Test
    public void testSaiMa(){
        Assertions.assertEquals("Khong tim thay",sanPhamService.update("SP003","asd"));
    }
    @Test
    public void testKyTu(){
        Assertions.assertEquals("Khong tim thay",sanPhamService.update("@","asd"));
    }
    @Test
    public void testRong(){
        Assertions.assertEquals("",sanPhamService.update("","asd"));
    }
    @Test
    public void testSo(){
        Assertions.assertEquals("Khong tim thay",sanPhamService.update("1","asd"));
    }
}
