import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;

    public Portfolio() {

    }

    public Portfolio(Project project){
        this.projects = this.projects.add(project);
    }


    public ArrayList<Project> getProjects() {
        return projects;
    }
    
    public void setProjects(Project project) {
        this.projects = this.projects.add(project);
    }

}