import com.mrh.dao.BlogMapper;
import com.mrh.pojo.Blog;
import com.mrh.utils.IDUtils;
import com.mrh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void addBlog(){

            SqlSession sqlSession = MybatisUtils.getSqlSession();
            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
            Blog blog = new Blog();
            blog.setId(IDUtils.getId());
            blog.setTitle("Mybatis如此简单");
            blog.setAuthor("狂神说");
            blog.setCreateTime(new Date());
            blog.setViews(9999);

            mapper.addBlog(blog);

            blog.setId(IDUtils.getId());
            blog.setTitle("Java如此简单");
            mapper.addBlog(blog);

            blog.setId(IDUtils.getId());
            blog.setTitle("Spring如此简单");
            mapper.addBlog(blog);

            blog.setId(IDUtils.getId());
            blog.setTitle("微服务如此简单");
            mapper.addBlog(blog);

            sqlSession.close();
    }

    @Test
    public void queryBlogIF(){
            SqlSession sqlSession = MybatisUtils.getSqlSession();

            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

            HashMap map = new HashMap();

//            map.put("title","Java如此简单2");
            map.put("author","狂神说");


            List<Blog> blogs = mapper.queryBlogIF(map);

            for (Blog blog : blogs) {
                    System.out.println(blog);
            }
            sqlSession.close();
    }
    @Test
    public void queryBlogChoose(){
            SqlSession sqlSession = MybatisUtils.getSqlSession();

            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

            HashMap map = new HashMap();

            map.put("title","Java如此简单");
            map.put("author","狂神说");
            map.put("views",9999);


            List<Blog> blogs = mapper.queryBlogChoose(map);

            for (Blog blog : blogs) {
                    System.out.println(blog);
            }
            sqlSession.close();
    }
    @Test
    public void updateBlog(){
            SqlSession sqlSession = MybatisUtils.getSqlSession();

            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

            HashMap map = new HashMap();

            map.put("title","Java如此简单2");
            map.put("author","狂神说1");
            map.put("id","b724edf11e474e28b633c6303a389796");


            int i = mapper.updateBlog(map);
                if (i>0){
                        System.out.println("更新成功");
                }

            sqlSession.close();
    }
    @Test
    public void queryBlogForeach(){
            SqlSession sqlSession = MybatisUtils.getSqlSession();

            BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

            HashMap map = new HashMap();

            ArrayList<Integer> ids = new ArrayList<Integer>();

            ids.add(1);
            ids.add(2);

            map.put("ids",ids);

            List<Blog> blogs = mapper.queryBlogForeach(map);

            for (Blog blog : blogs) {
                    System.out.println(blog);
            }
            sqlSession.close();
    }

}
