package creationalClass.BuilderPattern;

// 项目实施
public class Client {
    public static void main(String[] args) {
        // 招标之后 选了 B供应商
        Director director = new Director(new ConcreteHouseBuilderB());
        director.direct().getHouse();
    }
}
