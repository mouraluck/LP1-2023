package Mundo;
public class People {
    public String Name;
    public int age;

    public People(){}
    public People(String kkk, int kakakakandanguinha){
        System.out.println("I created a class");
        System.out.println("But, I created a people");
        this.Name =kkk;
        this.age = kakakakandanguinha;
    }

    public void apresentation(){
        System.out.println();
        System.out.println("Hi my name is "+ this.Name + " and i'm " + this.age + " years old");
    }

}
