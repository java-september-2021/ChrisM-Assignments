import java.util.ArrayList;

public class Project {
    private String name;
    private String description;
    private double initialCost;

    // default constructor
    public Project() {
        this.name = "New Project";
        this.description = "Project Description";
        this.initialCost = 10.00;
    }

    // constructor with just name
    public Project(String name) {
        this.name = name;
        this.description = "Project Description";
        this.initialCost = 10.00;
    }

    // constructor with name and description provided
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
        this.initialCost = 10.00;
    }

    public Project(String name, String description, double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    // getter for name
    public String getProjectName() {
        return name;
    }

    // setter for name
    public void setProjectName(String name) {
        this.name = name;
    }

    // getter for description
    public String getDescription() {
        return description;
    }

    // setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    public void setInitialCost(double cost) {
        this.initialCost = cost;
    }

    public double getInitialCost(){
        return this.initialCost;
    }

    public String elevatorPitch(){
        return this.name + " ($"+ this.initialCost+ ")" + " : " + this.description;
    }
}

public class Portfolio {
    private ArrayList<Project>;

    


}