/**
 * アルゴルの特徴を作成したクラス
 * 
 * @author Y.Maekawa
 */
public class Algol extends Star{
    /**
     * 星座の一般名、和名、星座名をそれぞれ格納している
     * 
     */
    public static final  String[]  LANGUAGE ={
        "アルゴル(アラビア語)","食変光星","ペルセウス座β星"  
    };
    double surfaceTem = (int)(Math.random()+12727)*1.02;                     //表面温度
    int magnitude = 2;                                                       //等級
    String luminosity = "182L";                                              //光度
    double mass = (int)(Math.random()+1.989*3.7)*1.02;                       //質量(^30kg)
    double distanceToEarth = (int)(Math.random()+93)*1.02;                   //地球からの距離(光年)
    double orbitalPeriod = (int)(Math.random()+680)+(Math.random()*0.0001);  //公転周期

    /**
     * 配列starsに表面温度、等級、光度、質量、地球からの距離、公転周期を格納
     */
    
    protected Object[] stars = {this.surfaceTem,this.magnitude,this.luminosity,this.mass,this.distanceToEarth,this.orbitalPeriod};
    /**
     * 3種類の星座の言い方を格納していた配列返す
     * 
     * @return 言い換え配列
     */

    protected String [] getlanguage(){
        return Algol.LANGUAGE;
    }
    /**
     * 6種類の星座の特徴配列返す
     * 
     * @return 星座特徴配列
     */
    public Object[] birth(){
        return stars;
    }
}
