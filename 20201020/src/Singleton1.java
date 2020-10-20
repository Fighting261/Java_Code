/**
 * 单例设计模式
 * 饿汉式：直接创建实例对象，无论是否需要创建
 *
 * (1)构造器私有化
 * (2)自行创建，用静态变量保存
 * (3)向外提供实例
 * (4)强调这个单例，可以用final修饰
 */
public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return INSTANCE;
    }

}
