package com.adoptaunxenofobico.adoptaxenophobic.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adoptaunxenofobico.adoptaxenophobic.entity.Xenophobic;
import com.adoptaunxenofobico.adoptaxenophobic.service.XenophobicService;
import com.adoptaunxenofobico.adoptaxenophobic.service.XenophobicServiceImpl;

@RestController
@RequestMapping("/xenophobics")
public class XenophobicApi {

	@Autowired
	private XenophobicService xenophobicService;
	
	@GetMapping()
	public List<Xenophobic> list() {
		return this.xenophobicService.findAll();
	}
	
	@PostMapping("/xenophobics")
	public void add(@RequestBody() Xenophobic xenophobic) {
		this.xenophobicService.add(xenophobic);
	}
	
	@GetMapping("/xenophobics/{id}")
	public Xenophobic show(@PathVariable int id) {
		Xenophobic xenophobic = this.xenophobicService.findById(id);
		return xenophobic;
	}
	
	@DeleteMapping("/xenophobics/{id}")
	public void delete(@PathVariable int id) {
		this.xenophobicService.delete(id);
	}
	
	@PutMapping("/xenophobics/{id}")
	public void edit(Xenophobic xenophobic) {
		// TODO
	}
	
}