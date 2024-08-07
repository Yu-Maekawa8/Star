public class Main extends Object{
    public static void main(String[] args) {
        Star[] inStars = {
            new Algol(),new Altair(),new Arcturus(),new Betelgeuse(),
            new Deneb(),new Sirius(),new Spica(),new Vega()
        };

/**
 * 配列inStarsからランダムに一つの要素を取得し、performメソッドを実行する。
 * 
 */
        
        inStars[(int)(Math.random()*7.9)].perform();
    }
}