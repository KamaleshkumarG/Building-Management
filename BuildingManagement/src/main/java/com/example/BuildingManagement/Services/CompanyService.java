package com.example.BuildingManagement.Services;


import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.BuildingManagement.Company;
import com.example.BuildingManagement.CompanyRepository;
import com.example.accessingdatajpa.rest.Movie;




@Service
public class CompanyService extends Company{
	
	@Autowired
	private CompanyRepository companyrepository;
	
	public List<Company> gethighestRentPayingCompanies(){
	
        List<Company> companies = companyrepository.findAll();
        
        if (companies == null || companies.size() < 2) {
            throw new IllegalArgumentException("List must contain at least 2 values");
        }
        companies.sort(Comparator.comparingDouble(Company::getRent).reversed());
        return companies.subList(0, 2);
			
			
	 
    }

	
}

	




	

