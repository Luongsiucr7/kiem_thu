import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Bai1 {
    public String testChanLe(int a){
        if(a%2==0 && a>0){
            return "a la so chan";
        }else if(a%2!=0 & a>0) {
            return "a la so le";
        }else {
            return "a khong phai chan le";
        }
    }

    @Test
    public void testSoChan(){
        Assertions.assertEquals("a la so chan",testChanLe(6));
    }

    @Test
    public void testSoLe(){
        Assertions.assertEquals("a la so le",testChanLe(5));
    }

    @Test
    public void testSoAm(){
        Assertions.assertEquals("a khong phai chan le",testChanLe(-1));
    }

    @Test
    public void testSoThapPhan(){
        Assertions.assertEquals("a la so le",testChanLe(4/3));
    }

    @Test
    public void testSoKhong(){
        Assertions.assertEquals("a khong phai chan le",testChanLe(0));
    }
}
