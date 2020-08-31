package reqs;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import reqs.utils.Res;
import reqs.vo.Requirement;

/**
 * 简单core java测试demo类
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(1111111111);
        SqlSessionFactory sqlSessionFactory = Res.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Requirement requirement = sqlSession.selectOne("reqs.dao.RequirementMapper.selectByPrimaryKey",1);
        System.out.println(requirement.getId());
        System.out.println(22222222);
    }
}
