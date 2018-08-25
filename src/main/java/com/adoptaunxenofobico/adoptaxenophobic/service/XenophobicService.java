package com.adoptaunxenofobico.adoptaxenophobic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adoptaunxenofobico.adoptaxenophobic.entity.Xenophobic;

@Service
public interface XenophobicService {
	public List<Xenophobic> findAll();
	public void add(Xenophobic xenophobic);
	public Xenophobic findById(int id);
	public void delete(int id);
}