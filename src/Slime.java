/**
 * Characterクラスを継承した、最も基本的な魔物スライムのクラスです。
 * このクラスは継承できません。
 */
public final class Slime extends Character {

    /**
     * Slimeクラスのコンストラクタです。
     * @param name スライムの名前
     * @param hp   スライムの初期体力
     */
    public Slime(String name, int hp) {
        // 親クラスであるCharacterのコンストラクタを呼び出す
        super(name, hp);
    }

    /**
     * 親の抽象メソッドを実装し、スライムの具体的な攻撃処理を定義します。
     * 体当たり攻撃のメッセージを表示し、対象のHPを5減らします。
     * @param target 攻撃対象のキャラクター
     */
    @Override
    public void attack(Character target) {
        System.out.println(this.name + "は体当たり攻撃！" + target.name + "に5のダメージを与えた！");
        // 対象(target)のhpを5減らす
        target.hp -= 5;
    }
}
