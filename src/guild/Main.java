package guild;

import java.util.Scanner;

import guild.management.Guild;
import guild.adventurer.Adventurer;
import guild.adventurer.Hero;
import guild.adventurer.Wizard;
import guild.adventurer.Priest;
import guild.quest.Quest;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Guild guild = new Guild();

		// サンプルデータの追加
		guild.addMember(new Hero("見習い勇者", 5, 100));
		guild.addMember(new Wizard("駆け出し魔法使い", 4, 80));
		guild.addMember(new Priest("サボり僧侶", 3, 70));
//		guild.addMember(new Hero("伝説の勇者ロト", 100, 2000));
//		guild.addMember(new Wizard("名前を言ってはいけないあの人", 100, 2400));
//		guild.addMember(new Priest("奈良の大仏", 100, 1800));

		// クエストデータの登録
		guild.addQuest(new Quest("キノコあつめ", 1, 100));
		guild.addQuest(new Quest("スライムたいじ", 4, 500));
		guild.addQuest(new Quest("ドラゴンげきたい", 8, 2000));
		guild.addQuest(new Quest("オブジェクト指向をマスター", 999999, 999999));

		// メインメソッド オープニング
		System.out.println("冒険者ギルドへようこそ !!");

		// プレイヤーキャラの作成
		System.out.print("主人公の名前を入力してください: ");
		String playerName = scanner.nextLine();
		System.out.print("主人公の職業を選択してください (1: Hero, 2: Wizard, 3: Priest): ");
		int classChoice = scanner.nextInt();

		Adventurer player;
		switch (classChoice) {
		case 1:
			player = new Hero(playerName, 1, 100);
			break;
		case 2:
			player = new Wizard(playerName, 1, 80);
			break;
		case 3:
			player = new Priest(playerName, 1, 90);
			break;
		default:
			System.out.println("デフォルトの勇者が選択されました");
			player = new Hero(playerName, 1, 100);
		}

		guild.addMember(player);

		// クエスト表示
		System.out.println("\n現在受注できるクエストは、以下です:");
		int index = 1;
		for (Quest quest : guild.getQuests()) {
			System.out.println(index++ + ". " + quest.getTitle() + " (難易度: " + quest.getDifficulty() + ", 報酬: "
					+ quest.getReward() + " ゴールド)");
		}

		System.out.print("\n挑戦するクエストを選択してください: ");
		int questChoice = scanner.nextInt();
		Quest selectedQuest = guild.getQuests().get(questChoice - 1);

		// クエストの挑戦
		int partyLevel = guild.getMembers().stream().mapToInt(Adventurer::getLevel).sum();
		System.out.println("\nパーティーの合計レベル: " + partyLevel);
		if (partyLevel >= selectedQuest.getDifficulty()) {
			System.out.println("クエスト成功! 報酬として" + selectedQuest.getReward() + " ゴールドを受け取った!!");
		} else {
			System.out.println("クエスト失敗... パーティーを整えて再挑戦しましょう。");
		}

		scanner.close();
	}
}
