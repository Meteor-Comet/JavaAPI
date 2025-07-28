package org.example.object;

public class PersonTest {
    public static void main(String[] args) throws Exception {
        // 创建原始对象
        Address address = new Address("北京", "长安街");
        Person person1 = new Person("张三", 25, address);

        // 方法1：使用clone实现深拷贝
        Person person2 = (Person) person1.clone();

        // 验证是深拷贝
        person2.getAddress().setCity("上海");
        System.out.println(person1.getAddress().getCity());  // 北京
        System.out.println(person2.getAddress().getCity());  // 上海
    }
}
