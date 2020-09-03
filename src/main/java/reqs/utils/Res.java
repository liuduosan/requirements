package reqs.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Res {

    private static SqlSessionFactory sqlSessionFactory = null;
    public static synchronized SqlSessionFactory getSqlSessionFactory(){
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        if(sqlSessionFactory == null) {
            try {
                inputStream = Resources.getResourceAsStream(resource);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sqlSessionFactory;
    }
}
