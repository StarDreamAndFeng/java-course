package game;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		
		Hero one = new Hero("����",10,50,3,3);
		Monster black = new Monster("����",200,20,1,2);
		
		System.out.println("��ӭ������ð�գ�");
		System.out.println("����Ϊ\"����\",Ӧ�ý߾�������ȥ��ܴ����\"����\"��Ψ���������ܹ�ȡ��ʤ����\n");
		
		Scanner scanner = new Scanner(System.in);
		
exit:	while(true) {
			System.out.println("��ѡ����ľ�����");
			System.out.println("1----����         2----����         3----ħ������         4----�鿴�Ծ����");
			int choose = scanner.nextInt();
			switch(choose) {
			case 1:
				//��ҹ���
				System.out.println("��ң�");
				int heroAttack = one.attackMonsterDamage();
				int heroAttackTruthDamage = heroAttack - black.defenseHeroAttack();//��ҹ�����ʵ�˺�
				if(heroAttackTruthDamage > 0) {
					black.hp -= heroAttackTruthDamage;//��ҹ�������������
					black.mosterInjured(heroAttackTruthDamage);//�����������
					//�жϹ����Ƿ�����
					if(black.die()) {
						break exit;
					}			
				}else {
					//��������ϸ�
					black.hp--;
					black.mosterInjured(1);//�����������
				}
				//���޹���
				System.out.println("���ޣ�");
				int mosterAttack = black.attackHeroDamage();
				int mosterAttackTruthDamage = mosterAttack - one.defenseMonsterAttack();//������ʵ�˺�
				if(mosterAttackTruthDamage > 0) {
					one.hp -= mosterAttackTruthDamage;
					one.heroInjured(mosterAttackTruthDamage);
					//�ж�����Ƿ�����
					if(one.die()) {
						break exit;
					}				
				}else {
					one.hp--;
					one.heroInjured(1);
				}	
				break;
			case 2:
				//�������
				System.out.println("���Ѿ��ӵ��ˣ�����Ŭ��~");break exit;
			case 3:
				//ħ������

				break;
			case 4:
				//�鿴�Ծ����
				one.heroCondition();
				black.mosterCondition();
				break;
			default:
				System.out.println("��������");
				break;
			}
		}	
	scanner.close();
	}
}
