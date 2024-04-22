package in.jt.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "reg-app")
public class AppProperties {

	private Map<String, String> messages = new HashMap<>();

	/*
	public Map<String, String> getMessages() {
		return messages;
	}

	public void setMessages(Map<String, String> messages) {
		this.messages = messages;
	}
	*/
	//K				V
	//success: CASEWORKER ACCOUNT SUCCESSFULLY CREATED...!!!
    //fail   : CASEWORKER ACCOUNT NOT CREATED...!!!
}