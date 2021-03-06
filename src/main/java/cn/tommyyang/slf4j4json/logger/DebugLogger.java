package cn.tommyyang.slf4j4json.logger;

import com.google.gson.Gson;
import org.apache.commons.lang3.time.FastDateFormat;
import org.slf4j.Logger;

/**
 * Created by TommyYang on 2018/8/23.
 */
public class DebugLogger extends AbstractJsonLogger {
    public final static String LOG_LEVEL = "debug";

    public DebugLogger(Logger slf4jLogger, FastDateFormat formatter, Gson gson, boolean includeLoggerName) {
        super(slf4jLogger, formatter, gson, includeLoggerName);
    }

    @Override
    public void log() {
        this.slf4jLogger.debug(this.formatMessage(LOG_LEVEL));
        this.clearLog();
    }
}
