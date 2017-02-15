#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.messages;

public class MiRequest extends BasicMessage {
	private String username;

	public MiRequest() {
		super();
	}

	public MiRequest(String correlationId, String sessionId) {
		super(correlationId, sessionId);
	}

	public MiRequest(String correlationId, String sessionId, String username) {
		super(correlationId, sessionId);
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "MiRequest {${symbol_escape}"username${symbol_escape}":" + username + ", ${symbol_escape}"correlationId${symbol_escape}":" + getCorrelationId() + ", ${symbol_escape}"cessionId${symbol_escape}":"
				+ getSessionId() + "}";
	}
}
