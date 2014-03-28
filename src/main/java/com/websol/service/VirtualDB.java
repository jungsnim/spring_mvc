package com.websol.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.websol.notice.model.School;
import com.websol.notice.model.Stud;
import com.websol.notice.model.StudList;
import com.websol.notice.model.UserInfo;

@Component
public class VirtualDB 
{
	private School school;
	Map<String,UserInfo> userList = new HashMap<>();
	public VirtualDB() {
		
		userList.put("aaa", new UserInfo("aaa", "aaa", "정성철", 32, "010-7193-8442"));
		userList.put("bbb", new UserInfo("bbb", "bbb", "정성철", 32, "010-7193-8442"));
		userList.put("ccc", new UserInfo("ccc", "ccc", "정성철", 32, "010-7193-8442"));
		userList.put("ddd", new UserInfo("ddd", "ddd", "정성철", 32, "010-7193-8442"));
		userList.put("eee", new UserInfo("eee", "eee", "정성철", 32, "010-7193-8442"));
		
		
		school = new School();
		List<StudList> bans = new ArrayList<StudList>();
		
		List<Stud> ban1St = new ArrayList<Stud>();
		ban1St.add(new Stud("전지현",85,50,85));
		ban1St.add(new Stud("김태희",78,69,78));
		ban1St.add(new Stud("허지우",55,85,36));
		bans.add(new StudList(1,ban1St));
		
		List<Stud> ban2St = new ArrayList<Stud>();
		ban2St.add(new Stud("정성철",81,86,36));
		ban2St.add(new Stud("장동건",87,55,55));
		ban2St.add(new Stud("김수현",85,78,33));
		bans.add(new StudList(2,ban2St));
		
		List<Stud> ban3St = new ArrayList<Stud>();
		ban3St.add(new Stud("데니스리치",43,25,97));
		ban3St.add(new Stud("제임스고슬링",25,86,52));
		ban3St.add(new Stud("송재경",44,77,33));
		bans.add(new StudList(3,ban3St));
		school.setBanList(bans);
	}
	public UserInfo getUserInfo(String id)
	{
		if(userList.containsKey(id))
		{
			return userList.get(id);
		}
		return null;
	}
	public List<String> getBanNames()
	{
		List<String> banNames = new ArrayList<>();
		for (StudList ban : school.getBanList()) {
			banNames.add(""+ban.getBan());
		}
		return banNames;
	}
	public List<String> getStudNames(Integer ban)
	{
		List<String> stNames = new ArrayList<>();
		for (Stud st : school.getBan(ban).getStdList()) {
			stNames.add(""+st.getName());
		}
		return stNames;
	}
	public Stud getStudInfo(Integer ban,Integer stIdx)
	{
		return school.getBan(ban).getStudInfo(stIdx);
	}
}
