package com.example.BuildingManagement.rest;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.BuildingManagement.Company;
import com.example.BuildingManagement.CompanyRepository;
import com.example.BuildingManagement.Services.CompanyService;



@RestController
public class CompanyController {

	
	    @Autowired
	    private CompanyRepository companyrepository;
	    @Autowired
	    private  CompanyService companyservice;
	    
	    

	   
	    @GetMapping("/CompanyDetails")
	    public List<Company> createcompanyname(){
	        return   companyrepository.findAll();
	    }
	   
	    
	    @PostMapping("/CompanyDetails")
	    public Company createCompanyinformation (@RequestBody Company company) {
			return companyrepository.save(company);
		}
	    @PutMapping("/CompanyDetails/{id}")
	    public Company upadateCompanyinformation(@PathVariable ("id") Long id, @RequestBody Company company ) {
	    	 company.setId(id);
	    	 Company company1 = companyrepository.findById(company.getId()).get();
	    	 company1.setCompanyName(company.getCompanyName());
	    	 company1.setCompanyEmailID(company.getCompanyEmailID());
	    	 company1.setCompanyPhone(company.getCompanyPhone());
	    	 company1.setRent(company.getRent());
	    	 
	    	return companyrepository.save(company);
	    	 
	    	 
	    }
	    @GetMapping("/CompanyDetails/maxValue")
		public List<Company> gethighestRentPayingCompanies(){
			List<Company> Company = companyservice.gethighestRentPayingCompanies();
		    return Company;
		}
	    

	
	    
	    @DeleteMapping("CompanyDetails/{id}")
	    public  String deleteCompany(@PathVariable Long id) {
	        companyrepository.deleteById(id);
	        return "sucessfully delete";
	        
	    }
	
}
