package game;

import java.util.Random;

/*
 * 英雄类
 */

public class Hero {
	
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
	
	//玩家死亡
	public boolean die() {
		if(this.hp < 0) {
			System.out.println("玩家失败，再接再厉！");
			return true;
		}
		return false;
	}
	
	//英雄攻击怪物造成的伤害
	public int attackMonsterDamage(){
		int damage = 0;
		
		Random random = new Random();
		
		int num = random.nextInt(3);//0 1 2
		if(num == 1) {
			//暴击
			System.out.println("玩家对怪兽造成暴击伤害！");
			damage = random.nextInt(5)+10+this.attack;
		}else {
			//普通
			damage = random.nextInt(6) + this.attack;
		}
			
		return damage;
	}
	
	//玩家防御抵挡伤害
	public int defenseMonsterAttack(){
		int defenseAttack = 0;
		Random random = new Random();
		
		//有一定几率进行抵挡	
		int num = random.nextInt(10) + 1;
		
		if(num == 2 || num == 3 || num == 5  || num == 7) {
			defenseAttack = (int)(Math.random() % 3 + 1) + this.defense;		
		}
		return defenseAttack;
	}
	
	//玩家受伤情况
	public void heroInjured(int decreaseHp) {
		System.out.println("玩家已经受到"+decreaseHp+"点伤害，剩余血量："+this.hp+"点。");
	}
	
	//英雄状况
	public void heroCondition() {
		System.out.println("<玩家属性>");
		System.out.println("姓名："+this.name);
		System.out.println("血量："+this.hp);
		System.out.println("魔法值："+this.mp);
	}
	
	//构造方法
	public Hero(String name,int hp,int mp,int attack,int defense) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.defense = defense;
	}
	
}
