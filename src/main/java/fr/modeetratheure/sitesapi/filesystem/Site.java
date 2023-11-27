package fr.modeetratheure.sitesapi.filesystem;

import fr.aym.acsguis.component.layout.GuiScaler;
import fr.aym.acsguis.component.panel.GuiFrame;
import fr.modeetratheure.sitesapi.filesystem.Directory;

public abstract class Site extends GuiFrame implements Directory {

    public Site(int width, int height, GuiScaler scale) {
        super(width, height, scale);
    }

}
