package com.example.design_pattern.mementoPattern.demo;

/**
 * 游戏角色
 *
 * @author Lu.F
 * @version 1.0
 * @date 2023/6/12 9:49
 */
public class GameRole {

    /**
     * 生命力
     */
    private int vit;

    /**
     * 攻击力
     */
    private int atk;

    /**
     * 防御力
     */
    private int def;

    /**
     * 初始状态
     */
    public void initState() {
        this.atk = 100;
        this.vit = 100;
        this.def = 100;
    }

    /**
     * 攻击
     */
    public void fight() {
        System.out.println("打输了");
        this.atk = 0;
        this.vit = 0;
        this.def = 0;
    }

    /**
     * 保存状态
     *
     * @return
     */
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    /**
     * 恢复状态
     *
     * @param roleStateMemento
     */
    public void recoveryState(RoleStateMemento roleStateMemento) {
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "vit=" + vit +
                ", atk=" + atk +
                ", def=" + def +
                '}';
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
