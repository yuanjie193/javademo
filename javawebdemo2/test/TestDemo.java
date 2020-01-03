import com.controller.UserController;
import org.junit.Test;

import java.util.Random;

public class TestDemo {
    @Test
    public void test(){
        UserController uc =new UserController();
        int a =uc.register("yuan2","123");
        System.out.println(a);
        Random r = new Random();
    }
}
