import com.sun.dao.UserMapper;
import com.sun.pojo.User;
import com.sun.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Author SunHao
 * @Date 2020/9/15 23:30
 */
public class MyTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);

        System.out.println("=========================================");
        User user2 = mapper.queryUserById(1);
        System.out.println(user2);

        System.out.println(user == user2);

        sqlSession.close();
    }
}
