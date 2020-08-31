package reqs.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import reqs.dao.RequirementMapper;
import reqs.vo.Requirement;
import reqs.vo.RequirementExample;

import java.util.List;

@RestController("/reqs")
@MapperScan("reqs.dao")
public class ReqsController {

//    @Autowired
//    private RequirementMapper requirementMapper;
    /**
     *
     * @param requirement
     * @return 1-ok,0-error
     */
//    @PostMapping
//    public int addReqs(Requirement requirement){
//        return requirementMapper.insert(requirement);
//    }
//
//    @GetMapping("/{puter}")
//    @ResponseBody
//    public Requirement  getReqsByPuter(@PathVariable String puter){
//
//        RequirementExample example = new RequirementExample();
//        RequirementExample.Criteria criteria = example.createCriteria();
//        criteria.andPuterEqualTo(puter);
//        List<Requirement> list =  requirementMapper.selectByExample(example);
//        if(list.size()>0){
//            return list.get(0);
//        }else{
//            return  null;
//        }
//
//    }
}
