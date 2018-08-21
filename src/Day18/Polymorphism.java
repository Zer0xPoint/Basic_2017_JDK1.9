package Day18;
/*final
修饰类，该类不能被继承 final class
修饰方法，该方法不能被重写 final sum() {}
修饰变量，不嫩修改变量 final int i

修饰变量的初始化时机：
1，被修饰的变量只能赋值一次
2，在构造方法完毕前 （非静态）

修饰局部基本变量 不能修改变量内容
修饰局部引用变量 不能修改引用地址
 */

/*
多态的前提：
1，继承关系
2，方法重写
3，父类引用指向子类对象：
    父类 name = new 子（）；

多态的成员访问：
1，成员变量
    编译看左边（父类）
    运行看左边
2，构造方法
    创建子类对象的时候，访问父类的构造方法，对父类数据初始化
3，成员方法（重写）
    编译看左边
    运行看右边（子类）
4，静态方法（和类相关，子类同名方法不是重写）
    编译看左边
    运行看左边

多态的好处：
1，提高可维护性（由继承实现）
2，提高扩展性（由多态实现）

多态的弊端：
1，不能使用子类的特有功能
    解决办法：向下转型
        对象间的转型：
            1，向上转型
            Father father = new Son（）；
            2，向下转型
            Son son = （Son）father；要求必须是可以转换的
 */
public class Polymorphism {
    public static void main(String[] args) {
        Father son = new Son();
        System.out.println(son.i);//打印父类的成员变量 运行看左边 （父类）
        System.out.println(son.i1);//如果父类没有此变量 报错（编译看左边）
        son.show();//运行看右边 运行子类的方法
//        son.uniqueShow(); 编译看左边 父类无此方法 报错
        System.out.println("----------------");
        Son son1 = new Son();
        Tools.showTools(son);//扩展性
        Tools.showTools(son1);
        System.out.println("----------------");
        Son son2 = (Son) son;
        son2.uniqueShow();//通过这种方法来调用子类特有的方法
    }
}

class Tools {
    public static void showTools(Father father) {
        father.show();
    }
}

class Father {
    public int i = 1;
    public int i1 = 10;

    public void show() {
        System.out.println("Father");
    }
}

class Son extends Father {
    public int i = 2;
    public int i1 = 20;

    public void show() {
        System.out.println("Son");
    }

    public void uniqueShow() {//父类没有定义此方法 不能使用
        System.out.println("Come On");
    }
}


