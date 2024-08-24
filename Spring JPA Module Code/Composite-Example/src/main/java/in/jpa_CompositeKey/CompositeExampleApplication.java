package in.jpa_CompositeKey;

import in.jpa_CompositeKey.Entity.account;
import in.jpa_CompositeKey.Entity.accountPK;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.Serializable;
import java.util.Optional;

@SpringBootApplication
public class CompositeExampleApplication  {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(CompositeExampleApplication.class, args);


		jpaRepo bean = run.getBean(jpaRepo.class);






//			# Data Inserted
//
//		accountPK apk = new accountPK();
//		apk.setAccountNum(74598785484726L);
//		apk.setAcctType("Saving");
//
//		account a = new account();
//		a.setHolderName("Ashok");
//		a.setBranch("Ameerpet");
//		a.setAcc(apk);
//
//		try{
//			bean.save(a);
//			System.out.println("Data got Inserted");
//		}catch (Exception e){
//			System.out.println("data Not Inserted ");
//		}



//========================================================================================


		//find method
//		accountPK apk = new accountPK();
//		apk.setAccountNum(74598785484726L);
//		apk.setAcctType("Saving");
//
//		Optional<account> byId = bean.findById(apk);
//		System.out.println(byId.get().getHolderName());

//=================================================================================================================

		//		 SQL -->Hibernate: delete from account_tbl where account_num=? and acct_type=?
//				accountPK apk = new accountPK();
//				apk.setAccountNum(74598785484726L);
//				apk.setAcctType("Saving");
//
//				bean.deleteById(apk);




	}

}
