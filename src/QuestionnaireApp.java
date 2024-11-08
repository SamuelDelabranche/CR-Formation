import Logic.GestionnaireDossiers;

public class QuestionnaireApp {
    public static void main(String[] args) {
        GestionnaireDossiers _gestionnaireDossiers = new GestionnaireDossiers();
        String[] currentProjects = _gestionnaireDossiers.getCurrentProjectsNames();

        for (String currentProject : currentProjects) {
            System.out.println(currentProject);
        }
    }
}
