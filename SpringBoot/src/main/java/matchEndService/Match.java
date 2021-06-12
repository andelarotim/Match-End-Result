package matchEndService;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="matches")
public class Match {
	@Id
	private String matchId;
	
	@Column
	private String matchName;
	
	@Column
	private String endResult;
	
	public Match () {
		
	}
	public Match(String id, String name, String result) {
		this.matchId = id;
		this.matchName = name;
		this.endResult = result;
	}

	public String getMatchId() {
		return matchId;
	}

	public void setMatchId(String id) {
		this.matchId = id;
	}

	public String getMatchName() {
		return matchName;
	}

	public void setMatchName(String name) {
		this.matchName = name;
	}

	public String getEndResult() {
		return endResult;
	}

	public void setEndResult(String result) {
		this.endResult = result;
	}
}

