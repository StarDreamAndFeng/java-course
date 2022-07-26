package game;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		
		Hero one = new Hero("蒙蒙",10,50,3,3);
		Monster black = new Monster("黑团",200,20,1,2);
		
		System.out.println("欢迎来到大冒险！");
		System.out.println("你作为\"蒙蒙\",应该竭尽所力的去打败大怪兽\"黑团\"，唯有如此你才能够取得胜利！\n");
		
		Scanner scanner = new Scanner(System.in);
		
exit:	while(true) {
			System.out.println("请选择你的决定：");
			System.out.println("1----攻击         2----逃跑         3----魔法攻击         4----查看对局情况");
			int choose = scanner.nextInt();
			switch(choose) {
			case 1:
				//玩家攻击
				System.out.println("玩家：");
				int heroAttack = one.attackMonsterDamage();
				int heroAttackTruthDamage = heroAttack - black.defenseHeroAttack();//玩家攻击真实伤害
				if(heroAttackTruthDamage > 0) {
					black.hp -= heroAttackTruthDamage;//玩家攻击，怪物受伤
					black.mosterInjured(heroAttackTruthDamage);//怪物受伤情况
					//判断怪兽是否死亡
					if(black.die()) {
						break exit;
					}			
				}else {
					//怪物防御较高
					black.hp--;
					black.mosterInjured(1);//怪物受伤情况
				}
				//怪兽攻击
				System.out.println("怪兽：");
				int mosterAttack = black.attackHeroDamage();
				int mosterAttackTruthDamage = mosterAttack - one.defenseMonsterAttack();//怪兽真实伤害
				if(mosterAttackTruthDamage > 0) {
					one.hp -= mosterAttackTruthDamage;
					one.heroInjured(mosterAttackTruthDamage);
					//判断玩家是否死亡
					if(one.die()) {
						break exit;
					}				
				}else {
					one.hp--;
					one.heroInjured(1);
				}	
				break;
			case 2:
				//玩家逃跑
				System.out.println("你已经逃掉了，继续努力~");break exit;
			case 3:
				//魔法攻击

				break;
			case 4:
				//查看对局情况
				one.heroCondition();
				black.mosterCondition();
				break;
			default:
				System.out.println("输入有误！");
				break;
			}
		}	
	scanner.close();
	}
}
