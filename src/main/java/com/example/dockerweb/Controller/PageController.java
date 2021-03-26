package com.example.dockerweb.Controller;

import com.example.dockerweb.Mapper.MysqlMapper;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class PageController {
    @Resource
    private MongoTemplate mongoTemplate;
    @Resource
    private RedisTemplate<String, Object> redisTemplate;
    @Resource
    private MysqlMapper mysqlMapper;
    @RequestMapping("/")
    public String home(Model model){
        int bef1 = mysqlMapper.selectMysql();
        mysqlMapper.changeMysql();
        int res1 = mysqlMapper.selectMysql();
        model.addAttribute("mysqlbef", bef1);
        model.addAttribute("mysqlres", res1);


        model.addAttribute("redisres", redisTemplate.opsForValue().increment("age"));


        Query query = new Query(Criteria.where("name").is("5yw"));
        List<Map> list = mongoTemplate.find(query, Map.class,  "hellomongodb");
        int bef3 = (int) list.get(0).get("age");
        //****************************************************************************************************
        Update update = new Update();
        update.set("age", bef3 + 1);
        mongoTemplate.updateFirst(query, update, "hellomongodb");
        //****************************************************************************************************
        List<Map> list1 = mongoTemplate.find(query, Map.class,  "hellomongodb");
        int res3 = (int) list1.get(0).get("age");
        model.addAttribute("mongobef", bef3);
        model.addAttribute("mongores", res3);


        return "Page/home.html";
    }
}
