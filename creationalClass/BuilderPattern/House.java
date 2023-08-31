package creationalClass.BuilderPattern;


// 产品（房屋）
public class House implements HouseBuilder{
    private String wall;
    private String roof;
    private String floor;

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public House getHouse() {
        System.out.println(this.floor);
        System.out.println(this.wall);
        System.out.println(this.roof);
        return this;
    }
}
