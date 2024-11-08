package Logic;

import Core.Configuration;

import java.io.File;
import java.util.Objects;

public class GestionnaireDossiers {
    private final File[] RequiredDirectories = {
            Configuration.LABO_PATH,
            Configuration.PDF_PATH,
            Configuration.OTHER_PATH,
            Configuration.BACKUP_TEXFILE_PATH
    };

    public GestionnaireDossiers()
    {
        for (File directory : RequiredDirectories){
            if (!directory.exists()){
                if(!directory.mkdir()){
                    System.err.println("Echec de la creation du dossier : " + directory.getName());
                    System.exit(1);
                }
            }
        }
    }

    public String[] getCurrentProjectsNames()
    {
        if(Objects.requireNonNull(Configuration.LABO_PATH.list()).length == 0){
            System.out.println("Aucuns projets en cours...");
            return new String[0];
        }
        return Configuration.LABO_PATH.list();
    }

}
