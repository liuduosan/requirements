package reqs.controller;

//import org.mybatis.spring.annotation.MapperScan;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import reqs.dao.RequirementMapper;
import reqs.utils.Res;
import reqs.vo.Requirement;
import reqs.vo.RequirementExample;

import java.util.List;

@RestController("/reqs")
//@MapperScan("reqs.dao")
public class ReqsController {
//    方式2
//    @Autowired
//    private RequirementMapper requirementMapper;
    /**
     *
     * @param requirement
     * @return
     */
    @PostMapping(value="/reqs/addReqs")
    public int addReqs(@RequestBody Requirement requirement){

//        方式1 原生
        SqlSession sqlSession = Res.getSqlSessionFactory().openSession();
        int result =  sqlSession.insert("reqs.dao.RequirementMapper.insert",requirement);

        sqlSession.commit();

//        方式2 框架
//        return requirementMapper.insert(requirement);
        return result;
    }

    /**
     * 根据提出人查找需求列表
     * TODO 暂时没有做分页
     * @param puter
     * @return
     */
    @GetMapping("/reqs/{puter}")
    @ResponseBody
    public List<Requirement>  getReqsByPuter(@PathVariable String puter){
//       方法1  原生
        RequirementExample requirementExample = new RequirementExample();

        requirementExample.createCriteria().andPuterEqualTo(puter);

        List<Requirement> requirements = Res.getSqlSessionFactory().openSession().selectList("reqs.dao.RequirementMapper.selectByExample",requirementExample);


//        方法二  框架



        return  requirements;
    }
}
