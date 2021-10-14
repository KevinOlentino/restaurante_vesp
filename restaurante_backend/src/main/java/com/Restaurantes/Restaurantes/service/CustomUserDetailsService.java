package com.Restaurantes.Restaurantes.service;

import com.Restaurantes.Restaurantes.entity.Cliente;
import com.Restaurantes.Restaurantes.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private ClienteRepositorio clienteRepositorio;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Cliente cliente = clienteRepositorio.findByNome(username);
        return new User(cliente.getNome(),cliente.getSenha(), new ArrayList<>());
    }
}
