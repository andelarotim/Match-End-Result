package matchEndService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class MatchController {
	@Autowired
	private MatchRepository matchRepository;

	@PostMapping(path="/matches")
    public @ResponseBody String createMatch(@RequestBody Match match) {
		Match m = new Match ();
		m.setMatchId(match.getMatchId());
		m.setMatchName(match.getMatchName());
		m.setEndResult(match.getEndResult());
		matchRepository.save(m);
		
        return "Match information saved successfully : " + match.getMatchId() + " " + match.getMatchName() + " " + match.getEndResult();
    }
}
