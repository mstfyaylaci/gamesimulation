package Abstract;

import Entities.Campaign;

public interface CampaignService {

void add(Campaign customer);
	
	void delete(Campaign customer);
	
	void update(Campaign customer);
	
	void getAll(Campaign customer);

}
