package in.jt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.jt.binding.CaseWorker;
import in.jt.constants.AppConstants;
import in.jt.constants.ProjectConstants;
import in.jt.entity.CaseWorkerEntity;
import in.jt.props.AppProperties;
import in.jt.repository.CaseWorkerEntityRepository;

@Service
public class CaseWorkerService {
	@Autowired
	private CaseWorkerEntityRepository repo;
	
	@Autowired
	private AppProperties props;
	
	public String createCaseWorkerAccount(CaseWorker cw) {
		
		CaseWorkerEntity entity = new CaseWorkerEntity();
		
		BeanUtils.copyProperties(cw, entity);
		
		CaseWorkerEntity cwe = repo.save(entity);
		
		if(cwe.getCwId() != null) {
			//return props.getMessages().get(AppConstants.SUCCESS);
			return props.getMessages().get(ProjectConstants.SUCCESS);
		}
		else
			//return props.getMessages().get(AppConstants.FAIL);
			return props.getMessages().get(ProjectConstants.FAIL);
		
	}
}
