package game;

import java.util.Random;

/*
 * ������
 */

public class Monster {
	
	//����
	String name;
	int hp;//Ѫ��
	int mp;//ħ��ֵ
	int attack;//����
	int defense;//����
	
	//����
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
	
	//������������
	public boolean die() {
		if(this.hp < 0) {
			System.out.println("���������������ʤ������Ϸ������");
			return true;
		}
		return false;
	}
	
	//���﹥��Ӣ����ɵ��˺�
	public int attackHeroDamage(){
		int damage = 0;
		Random random = new Random();
		damage = random.nextInt(2) + this.attack;
		return damage;
	}
	
	//��������ֵ��˺�
	public int defenseHeroAttack(){
		int defenseAttack = 0;
		Random random = new Random();
		
		//��һ�����ʽ��еֵ�	
		int num = random.nextInt(10) + 1;
		
		if(num == 1 || num == 2 || num == 4  || num == 5) {
			defenseAttack = (int)(Math.random() % 2 + 1) + this.defense;		
		}
		return defenseAttack;
	}
	
	//�����������
	public void mosterInjured(int decreaseHp) {
		System.out.println("�����Ѿ��ܵ�"+decreaseHp+"���˺���ʣ��Ѫ����"+this.hp+"�㡣");
	}
	
	//����״��
	public void mosterCondition() {
		System.out.println("<��������>");
		System.out.println("������"+this.name);
		System.out.println("Ѫ����"+this.hp);
		System.out.println("ħ��ֵ��"+this.mp);
	}
	
	//���췽��
	public Monster(String name,int hp,int mp,int attack,int defense) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.defense = defense;
	}
	
}
