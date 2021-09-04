public class ProjectTest {
    public static void main(String[] args) {

        Project lawnMowing = new Project("Lawn Mowing", "Mow the lawn");
        Project newProject = new Project();
        System.out.println(newProject.getProjectName());
        System.out.println(newProject.getDescription());
        Project painting = new Project("Painting");
        Project concrete = new Project("Concrete", "Pouring Concrete In unique shapes", 250.00);

        System.out.println(lawnMowing.getProjectName());
        System.out.println(lawnMowing.getDescription());

        newProject.setProjectName("Weed Wacking");
        newProject.setDescription("Weed eating the yard");

        System.out.println(newProject.getProjectName());
        System.out.println(newProject.getDescription());

        painting.setDescription("Painting the house");

        System.out.println(painting.getProjectName());
        System.out.println(painting.getDescription());
        
        System.out.println(lawnMowing.elevatorPitch());
        System.out.println(newProject.elevatorPitch());
        System.out.println(painting.elevatorPitch());
        System.out.println(concrete.elevatorPitch());
        concrete.setInitialCost(200);
        System.out.println(concrete.elevatorPitch());

        Portfolio myPortfolio = new Portfolio();
        myPortfolio.addToPortfolio(lawnMowing);
        myPortfolio.addToPortfolio(newProject);
        myPortfolio.addToPortfolio(painting);
        myPortfolio.addToPortfolio(concrete);
        myPortfolio.showPortfolio();
    }
}