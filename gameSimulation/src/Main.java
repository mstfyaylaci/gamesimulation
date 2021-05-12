import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.ProductManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Product;

public class Main {

	public static void main(String[] args) {

		
		Customer customer= new Customer(1, "mustafa","yaylacý", 20, "111111");
		Product product= new Product("Call of duts", 100);
		Campaign campaign =new Campaign(1, "ögrenci kampanyasý", 10);
		
		CustomerManager customerManager = new CustomerManager();
        customerManager.add(customer);
        customerManager.delete(customer);
        customerManager.update(customer);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        productManager.delete(product);
        productManager.update(product);

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign);
        campaignManager.delete(campaign);
        campaignManager.update(campaign);
	}

}
