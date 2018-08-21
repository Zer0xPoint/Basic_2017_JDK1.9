package Day07;

public class ArrayListTest {
    /*
    和数组比较类似，是一种引用类型，可以保存多个数据
    1，数组长度不可以改变，集合的长度可以任意改变
    2，包含很多种HashSet，LinkedList，HashMap等
     */
    public static void main(String[] args) {
        arrayListMethod();
        System.out.println("******************");
        arrayIter();
        System.out.println("******************");
        arrayListCustom();

    }

    public static void newArrayList() {
        java.util.ArrayList<String> stringArrayList = new java.util.ArrayList<>();
//        ArrayList<int> ints = new ArrayList<>(); //只能是引用类型，不能是基本类型
    }

    private static void arrayIter() {
        java.util.ArrayList<String> stringArrayList = new java.util.ArrayList<>();
        stringArrayList.add("1");
        stringArrayList.add("2");
        stringArrayList.add("3");

        for (String string : stringArrayList) {
            System.out.println(string);
        }

    }

    private static void arrayListMethod() {
        /*
        1，添加元素
        public boolean add(E element),参数是要添加的元素，返回值 一定 是true

        2，获取元素
        public E get(int index)，参数是index,返回值为获取的元素对象

        3，获取长度
        public int size(),获取元素个数，返回值为int长度

        ArrayList直接打印不是地址值，而是内容，和数组类似
        其中toString方法有特殊处理
         */

        java.util.ArrayList<String> stringArrayList = new java.util.ArrayList<>();
        System.out.println(stringArrayList); // []

        boolean isSuccess = stringArrayList.add("sth");
        System.out.println(isSuccess); // 对于ArrayList的add来说 返回值一定是true
        System.out.println(stringArrayList);

        stringArrayList.add("sth1");
        String item1 = stringArrayList.get(1);
        System.out.println(item1);
        System.out.println(stringArrayList);

        int listSize = stringArrayList.size();
        System.out.println(listSize);
        stringArrayList.add("sth2"); //ArrayList可变长

        listSize = stringArrayList.size();
        System.out.println(listSize);

    }

    private static void wrapper() {
        /*
        在集合中存放数据
        包装类 Byte,Short,Integer,Long,Float,Double,Character,Boolean
        基本类型 byte,short,int,long,float,double,char,boolean

        从JDK1.5开始 包装类自动装箱拆箱
         */

        java.util.ArrayList<Integer> integers = new java.util.ArrayList<>();

    }

    private static void arrayListCustom() {
        java.util.ArrayList<Person> day07_people = new java.util.ArrayList<>();

        Person _person0 = new Person("Lee", 23);
        Person _person1 = new Person("Lin", 20);
        Person _person2 = new Person("Wang", 19);

        day07_people.add(_person0);
        day07_people.add(_person1);
        day07_people.add(_person2);

        double sum = 0;
        double average = 0;

        for (Person _person : day07_people) {
            sum += _person.getAge();
            System.out.println(_person.getName() + " " + _person.getAge());
        }

        average = sum/day07_people.size();
        System.out.println(average);

    }
}
