package Day09;

@FunctionalInterface //函数式接口 检测
public interface LambdaCalculator {
    /*
    Java中使用Lambda表达式的前提是
    必须有函数式接口
    1，有且仅有一个抽象方法的接口，叫做函数式接口

    如何检测万无一失的检验一下当前接口是不是函数式接口
    @叫做注解
    @FunctionalInterface + ...
     */
    int sum(int a, int b);
//    int minus(int a);
}
