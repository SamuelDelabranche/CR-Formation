package Core;

import java.io.File;

public class Configuration {
    public static final File LABO_PATH = new File("labo");
    public static final File OTHER_PATH = new File("other");
    public static final File PDF_PATH = new File("pdf");
    public static final File BACKUP_TEXFILE_PATH = new File("backup");
    public static final File TEMPLATES_PATH = new File("templates");

    public static final String[] WHITELIST_EXTENSION_FILTER = {
            "aux",
            "log",
            "toc",
            "lof",
            "lot",
            "out",
            "synctex.gz",
            "bbl",
            "blg",
            "idx",
            "ind",
            "ilg"
    };
}