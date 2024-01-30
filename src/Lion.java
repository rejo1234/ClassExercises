public class Lion {
    int age;
    String name;
    public Lion(int age , String name){
        this.age = age;
        this.name = name;
    }
    public void makeNoise(){
        System.out.println("roar");
    }
    public String introduceMyself(){
        return "my name is " + name + " i`m " + age + " years old";
    }
}
