package fr.modeetratheure.sitesapi.filesystem;

import fr.aym.acsguis.component.layout.GuiScaler;
import fr.aym.acsguis.component.panel.GuiFrame;
import fr.aym.acsguis.component.panel.GuiPanel;
import fr.modeetratheure.sitesapi.filesystem.Directory;

public abstract class Page extends GuiPanel implements Directory {

    protected Site parent;

    public Page(Site parent){
        this.parent = parent;
    }

}
