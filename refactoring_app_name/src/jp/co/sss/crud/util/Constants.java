package jp.co.sss.crud.util;

public class Constants {
	public static final String MENU = "=== 社員管理システム ===\n1.全件表示\n2.社員名検索\n3.部署ID検索\n4.新規登録\n5.更新\n6.削除\n7.終了";
	public static final String MENU_VIEW = "メニュー番号を入力してください：";
	public static final String EMP_NAME = "社員名";
	public static final String GENDER = "性別(0:その他, 1:男性, 2:女性, 9:回答なし):";
	public static final String BIRTHDAY = "生年月日(西暦年/月/日):";
	public static final String DEPT_ID = "部署ID(1:営業部、2:経理部、3:総務部):)";
	public static final String UPDATE_EMP_ID = "更新する社員の社員IDを入力してください：";
	public static final String UPDATE_MESSAGE = "社員情報を更新しました";
	public static final String DELETE_EMP_ID = "削除する社員の社員IDを入力してください：";
	public static final String EMP_NAME_SEARCH = "検索する社員名を入力してください:";
	public static final String END_MESSAGE = "システムを終了します。";
	public static final String NO_EMP = "該当する社員は存在しません";
	public static final String RESIST_COMPLETE = "登録完了";
	public static final String UPDATE_COMPLETE = "更新完了";
	public static final String DELETE_COMPLETE = "削除完了";
	public static final String ERROR_MESSAGE_INPUT = "入出力エラー:";
	public static final String ERROR_MESSAGE_NUMBER_FRAUD = "数字の形式が不正です。";
	public static final String ERROR_MESSAGE_DB_DRIVER = "DBドライバーエラー: ";
	public static final String ERROR_MESSAGE_DB_PROCESS = "DB処理エラー: ";
	public static final String ERROR_MESSAGE_UNEXPECTED = "予期せぬエラー: ";
}
