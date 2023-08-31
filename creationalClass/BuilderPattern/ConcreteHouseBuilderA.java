package creationalClass.BuilderPattern;

// 开发商 A
public class ConcreteHouseBuilderA implements HouseBuilder {
    private House house = new House();

    @Override
    public void setWall(String wall) {
        house.setWall(wall + "I am A 供应商");
    }

    @Override
    public void setRoof(String roof) {
        house.setRoof(roof);
    }

    @Override
    public void setFloor(String floor) {
        house.setFloor(floor);
    }

    @Override
    public House getHouse() {
        return house;
    }
}
