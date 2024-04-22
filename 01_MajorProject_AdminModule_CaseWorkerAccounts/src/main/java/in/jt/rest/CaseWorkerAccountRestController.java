package in.jt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.jt.binding.CaseWorker;
import in.jt.service.CaseWorkerService;

@RestController
public class CaseWorkerAccountRestController {
	@Autowired
	private CaseWorkerService service;
	
	@PostMapping(value="/account",consumes = "application/json")
	public String saveCaseWorkerInfo(@RequestBody CaseWorker cw) {
		return service.createCaseWorkerAccount(cw);
	}
}
