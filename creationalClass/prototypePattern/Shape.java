package creationalClass.prototypePattern;

import java.util.Properties;

// 抽象原型类
abstract class Shape implements Cloneable {
    protected String type;
    protected int size;

    protected Couple couple;

    abstract void draw();

    abstract void setType(String type);

    abstract void setSize(int size);

    abstract void setCouple(String color, int light);


    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    /*
    在上面的示例中，Shape 类实现了 Cloneable 接口，并重写了 clone() 方法。
    在 Client类 main() 方法中，我们创建了一个原始对象 Circle，然后使用 clone() 方法创建了克隆对象 clone_Circle。

    通过运行示例，我们可以看到原始对象和克隆对象初始时具有相同的值。然后，当我们修改克隆对象的基础类型值时，原始对象的值不受影响。
    当然只是针对不可变引用数据类型，只要是有可变引用类型会受到影响和改变。

    需要注意的是，clone() 方法在 Object 类中是受保护的，因此在子类中重写时需要注意访问修饰符。
    此外，对象克隆是浅拷贝的，即对于引用类型的成员变量，只复制引用而不是创建新对象。

    如果需要实现深拷贝，需要在 clone() 方法中进行相应的处理,既然引用类型无法被完全克隆，那么我们可以考虑在引用类型所在的类也实现Cloneable接口。

    Reference: https://cloud.tencent.com/developer/article/1628044
     */
}
