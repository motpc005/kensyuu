package BusnessTraining;

import java.util.ArrayList;

public class BusinessTraining {
	String 会社名;
	ArrayList<String> 従業員リスト;
	ArrayList<String> 部署リスト;

	void 従業員作成(String 従業員) {
		従業員リスト.add(従業員);
	}
	void 従業員情報開示(String 情報展示) {
		部署リスト.add(情報展示);
	}
}
