package reqs.controller;

//import org.mybatis.spring.annotation.MapperScan;
import org.apache.ibatis.session.SqlSession;
import org.springframework.web.bind.annotation.*;
import reqs.utils.Res;
import reqs.vo.Requirement;
import reqs.vo.RequirementExample;
import reqs.vo.User;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController("/reqs")
//@MapperScan("reqs.dao")
public class ReqsController {
    static HashMap<String,String> users=new HashMap<>();
    {
        users.put("lt","Kjb12345");
        users.put("ccb","547114");
        users.put("jzm","745123");
        users.put("dl","545571");
        users.put("fqm","874541");
        users.put("ft","716545");
        users.put("ftc","712564");
        users.put("hhe","445145");
        users.put("hjm","445474");
        users.put("hyl","544024");
        users.put("fl","785456");
        users.put("lt","Kjb12345");
        users.put("julia","544572");//梁洪琼
        users.put("lyl","745145");
        users.put("may","544512");//李艳美
        users.put("qxp","751114");
        users.put("xxl","751214");
        users.put("wjy","753114");
        users.put("xy","768114");
        users.put("yq","751314");
        users.put("yjy","761314");
        users.put("ypy","758314");


    }
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
        // 判断该用户当天是否已经提交需求
        RequirementExample requirementExample = new RequirementExample();
        // 获取当天凌晨00:00：00时间
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(calendar1.get(Calendar.YEAR), calendar1.get(Calendar.MONTH), calendar1.get(Calendar.DAY_OF_MONTH),
                0, 0, 0);
        Date ealierTime = calendar1.getTime();
        requirementExample.createCriteria().andPuterEqualTo(requirement.getPuter()).andCtimeGreaterThan(ealierTime);
        List<Requirement> exsitRequirement = sqlSession.selectList("reqs.dao.RequirementMapper.selectByExample",requirementExample);
        if(exsitRequirement.size()==3){
            return 3;
        }
        requirement.setCtime(new Date());
        int result =  sqlSession.insert("reqs.dao.RequirementMapper.insert",requirement);

        sqlSession.commit();

        // TODO 异步邮件通知研发人员


//        方式2 框架
//        return requirementMapper.insert(requirement);
        return result;
    }

    @PostMapping(value="/reqs/login")
    public int login(@RequestBody User user) {

        String username = user.getUsername();
        String password = user.getPassword();
        if(username!=null && users.get(username)!=null){
            String password_db = users.get(username);
            if(password_db.equals(password)){
                return 1;
            }
        }
        return 0;
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
