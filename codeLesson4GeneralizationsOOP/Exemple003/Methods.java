package Exemple003;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Methods {

    // #region
    // ниже идет описание получения Index в коллекции для каждого Типа!!
    // соответсвенно это долго упорно и что если попадется тип который мы не
    // описывали
    // public static Integer getElementFromIntegerCollection(List<Integer> col, int index) {
    //     return col.get(index);
    // }

    // public static String getElementFromStringCollection(List<String> col, int index) {
    //     return col.get(index);
    // }

    // public static Double getElementFromDoubleCollection(List<Double> col, int index) {
    //     return col.get(index);

    // }
    // #endregion

    //#region
    // Напишем static метод с помощью ОЮОЮЩЕНИЙ который будет завязан на каком-то
    // общем Типе(на перед не известном!!)
    // <обощенный тип метода> будет возвращать элемент типа U
    public static <U> U getElementFromUCollection(List<U> col, int index){
        return col.get(index);
    }
    public static <T1 ,T2> T2 put(T1 arg1, T2 arg2){
        // Map<Integer,String> hm = new HashMap<>();
        // hm.put(key, value);
        return arg2;
    } 
            

    //#endregion


}
