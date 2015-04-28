package org.lappsgrid.prototype.json2json.error

/**
 * @author Keith Suderman
 */
class JsonException extends Json2JsonException {
    JsonException() {
    }

    JsonException(String message) {
        super(message)
    }

    JsonException(String message, Throwable e) {
        super(message, e)
    }

    JsonException(Throwable e) {
        super(e)
    }
}
