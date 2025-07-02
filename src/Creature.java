/**
 * 生物全般が持つべき行動の契約を定義するインターフェース
 */
public interface Creature {

    /**
     * 指定されたターゲットに対して攻撃を行います。
     * このメソッドの実装は、このインターフェースを実装する各クラスに委ねられます。
     *
     * @param target 攻撃対象のキャラクター
     */
    void attack(Character target);
}