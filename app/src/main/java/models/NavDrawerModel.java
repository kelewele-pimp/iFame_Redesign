package models;

/**
 * Created by desmond on 08/04/15.
 */
public class NavDrawerModel {

    private int menu_icon;
    private String menu_data;

    public NavDrawerModel() {
    }

    public NavDrawerModel(int menu_icon, String menu_data) {
        this.menu_icon = menu_icon;
        this.menu_data = menu_data;
    }

    public int getMenu_icon() {
        return menu_icon;
    }

    public void setMenu_icon(int menu_icon) {
        this.menu_icon = menu_icon;
    }

    public String getMenu_data() {
        return menu_data;
    }

    public void setMenu_data(String menu_data) {
        this.menu_data = menu_data;
    }

    @Override
    public String toString() {
        return "NavDrawerModel{" +
                "menu_icon=" + menu_icon +
                ", menu_data='" + menu_data + '\'' +
                '}';
    }
}
