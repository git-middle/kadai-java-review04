package animal;

public class Animal {

    //フィールド
    public String name;
    public int age;

    //コンストラクタ
    public Animal() {

    }

    //引数ありコンストラクタ
    public Animal(String name,int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //名前と年齢を言うをするメソッド
    public void say() {
        System.out.println( name + "です。" + age + "歳です。");

}
}
