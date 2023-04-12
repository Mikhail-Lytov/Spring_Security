package ru.misha.lytov.firstSecurityApp.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ru.misha.lytov.firstSecurityApp.models.Person;

import java.util.Collection;

public class PersonDetails implements UserDetails {

    private final Person person;

    public PersonDetails(Person person) {
        this.person = person;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {// список прав
        return null;
    }

    @Override
    public String getPassword() { // возвращает пароль сущности
        return this.person.getPassword();
    }

    @Override
    public String getUsername() {
        return this.person.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() { //текущая сущность активна
        return true;
    }

    @Override
    public boolean isAccountNonLocked() { // не заблокирована
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() { // пароль не просрочен
        return true;
    }

    @Override
    public boolean isEnabled() { // аккаунт включен
        return true;
    }


    public Person getPerson(){
        return this.person;
    }
}
