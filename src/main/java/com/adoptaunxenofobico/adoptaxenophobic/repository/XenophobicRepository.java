package com.adoptaunxenofobico.adoptaxenophobic.repository;

import java.util.List;

import com.adoptaunxenofobico.adoptaxenophobic.entity.Xenophobic;

public interface XenophobicRepository {
	public void add(Xenophobic xenophobic);
	public List<Xenophobic> list();
	public Xenophobic show(int id);
	public void delete(int id);
}
