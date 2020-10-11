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
    static HashMap<String,String> users_chinese=new HashMap<>();
    {
        users.put("lt","666666"); users_chinese.put("lt","刘涛");
        users.put("ccb","547114");users_chinese.put("ccb","陈翠冰");
        users.put("jzm","745123");users_chinese.put("jzm","姜赞美");
        users.put("dl","545571");users_chinese.put("dl","段磊");
        users.put("fqm","874541");users_chinese.put("fqm","冯七妹");
        users.put("ft","716545");users_chinese.put("ft","冯涛");
        users.put("ftc","712564");users_chinese.put("ftc","冯天彩");
        users.put("hhe","445145");users_chinese.put("hhe","韩焕娥");
        users.put("hjm","445474");users_chinese.put("hjm","黄见民");
        users.put("hyl","544024");users_chinese.put("hyl","黄亚莲");
        users.put("fl","785456");users_chinese.put("fl","范磊");
        users.put("julia","544572");users_chinese.put("julia","梁洪琼");//梁洪琼
        users.put("lyl","745145");users_chinese.put("lyl","廖玉莲");
        users.put("ljw","775145");users_chinese.put("ljw","刘杰文");
        users.put("may","544512");users_chinese.put("may","李艳美");//李艳美
        users.put("qxp","751114");users_chinese.put("qxp","秋显萍");
        users.put("xxl","751214");users_chinese.put("xxl","邢晓亮");
        users.put("wjy","753114");users_chinese.put("wjy","王金洋");
        users.put("xy","768114");users_chinese.put("xy","熊毅");
        users.put("yq","751314");users_chinese.put("yq","杨倩");
        users.put("yjy","761314");users_chinese.put("yjy","叶淦源");
        users.put("ypy","758314");users_chinese.put("ypy","尹佩莹");




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
        requirementExample.createCriteria().andPuterEqualTo(users_chinese.get(requirement.getPuter())).andCtimeGreaterThan(ealierTime);
        List<Requirement> exsitRequirement = sqlSession.selectList("reqs.dao.RequirementMapper.selectByExample",requirementExample);
        if(exsitRequirement.size()>=3){
            return 3;
        }
        requirement.setCtime(new Date());
        // 中文名转换
        requirement.setPuter(users_chinese.get(requirement.getPuter()));
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
