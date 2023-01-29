package ru.grebnev.a.phonebook.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.grebnev.a.phonebook.exception.NotFoundException;
import ru.grebnev.a.phonebook.repository.UserRepo;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new UserDetailsImpl(
                repo.findByEmail(username)
                        .orElseThrow(
                                () -> new NotFoundException(String.format("User with email %s  not found", username))
                        )
        );
    }
}
