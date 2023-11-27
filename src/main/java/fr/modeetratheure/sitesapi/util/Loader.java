package fr.modeetratheure.sitesapi.util;

import java.util.function.Consumer;

public interface Loader <T>{

    public Loader<T> load(String targetPackage, Class<T> clazz, Consumer<T> consumer);

}
