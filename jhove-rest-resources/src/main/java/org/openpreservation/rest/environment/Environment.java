/**
 * 
 */
package org.openpreservation.rest.environment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * @author <a href="mailto:carl@openpreservation.org">Carl Wilson</a>.</p>
 */
@JsonTypeName
public class Environment {
    final static Environment INSTANCE = new Environment();
    private final ServerDetails hardware = ServerDetails.getInstance();
    private final OsDetails os = OsDetails.getInstance();
    private final JvmDetails java = JvmDetails.getInstance();

    private Environment() {
        // Do nothing
    }

    /**
     * @return the Server details
     */
    @JsonProperty
    public ServerDetails getServer() {
        return this.hardware;
    }

    /**
     * @return the os details
     */
    @JsonProperty
    public OsDetails getOS() {
        return this.os;
    }

    /**
     * @return the Java details
     */
    @JsonProperty
    public JvmDetails getJava() {
        return this.java;
    }
}
