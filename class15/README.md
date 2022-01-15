## 工程简介  
- 各种注解的意义及使用场景
- 如何实现RESTful风格

- 当返回的结果都是JSON类型时  
```java
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student")
    public @ResponseBody Object check(Integer id){
        return studentService.queryStudentById(id);
    }
}
```

- `@Controller可以`替换成：`@RestController`，相当于`@Controller + @RespnseBody`  
```java
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student")
    //@ResponseBody
    public Object check(Integer id){
        return studentService.queryStudentById(id);
    }
}
```
- @RestController支持GET和POST请求  
```java
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    //@RequestMapping(value = "/student")
    @RequestMapping(value = "/student", method = {RequestMethod.GET, RequestMethod.POST})
    public Object check(Integer id) {
        return studentService.queryStudentById(id);
    }
}
```

- 仅支持GET请求的写法
```java
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    //@RequestMapping(value = "/student")
    @GetMapping(value = "/queryStudentById")
    public Object check(Integer id) {
        return studentService.queryStudentById(id);
    }
}
```

- 仅支持POST请求的写法
```java
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    //@RequestMapping(value = "/student")
    @PostMapping(value = "/insert")
    public Object check(Integer id) {
        return "insert success";
    }
}
```

- 仅支持删除请求的写法
```java
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    //@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @DeleteMapping(value = "/delete")
    public Object check(Integer id) {
        return "delete success";
    }
}
```

- 改

```java
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    
    //@RequestMapping(value = "/update", method = RequestMethod.PUT)
    @PutMapping(value = "/update")
    public Object check(Integer id) {
        return "update success";
    }
}
```

## RESTful风格
```java
@PostMapping(value = "/student/{id}/{name}/{age}")
public Object addStudent(@PathVariable("id") Integer id,
                         @PathVariable("name") String name,
                         @PathVariable("age") Integer age){
    Student student = new Student();
    student.setId(id);
    student.setName(name);
    student.setAge(age);
    int addCount = studentServiceAdd.addStudent(student);

    Map<String, Object> retMap = new HashMap<>();
    retMap.put("id", id);
    retMap.put("name", name);
    retMap.put("age", age);
    retMap.put("success", addCount);

    return retMap;
}
```
