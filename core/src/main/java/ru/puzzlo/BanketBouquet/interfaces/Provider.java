package ru.puzzlo.BanketBouquet.interfaces;

import java.util.Date;

/**
 * Created by esskov on 22.06.2016.
 */
public interface Provider {

    String getName();

    void addProduct(String product);
    void deleteProduct(String product);
    void updateCost(Date date, String product);

}
