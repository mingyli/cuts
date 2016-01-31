package mingyli.com.cuts;

import java.util.ArrayList;

/**
 * Created by cng on 1/31/16.
 */
public class Profile {
    private double hair_length;
    private int cut_frequency;
    private String barber_name;
    private String shampoo_name;
    private ArrayList<String> tags_list;

    public Profile(){ //default profile
        hair_length = 5.0;
        cut_frequency = 1;
        barber_name = "Eduardo";

    }
    public Profile(double length, int freq, String barber, String shampoo, ArrayList<String> tags){
        hair_length = length;
        cut_frequency = freq;
        barber_name = barber;
        shampoo_name = shampoo;
        tags_list = tags;
    }
    public void addTag(String tag){
        tags_list.add(tag);
    }
    public double getHair_length(){
        return hair_length;
    }
    public int getCut_frequency(){
        return cut_frequency;
    }
    public String getBarber_name(){
        return barber_name;
    }
    public String getShampoo_name(){
        return shampoo_name;
    }
    public ArrayList<String> getTags_list(){
        return tags_list;
    }
}
