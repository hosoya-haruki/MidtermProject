/**
 * Characterクラスを継承した、物語の主人公となる勇者クラスです。
 */
public class Hero extends Character {

    /** 勇者が装備している武器名 */
    private String weapon;

    /**
     * Heroクラスのコンストラクタです。
     * 名前、HP、武器名を引数として受け取り、親クラスのコンストラクタを呼び出して初期化します。
     *
     * @param name   勇者の名前
     * @param hp     勇者の初期体力
     * @param weapon 勇者の武器名
     */
    public Hero(String name, int hp, String weapon) {
        // 親クラスであるCharacterのコンストラクタを呼び出す
        super(name, hp);
        this.weapon = weapon;
    }

    /**
     * 親クラスの抽象メソッドを実装し、具体的な攻撃処理を定義します。
     * 攻撃メッセージを表示し、対象のHPを10減らします。
     * @param target 攻撃対象のキャラクター
     */
    @Override
    public void attack(Character target) {
        System.out.println(this.name + "は" + this.weapon + "で攻撃！" + target.name + "に10のダメージを与えた！");
        // 対象(target)のhpを10減らす
        target.hp -= 10;
    }

    /**
     * 勇者自身のHPを回復するメソッドです。
     * 回復メッセージを表示し、自身のHPを20増やします。
     */
    public void heal() {
        System.out.println(this.name + "は回復呪文を唱えた！HPが20回復した！");
        // 自身のhpを20増やす
        this.hp += 20;
    }
}
