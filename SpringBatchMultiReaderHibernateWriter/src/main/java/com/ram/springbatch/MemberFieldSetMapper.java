package com.ram.springbatch;


import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.ram.springbatch.model.Member;



/**
 * @author sandeep Nalla
 *
 */
public class MemberFieldSetMapper implements FieldSetMapper<Member> {
	
	
	public Member mapFieldSet(FieldSet memberLoadFiledset) throws BindException {
		
		
		Member memberLoad = new Member();
		
		System.out.println("****"+memberLoadFiledset.readInt(0));
		System.out.println("****"+memberLoadFiledset.readString(1));
		System.out.println("****"+memberLoadFiledset.readString(2));
		System.out.println("****"+memberLoadFiledset.readString(3));
		System.out.println("****"+memberLoadFiledset.readInt(4));
		System.out.println("****"+memberLoadFiledset.readString(5));
		System.out.println("****"+memberLoadFiledset.readString(6));
		System.out.println("****"+memberLoadFiledset.readString(7));
		System.out.println("****"+memberLoadFiledset.readString(8));
		System.out.println("****"+memberLoadFiledset.readString(9));
		System.out.println("****"+memberLoadFiledset.readString(10));
		
		//memberLoad.setId(memberLoadFiledset.readInt(0));
		memberLoad.setMbrPtyId(memberLoadFiledset.readInt(1));
		memberLoad.setGivenName(memberLoadFiledset.readString(2));
		memberLoad.setFamilyName(memberLoadFiledset.readString(3));
 	    memberLoad.setSourceSubscriberID(memberLoadFiledset.readString(4));
 		memberLoad.setDepnNbr(memberLoadFiledset.readInt(5));
 		memberLoad.setDepSequenceNumber(memberLoadFiledset.readString(6));
 		memberLoad.setRelCD(memberLoadFiledset.readString(7));
 		memberLoad.setBirthDate(memberLoadFiledset.readString(8));
 		memberLoad.setCdrTypeCD(memberLoadFiledset.readString(9));
 		memberLoad.setMemberRowEffectiveDate(memberLoadFiledset.readString(10));
		memberLoad.setMemberrowExpireDate(memberLoadFiledset.readString(11));
		return memberLoad;
		
	}

}
