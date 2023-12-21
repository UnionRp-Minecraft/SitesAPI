package fr.modeetratheure.sitesapi;

import fr.modeetratheure.sitesapi.filesystem.Directory;
import fr.modeetratheure.sitesapi.filesystem.Site;

import java.util.List;

public interface SitesInterface {

    Site getSites();

    Site getSite(String site);

}
