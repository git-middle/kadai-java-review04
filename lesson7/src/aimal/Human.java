package aimal;

public class Human extends Animal implements Thinkable{

    private String hobit;

    public Human() {

    }

    //引数ありのコンストラクタ
    public Human(String name,int age,String hobit) {
        super(name,age);//スーパークラス（Character）のコンストラクタを呼び出し
        this.hobit = hobit;
    }

    public void think() {
       System.out.println("私は"+hobit+"について考えています。");

    }


}




