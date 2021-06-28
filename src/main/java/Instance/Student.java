package Instance;
//保存请求参数值的普通类
public class Student {
//    属性名要和请求参数名称一样
    private String name;
    private Integer age;

    public Student() {
        System.out.println("student无参数构造执行");
    }

    public Student(String name, Integer age) {
        System.out.println("student有参数构造执行");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
