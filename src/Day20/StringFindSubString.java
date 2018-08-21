package Day20;

public class StringFindSubString {
    public static void main(String[] args) {
        String s = "javasdoifhoahweoifjjavaakljshdfkhawejavajava";
        System.out.println(findSubString(0, s,0));
    }

    public static int findSubString(int index, String s,int count) {
        index = s.indexOf("java",index) + 1;
        if (index == 0) return 0;
        return count + 1 + findSubString(index,s,count);
    }
}

