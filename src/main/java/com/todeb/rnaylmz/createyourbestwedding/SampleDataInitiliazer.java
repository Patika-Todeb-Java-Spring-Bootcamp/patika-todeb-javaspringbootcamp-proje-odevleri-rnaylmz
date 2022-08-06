package com.todeb.rnaylmz.createyourbestwedding;

import com.todeb.rnaylmz.createyourbestwedding.model.entity.User;
import com.todeb.rnaylmz.createyourbestwedding.repository.IUserRepository;
import com.todeb.rnaylmz.createyourbestwedding.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SampleDataInitiliazer implements ApplicationRunner {

    private final IUserRepository userRepository;
    private final UserService userService;

    @Override
    public void run(ApplicationArguments args) throws Exception {


        User adminUser = new User("admin-user", "adminuser@mail.com", "pass1234");

        if (adminUser.getUsername() != null && !adminUser.getUsername().isEmpty()) {
            // @NotNull && @NotEmpty = @NotBlank
        }

        if (!userRepository.existsByUsername(adminUser.getUsername())) {
            userService.signup(adminUser, true);
        }

        // Creating a sample USER
        User sampleUser = new User("sample-user", "sampleuser@mail.com", "pass1234");
        if (!userRepository.existsByUsername(sampleUser.getUsername())) {
            userService.signup(sampleUser, false);
        }
    }
}
