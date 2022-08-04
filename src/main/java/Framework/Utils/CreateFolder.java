package br.com.desafio-web.Framework.Utils;

import java.io.File;

public class CreateFolder {
    public static void createFolderReport(String path){
        File pathReport = new File(path);
        if (!pathReport.exists()){
            pathReport.mkdir();
        }
    }
}