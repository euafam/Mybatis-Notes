import com.william.dao.StudentMapper;
import com.william.dao.TeacherMapper;
import com.william.pojo.Student;
import com.william.pojo.Teacher;
import com.william.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {

    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);

        System.out.println(teacher);
        sqlSession.close();
    }


    @Test
    public void testStudent(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student>  studentList = mapper.getStudent();

        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();

    }


    @Test
    public void testStudent2(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student>  studentList = mapper.getStudent();

        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();

    }
}
