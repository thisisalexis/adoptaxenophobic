package com.adoptaunxenofobico.adoptaxenophobic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adoptaunxenofobico.adoptaxenophobic.entity.Xenophobic;
import com.adoptaunxenofobico.adoptaxenophobic.repository.XenophobicRepository;

@Service
public class XenophobicServiceImpl implements XenophobicService {
	
	@Autowired
	private XenophobicRepository xenophobicRepository;
	
	public XenophobicServiceImpl() {
		super();
	}
	
	public List<Xenophobic> findAll() {
		List<Xenophobic> xenophobics = new ArrayList<>();
		try {
			xenophobics = this.xenophobicRepository.list();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return xenophobics;
	}
	
	public void add(Xenophobic xenophobic) {
		this.xenophobicRepository.add(xenophobic);
	}
	
	public Xenophobic findById(int id) {
		return this.xenophobicRepository.show(id);
	}
	
	public void delete(int id) {
		this.xenophobicRepository.delete(id);
	}
	
}