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
import jp.co.sss.crud.service.EmployeeRegisterService;
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
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int menu = 0;

		do {
			// メニューの表示
			System.out.println(Constants.MENU);
			System.out.println(Constants.MENU_VIEW);

			// メニュー番号の入力
			String inputMenu = br.readLine();
			menu = Integer.parseInt(inputMenu);

			// 機能の呼出
			switch (menu) {
			case 1:
				// 全件表示機能の呼出
				//				DBController.find();
				EmployeeAllFindService findAll = new EmployeeAllFindService();
				findAll.execute();

				break;

			case 2:
				// 社員名検索
				//				System.out.print(Constants.EMP_NAME);
				//
				//				// 検索機能の呼出
				//				DBController.findB();
				EmployeeFindByEmpNameService findEmpName = new EmployeeFindByEmpNameService();
				findEmpName.execute();
				break;

			case 3:
				// 検索する部署IDを入力
				//				System.out.print(Constants.DEPT_ID);
				//				String searchDept = br.readLine();
				//
				//				// 検索機能の呼出
				//				DBController.findC(searchDept);
				EmployeeFindByDeptIdService FindByDeptId = new EmployeeFindByDeptIdService();
				FindByDeptId.execute();
				break;

			case 4:
				// 登録する値を入力
				//				System.out.print(Constants.EMP_NAME);
				//				String empName = br.readLine();
				//				System.out.print(Constants.GENDER);
				//				String gender = br.readLine();
				//				System.out.print(Constants.BIRTHDAY);
				//				String birthday = br.readLine();
				//				System.out.print(Constants.DEPT_ID);
				//				String deptId = br.readLine();
				//
				//				// 登録機能の呼出
				//				DBController.insert(empName, gender, birthday, deptId);
				EmployeeRegisterService regist = new EmployeeRegisterService();
				regist.execute();
				break;

			case 5:
				// 更新する社員IDを入力
				//				System.out.print(Constants.UPDATE_EMP_ID);
				//
				//				// 更新する値を入力する
				//				String updateEmpId = br.readLine();
				//				Integer.parseInt(updateEmpId);
				//
				//				// 更新機能の呼出
				//				DBController.update(updateEmpId);
				//				System.out.println(Constants.UPDATE_MESSAGE);
				EmployeeUpdateService update = new EmployeeUpdateService();
				update.execute();
				break;

			case 6:
				//				// 削除する社員IDを入力
				//				System.out.print(Constants.DELETE_EMP_ID);
				//
				//				// 削除機能の呼出
				//				DBController.delete();
				EmployeeDeleteService delete = new EmployeeDeleteService();
				delete.execute();
				break;

			}
		} while (menu != 7);
		System.out.println(Constants.END_MESSAGE);
	}
}
