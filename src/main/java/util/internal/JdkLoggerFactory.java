package util.internal;

import java.util.logging.Logger;

/**
 * @author Veritas
 * @create 2021/7/9 15:46
 */
public class JdkLoggerFactory extends InternalLoggerFactory {

    @Override
    public InternalLogger newInstance(String name) {
        return new JdkLogger(Logger.getLogger(name));
    }
}

