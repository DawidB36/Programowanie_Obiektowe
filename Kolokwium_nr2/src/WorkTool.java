public abstract class WorkTool {
    public String name;
    public int productionYear;

    public WorkTool(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    abstract public void use();
}
