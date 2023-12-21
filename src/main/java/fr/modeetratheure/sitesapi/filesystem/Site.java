package fr.modeetratheure.sitesapi.filesystem;

public interface Site extends Directory{

    public Controller getController();

    public Directory getDirectory(String dir);

}
