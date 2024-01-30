public class Zoo {
    String zooName;
    Lion myLion;
    public Zoo(String zooName1){
        myLion = new Lion(5,"lew");
        zooName = zooName1;
        System.out.println("Init zoo class " + zooName);
    }
    public void startVisit(){
        System.out.println("visit started");
        myLion.makeNoise();
        System.out.println(myLion.introduceMyself());
    }
}
