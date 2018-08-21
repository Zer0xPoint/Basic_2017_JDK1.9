package Day13;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Test07 {
    public static void main(String[] args) {
        ArrayList<Double> doubles = new ArrayList<>();
        getSum(doubles);
        double sum = doubles.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("总计金额为" + sum);
        OptionalDouble optionalDoubleMax = doubles.parallelStream().mapToDouble(Double::doubleValue).max();
        OptionalDouble optionalDoubleMin = doubles.parallelStream().mapToDouble(Double::doubleValue).min();
        if (optionalDoubleMax.isPresent() && optionalDoubleMin.isPresent()) {
            double max = optionalDoubleMax.getAsDouble();
            double min = optionalDoubleMin.getAsDouble();
            System.out.println("最大消费金额为" + max + "顾客为第" + (doubles.indexOf(max)+1) + "个");
            System.out.println("最小消费金额为" + min + "顾客为第" + (doubles.indexOf(min)+1) + "个");
        }
    }

    static void getSum(ArrayList<Double> doubles) {
        Scanner scan = new Scanner(System.in);
        String Go = "";
        do {
            System.out.println("请输入消费金额：");
            double count = scan.nextDouble();
            if (count < 2000) {
                System.out.println("只能使用现金支付，不能享受任何打折的优惠，您的实际支付金额为" + count);
            } else {
                System.out.println("请输入您是否为会员（1 - 会员，其它 - 非会员）:");
                int member = scan.nextInt();
                if (member == 1) {
                    System.out.println("请输入您的支付方式（1-现金支付 2-信用卡支付 其它-借记卡支付）");
                    int method = scan.nextInt();
                    switch (method) {
                        case 1:
                            System.out.println("可以享受8折优惠，您的实际支付金额为" + count * 0.8);
                            break;
                        case 2:
                            System.out.println("可以享受8.5折优惠，您的实际支付金额为" + count * 0.85);
                            break;
                        default:
                            System.out.println("可以享受9折优惠，您的实际支付金额为" + count * 0.9);
                    }
                } else {
                    System.out.println("只能使用现金支付,可以享受9.5折优惠");
                }
            }
            System.out.println("是否继续为下一位顾客结账[y-是  其它-结束]");
            Go = scan.next();
            doubles.add(count);
        } while (Go.equals("y"));
    }
}

