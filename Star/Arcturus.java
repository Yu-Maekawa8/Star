/**
 * アークトゥルスの特徴を作成したクラス
 * 
 * @author Y.Maekawa
 */
public class Arcturus extends Star{
    /**
     * 星座の一般名、和名、星座名をそれぞれ格納している
     * 
     */
    public static final  String[]  LANGUAGE ={
        "アークトゥルス(ギリシャ語)","ムギボシ（麦星)","うしかい座"  
    };
    double surfaceTem = (int)(Math.random()+4017)*1.02;                //表面温度
    int magnitude = 1;                                                 //等級
    String luminosity = "170L";                                        //光度
    double mass = (int)(Math.random()+1.989*1.08)*1.02;                //質量(^30kg)
    double distanceToEarth = (int)(Math.random()+36.66)*1.02;          //地球からの距離(光年)
    double orbitalPeriod = 0.0;                                        //公転周期
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
        return Arcturus.LANGUAGE;
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
