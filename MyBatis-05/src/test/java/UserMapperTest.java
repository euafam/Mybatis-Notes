import com.william.dao.UserMapper;
import com.william.pojo.User;
import com.william.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = mapper.getUsers();
//
//        for (User user : users) {
//            System.out.println(user);
//        }
//
//        User userByID = mapper.getUserByID(2);
//        System.out.println(userByID);

//        mapper.addUser(new User(4, "zhangsan", "123123"));

//        mapper.updateUser(new User(5,"to", "232423"));

        mapper.deleteUser(5);
        sqlSession.commit();
        sqlSession.close();

    }
}
