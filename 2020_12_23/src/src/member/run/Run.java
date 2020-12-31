package src.member.run;

import src.member.controller.MemberManager;
import src.member.model.vo.Gold;
import src.member.model.vo.Silver;
import src.member.model.vo.Vip;
import src.member.model.vo.Vvip;

public class Run {

	public static void main(String[] args) {
		MemberManager m = new MemberManager();
		
		Silver s = new Silver("홍길동", "silver", 1000);
		Silver s1 = new Silver("김말똥", "silver", 3000);
		
		m.SilverInsert(s);
		m.SilverInsert(s1);
		m.SilverInsert(new Silver("고길동", "Silver",3000));
		m.goldInsert(new Gold("김회장", "Gold", 1000));
		m.goldInsert(new Gold("이회장", "Gold", 2000));
		m.goldInsert(new Gold("오회장", "Gold", 3000));
		
		//vip추가
		m.vipInsert(new Vip("최순실", "Vip", 10000));
		
		//vvip추가
		m.vvipInsert(new Vvip("박근혜", "Vvip", 100000));
		
		m.printData();
	}
}
