package guild.management;

import java.util.ArrayList;
import java.util.List;

import guild.adventurer.Adventurer;
import guild.quest.Quest;

public class Guild {
	private List<Adventurer> members = new ArrayList<>();
	private List<Quest> quests = new ArrayList<>();

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
