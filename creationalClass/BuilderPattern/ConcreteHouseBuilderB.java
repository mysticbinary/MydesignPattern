package creationalClass.BuilderPattern;

// 开发商 B
public class ConcreteHouseBuilderB implements HouseBuilder {
    private House house = new House();

    @Override
    public void setWall(String wall) {
        house.setWall(wall + "I am B 供应商");
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
