package game;

import java.util.Random;

/*
 * Ӣ����
 */

public class Hero {
	
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
	
	//�������
	public boolean die() {
		if(this.hp < 0) {
			System.out.println("���ʧ�ܣ��ٽ�������");
			return true;
		}
		return false;
	}
	
	//Ӣ�۹���������ɵ��˺�
	public int attackMonsterDamage(){
		int damage = 0;
		
		Random random = new Random();
		
		int num = random.nextInt(3);//0 1 2
		if(num == 1) {
			//����
			System.out.println("��ҶԹ�����ɱ����˺���");
			damage = random.nextInt(5)+10+this.attack;
		}else {
			//��ͨ
			damage = random.nextInt(6) + this.attack;
		}
			
		return damage;
	}
	
	//��ҷ����ֵ��˺�
	public int defenseMonsterAttack(){
		int defenseAttack = 0;
		Random random = new Random();
		
		//��һ�����ʽ��еֵ�	
		int num = random.nextInt(10) + 1;
		
		if(num == 2 || num == 3 || num == 5  || num == 7) {
			defenseAttack = (int)(Math.random() % 3 + 1) + this.defense;		
		}
		return defenseAttack;
	}
	
	//����������
	public void heroInjured(int decreaseHp) {
		System.out.println("����Ѿ��ܵ�"+decreaseHp+"���˺���ʣ��Ѫ����"+this.hp+"�㡣");
	}
	
	//Ӣ��״��
	public void heroCondition() {
		System.out.println("<�������>");
		System.out.println("������"+this.name);
		System.out.println("Ѫ����"+this.hp);
		System.out.println("ħ��ֵ��"+this.mp);
	}
	
	//���췽��
	public Hero(String name,int hp,int mp,int attack,int defense) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.defense = defense;
	}
	
}
