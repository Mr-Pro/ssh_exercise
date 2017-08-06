import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;


/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-08-03.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestC3P0DataSource {

    @Resource(name = "dataSource")
    private DataSource dataSource;

    @org.junit.Test
    public void test1(){
        System.out.println(dataSource);
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }


}
