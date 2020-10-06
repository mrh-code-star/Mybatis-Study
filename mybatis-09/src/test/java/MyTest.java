import com.mrh.dao.UserMapper;
import com.mrh.pojo.User;
import com.mrh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {


    @Test
    public void queryUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        System.out.println("=======================");

        User user = mapper.queryUserById(1);

        System.out.println(user);

        System.out.println("=======================");

//        mapper.updateUser(new User(2, "第二二二", "2222222"));

        sqlSession.clearCache();//手动清理缓存

        System.out.println("=======================");



        User user1 = mapper.queryUserById(1);

        System.out.println(user1);

        System.out.println(user==user1);

        sqlSession.close();
    }

    @Test
    public void Test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();


        System.out.println("=================");

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlSession.close();

        System.out.println("=================");

        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        User user1 = mapper1.queryUserById(1);
        System.out.println(user1);

        System.out.println(user==user1);
        sqlSession1.close();

    }
}
