# 工程简介
使用springboot框架的核心配置文件application.properties


## 注解的两种写法

```java
@Controller
public class IndexController {
    @RequestMapping(value = "/say")
    @ResponseBody
    public String say() {
        return "say hello";
    }

    @RequestMapping(value = "/anothersay")
    public @ResponseBody
    Map<String, Object> mapvalue() {
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("message", "sping boot project");

        return retMap;
    }

    @RequestMapping(value = "/sayagain")
    public @ResponseBody say(String message){
        return "hello" + message;
    }
}
```

