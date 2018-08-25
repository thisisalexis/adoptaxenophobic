package com.adoptaunxenofobico.adoptaxenophobic.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.adoptaunxenofobico.adoptaxenophobic.entity.Xenophobic;

@Repository
public class XenophobicRepositoryImpl implements XenophobicRepository {

	private List<Xenophobic> xenophobics;
	
	public XenophobicRepositoryImpl() {
		super();
		this.initialize();
	}
	
	private void initialize() {
		this.xenophobics = new ArrayList<>();
		Xenophobic dani = new Xenophobic(1, "Daniela", "Paredes", "Maldita perra despiadada", 5, null, null, null, true, "EC", null, "A", false);
		Xenophobic santi = new Xenophobic(2, "Santiago", "Guachamin", "Maricón con complejo de inferioridad", 5, null, null, null, true, "EC", null, "A", false);
		this.xenophobics.add(dani);
		this.xenophobics.add(santi);
	}

	@Override
	public void add(Xenophobic xenophobic) {
		this.xenophobics.add(xenophobic);
	}

	@Override
	public List<Xenophobic> list() {
		return this.xenophobics;
	}

	@Override
	public Xenophobic show(int id) {
		for(Xenophobic xenophobic : this.xenophobics) {
			if(xenophobic.getId() == id)
				return xenophobic;
		}
		return null;
	}

	@Override
	public void delete(int id) {
		Xenophobic xenophobic = this.show(id);
		if(!xenophobic.equals(null))
			this.xenophobics.remove(xenophobic);
	}
	
	
	
}
