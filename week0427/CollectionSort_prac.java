package week0427;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 村莊類別，等等拿來做排序用
 */
class Village {
    public int id;
    public String name;
    public int population;
    public double area;

    public Village (int id, String name, int population, double area){
        this.id = id; 
        this.name = name;
        this.population = population;
        this.area = area;
    }

    @Override
    public String toString(){
        return id + "." + name + "(人口: " + population + " 面積: "+ area + ")";
    }
}


/**
 * 使用ID排序(ConcretStrategy)
 */
class SortVillageById implements Comparator<Village>{
    @Override
    public int compare(Village o1, Village o2) {
        if(o1.id > o2.id){
            return 1;
        } 

        if(o1.id < o2.id){
            return -1;
        }
        return 0;
    }
}

/**
 * 用村莊面積做排序(ConcretStrategy)
 */
class SortVillageByArea implements Comparator<Village>{
    @Override
    public int compare(Village o1, Village o2) {
        if(o1.area > o2.area){
            return 1;
        } 

        if(o1.area < o2.area){
            return -1;
        }
        return 0;
    }
}

/**
 * 村莊名稱做排序(ConcretStrategy)
 */
class SortVillageByName implements Comparator<Village>{
    @Override
    public int compare(Village o1, Village o2) {
        if(o1.name.charAt(0) > o2.name.charAt(0)){
            return 1;
        } 

        if(o1.name.charAt(0) < o2.name.charAt(0)){
            return -1;
        }
        return 0;
    }
}


/**
 * 策略模式排序-測試
 */
public class CollectionSort_prac {

    public static void main(String[] args) {
        // 準備三個村莊的資料
        Village appleFarm = new Village(3,"apple farm",32,5.1);
        Village barnField = new Village(1,"barn field",22,1.7);
        Village capeValley = new Village(2, "cape valley",  10  ,10.2);


        ArrayList<Village> vilages = new ArrayList<>();
        vilages.add(appleFarm);
        vilages.add(barnField);
        vilages.add(capeValley);

        System.out.println("沒排序過的資料");
        showList(vilages);

        System.out.println("根據ID排序");
        Collections.sort(vilages,new SortVillageById());
        showList(vilages);

        System.out.println("根據名子排序");
        Collections.sort(vilages,new SortVillageByName());
        showList(vilages);

//        System.out.println("根據人口排序");
//        Collections.sort(vilages,new SortVillageByPopulation());
//        showList(vilages);

        System.out.println("根據面積排序");
        Collections.sort(vilages,new SortVillageByArea());
        showList(vilages);
    }

    // 只是為了把資料印出來看
    public static void showList (ArrayList<Village> list){
        for(Village v : list){
            System.out.println(v);
        }
    }



}
