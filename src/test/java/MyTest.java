import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Product;
import com.pojo.ResponseBean;
import com.service.CarouselService;
import com.service.ProductService;
import com.util.JwtUtils;
import com.util.MyUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MyTest {

    @Resource
    private CarouselService carouselService;

    public CarouselService getCarouselService() {
        return carouselService;
    }

    public void setCarouselService(CarouselService carouselService) {
        this.carouselService = carouselService;
    }

    @Test
    public void test() throws Exception{
        System.out.println(ClassUtils.getDefaultClassLoader().getResource("").getPath());
    }

}
