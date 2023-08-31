package creationalClass.compositePattern2;

public class Client {
    /**
     * 需求是做一个统计全国人口数量的功能
     * 全国根据地区划分就是一个树状结构
     * ------------------------------
     * 国家
     *  城市1
     *      区1
     *      区2
     *  城市2
     *      区1
     *      区2
     * ------------------------------
     */
    public static void main(String[] args) {
        System.out.println("开始统计人数");
        Branch city = new Branch(); // 模拟市
        Leaf beijing = new Leaf(100);
        Leaf shanghai = new Leaf(200);
        city.add(beijing);
        city.add(shanghai);

        Branch district = new Branch(); // 模拟区
        Leaf dongcheng = new Leaf(300);
        Leaf xicheng = new Leaf(400);
        district.add(dongcheng);
        district.add(xicheng);

        city.add(district);  // 区加入城市
        System.out.println(city.count()); //1000
    }
}
