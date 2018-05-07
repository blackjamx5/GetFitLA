package practicum.getfitla_v3;

import android.os.Parcel;
import android.os.Parcelable;

//Formats Information to be easily called
public class NutritionItemFormat implements Parcelable {
    private int id;
    private String name;
    private String shortdesc;
    private String price;
    private String image;
    private String prepTime;
    private String servingSize;
    private String calories;
    private String equipment;
    private String process;
    private String ingredients;
    public String category;

    public NutritionItemFormat(int id, String name,
                               String shortdesc,
                               String image, String preptime, String servingSize, String calories,
                               String equipment, String process, String ingredients, String rating,
                               String price, String category) {
        this.id = id;
        this.name = name;
        this.shortdesc = shortdesc;
        this.price = price;
        this.image = image;
        this.prepTime = preptime;
        this.servingSize = servingSize;
        this.calories = calories;
        this.equipment = equipment;
        this.process = process;
        this.ingredients = ingredients;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public String getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public String getPrepTime() {
        return prepTime;
    }

    public String getServingSize() {
        return servingSize;
    }

    public String getCalories() {
        return calories;
    }

    public String getEquipment() {
        return equipment;
    }

    public String getProcess() {
        return process;
    }

    public String getIngredients() {
        return ingredients;
    }

    //Begin Parcel Elements
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.shortdesc);
        dest.writeString(this.price);
        dest.writeString(this.image);
        dest.writeString(this.prepTime);
        dest.writeString(this.servingSize);
        dest.writeString(this.calories);
        dest.writeString(this.equipment);
        dest.writeString(this.process);
        dest.writeString(this.ingredients);
        dest.writeString(this.category);
    }

    protected NutritionItemFormat(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.shortdesc = in.readString();
        this.price = in.readString();
        this.image = in.readString();
        this.prepTime = in.readString();
        this.servingSize = in.readString();
        this.calories = in.readString();
        this.equipment = in.readString();
        this.process = in.readString();
        this.ingredients = in.readString();
        this.category = in.readString();
    }

    public static final Parcelable.Creator<NutritionItemFormat> CREATOR = new Parcelable.Creator<NutritionItemFormat>() {
        @Override
        public NutritionItemFormat createFromParcel(Parcel source) {
            return new NutritionItemFormat(source);
        }

        @Override
        public NutritionItemFormat[] newArray(int size) {
            return new NutritionItemFormat[size];
        }
    };
}
