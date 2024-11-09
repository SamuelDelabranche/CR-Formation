package Logic;

import Core.Configuration;

import java.io.File;
import java.util.Objects;

public class GestionnaireDossiers {
    private final File[] RequiredDirectories = {
            Configuration.TEMPLATES_PATH
    };

    private final File[] FunctionnalDirectories = {
            Configuration.LABO_PATH,
            Configuration.PDF_PATH,
            Configuration.OTHER_PATH,
            Configuration.BACKUP_TEXFILE_PATH
    };

    public GestionnaireDossiers()
    {
        CheckOrCreateDirectory(RequiredDirectories, true);
        CheckOrCreateDirectory(FunctionnalDirectories, false);
    }

    public String[] getCurrentProjectsNames()
    {
        if(Objects.requireNonNull(Configuration.LABO_PATH.list()).length == 0){
            System.out.println("Aucuns projets en cours...");
            return new String[0];
        }
        return Configuration.LABO_PATH.list();
    }

    private void CheckOrCreateDirectory(File[] dir, boolean Required)
    {
        for (File directory : dir){
            if (!directory.exists()){
                if(Required){
                    System.out.println("Le dossier obligatoire '" + directory.getName() + "' n'existe pas ! ");
                    System.exit(1);
                }

                if(!directory.mkdir()){
                    System.err.println("Echec de la creation du dossier : " + directory.getName());
                    System.exit(1);
                }
            }
        }
    }
}
