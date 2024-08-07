/**
 * 星座をランダムで一つ誕生させるクラス
 * 
 * @author Y.Maekawa
 */

public abstract class Star extends Object{
    protected double surfaceTem = 0.0;
    protected int magnitude =0;
    protected String luminosity = null;
    protected double mass = 0.0;
    protected double distanceToEarth = 0.0;
    protected double orbitalPeriod = 0.0;
/**
 * 星それぞれに言い方があるため抽象クラスにして表現する
 * 
 * @return 名称の配列
 */
    protected abstract String [] getlanguage();  

/**
 * 星座それぞれに特徴が異なるため、星座別のクラスの配列に格納
 * 
 * @return 星座の特徴配列
 */    
    public abstract Object[] birth();          

/**
 * 星座の各種類の属性を格納している配列と星座の呼び名を格納している配列を取得し、
 * それぞれランダムで1種類の星座を出力する。
 */
    public void perform(){
        Object[] characteristic  = this.birth();
        String[] languageStrings = this.getlanguage();

        System.out.println("以下の星が誕生しました");

        System.out.println("一般名は"+languageStrings[0]);
        System.out.println("和名は"+languageStrings[1]);
        System.out.println("星座名は"+languageStrings[2]);
        
        System.out.println("表面温度は"+characteristic[0]+"C");
        System.out.println("等級は"+characteristic[1]+"等星");
        System.out.println("光度は"+characteristic[2]);
        System.out.println("質量は"+characteristic[3]+"^30kg");
        System.out.println("地球からの距離は"+characteristic[4]+"光年");
        System.out.println("公転周期は"+characteristic[5]+"年");
    }
}
