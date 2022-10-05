package com.example.demo.appuser;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class AppUser implements UserDetails {
	
	
	@SequenceGenerator(
			name = "clinica_sequence",
			sequenceName = "clinica_sequence",
			allocationSize = 1
			)
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "clinica_sequence"
			)
	
	
	private Long id;
	private String nombre;
	private String email;
	private String direccion;
	private String password;
	private String ciudad;
	@Enumerated(EnumType.STRING)
	private AppUserRole appUserRole;
	private Boolean locked = false;
	private Boolean enabled = false;
	
	public AppUser(String nombre, String email, String direccion, String password, String ciudad,
			AppUserRole appUserRole) {
		
		this.nombre = nombre;
		this.email = email;
		this.direccion = direccion;
		this.password = password;
		this.ciudad = ciudad;
		this.appUserRole = appUserRole;
		
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(appUserRole.name());
		return Collections.singletonList(authority);
	}

	@Override
	public String getPassword() {
		
		return password;
	}

	@Override
	public String getUsername() {
		
		return email;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getCiudad() {
		return ciudad;
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return !locked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return enabled;
	}

	
	
}
