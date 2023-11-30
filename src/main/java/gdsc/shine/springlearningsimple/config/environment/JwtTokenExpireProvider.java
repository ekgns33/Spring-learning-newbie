package gdsc.shine.springlearningsimple.config.environment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

// TODO: 컴포넌트 스캔을 통한 빈 등록
@Component
@PropertySource("classpath:application.properties")
public class JwtTokenExpireProvider {
    // TODO: application.properties의 security.jwt.token.expire-length 값을 활용하여 validityInMilliseconds값 초기화 하기
    private long validityInMilliseconds;

    public JwtTokenExpireProvider(@Value("${security.jwt.token.expire-length}")Long validityInMilliseconds) {
        this.validityInMilliseconds = validityInMilliseconds;
    }

    public long getValidityInMilliseconds() {
        return validityInMilliseconds;
    }
}