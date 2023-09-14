package test20230718;
import java.util.Scanner;

public class Password {
	
	//先ずはパスワードの最低限を設定しておきましょう。パスワードは8文字以上
	public static final int PASSWORD_LENGTH = 8;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);//インプット処理できるようにスキャナーライブラリーのインスタンスを開始
        //ユーザーにパスワードの求めるルールを出力
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password: ");
        
        String s = input.nextLine(); //inputというスキャナーのインスタンスのオブジェクトを使って入力したテキストを受け取ってｓに保存する
        
        //ｓの入力したデータを関数に送って確認する
        if (is_Valid_Password(s)) {
        	//ＯＫ
            System.out.println("Password is valid: " + s);
        } else {
        	//ＮＧ
            System.out.println("Not a valid password: " + s);
        }

    }
	
	/*この関数が入力した文字列が有効なパスワードかどうかを確認する
	 * 関数タイプ：パブリック　ｂｏｏｌｅａｎ
	 * パラメータ：パスワードの文字列　ｓｔｒｉｎｇ　タイプ
	 * 確認条件：
	 * 	パスワードは8文字以上でなければならない。→　PASSWORD_LENGTHという値を使う
	 * 　パスワードは文字と数字のみで構成される。→　ｉｓＬｅｔｔｅｒとｉｓＮｕｍｅｒｉｃ関数を呼び出して確認
	 * 　パスワードには少なくとも3桁の数字が含まれていなければならない。→　数字数を確認する
	 * 返却データ：　ｂｏｏｌｅａｎのｔｒｕｅかｆａｌｓｅ
	 * */
    public static boolean is_Valid_Password(String password) {
    	//8桁以上ではない場合、ＮＧを返却する
        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);
            //パスワードは文字と数字のみで構成されるか？
            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;//１つでもNGだとfalseを返却
        }

        //数字が3桁以上か？
        return (numCount >= 3);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

}
