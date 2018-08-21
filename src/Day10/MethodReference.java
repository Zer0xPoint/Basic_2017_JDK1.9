package Day10;

public class MethodReference {
    /*
    在某些场景之下Lambda要做的事，在其他方法里已经实现过了
    如何复用？
    方法引用

    方法引用写法
    类名称：：静态方法

     */
    public static void main(String[] args) {
        runLambda(sayHello -> System.out.println("主人" + sayHello));//Lambda 有重复功能

        runLambda(MethodReference::classMethod);//方法引用，可以实现不浪费 复用静态方法
    }

    static void classMethod(String string) {
        System.out.println("主人" + string);
    }

    static void runLambda(MethodReferenceInterface methodReferenceInterface) {
        methodReferenceInterface.interfaceMethod("你好");
    }

}
