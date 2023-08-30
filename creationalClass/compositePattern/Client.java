package creationalClass.compositePattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("开始统计人数");
        Branch nation = new Branch();
        nation.add(new Leaf(100)); // 模拟国家下 —— 直辖市1
        nation.add(new Leaf(200)); // 模拟国家下 ——— 直辖市2

        Branch region = new Branch();
        region.add(new Leaf(300)); // 模拟国家下 —— 区1
        region.add(new Leaf(400)); // 模拟国家下 —— 区2

        nation.add(region);  // 区加入国家
        System.out.println(nation.count()); //1000
    }
}
