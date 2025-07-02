/**
 * 物語全体を進行させる「神様」の視点となるクラスです。
 * このクラスのmainメソッドからゲームが実行されます。
 */
public class GameMaster {

    public static void main(String[] args) {
        // 1. インスタンスの生成
        Hero abel = new Hero("アベル", 100, "銅の剣");
        Slime slimeA = new Slime("スライムA", 30);

        // 2. 冒険の始まり
        System.out.println("冒険が始まる…！");
        abel.showStatus();
        slimeA.showStatus();
        System.out.println("--------------------");

        // 3. 戦闘シミュレーション
        System.out.println("戦闘開始！\n");

        // 勇者の攻撃
        abel.attack(slimeA);
        slimeA.showStatus();
        System.out.println(); // 改行

        // スライムの攻撃
        slimeA.attack(abel);
        abel.showStatus();
        System.out.println(); // 改行

        // 勇者の回復
        abel.heal();
        abel.showStatus();
        System.out.println(); // 改行

        // 勇者の連続攻撃
        System.out.println("アベルの連続攻撃！");
        for (int i = 0; i < 3; i++) {
            abel.attack(slimeA);
        }
        System.out.println("--------------------");


        // 4. 戦闘後の結果表示
        System.out.println("戦闘終了後：");
        abel.showStatus();
        slimeA.showStatus();
        System.out.println(abel.name + "は生きている: " + abel.isAlive());
        System.out.println(slimeA.name + "は生きている: " + slimeA.isAlive());
        System.out.println("--------------------");


        // 5. 参照の確認
        // abelと同じインスタンスを指す変数partyMemberを作成
        Character partyMember = abel;
        // partyMember経由でHPを操作する
        partyMember.hp -= 50;

        System.out.println("partyMember経由でHPを減らした後：");
        // 元の変数abelでステータスを表示しても、HPが減っていることがわかる
        abel.showStatus();
    }
}
