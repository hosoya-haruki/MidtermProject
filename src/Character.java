
public abstract class Character implements Creature {

    /**
     * キャラクターの名前
     */
    protected String name;

    /**
     * キャラクターの体力
     */
    protected int hp;

    /**
     * Characterクラスのコンストラクタ
     * @param name キャラクターの名前
     * @param hp キャラクターの初期体力
     */
    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    /**
     * キャラクターが生存しているかどうかを判定します。
     * このメソッドは処理内容が変わるべきではないため、オーバーライドできません。
     * @return hpが0より大きい場合はtrue、そうでなければfalse
     */
    public final boolean isAlive() {
        return this.hp > 0;
    }

    /**
     * キャラクターの現在の状態を表示します。
     * 例：「[名前]：HP [hp]」
     */
    public void showStatus() {
        System.out.println(this.name + "：HP " + this.hp);
    }
}