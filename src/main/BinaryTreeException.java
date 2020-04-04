package src.main;

import java.lang.Exception;
/**
 * Customizable BinaryTreeException
 * @param message
 * @param err
 */
public class BinaryTreeException extends Exception{
    private static final long serialVersionUID = -3722525055659666909L;

    public BinaryTreeException(String message) {
        super(message);
    }

    public BinaryTreeException(String message, Exception err) {
        super(message, err);
    }
}