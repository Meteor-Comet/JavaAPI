package org.example.object;

class Person implements Cloneable {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 先浅拷贝
        Person cloned = (Person) super.clone();
        // 再深拷贝引用类型的字段
        if (this.address != null) {
            cloned.address = (Address) this.address.clone();
        }
        return cloned;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}

class Address implements Cloneable {
    private String city;
    private String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public Address() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 获取
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     * 设置
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    public String toString() {
        return "Address{city = " + city + ", street = " + street + "}";
    }

    // getters and setters...
}
