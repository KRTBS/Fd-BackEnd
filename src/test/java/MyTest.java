import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.ResponseBean;
import com.pojo.Shop;
import com.service.ShopService;
import com.util.JwtUtils;
import com.util.MyUtils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class MyTest {

    @Test
    public void test() throws Exception{
        //String s = JwtUtils.getToken("d1", "Admin");
        //System.out.println("TOKEN");
        //System.out.println(s);
        //System.out.println(JwtUtils.verifyToken(s));
        //System.out.println(JwtUtils.getTokenInfo(s));//JWTDecoder对象
        //System.out.println(JwtUtils.getUsername("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiQWRtaW4iLCJleHAiOjE2Mzg1ODY0NTAsInVzZXJuYW1lIjoicm9vdCJ9.TipAEz6iWWDSOpaHDeJIyB9bpnQNDlvQQOMw0KajZ1A"));
        //System.out.println(JwtUtils.getRole(s));
        //System.out.println(JwtUtils.isExprire(s));


        System.out.println(new ResponseBean("sss").CREATED());

    }

}
