package guild.management;

import java.util.ArrayList;
import java.util.List;
import guild.adventurer.Adventurer;
import guild.quest.Quest;

public class Guild {
	// ==== フィールド ====
	private List<Adventurer> members = new ArrayList<>(); // ヌルポを防ぐため、宣言時に初期化
	private List<Quest> quests = new ArrayList<>(); // ヌルポを防ぐため、宣言時に初期化

	// -------- OOP MEMO --------
	// 【デフォルトコンストラクタ】
	// 明示的なコンストラクタが定義されていない場合、
	// 引数なしの空のコンストラクタが、コンパイラによって自動的に追加
	// public Guild() {}
	// --------------------------
	
	// -------- OOP MEMO --------
	// 【ポリモーフィズム】
	// 冒険者クラスのインスタンスを統一的に扱う
	// Adventurer型のリストにHeroやWizardを追加できる
	// --------------------------
	public void addMember(Adventurer adventurer) {
		members.add(adventurer);
	}

	public List<Adventurer> getMembers() {
		return members;
	}

	public void addQuest(Quest quest) {
		quests.add(quest);
	}

	public List<Quest> getQuests() {
		return quests;
	}
}
