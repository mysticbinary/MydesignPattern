package creationalClass.BuilderPattern;

// 抽象建造者
public interface HouseBuilder {
    void setWall(String wall);
    void setRoof(String roof);
    void setFloor(String floor);
    House getHouse();
}
