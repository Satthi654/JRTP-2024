package in.jt.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;


@Data
@Entity
@Table(name="CASEWORKER_INFO")
public class CaseWorkerEntity {
	@Id
	@Column(name="CW_ID")
	@GenericGenerator(name="caseworker",strategy = "in.jt.generator.CaseWorkerIdSequenceGenerator")
	@GeneratedValue(generator = "caseworker")
	private String cwId;
	
	@Column(name="CW_NAME")
	private String cwName;
	
	@Column(name="CW_PHNO")
	private Long cwPhno;
	
	@Column(name="CW_EMAILID")
	private String cwEmailId;
	
	@Column(name="CW_EMAIL_PASSWORD")
	private String cwPassword;
	
	@CreationTimestamp
	@Column(name="CW_CREATED_DATE",updatable = false)
	private LocalDateTime creadtedDate;
	
	@UpdateTimestamp
	@Column(name="CW_UPDATEDATE",insertable = false)
	private LocalDateTime updatedDate;
}
