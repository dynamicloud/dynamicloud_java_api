package org.dynamicloud.net.http;

/**
 * This enum has all possible http code response.
 *
 * @author Eleazar Gomez
 * @version 1.0.0
 * @since 2015-08-22
 **/
public enum HttpStatus {
    CONTINUE(100, "CONTINUE"),

    SWITCHING_PROTOCOLS(101, "SWITCHING_PROTOCOLS"),

    PROCESSING(102, "PROCESSING"),

    OK(200, "OK"),

    CREATED(201, "CREATED"),

    ACCEPTED(202, "ACCEPTED"),

    NON_AUTHORITATIVE_INFORMATION(203, "NON_AUTHORITATIVE_INFORMATION"),

    NO_CONTENT(204, "NO_CONTENT"),

    RESET_CONTENT(205, "RESET_CONTENT"),

    PARTIAL_CONTENT(206, "PARTIAL_CONTENT"),

    MULTI_STATUS(207, "MULTI_STATUS"),

    MULTIPLE_CHOICES(300, "MULTIPLE_CHOICES"),

    MOVED_PERMANENTLY(301, "MOVED_PERMANENTLY"),

    MOVED_TEMPORARILY(302, "MOVED_TEMPORARILY"),

    SEE_OTHER(303, "SEE_OTHER"),

    NOT_MODIFIED(304, "NOT_MODIFIED"),

    USE_PROXY(305, "USE_PROXY"),

    TEMPORARY_REDIRECT(307, "TEMPORARY_REDIRECT"),

    BAD_REQUEST(400, "BAD_REQUEST"),

    UNAUTHORIZED(401, "UNAUTHORIZED"),

    PAYMENT_REQUIRED(402, "PAYMENT_REQUIRED"),

    FORBIDDEN(403, "FORBIDDEN"),

    NOT_FOUND(404, "NOT_FOUND"),

    METHOD_NOT_ALLOWED(405, "METHOD_NOT_ALLOWED"),

    NOT_ACCEPTABLE(406, "NOT_ACCEPTABLE"),

    PROXY_AUTHENTICATION_REQUIRED(407, "PROXY_AUTHENTICATION_REQUIRED"),

    REQUEST_TIMEOUT(408, "REQUEST_TIMEOUT"),

    CONFLICT(409, "CONFLICT"),

    GONE(410, "GONE"),

    LENGTH_REQUIRED(411, "LENGTH_REQUIRED"),

    PRECONDITION_FAILED(412, "PRECONDITION_FAILED"),

    REQUEST_TOO_LONG(413, "REQUEST_TOO_LONG"),

    REQUEST_URI_TOO_LONG(414, "REQUEST_URI_TOO_LONG"),

    UNSUPPORTED_MEDIA_TYPE(415, "UNSUPPORTED_MEDIA_TYPE"),

    REQUESTED_RANGE_NOT_SATISFIABLE(416, "REQUESTED_RANGE_NOT_SATISFIABLE"),

    EXPECTATION_FAILED(417, "EXPECTATION_FAILED"),

    INSUFFICIENT_SPACE_ON_RESOURCE(419, "INSUFFICIENT_SPACE_ON_RESOURCE"),

    METHOD_FAILURE(420, "METHOD_FAILURE"),

    UNPROCESSABLE_ENTITY(422, "UNPROCESSABLE_ENTITY"),

    LOCKED(423, "LOCKED"),

    FAILED_DEPENDENCY(424, "FAILED_DEPENDENCY"),

    INTERNAL_SERVER_ERROR(500, "INTERNAL_SERVER_ERROR"),

    NOT_IMPLEMENTED(501, "NOT_IMPLEMENTED"),

    BAD_GATEWAY(502, "BAD_GATEWAY"),

    SERVICE_UNAVAILABLE(503, "SERVICE_UNAVAILABLE"),

    GATEWAY_TIMEOUT(504, "GATEWAY_TIMEOUT"),

    HTTP_VERSION_NOT_SUPPORTED(505, "HTTP_VERSION_NOT_SUPPORTED"),

    INSUFFICIENT_STORAGE(507, "INSUFFICIENT_STORAGE");

    private int status;
    private String description;

    /**
     * Enum constructor
     * @param status http status
     * @param description a brief description of this status
     */
    private HttpStatus(int status, String description) {
        this.status = status;
        this.description = description;
    }

    /**
     * Returns a description of this status.
     * @return a string
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Returns the status
     * @return an int
     */
    public int getStatus() {
        return this.status;
    }
}