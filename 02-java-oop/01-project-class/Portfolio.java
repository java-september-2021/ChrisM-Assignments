import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> Projects;

    public Portfolio() {
        this.Projects = new ArrayList<Project>();
    }

    public void addToPortfolio(Project project){
        Projects.add(project);
    }

    public String getPortfolio() {
        return Projects.toString();
    }
    
    public double getPortfolioCost() {
        double total = 0;
        for(Project project : Projects) {
            total += project.getInitialCost();
        }
        return total;
    }

    public void showPortfolio() {
        System.out.println("All projects in portfolio: ");
        for(Project project : Projects) {
            System.out.println(project.elevatorPitch());
        }
        System.out.println(String.format("Total Cost: %f", this.getPortfolioCost()));
    }

}