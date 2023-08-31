package creationalClass.BuilderPattern;

// 工程监理
// 工程总监的角色就像电影制作中的导演一样，他从宏观上管理项目并指导整个施工队的建造流程.
public class Director {

    private HouseBuilder houseBuilder;

    public Director(HouseBuilder builder) {
        this.houseBuilder = builder;
    }

    public void setBuilder(HouseBuilder builder) {
        this.houseBuilder = builder;
    }

    public House direct() {
        // 第一步，打好地基
        houseBuilder.setFloor("口口口口口口口口 I am 地基");
        // 第二步，建造框架、增体
        houseBuilder.setWall("| 田 |  | 田 |  ");
        // 第三步，封顶
        houseBuilder.setRoof("_______________ I am 屋顶");
        return houseBuilder.getHouse();
    }
}
