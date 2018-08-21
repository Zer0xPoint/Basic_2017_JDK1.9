package Day09;

public class Lambda02 {
    /*
    一定要有函数式接口的环境
    1，可以通过方法的参数类型来确定，调用哪一个参数式接口
    2，也能用过赋值操作来确定，是哪一个函数式接口

    Lambda的格式就是为了将抽象方法，翻译为：
    1，一些参数 方法参数
    2，一个箭头
    3，一些代码 方法体 大括号

    例如抽象方法
    abstract int sum（int a, int b）;

    翻译成为Lambda
    (int a, int b) -> {return a + b;}

    在Lambda表达式中，可以推导的，就可以省略
    1，Lambda表达式中的参数类型可以省略
    2，如果参数只有一个，小括号可以省略
    3，如果语句只有一个，大括号也可以省略
     */
    public static void main(String[] args) {

        //传参 因为调用方法的时候，参数类型是函数式接口，所以Lambda可以推断出是哪一个接口
        //函数式接口里面只有一个抽象方法，所以能够推断出来是哪一个方法
        method((x, y) -> {
            return x + y;
        });

        //赋值 看等号左边的类型，必须是函数式接口
        //LambdaCalculator param = null;
        LambdaCalculator param = (int a, int b) -> {
            return a + b;
        };
        method(param);

        //(int a, int b) -> {return a + b;};
        //错误写法，没有上下文判断，Lambda无法判断是哪个函数式接口；
    }

    static void method(LambdaCalculator lambdaCalculator) {
        int res = lambdaCalculator.sum(100, 200);
        System.out.println(res);
    }
}
