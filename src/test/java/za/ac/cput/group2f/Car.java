public class Car {
    private String model;
    private int regNum;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRegNum() {
        return regNum;
    }

    public void setRegNum(int isdn) {
        this.regNum = regNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return regNum == car.regNum;
    }

    @Override
    public int hashCode() {
        return regNum;
    }
}
