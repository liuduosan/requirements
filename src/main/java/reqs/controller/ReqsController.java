package reqs.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import reqs.dao.RequirementMapper;
import reqs.utils.Res;
import reqs.vo.Requirement;
import reqs.vo.RequirementExample;

import java.util.List;

@RestController("/reqs")
@MapperScan("reqs.dao")
public class ReqsController {
//    方式2
//    @Autowired
//    private RequirementMapper requirementMapper;
    /**
     *
     * @param requirement
     * @return
     */
    @PostMapping
    public int addReqs(Requirement requirement){

//        方式1
        return Res.getSqlSessionFactory().openSession().insert("reqs.dao.RequirementMapper.insert",requirement);
//        方式2
//        return requirementMapper.insert(requirement);
    }

    @GetMapping("/{puter}")
    @ResponseBody
    public Requirement  getReqsByPuter(@PathVariable String puter){
//      方法1  TODO 还没写完；
//        Res.getSqlSessionFactory().openSession().selectList("reqs.dao.RequirementMapper.")

//        方法二
//        RequirementExample example = new RequirementExample();
//        RequirementExample.Criteria criteria = example.createCriteria();
//        criteria.andPuterEqualTo(puter);
//        List<Requirement> list =  requirementMapper.selectByExample(example);
//        if(list.size()>0){
//            return list.get(0);
//        }else{
//            return  null;
//        }


        return  null;
    }
}
