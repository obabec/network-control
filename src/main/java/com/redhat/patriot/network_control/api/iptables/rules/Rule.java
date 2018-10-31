package com.redhat.patriot.network_control.api.iptables.rules;

/**
 * Ip tables rule.
 */
public interface Rule {
    /**
     * Create HTML path for ip tables rest request.
     *
     * @return the string
     */
    String toPath();
}
