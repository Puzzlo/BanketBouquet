package ru.puzzlo.BanketBouquet.impls;

import ru.puzzlo.BanketBouquet.interfaces.Provider;

/**
 * Created by esskov on 22.06.2016.
 */
public class DefaultProvider implements Provider {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
