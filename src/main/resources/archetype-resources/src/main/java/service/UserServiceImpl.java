#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${package}.model.MobileInternet;
import ${package}.model.User;
import ${package}.repository.MobileInternetRepository;
import ${package}.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired(required=true)
	UserRepository userRepo;
	
	@Autowired(required=true)
	MobileInternetRepository miRepo;
	
	
	@Override
	public User getUserData(String user,String password) {
		User usr=userRepo.findOneByMsisdn(user);
		return usr;
	}


	@Override
	public Optional<MobileInternet> getUserMi(String msisdn) {
		logger.info("getUserMi(msisdn: {}) starts...", msisdn);
		Optional<MobileInternet> result = miRepo.findByUserName(msisdn);
		logger.info("getUserMi(msisdn: {}) done, result: {}", msisdn, result);
		return result;
	}
}
