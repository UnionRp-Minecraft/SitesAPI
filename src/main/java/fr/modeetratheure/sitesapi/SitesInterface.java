package fr.modeetratheure.sitesapi;

import fr.modeetratheure.sitesapi.filesystem.Directory;
import fr.modeetratheure.sitesapi.filesystem.Site;

import java.util.List;

public interface SitesInterface {

    Directory getPath(String url);
    List<Directory> getAllPaths();
    Site getSite(String url);

}
