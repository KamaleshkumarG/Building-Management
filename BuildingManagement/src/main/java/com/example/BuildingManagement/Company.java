package com.example.BuildingManagement;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Company {
		
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		private String companyName;
	    private String companyEmailID;
	    private Long companyPhone;
	    private  double rent;
	    
	  

		public Company() {
	    	
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getCompanyEmailID() {
			return companyEmailID;
		}

		public void setCompanyEmailID(String companyEmailID) {
			this.companyEmailID = companyEmailID;
		}

		public Long getCompanyPhone() {
			return companyPhone;
		}

		public void setCompanyPhone(Long companyPhone) {
			this.companyPhone = companyPhone;
		}

		public  double getRent() {
			return rent;
		}

		public void setRent(double rent) {
			this.rent = rent;
		}

		

		  
	  
	  
	    

	    
	}

