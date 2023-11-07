import java.util.ArrayList;
import java.util.List;

public class Bill {
	private Person person; 
	private Company company;
	List <Item> items = new ArrayList<>();
	
	
	
	// Constructors
	public Bill(Person person, Company company) {
		super();
		this.person = person;
		this.company = company;
	}

	// Getters and setters
	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}
		
	// toString()
	@Override
	public String toString() {
		return "Bill [person=" + person + ", company=" + company + "]";
	}
	
	
	
	
	
	

}
