public class User{
    private String name;
    private String dob;
    private int age;
    private String address;
    private String gender;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public User(String name, String dob, int age, String address, String gender) {
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }
    public User() {
    
    }


    @Override
    public String toString() {
        return "User [name=" + name + ", dob=" + dob + ", age=" + age + ", address=" + address + ", gender=" + gender
                + "]";
    }
    
}