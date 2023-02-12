
public class Chapter08_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
/**
 *問題2
 * 
 **/
	//曜日を表すString型の変数を定義し、 英単語で初期化する
	//英単語に該当する日本語で曜日を出力する
	//曜日以外の単語の場合は "曜日ではありません" を出力する
		
		String daysOfTheWeek = "Tuesday";
		
		switch(daysOfTheWeek){
			case "Monday":
				System.out.println("月曜日です");
				break;
			case "Tuesday":
				System.out.println("火曜日です");
				break;
			case "Wednesday":
				System.out.println("水曜日です");
				break;
			case "Thursday":
				System.out.println("木曜日です");
				break;
			case "Friday":
				System.out.println("金曜日です");
				break;
			case "Saturday":
				System.out.println("土曜日です");
				break;
			case "Sunday":
				System.out.println("日曜日です");
				break;
			default:
				System.out.println("曜日ではありません");
		}	
		
	}

}
