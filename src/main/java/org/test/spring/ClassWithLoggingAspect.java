package org.test.spring;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

/**
 * Created by IntelliJ IDEA.
 * User: perperidis
 * Date: 19.11.11
 * Time: 13:59
 * To change this template use File | Settings | File Templates.
 */
public class ClassWithLoggingAspect {
    static Logger logger = Logger.getLogger(ClassWithLoggingAspect.class);
    public void beforeMethod(final JoinPoint joinPoint) {
        logger.info(String.format("Entering method %s", joinPoint.getSignature().toShortString()));
    }
    public void afterMethod(final JoinPoint joinPoint) {
        logger.info(String.format("Leaving method %s", joinPoint.getSignature().toShortString()));
    }
}
