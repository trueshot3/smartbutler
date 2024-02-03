package com.fms.smartbutler.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fms.smartbutler.domain.Company;
import com.fms.smartbutler.dto.CompanyDTO;
import com.fms.smartbutler.repository.BuildRepository;
import com.fms.smartbutler.repository.CompanyKindRepository;
import com.fms.smartbutler.repository.CompanyRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

/**
 * @author 전종배
 * @since 2024-02-01 to 2024-02-03
 */

@Service
@Transactional
@RequiredArgsConstructor
public class CompanyService implements UserDetailsService {

	private final BuildRepository buildRepository;
	private final CompanyKindRepository companyKindRepository;
	private final CompanyRepository companyRepository;
	private final ModelMapper modelMapper;
	
	@Override
	public UserDetails loadUserByUsername(String companyName) throws UsernameNotFoundException {
		Company company = companyRepository.findByCompanyName(companyName);

		if (company == null) {
			throw new UsernameNotFoundException(companyName);
		}

		return User.builder().username(company.getCompanyName()).password(company.getPassword())
				.roles(company.getRole()).build();
	}
	
	public CompanyDTO save(CompanyDTO companyDTO) {
		
		String role = "WORKER";
		companyDTO.setRole(role);
		
		System.out.println(companyDTO.getKindName());
		Long kindType= companyDTO.getKindType();
		String kindName = companyKindRepository.findById(kindType).get().getKindName();
		companyDTO.setKindName(kindName);
		
		System.out.println(companyDTO.getBuildName());
		Long buildId=companyDTO.getBuildId();
		String buildName=buildRepository.findById(buildId).get().getBuildName();
		companyDTO.setBuildName(buildName);
		
		Company company = modelMapper.map(companyDTO, Company.class);
		
		companyRepository.save(company);
		Company savedCompany = companyRepository.save(company);
		CompanyDTO savedCompanyDTO = modelMapper.map(savedCompany, CompanyDTO.class);
		return savedCompanyDTO;
	}
	
	public CompanyDTO findById(Long companyId) {
		Company company = companyRepository.findById(companyId).get();
		CompanyDTO companyDTO = modelMapper.map(company, CompanyDTO.class);
		return companyDTO;
	}

	public List<CompanyDTO> findAll() {
		List<Company> companies = companyRepository.findAll();

		List<CompanyDTO> companiesDTO = companies.stream().map(company -> modelMapper.map(company, CompanyDTO.class))
				.collect(Collectors.toList());

		return companiesDTO;
	}

	public void deleteById(Long companyId) {
		companyRepository.deleteById(companyId);
	}
	
	public Optional<CompanyDTO> findByName(String companyName) {
		Company company = companyRepository.findByCompanyName(companyName);
		CompanyDTO companyDTO = modelMapper.map(company, CompanyDTO.class);
		
		return Optional.ofNullable(companyDTO);
	}
}
