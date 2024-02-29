package com.AloBomnito.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.AloBomnito.modelos.Cliente;
import com.AloBomnito.repository.ClienteRepository;

@Component
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Cliente user = clienteRepository.findByNombre(username)
				.orElseThrow(() -> new UsernameNotFoundException("Username not found"));

		return org.springframework.security.core.userdetails.User
				.withUsername(user.getNombre())
				.password(user.getContrasenia())
				.authorities(new ArrayList<>())
				.accountExpired(false)
				.accountLocked(false)
				.credentialsExpired(false)
				.disabled(false)
				.build();
	}


}
