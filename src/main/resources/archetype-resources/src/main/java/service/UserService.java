#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import java.util.Optional;

import ${package}.model.MobileInternet;
import ${package}.model.User;

public interface UserService {
	public User getUserData(String user, String password);
	
	public Optional<MobileInternet> getUserMi(String msisdn);
	
}
