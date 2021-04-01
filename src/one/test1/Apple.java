package one.test1;

/**
 * @author 123456
 */
public class Apple {
    /**
     * 编号
     */
    private int id;

    /**
     * 重量
     */
    private double weight;

    /**
     * 名称
     */
    private Integer name;

    public Apple() {
    }

    public Apple(int id, double weight, Integer name) {
        this.id = id;
        this.weight = weight;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                ", weight=" + weight +
                ", name=" + name +
                '}';
    }
}
