package es.source.code.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FoodInfo implements Serializable {
    private String foodName,foodDescription;
    private long foodID;
    private int orderedNum;
    private int submitNum;
    private double foodPrice;
    private String foodType;
    private int foodPos;// food type position


    public FoodInfo(String foodName,String foodDescription,long foodID,double foodPrice,String foodType){
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.foodID = foodID;
        submitNum = 0;
        this.foodType = foodType;
        foodPos = 0;
        this.foodPrice = foodPrice;
    }
    public String getFoodName(){
        return foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public long getFoodID() {
        return foodID;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public int getOrderedNum() {
        return orderedNum;
    }

    public String getFoodtype() { return foodType; }

    public int getFoodPos() { return foodPos; }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodID(long foodID) {
        this.foodID = foodID;
    }

    public void setOrderedNum(int orderedNum) {
        this.orderedNum = orderedNum;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public void setFoodPos(int foodPos) { this.foodPos = foodPos; }

    public void setSubmitNum(int submitNum) {
        this.submitNum = submitNum;
    }

    public int getSubmitNum() {
        return submitNum;
    }

    public static ArrayList<FoodInfo> getTestFoodInfo(int num){
        ArrayList<FoodInfo> foodInfos = new ArrayList<FoodInfo>();
        String[] typeList = {"冷菜", "热菜", "海鲜", "酒水"};
        for(int i =0;i<num;i++){
            FoodInfo foodinfo = new FoodInfo("TestFood "+typeList[i/(num/4)]+" "+i,"Test Description "+i,i,16.66,typeList[i/(num/4)]);
            //output ordered by foodType
            foodInfos.add(foodinfo);
        }
        return foodInfos;
    }
}
