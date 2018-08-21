package Day09;

public class Lambda {
    //函数式编程

    public static void main(String[] args) {
        method((x, y) -> x + y);
        //lambda 表达式(a, b) -> a + b
        //method方法需要一个 LambdaCalculator接口类型的参数
        //Lambda表达式充当了这个接口类型的参数
        /*
        1，Lambda前面的小括号，其实就是接口抽象方法的小括号
        2，箭头代表拿着小括号的东西，去完成一个事情
        3，箭头后面代表拿到参数之后，做什么事情
        Lambda表达式语义本身就代表了怎么做，没有对象的概念（更简单直观）
         */

    }
    static void method(LambdaCalculator lambdaCalculator) {
        int res = lambdaCalculator.sum(100, 200);
        System.out.println(res);
    }
}
