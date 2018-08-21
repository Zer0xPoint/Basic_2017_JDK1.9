package Day06;

public class ClassTest {

    private int privInt;

    private int test; //command + N to construct getter and setter
    private boolean testGetter; //boolean类型的getter一定要写成isXXX


    String className = "name";
    String classUsage = "nothing";

    public ClassTest(int privInt) {
        this.privInt = privInt;
    }

    public ClassTest(int privInt, int test, String className, String classUsage) {
        this.privInt = privInt;
        this.test = test;
        this.className = className;
        this.classUsage = classUsage;
    }


    /*
    1，构造方法不能有返回值
    2，构造方法名称必须和本类一致
    3，构造方法也可重载
    4，没有定义构造方法，将会缺省一个
        1），一旦自定义之后，将不会缺省
     */


    public ClassTest() { //构造方法
        this.printHello();
    }


    public void printHello() {
        System.out.println("hello");
    }


    public int getPrivInt() {
        return privInt;
    }

    public void setPrivInt(int privInt) {
        if (privInt >= 1) {
            this.privInt = privInt;
        }
        else {
            System.out.println("Error Age could not be minors");
        }
    }

    public boolean isTestGetter() {
        return testGetter;
    }

    public void setTestGetter(boolean testGetter) {
        this.testGetter = testGetter;
    }
}
