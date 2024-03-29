package nl.edsn.prototype.devnationresourceserver;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class MessageController {

    @GetMapping("/message")
    Map<String,String> message(@AuthenticationPrincipal Jwt jwt) {
        return Collections.singletonMap("text", "Hello " + jwt.getClaimAsString("email"));
    }

}
