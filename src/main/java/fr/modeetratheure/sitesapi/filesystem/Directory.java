package fr.modeetratheure.sitesapi.filesystem;

import java.util.List;

public interface Directory {

    void addDirectory(Directory directory);
    List<Directory> getChildren();
    Directory getParentDirectory();
    String getName();

}
