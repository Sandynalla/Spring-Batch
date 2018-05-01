package com.ram.springbatch.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Member implements Serializable{

	public Member(){		
	
	}
	
    @GeneratedValue(strategy = GenerationType.AUTO)  
    @Id
    @Column(name = "ID")
	private Integer id;
	
	@Column(name = "MBR_PTY_ID")
	private Integer mbrPtyId;
	
	@Column(name = "GIV_NM")
	private String givenName;
	
	@Column(name = "FAM_NM")
	private String familyName;
	
	@Column(name = "SRC_SBSCR_ID")
	private String sourceSubscriberID;
	
	@Column(name = "DEPN_NBR")
	private Integer depnNbr;
	
	@Column(name = "DEPN_SEQ_NUM")
	private String depSequenceNumber;
	
	@Column(name = "REL_CD")
	private String relCD;
	
	@Column(name = "BTH_DT")
	private String birthDate;
	
	@Column(name = "GDR_TYP_CD")
	private String cdrTypeCD;
	
	@Column(name = "MBR_ROW_EFF_DT")
	private String memberRowEffectiveDate;
	
	@Column(name = "MBR_ROW_EXPIR_DT")
	private String memberrowExpireDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMbrPtyId() {
		return mbrPtyId;
	}
	public void setMbrPtyId(Integer mbrPtyId) {
		this.mbrPtyId = mbrPtyId;
	}
	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getSourceSubscriberID() {
		return sourceSubscriberID;
	}
	public void setSourceSubscriberID(String sourceSubscriberID) {
		this.sourceSubscriberID = sourceSubscriberID;
	}
	public Integer getDepnNbr() {
		return depnNbr;
	}
	public void setDepnNbr(Integer depnNbr) {
		this.depnNbr = depnNbr;
	}
	public String getDepSequenceNumber() {
		return depSequenceNumber;
	}
	public void setDepSequenceNumber(String depSequenceNumber) {
		this.depSequenceNumber = depSequenceNumber;
	}
	public String getRelCD() {
		return relCD;
	}
	public void setRelCD(String relCD) {
		this.relCD = relCD;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getCdrTypeCD() {
		return cdrTypeCD;
	}
	public void setCdrTypeCD(String cdrTypeCD) {
		this.cdrTypeCD = cdrTypeCD;
	}
	public String getMemberRowEffectiveDate() {
		return memberRowEffectiveDate;
	}
	public void setMemberRowEffectiveDate(String memberRowEffectiveDate) {
		this.memberRowEffectiveDate = memberRowEffectiveDate;
	}
	public String getMemberrowExpireDate() {
		return memberrowExpireDate;
	}
	public void setMemberrowExpireDate(String memberrowExpireDate) {
		this.memberrowExpireDate = memberrowExpireDate;
	}
	
	
}