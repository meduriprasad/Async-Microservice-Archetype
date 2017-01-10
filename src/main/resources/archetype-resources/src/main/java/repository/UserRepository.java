#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.repository;

import org.springframework.data.repository.CrudRepository;

import ${package}.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	public User findOneByMsisdn(String msisdn);
}
