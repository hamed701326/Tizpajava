package trip;

abstract public class Trip {
    protected int typeCondition;
    protected double price,x;
    protected int distance;
    abstract protected void typeCondition();
    public abstract void setDistance(int distance);
    public void setTypeCondition(int typeCondition) {
        this.typeCondition = typeCondition;
    }
    public abstract double getPrice();

}
