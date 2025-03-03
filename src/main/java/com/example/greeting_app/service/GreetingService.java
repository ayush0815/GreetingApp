package com.example.greeting_app.service;

import com.example.greeting_app.model.Greeting;
import com.example.greeting_app.repository.GreetingRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public Greeting getGreetingById(Long id) {
        return greetingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Greeting not found with ID: " + id));
    }

    public Greeting saveGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }

    // ✅ UC6: Fetch all greeting messages from the repository
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }
}
