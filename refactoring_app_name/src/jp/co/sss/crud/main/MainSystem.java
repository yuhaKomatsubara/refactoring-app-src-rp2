package jp.co.sss.crud.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.text.ParseException;

import jp.co.sss.crud.service.EmployeeAllFindService;
import jp.co.sss.crud.service.EmployeeDeleteService;
import jp.co.sss.crud.service.EmployeeFindByDeptIdService;
import jp.co.sss.crud.service.EmployeeFindByEmpNameService;
import jp.co.sss.crud.service.EmployeeUpdateService;
import jp.co.sss.crud.util.Constants;

/**
 * 社員情報管理システム開始クラス 社員情報管理システムはこのクラスから始まる。<br/>
 * メニュー画面を表示する。
 *
 * @author System Shared
 *
 */
public class MainSystem {
	/**
	 * 社員管理システムを起動
	 *
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int menu = 0;

		do {
			// メニューの表示
			System.out.println(Constants.MENU);
			System.out.println(Constants.MENU_VIEW);

			// メニュー番号の入力
			try {
				String inputMenu = br.readLine();
				menu = Integer.parseInt(inputMenu);

				// 機能の呼出
				switch (menu) {
				case 1: //全件表示
					EmployeeAllFindService findAll = new EmployeeAllFindService();
					findAll.execute();

					break;

				case 2: //社員名検索
					EmployeeFindByEmpNameService findEmpName = new EmployeeFindByEmpNameService();
					findEmpName.execute();
					break;

				case 3: //部署名検索
					EmployeeFindByDeptIdService FindByDeptId = new EmployeeFindByDeptIdService();
					FindByDeptId.execute();
					break;

				//				case 4: //登録
				//					EmployeeRegisterService regist = new EmployeeRegisterService();
				//					regist.execute();
				//					break;

				case 5: //更新
					EmployeeUpdateService update = new EmployeeUpdateService();
					update.execute();
					break;

				case 6: //削除
					EmployeeDeleteService delete = new EmployeeDeleteService();
					delete.execute();
					break;

				}
			} catch (IOException e) {
				//入出力エラー
				System.out.println(Constants.ERROR_MESSAGE_INPUT + e.getMessage());
			} catch (NumberFormatException e) {
				//数字エラー
				System.out.println(Constants.ERROR_MESSAGE_NUMBER_FRAUD);
			} catch (ClassNotFoundException e) {
				//DBドライバーエラー
				System.out.println(Constants.ERROR_MESSAGE_DB_DRIVER + e.getMessage());
			} catch (SQLException e) {
				//DB処理エラー
				System.out.println(Constants.ERROR_MESSAGE_DB_PROCESS + e.getMessage());
			} catch (Exception e) {
				//予期せぬエラー
				System.out.println(Constants.ERROR_MESSAGE_UNEXPECTED + e.getMessage());
			}
		} while (menu != 7);
		System.out.println(Constants.END_MESSAGE);
	}

}
