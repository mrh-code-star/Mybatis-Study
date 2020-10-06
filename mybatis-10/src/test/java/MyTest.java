import com.mrh.dao.UserMapper;
import com.mrh.pojo.User;
import com.mrh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {

    @Test
    public void add(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.add(new User(9,"xiaomi","小米","00000000",2,))
    }
}
