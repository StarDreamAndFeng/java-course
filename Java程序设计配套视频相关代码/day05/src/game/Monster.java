package game;

import java.util.Random;

/*
 * 怪物类
 */

public class Monster {
	
	//属性
	String name;
	int hp;//血量
	int mp;//魔法值
	int attack;//攻击
	int defense;//防御
	
	//方法
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHp(int newHp) {
		this.hp = newHp;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setMp(int newMp) {
		this.mp = newMp;
	}
	
	public int getMp() {
		return mp;
	}
	
	public void setAttack(int newAttack) {
		this.attack = newAttack;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public void setDefense(int newDefense) {
		this.defense = newDefense;
	}
	
	public int getDefense() {
		return defense;
	}
	
	//怪物死亡死亡
	public boolean die() {
		if(this.hp < 0) {
			System.out.println("怪物已死亡！玩家胜利，游戏结束！");
			return true;
		}
		return false;
	}
	
	//怪物攻击英雄造成的伤害
	public int attackHeroDamage(){
		int damage = 0;
		Random random = new Random();
		damage = random.nextInt(2) + this.attack;
		return damage;
	}
	
	//怪物防御抵挡伤害
	public int defenseHeroAttack(){
		int defenseAttack = 0;
		Random random = new Random();
		
		//有一定几率进行抵挡	
		int num = random.nextInt(10) + 1;
		
		if(num == 1 || num == 2 || num == 4  || num == 5) {
			defenseAttack = (int)(Math.random() % 2 + 1) + this.defense;		
		}
		return defenseAttack;
	}
	
	//怪物受伤情况
	public void mosterInjured(int decreaseHp) {
		System.out.println("怪物已经受到"+decreaseHp+"点伤害，剩余血量："+this.hp+"点。");
	}
	
	//怪物状况
	public void mosterCondition() {
		System.out.println("<怪物属性>");
		System.out.println("姓名："+this.name);
		System.out.println("血量："+this.hp);
		System.out.println("魔法值："+this.mp);
	}
	
	//构造方法
	public Monster(String name,int hp,int mp,int attack,int defense) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.defense = defense;
	}
	
}
