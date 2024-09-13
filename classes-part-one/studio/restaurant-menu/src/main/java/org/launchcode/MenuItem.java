package org.launchcode;

import java.time.LocalDate;

public class MenuItem {
//declare fields
    private String menuItem;
    private int menuPrice;
    private String menuDescription;
    private String menuCategory;
    private final LocalDate dateAdded;

//build constructor


    public MenuItem(String menuItem, int menuPrice, String menuDescription, String menuCategory) {
        this.menuItem = menuItem;
        this.menuPrice = menuPrice;
        this.menuDescription = menuDescription;
        this.menuCategory = menuCategory;
        this.dateAdded = LocalDate.now();
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    public String getMenuCategory() {
        return menuCategory;
    }

    public void setMenuCategory(String menuCategory) {
        this.menuCategory = menuCategory;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }
}
