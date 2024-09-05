package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration
public class RedisConfig {
	
	/*@Value("${spring.data.redis.url}")
	private String url;
	
	@Value("${spring.data.redis.port}")
	private Integer port;
	
	@Value("${spring.data.redis.username}")
	private String username;
	
	@Value("${spring.data.redis.password}")
	private String pwd;*/

	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {

		RedisStandaloneConfiguration serverConfig = 
				new RedisStandaloneConfiguration("redis-16575.c264.ap-south-1-1.ec2.cloud.redislabs.com", 16575);

		serverConfig.setUsername("default");
		serverConfig.setPassword("KSpkcmqnzC9IxL5CXnn1lmDAhDtkh8eD");

		JedisClientConfiguration clientConfig = JedisClientConfiguration.builder().build();

		return new JedisConnectionFactory(serverConfig, clientConfig);
	}

}


